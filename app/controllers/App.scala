package controllers

import play.api.mvc._

import play.api.libs.json._

import play.api.libs.concurrent.Execution.Implicits.defaultContext

object App extends Controller {

  implicit val jsonWrites = new Writes[Map[String, Any]] {
    def writes(json: Map[String, Any]) = Json.obj(
      "id" -> json("id").asInstanceOf[Int],
      "message" -> json("message").toString
    )
  }

  val jsonValue = Map("id" -> 1, "message" -> "Hello")

  def json = Action.async {
    val futureJson = scala.concurrent.Future {
      Json.toJson(jsonValue)
    }
    futureJson.map(j => Ok(j))
  }

  def xml = Action.async {
    val futureXml = scala.concurrent.Future {
      <root>
        <message id="1">Hello</message>
      </root>
    }
    futureXml.map(x => Ok(x).as("text/xml; charset=utf-8"))
  }

  def index = Action.async {
    val futureHtml = scala.concurrent.Future {
      views.html.index()
    }
    futureHtml.map(h => Ok(h).as("text/html; charset=utf-8"))
  }
}
