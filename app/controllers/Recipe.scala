package controllers

import play.api.mvc._

import play.api.libs.json._

import play.api.libs.concurrent.Execution.Implicits.defaultContext

class Recipe extends Controller {

  val recipeModel = new models.Recipe {}

  def recipeMap = recipeModel.recipe

  implicit val recipeWrites = new Writes[Map[String, Any]] {
    def writes(json: Map[String, Any]) = Json.arr((for {
      (k, v) <- json
    } yield Json.obj(k -> (v match {
      case i: Int => JsNumber(i)
      case s: String => JsString(s)
      case _ => JsNull
    }))))
  }

  implicit val recipesWrites = new Writes[Map[Int, Map[String, Any]]] {
    def writes(json: Map[Int, Map[String, Any]]) = Json.obj("recipes" -> (for {
      (k: Int, v: Map[String, Any]) <- json
    } yield Json.toJson(v)))
  }

  def list = Action.async {
    val futureJson = scala.concurrent.Future {
      Json.prettyPrint(Json.toJson(recipeMap))
    }
    futureJson.map(j => Ok(j))
  }

  def get(id: Int) = Action.async {
    val futureJson = scala.concurrent.Future {
      Json.prettyPrint(Json.toJson(recipeMap(8552)))
    }
    futureJson.map(j => Ok(j))
  }

  def put = ???
  def post = ???
  def delete = ???
}
