package test.controllers

import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._
import play.api.libs.json._

class AppSpec extends Specification {

  val fakeApplication = FakeApplication()

  "Application" should {
    "not respond to a nonexistent route" in new WithApplication(fakeApplication) {
      route(FakeRequest(GET, "")) must beNone
    }

    "respond to the index Action" in new WithApplication(fakeApplication) {
      val Some(result) = route(FakeRequest(GET, "/"))
      status(result) must equalTo(OK)
      contentType(result) must beSome("text/html")
      charset(result) must beSome("utf-8")
      contentAsString(result) must contain("<h1>Hello</h1>")
    }
    "respond with JSON" in new WithApplication(fakeApplication) {
      val Some(result) = route(FakeRequest(GET, "/json"))
      status(result) must equalTo(OK)
      contentType(result) must beSome("application/json")
      charset(result) must beSome("utf-8")
      val json = contentAsJson(result)
      (json \ "id").validate[Int] must beAnInstanceOf[JsSuccess[Int]]
      (json \ "message").validate[String] must beAnInstanceOf[JsSuccess[String]]
    }
    "respond with XML" in new WithApplication(fakeApplication) {
      val Some(result) = route(FakeRequest(GET, "/xml"))
      status(result) must equalTo(OK)
      contentType(result) must beSome("text/xml")
      charset(result) must beSome("utf-8")
      val xml = scala.xml.XML.loadString(contentAsString(result))
      (xml \ "message" \ "@id").text.toInt must equalTo(1)
      (xml \ "message").text must equalTo("Hello")
    }
  }
}
