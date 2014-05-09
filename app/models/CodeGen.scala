package models

import scala.slick.model.codegen.SourceCodeGenerator

object CodeGen {

  def main(args: Array[String]) {
    SourceCodeGenerator.main(
      Array(
        "scala.slick.driver.MySQLDriver", "com.mysql.jdbc.Driver",
        "jdbc:mysql://127.0.0.1/licensing", "app/", "models",
        "root", "")
    )
  }
}
