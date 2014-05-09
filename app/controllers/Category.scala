package controllers

import play.api.mvc._

import play.api.libs.json._

import play.api.libs.concurrent.Execution.Implicits.defaultContext

object Category extends Controller {

  val categoryModel = new models.Category {}

  def categoryMap = categoryModel.categories

  def tagMap = categoryModel.tags

  val notFound = Json.obj("error" -> JsBoolean(true),
    "message" -> JsString("Not found"))

  implicit val categoriesWrites = new Writes[Map[Int, String]] {
    def writes(json: Map[Int, String]) = Json.obj("categories" -> (for {
      (k, v) <- json
    } yield Json.arr(Json.obj(
      "id" -> JsNumber(k),
      "category" -> JsString(v)))).fold(JsArray())(_ ++ _))
  }

  def list = Action.async {
    val futureJson = scala.concurrent.Future {
      Json.prettyPrint(Json.toJson(categoryMap))
    }
    futureJson.map(j => Ok(j))
  }

  def get(category: String) = Action.async {
    val futureJson = scala.concurrent.Future {
      Json.prettyPrint(Json.toJson(tagMap(category)))
    }
    futureJson.map(j => Ok(j))
  }

  def put = ???
  def post = ???
  def delete = ???
}
