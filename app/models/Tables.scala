package models
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = scala.slick.driver.MySQLDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: scala.slick.driver.JdbcProfile
  import profile.simple._
  import scala.slick.model.ForeignKeyAction
  import scala.slick.collection.heterogenous._
  import scala.slick.collection.heterogenous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import scala.slick.jdbc.{ GetResult => GR }

  /** DDL for all tables. Call .create to execute. */
  lazy val ddl = ArticleBatches.ddl ++ Batches.ddl ++ Categories.ddl ++ EwlarticlecustomXml.ddl ++ EwlarticleXml.ddl ++ EwltipBatch.ddl ++ EwltipsTechniquesXml.ddl ++ MsnLinks.ddl ++ RecipeBatches.ddl ++ RecipeCategories.ddl ++ RecipeCategoriesOld.ddl ++ RecipeNutritionEsha.ddl ++ Recipes.ddl ++ Slideshows.ddl ++ SlideshowsCustom.ddl ++ SlideshowSlides.ddl ++ SlideshowSlidesCustom.ddl ++ Tags.ddl

  /**
   * Entity class storing rows of table ArticleBatches
   *  @param idBatch Database column id_batch
   *  @param idArticle Database column id_article
   *  @param version Database column version Default(1)
   */
  case class ArticleBatchesRow(idBatch: Int, idArticle: Int, version: Int = 1)
  /** GetResult implicit for fetching ArticleBatchesRow objects using plain SQL queries */
  implicit def GetResultArticleBatchesRow(implicit e0: GR[Int]): GR[ArticleBatchesRow] = GR {
    prs =>
      import prs._
      ArticleBatchesRow.tupled((<<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table article_batches. Objects of this class serve as prototypes for rows in queries. */
  class ArticleBatches(genTag: Tag) extends Table[ArticleBatchesRow](genTag, "article_batches") {
    def * = (idBatch, idArticle, version) <> (ArticleBatchesRow.tupled, ArticleBatchesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (idBatch.?, idArticle.?, version.?).shaped.<>({ r => import r._; _1.map(_ => ArticleBatchesRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id_batch  */
    val idBatch: Column[Int] = column[Int]("id_batch")
    /** Database column id_article  */
    val idArticle: Column[Int] = column[Int]("id_article")
    /** Database column version Default(1) */
    val version: Column[Int] = column[Int]("version", O.Default(1))
  }
  /** Collection-like TableQuery object for table ArticleBatches */
  lazy val ArticleBatches = new TableQuery(genTag => new ArticleBatches(genTag))

  /**
   * Entity class storing rows of table Batches
   *  @param idBatch Database column id_batch PrimaryKey
   *  @param idPartner Database column id_partner
   *  @param description Database column description
   *  @param notes Database column notes
   *  @param deliveryDate Database column delivery_date
   */
  case class BatchesRow(idBatch: Int, idPartner: Int, description: Option[String], notes: Option[String], deliveryDate: Option[java.sql.Date])
  /** GetResult implicit for fetching BatchesRow objects using plain SQL queries */
  implicit def GetResultBatchesRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[java.sql.Date]]): GR[BatchesRow] = GR {
    prs =>
      import prs._
      BatchesRow.tupled((<<[Int], <<[Int], <<?[String], <<?[String], <<?[java.sql.Date]))
  }
  /** Table description of table batches. Objects of this class serve as prototypes for rows in queries. */
  class Batches(genTag: Tag) extends Table[BatchesRow](genTag, "batches") {
    def * = (idBatch, idPartner, description, notes, deliveryDate) <> (BatchesRow.tupled, BatchesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (idBatch.?, idPartner.?, description, notes, deliveryDate).shaped.<>({ r => import r._; _1.map(_ => BatchesRow.tupled((_1.get, _2.get, _3, _4, _5))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id_batch PrimaryKey */
    val idBatch: Column[Int] = column[Int]("id_batch", O.PrimaryKey)
    /** Database column id_partner  */
    val idPartner: Column[Int] = column[Int]("id_partner")
    /** Database column description  */
    val description: Column[Option[String]] = column[Option[String]]("description")
    /** Database column notes  */
    val notes: Column[Option[String]] = column[Option[String]]("notes")
    /** Database column delivery_date  */
    val deliveryDate: Column[Option[java.sql.Date]] = column[Option[java.sql.Date]]("delivery_date")
  }
  /** Collection-like TableQuery object for table Batches */
  lazy val Batches = new TableQuery(genTag => new Batches(genTag))

  /**
   * Entity class storing rows of table Categories
   *  @param id Database column id AutoInc, PrimaryKey
   *  @param category Database column category
   */
  case class CategoriesRow(id: Int, category: String)
  /** GetResult implicit for fetching CategoriesRow objects using plain SQL queries */
  implicit def GetResultCategoriesRow(implicit e0: GR[Int], e1: GR[String]): GR[CategoriesRow] = GR {
    prs =>
      import prs._
      CategoriesRow.tupled((<<[Int], <<[String]))
  }
  /** Table description of table categories. Objects of this class serve as prototypes for rows in queries. */
  class Categories(genTag: Tag) extends Table[CategoriesRow](genTag, "categories") {
    def * = (id, category) <> (CategoriesRow.tupled, CategoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, category.?).shaped.<>({ r => import r._; _1.map(_ => CategoriesRow.tupled((_1.get, _2.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column category  */
    val category: Column[String] = column[String]("category")
  }
  /** Collection-like TableQuery object for table Categories */
  lazy val Categories = new TableQuery(genTag => new Categories(genTag))

  /**
   * Entity class storing rows of table EwlarticlecustomXml
   *  @param articlepartnerid Database column ArticlePartnerID
   *  @param fkarticleid Database column fkArticleID Default(0)
   *  @param articleContentpartner Database column Article_ContentPartner
   *  @param articleTitle Database column Article_Title
   *  @param articleSubtitle Database column Article_SubTitle
   *  @param articleAuthor Database column Article_Author
   *  @param articlePhotographer Database column Article_Photographer
   *  @param articleBody Database column Article_Body
   */
  case class EwlarticlecustomXmlRow(articlepartnerid: Int, fkarticleid: Int = 0, articleContentpartner: String, articleTitle: Option[String], articleSubtitle: Option[String], articleAuthor: Option[String], articlePhotographer: Option[String], articleBody: Option[String])
  /** GetResult implicit for fetching EwlarticlecustomXmlRow objects using plain SQL queries */
  implicit def GetResultEwlarticlecustomXmlRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[EwlarticlecustomXmlRow] = GR {
    prs =>
      import prs._
      EwlarticlecustomXmlRow.tupled((<<[Int], <<[Int], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table EWLArticleCustom_XML. Objects of this class serve as prototypes for rows in queries. */
  class EwlarticlecustomXml(genTag: Tag) extends Table[EwlarticlecustomXmlRow](genTag, "EWLArticleCustom_XML") {
    def * = (articlepartnerid, fkarticleid, articleContentpartner, articleTitle, articleSubtitle, articleAuthor, articlePhotographer, articleBody) <> (EwlarticlecustomXmlRow.tupled, EwlarticlecustomXmlRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (articlepartnerid.?, fkarticleid.?, articleContentpartner.?, articleTitle, articleSubtitle, articleAuthor, articlePhotographer, articleBody).shaped.<>({ r => import r._; _1.map(_ => EwlarticlecustomXmlRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column ArticlePartnerID  */
    val articlepartnerid: Column[Int] = column[Int]("ArticlePartnerID")
    /** Database column fkArticleID Default(0) */
    val fkarticleid: Column[Int] = column[Int]("fkArticleID", O.Default(0))
    /** Database column Article_ContentPartner  */
    val articleContentpartner: Column[String] = column[String]("Article_ContentPartner")
    /** Database column Article_Title  */
    val articleTitle: Column[Option[String]] = column[Option[String]]("Article_Title")
    /** Database column Article_SubTitle  */
    val articleSubtitle: Column[Option[String]] = column[Option[String]]("Article_SubTitle")
    /** Database column Article_Author  */
    val articleAuthor: Column[Option[String]] = column[Option[String]]("Article_Author")
    /** Database column Article_Photographer  */
    val articlePhotographer: Column[Option[String]] = column[Option[String]]("Article_Photographer")
    /** Database column Article_Body  */
    val articleBody: Column[Option[String]] = column[Option[String]]("Article_Body")
  }
  /** Collection-like TableQuery object for table EwlarticlecustomXml */
  lazy val EwlarticlecustomXml = new TableQuery(genTag => new EwlarticlecustomXml(genTag))

  /**
   * Entity class storing rows of table EwlarticleXml
   *  @param articleid Database column ArticleID Default(0)
   *  @param articleBrand Database column Article_Brand
   *  @param articleTitle Database column Article_Title
   *  @param articleSubtitle Database column Article_SubTitle
   *  @param articleKeywords Database column Article_Keywords
   *  @param articleByline Database column Article_ByLine
   *  @param articlePhotographer Database column Article_Photographer
   *  @param articleAbstract Database column Article_Abstract
   *  @param articleBody Database column Article_Body
   *  @param articleTitleShort Database column Article_Title_Short
   *  @param articleBodyShort Database column Article_Body_Short
   */
  case class EwlarticleXmlRow(articleid: Int = 0, articleBrand: String, articleTitle: Option[String], articleSubtitle: Option[String], articleKeywords: Option[String], articleByline: Option[String], articlePhotographer: Option[String], articleAbstract: Option[String], articleBody: Option[String], articleTitleShort: Option[String], articleBodyShort: Option[String])
  /** GetResult implicit for fetching EwlarticleXmlRow objects using plain SQL queries */
  implicit def GetResultEwlarticleXmlRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[EwlarticleXmlRow] = GR {
    prs =>
      import prs._
      EwlarticleXmlRow.tupled((<<[Int], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table EWLArticle_XML. Objects of this class serve as prototypes for rows in queries. */
  class EwlarticleXml(genTag: Tag) extends Table[EwlarticleXmlRow](genTag, "EWLArticle_XML") {
    def * = (articleid, articleBrand, articleTitle, articleSubtitle, articleKeywords, articleByline, articlePhotographer, articleAbstract, articleBody, articleTitleShort, articleBodyShort) <> (EwlarticleXmlRow.tupled, EwlarticleXmlRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (articleid.?, articleBrand.?, articleTitle, articleSubtitle, articleKeywords, articleByline, articlePhotographer, articleAbstract, articleBody, articleTitleShort, articleBodyShort).shaped.<>({ r => import r._; _1.map(_ => EwlarticleXmlRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column ArticleID Default(0) */
    val articleid: Column[Int] = column[Int]("ArticleID", O.Default(0))
    /** Database column Article_Brand  */
    val articleBrand: Column[String] = column[String]("Article_Brand")
    /** Database column Article_Title  */
    val articleTitle: Column[Option[String]] = column[Option[String]]("Article_Title")
    /** Database column Article_SubTitle  */
    val articleSubtitle: Column[Option[String]] = column[Option[String]]("Article_SubTitle")
    /** Database column Article_Keywords  */
    val articleKeywords: Column[Option[String]] = column[Option[String]]("Article_Keywords")
    /** Database column Article_ByLine  */
    val articleByline: Column[Option[String]] = column[Option[String]]("Article_ByLine")
    /** Database column Article_Photographer  */
    val articlePhotographer: Column[Option[String]] = column[Option[String]]("Article_Photographer")
    /** Database column Article_Abstract  */
    val articleAbstract: Column[Option[String]] = column[Option[String]]("Article_Abstract")
    /** Database column Article_Body  */
    val articleBody: Column[Option[String]] = column[Option[String]]("Article_Body")
    /** Database column Article_Title_Short  */
    val articleTitleShort: Column[Option[String]] = column[Option[String]]("Article_Title_Short")
    /** Database column Article_Body_Short  */
    val articleBodyShort: Column[Option[String]] = column[Option[String]]("Article_Body_Short")
  }
  /** Collection-like TableQuery object for table EwlarticleXml */
  lazy val EwlarticleXml = new TableQuery(genTag => new EwlarticleXml(genTag))

  /**
   * Entity class storing rows of table EwltipBatch
   *  @param transactionid Database column TransactionID PrimaryKey
   *  @param fkbatchid Database column fkBatchID Default(0)
   *  @param fktipid Database column fkTipID Default(0)
   */
  case class EwltipBatchRow(transactionid: String, fkbatchid: Int = 0, fktipid: Int = 0)
  /** GetResult implicit for fetching EwltipBatchRow objects using plain SQL queries */
  implicit def GetResultEwltipBatchRow(implicit e0: GR[String], e1: GR[Int]): GR[EwltipBatchRow] = GR {
    prs =>
      import prs._
      EwltipBatchRow.tupled((<<[String], <<[Int], <<[Int]))
  }
  /** Table description of table EWLTip_Batch. Objects of this class serve as prototypes for rows in queries. */
  class EwltipBatch(genTag: Tag) extends Table[EwltipBatchRow](genTag, "EWLTip_Batch") {
    def * = (transactionid, fkbatchid, fktipid) <> (EwltipBatchRow.tupled, EwltipBatchRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (transactionid.?, fkbatchid.?, fktipid.?).shaped.<>({ r => import r._; _1.map(_ => EwltipBatchRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column TransactionID PrimaryKey */
    val transactionid: Column[String] = column[String]("TransactionID", O.PrimaryKey)
    /** Database column fkBatchID Default(0) */
    val fkbatchid: Column[Int] = column[Int]("fkBatchID", O.Default(0))
    /** Database column fkTipID Default(0) */
    val fktipid: Column[Int] = column[Int]("fkTipID", O.Default(0))
  }
  /** Collection-like TableQuery object for table EwltipBatch */
  lazy val EwltipBatch = new TableQuery(genTag => new EwltipBatch(genTag))

  /**
   * Entity class storing rows of table EwltipsTechniquesXml
   *  @param tipid Database column TipID Default(0)
   *  @param tiptitle Database column TipTitle
   *  @param tipkeywords Database column TipKeywords
   *  @param tipbody Database column TipBody
   *  @param tipcategory Database column TipCategory
   *  @param tiphealthtopic Database column TipHealthTopic
   */
  case class EwltipsTechniquesXmlRow(tipid: Int = 0, tiptitle: Option[String], tipkeywords: Option[String], tipbody: Option[String], tipcategory: Option[String], tiphealthtopic: Option[String])
  /** GetResult implicit for fetching EwltipsTechniquesXmlRow objects using plain SQL queries */
  implicit def GetResultEwltipsTechniquesXmlRow(implicit e0: GR[Int], e1: GR[Option[String]]): GR[EwltipsTechniquesXmlRow] = GR {
    prs =>
      import prs._
      EwltipsTechniquesXmlRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table EWLTips_Techniques_XML. Objects of this class serve as prototypes for rows in queries. */
  class EwltipsTechniquesXml(genTag: Tag) extends Table[EwltipsTechniquesXmlRow](genTag, "EWLTips_Techniques_XML") {
    def * = (tipid, tiptitle, tipkeywords, tipbody, tipcategory, tiphealthtopic) <> (EwltipsTechniquesXmlRow.tupled, EwltipsTechniquesXmlRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tipid.?, tiptitle, tipkeywords, tipbody, tipcategory, tiphealthtopic).shaped.<>({ r => import r._; _1.map(_ => EwltipsTechniquesXmlRow.tupled((_1.get, _2, _3, _4, _5, _6))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column TipID Default(0) */
    val tipid: Column[Int] = column[Int]("TipID", O.Default(0))
    /** Database column TipTitle  */
    val tiptitle: Column[Option[String]] = column[Option[String]]("TipTitle")
    /** Database column TipKeywords  */
    val tipkeywords: Column[Option[String]] = column[Option[String]]("TipKeywords")
    /** Database column TipBody  */
    val tipbody: Column[Option[String]] = column[Option[String]]("TipBody")
    /** Database column TipCategory  */
    val tipcategory: Column[Option[String]] = column[Option[String]]("TipCategory")
    /** Database column TipHealthTopic  */
    val tiphealthtopic: Column[Option[String]] = column[Option[String]]("TipHealthTopic")
  }
  /** Collection-like TableQuery object for table EwltipsTechniquesXml */
  lazy val EwltipsTechniquesXml = new TableQuery(genTag => new EwltipsTechniquesXml(genTag))

  /**
   * Entity class storing rows of table MsnLinks
   *  @param fkarticleid Database column fkArticleID
   *  @param alias Database column alias
   *  @param link Database column link
   *  @param position Database column position
   */
  case class MsnLinksRow(fkarticleid: Int, alias: String, link: String, position: Int)
  /** GetResult implicit for fetching MsnLinksRow objects using plain SQL queries */
  implicit def GetResultMsnLinksRow(implicit e0: GR[Int], e1: GR[String]): GR[MsnLinksRow] = GR {
    prs =>
      import prs._
      MsnLinksRow.tupled((<<[Int], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table msn_links. Objects of this class serve as prototypes for rows in queries. */
  class MsnLinks(genTag: Tag) extends Table[MsnLinksRow](genTag, "msn_links") {
    def * = (fkarticleid, alias, link, position) <> (MsnLinksRow.tupled, MsnLinksRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (fkarticleid.?, alias.?, link.?, position.?).shaped.<>({ r => import r._; _1.map(_ => MsnLinksRow.tupled((_1.get, _2.get, _3.get, _4.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column fkArticleID  */
    val fkarticleid: Column[Int] = column[Int]("fkArticleID")
    /** Database column alias  */
    val alias: Column[String] = column[String]("alias")
    /** Database column link  */
    val link: Column[String] = column[String]("link")
    /** Database column position  */
    val position: Column[Int] = column[Int]("position")
  }
  /** Collection-like TableQuery object for table MsnLinks */
  lazy val MsnLinks = new TableQuery(genTag => new MsnLinks(genTag))

  /**
   * Entity class storing rows of table RecipeBatches
   *  @param idBatch Database column id_batch
   *  @param idRecipe Database column id_recipe
   */
  case class RecipeBatchesRow(idBatch: Int, idRecipe: Int)
  /** GetResult implicit for fetching RecipeBatchesRow objects using plain SQL queries */
  implicit def GetResultRecipeBatchesRow(implicit e0: GR[Int]): GR[RecipeBatchesRow] = GR {
    prs =>
      import prs._
      RecipeBatchesRow.tupled((<<[Int], <<[Int]))
  }
  /** Table description of table recipe_batches. Objects of this class serve as prototypes for rows in queries. */
  class RecipeBatches(genTag: Tag) extends Table[RecipeBatchesRow](genTag, "recipe_batches") {
    def * = (idBatch, idRecipe) <> (RecipeBatchesRow.tupled, RecipeBatchesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (idBatch.?, idRecipe.?).shaped.<>({ r => import r._; _1.map(_ => RecipeBatchesRow.tupled((_1.get, _2.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id_batch  */
    val idBatch: Column[Int] = column[Int]("id_batch")
    /** Database column id_recipe  */
    val idRecipe: Column[Int] = column[Int]("id_recipe")

    /** Index over (idBatch,idRecipe) (database name id_batch) */
    val index1 = index("id_batch", (idBatch, idRecipe))
  }
  /** Collection-like TableQuery object for table RecipeBatches */
  lazy val RecipeBatches = new TableQuery(genTag => new RecipeBatches(genTag))

  /**
   * Entity class storing rows of table RecipeCategories
   *  @param id Database column id
   *  @param category Database column category
   *  @param tag Database column tag
   */
  case class RecipeCategoriesRow(id: Int, category: String, tag: String)
  /** GetResult implicit for fetching RecipeCategoriesRow objects using plain SQL queries */
  implicit def GetResultRecipeCategoriesRow(implicit e0: GR[Int], e1: GR[String]): GR[RecipeCategoriesRow] = GR {
    prs =>
      import prs._
      RecipeCategoriesRow.tupled((<<[Int], <<[String], <<[String]))
  }
  /** Table description of table recipe_categories. Objects of this class serve as prototypes for rows in queries. */
  class RecipeCategories(genTag: Tag) extends Table[RecipeCategoriesRow](genTag, "recipe_categories") {
    def * = (id, category, tag) <> (RecipeCategoriesRow.tupled, RecipeCategoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, category.?, tag.?).shaped.<>({ r => import r._; _1.map(_ => RecipeCategoriesRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id  */
    val id: Column[Int] = column[Int]("id")
    /** Database column category  */
    val category: Column[String] = column[String]("category")
    /** Database column tag  */
    val tag: Column[String] = column[String]("tag")

    /** Index over (id) (database name id) */
    val index1 = index("id", id)
  }
  /** Collection-like TableQuery object for table RecipeCategories */
  lazy val RecipeCategories = new TableQuery(genTag => new RecipeCategories(genTag))

  /**
   * Entity class storing rows of table RecipeCategoriesOld
   *  @param id Database column id
   *  @param category Database column category
   *  @param tag Database column tag
   */
  case class RecipeCategoriesOldRow(id: Int, category: String, tag: String)
  /** GetResult implicit for fetching RecipeCategoriesOldRow objects using plain SQL queries */
  implicit def GetResultRecipeCategoriesOldRow(implicit e0: GR[Int], e1: GR[String]): GR[RecipeCategoriesOldRow] = GR {
    prs =>
      import prs._
      RecipeCategoriesOldRow.tupled((<<[Int], <<[String], <<[String]))
  }
  /** Table description of table recipe_categories_old. Objects of this class serve as prototypes for rows in queries. */
  class RecipeCategoriesOld(genTag: Tag) extends Table[RecipeCategoriesOldRow](genTag, "recipe_categories_old") {
    def * = (id, category, tag) <> (RecipeCategoriesOldRow.tupled, RecipeCategoriesOldRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, category.?, tag.?).shaped.<>({ r => import r._; _1.map(_ => RecipeCategoriesOldRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id  */
    val id: Column[Int] = column[Int]("id")
    /** Database column category  */
    val category: Column[String] = column[String]("category")
    /** Database column tag  */
    val tag: Column[String] = column[String]("tag")

    /** Index over (id) (database name id) */
    val index1 = index("id", id)
  }
  /** Collection-like TableQuery object for table RecipeCategoriesOld */
  lazy val RecipeCategoriesOld = new TableQuery(genTag => new RecipeCategoriesOld(genTag))

  /** Row type of table RecipeNutritionEsha */
  type RecipeNutritionEshaRow = HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for RecipeNutritionEshaRow providing default values if available in the database schema. */
  def RecipeNutritionEshaRow(id: Int, calories: Int, fat: Int, satfat: Int, monofat: Int, cholesterol: Int, carbohydrates: Int, protein: Int, fiber: Int, sodium: Int, potassium: Int, calcium: Int, chromium: Int, folate: Int, iron: Int, magnesium: Int, omega3: Int, omega6: Int, selenium: Int, transfat: Int, vitamina: Int, vitaminb3: Int, vitaminb12: Int, vitaminc: Int, vitamine: Int, zinc: Int, totalsugars: Int, mealtype: Int): RecipeNutritionEshaRow = {
    id :: calories :: fat :: satfat :: monofat :: cholesterol :: carbohydrates :: protein :: fiber :: sodium :: potassium :: calcium :: chromium :: folate :: iron :: magnesium :: omega3 :: omega6 :: selenium :: transfat :: vitamina :: vitaminb3 :: vitaminb12 :: vitaminc :: vitamine :: zinc :: totalsugars :: mealtype :: HNil
  }
  /** GetResult implicit for fetching RecipeNutritionEshaRow objects using plain SQL queries */
  implicit def GetResultRecipeNutritionEshaRow(implicit e0: GR[Int]): GR[RecipeNutritionEshaRow] = GR {
    prs =>
      import prs._
      <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: HNil
  }
  /** Table description of table recipe_nutrition_esha. Objects of this class serve as prototypes for rows in queries. */
  class RecipeNutritionEsha(genTag: Tag) extends Table[RecipeNutritionEshaRow](genTag, "recipe_nutrition_esha") {
    def * = id :: calories :: fat :: satfat :: monofat :: cholesterol :: carbohydrates :: protein :: fiber :: sodium :: potassium :: calcium :: chromium :: folate :: iron :: magnesium :: omega3 :: omega6 :: selenium :: transfat :: vitamina :: vitaminb3 :: vitaminb12 :: vitaminc :: vitamine :: zinc :: totalsugars :: mealtype :: HNil

    /** Database column id PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column calories  */
    val calories: Column[Int] = column[Int]("calories")
    /** Database column fat  */
    val fat: Column[Int] = column[Int]("fat")
    /** Database column satFat  */
    val satfat: Column[Int] = column[Int]("satFat")
    /** Database column monoFat  */
    val monofat: Column[Int] = column[Int]("monoFat")
    /** Database column cholesterol  */
    val cholesterol: Column[Int] = column[Int]("cholesterol")
    /** Database column carbohydrates  */
    val carbohydrates: Column[Int] = column[Int]("carbohydrates")
    /** Database column protein  */
    val protein: Column[Int] = column[Int]("protein")
    /** Database column fiber  */
    val fiber: Column[Int] = column[Int]("fiber")
    /** Database column sodium  */
    val sodium: Column[Int] = column[Int]("sodium")
    /** Database column potassium  */
    val potassium: Column[Int] = column[Int]("potassium")
    /** Database column calcium  */
    val calcium: Column[Int] = column[Int]("calcium")
    /** Database column chromium  */
    val chromium: Column[Int] = column[Int]("chromium")
    /** Database column folate  */
    val folate: Column[Int] = column[Int]("folate")
    /** Database column iron  */
    val iron: Column[Int] = column[Int]("iron")
    /** Database column magnesium  */
    val magnesium: Column[Int] = column[Int]("magnesium")
    /** Database column omega3  */
    val omega3: Column[Int] = column[Int]("omega3")
    /** Database column omega6  */
    val omega6: Column[Int] = column[Int]("omega6")
    /** Database column selenium  */
    val selenium: Column[Int] = column[Int]("selenium")
    /** Database column transFat  */
    val transfat: Column[Int] = column[Int]("transFat")
    /** Database column vitaminA  */
    val vitamina: Column[Int] = column[Int]("vitaminA")
    /** Database column vitaminB3  */
    val vitaminb3: Column[Int] = column[Int]("vitaminB3")
    /** Database column VitaminB12  */
    val vitaminb12: Column[Int] = column[Int]("VitaminB12")
    /** Database column vitaminC  */
    val vitaminc: Column[Int] = column[Int]("vitaminC")
    /** Database column vitaminE  */
    val vitamine: Column[Int] = column[Int]("vitaminE")
    /** Database column zinc  */
    val zinc: Column[Int] = column[Int]("zinc")
    /** Database column totalSugars  */
    val totalsugars: Column[Int] = column[Int]("totalSugars")
    /** Database column mealType  */
    val mealtype: Column[Int] = column[Int]("mealType")
  }
  /** Collection-like TableQuery object for table RecipeNutritionEsha */
  lazy val RecipeNutritionEsha = new TableQuery(genTag => new RecipeNutritionEsha(genTag))

  /** Row type of table Recipes */
  type RecipesRow = HCons[Int, HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[Int, HCons[String, HCons[String, HCons[Int, HCons[String, HCons[Int, HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[Int, HNil]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for RecipesRow providing default values if available in the database schema. */
  def RecipesRow(id: Int, title: String, brand: String, author: String, photographer: String, image: String, servings: Int, servingsize: String, `yield`: String, totaltime: Int, totaltimedesc: String, activetime: Int, activetimedesc: String, hednote: String, servingsuggestion: String, makeaheadtip: String, equipment: String, ingredientxml: String, method: String, tips: String, nutritionBonus: String, nutritionNote: String, nutritionCarbservings: String, nutritionExchanges: String, nutritionServing: String, nutritionAddedsugars: Int): RecipesRow = {
    id :: title :: brand :: author :: photographer :: image :: servings :: servingsize :: `yield` :: totaltime :: totaltimedesc :: activetime :: activetimedesc :: hednote :: servingsuggestion :: makeaheadtip :: equipment :: ingredientxml :: method :: tips :: nutritionBonus :: nutritionNote :: nutritionCarbservings :: nutritionExchanges :: nutritionServing :: nutritionAddedsugars :: HNil
  }
  /** GetResult implicit for fetching RecipesRow objects using plain SQL queries */
  implicit def GetResultRecipesRow(implicit e0: GR[Int], e1: GR[String]): GR[RecipesRow] = GR {
    prs =>
      import prs._
      <<[Int] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Int] :: <<[String] :: <<[String] :: <<[Int] :: <<[String] :: <<[Int] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Int] :: HNil
  }
  /**
   * Table description of table recipes. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: yield
   */
  class Recipes(genTag: Tag) extends Table[RecipesRow](genTag, "recipes") {
    def * = id :: title :: brand :: author :: photographer :: image :: servings :: servingsize :: `yield` :: totaltime :: totaltimedesc :: activetime :: activetimedesc :: hednote :: servingsuggestion :: makeaheadtip :: equipment :: ingredientxml :: method :: tips :: nutritionBonus :: nutritionNote :: nutritionCarbservings :: nutritionExchanges :: nutritionServing :: nutritionAddedsugars :: HNil

    /** Database column id  */
    val id: Column[Int] = column[Int]("id")
    /** Database column title  */
    val title: Column[String] = column[String]("title")
    /** Database column brand  */
    val brand: Column[String] = column[String]("brand")
    /** Database column author  */
    val author: Column[String] = column[String]("author")
    /** Database column photographer  */
    val photographer: Column[String] = column[String]("photographer")
    /** Database column image  */
    val image: Column[String] = column[String]("image")
    /** Database column servings  */
    val servings: Column[Int] = column[Int]("servings")
    /** Database column servingSize  */
    val servingsize: Column[String] = column[String]("servingSize")
    /**
     * Database column yield
     *  NOTE: The name was escaped because it collided with a Scala keyword.
     */
    val `yield`: Column[String] = column[String]("yield")
    /** Database column totalTime  */
    val totaltime: Column[Int] = column[Int]("totalTime")
    /** Database column totalTimeDesc  */
    val totaltimedesc: Column[String] = column[String]("totalTimeDesc")
    /** Database column activeTime  */
    val activetime: Column[Int] = column[Int]("activeTime")
    /** Database column activeTimeDesc  */
    val activetimedesc: Column[String] = column[String]("activeTimeDesc")
    /** Database column hednote  */
    val hednote: Column[String] = column[String]("hednote")
    /** Database column servingSuggestion  */
    val servingsuggestion: Column[String] = column[String]("servingSuggestion")
    /** Database column makeAheadTip  */
    val makeaheadtip: Column[String] = column[String]("makeAheadTip")
    /** Database column equipment  */
    val equipment: Column[String] = column[String]("equipment")
    /** Database column ingredientXml  */
    val ingredientxml: Column[String] = column[String]("ingredientXml")
    /** Database column method  */
    val method: Column[String] = column[String]("method")
    /** Database column tips  */
    val tips: Column[String] = column[String]("tips")
    /** Database column nutrition_bonus  */
    val nutritionBonus: Column[String] = column[String]("nutrition_bonus")
    /** Database column nutrition_note  */
    val nutritionNote: Column[String] = column[String]("nutrition_note")
    /** Database column nutrition_carbServings  */
    val nutritionCarbservings: Column[String] = column[String]("nutrition_carbServings")
    /** Database column nutrition_exchanges  */
    val nutritionExchanges: Column[String] = column[String]("nutrition_exchanges")
    /** Database column nutrition_serving  */
    val nutritionServing: Column[String] = column[String]("nutrition_serving")
    /** Database column nutrition_addedSugars  */
    val nutritionAddedsugars: Column[Int] = column[Int]("nutrition_addedSugars")

    /** Uniqueness Index over (id) (database name id) */
    val index1 = index("id", id :: HNil, unique = true)
  }
  /** Collection-like TableQuery object for table Recipes */
  lazy val Recipes = new TableQuery(genTag => new Recipes(genTag))

  /**
   * Entity class storing rows of table Slideshows
   *  @param articleid Database column ArticleID Default(0)
   *  @param slideshowTitle Database column Slideshow_Title
   *  @param slideshowSubtitle Database column Slideshow_SubTitle
   *  @param slideshowAuthor Database column Slideshow_Author
   *  @param slideshowPhotographer Database column Slideshow_Photographer
   *  @param slideshowIntro Database column Slideshow_Intro
   *  @param slideshowCoverimage Database column Slideshow_CoverImage
   *  @param slideshowBrand Database column Slideshow_Brand
   *  @param categories Database column Categories
   */
  case class SlideshowsRow(articleid: Int = 0, slideshowTitle: Option[String], slideshowSubtitle: Option[String], slideshowAuthor: Option[String], slideshowPhotographer: Option[String], slideshowIntro: Option[String], slideshowCoverimage: Option[String], slideshowBrand: Option[String], categories: String)
  /** GetResult implicit for fetching SlideshowsRow objects using plain SQL queries */
  implicit def GetResultSlideshowsRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[String]): GR[SlideshowsRow] = GR {
    prs =>
      import prs._
      SlideshowsRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[String]))
  }
  /** Table description of table slideshows. Objects of this class serve as prototypes for rows in queries. */
  class Slideshows(genTag: Tag) extends Table[SlideshowsRow](genTag, "slideshows") {
    def * = (articleid, slideshowTitle, slideshowSubtitle, slideshowAuthor, slideshowPhotographer, slideshowIntro, slideshowCoverimage, slideshowBrand, categories) <> (SlideshowsRow.tupled, SlideshowsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (articleid.?, slideshowTitle, slideshowSubtitle, slideshowAuthor, slideshowPhotographer, slideshowIntro, slideshowCoverimage, slideshowBrand, categories.?).shaped.<>({ r => import r._; _1.map(_ => SlideshowsRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column ArticleID Default(0) */
    val articleid: Column[Int] = column[Int]("ArticleID", O.Default(0))
    /** Database column Slideshow_Title  */
    val slideshowTitle: Column[Option[String]] = column[Option[String]]("Slideshow_Title")
    /** Database column Slideshow_SubTitle  */
    val slideshowSubtitle: Column[Option[String]] = column[Option[String]]("Slideshow_SubTitle")
    /** Database column Slideshow_Author  */
    val slideshowAuthor: Column[Option[String]] = column[Option[String]]("Slideshow_Author")
    /** Database column Slideshow_Photographer  */
    val slideshowPhotographer: Column[Option[String]] = column[Option[String]]("Slideshow_Photographer")
    /** Database column Slideshow_Intro  */
    val slideshowIntro: Column[Option[String]] = column[Option[String]]("Slideshow_Intro")
    /** Database column Slideshow_CoverImage  */
    val slideshowCoverimage: Column[Option[String]] = column[Option[String]]("Slideshow_CoverImage")
    /** Database column Slideshow_Brand  */
    val slideshowBrand: Column[Option[String]] = column[Option[String]]("Slideshow_Brand")
    /** Database column Categories  */
    val categories: Column[String] = column[String]("Categories")
  }
  /** Collection-like TableQuery object for table Slideshows */
  lazy val Slideshows = new TableQuery(genTag => new Slideshows(genTag))

  /**
   * Entity class storing rows of table SlideshowsCustom
   *  @param slideshowpartnerid Database column SlideshowPartnerID
   *  @param fkarticleid Database column fkArticleID Default(0)
   *  @param slideshowContentpartner Database column Slideshow_ContentPartner
   *  @param slideshowTitle Database column Slideshow_Title
   *  @param slideshowSubtitle Database column Slideshow_SubTitle
   *  @param slideshowAuthor Database column Slideshow_Author
   *  @param slideshowPhotographer Database column Slideshow_Photographer
   *  @param slideshowIntro Database column Slideshow_Intro
   *  @param slideshowCoverimage Database column Slideshow_CoverImage
   *  @param slideshowImageCaption Database column Slideshow_Image_Caption
   *  @param slideshowBrand Database column Slideshow_Brand
   *  @param categories Database column Categories
   */
  case class SlideshowsCustomRow(slideshowpartnerid: Int, fkarticleid: Int = 0, slideshowContentpartner: String, slideshowTitle: Option[String], slideshowSubtitle: Option[String], slideshowAuthor: Option[String], slideshowPhotographer: Option[String], slideshowIntro: Option[String], slideshowCoverimage: Option[String], slideshowImageCaption: String, slideshowBrand: Option[String], categories: String)
  /** GetResult implicit for fetching SlideshowsCustomRow objects using plain SQL queries */
  implicit def GetResultSlideshowsCustomRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[SlideshowsCustomRow] = GR {
    prs =>
      import prs._
      SlideshowsCustomRow.tupled((<<[Int], <<[Int], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[String], <<?[String], <<[String]))
  }
  /** Table description of table slideshows_custom. Objects of this class serve as prototypes for rows in queries. */
  class SlideshowsCustom(genTag: Tag) extends Table[SlideshowsCustomRow](genTag, "slideshows_custom") {
    def * = (slideshowpartnerid, fkarticleid, slideshowContentpartner, slideshowTitle, slideshowSubtitle, slideshowAuthor, slideshowPhotographer, slideshowIntro, slideshowCoverimage, slideshowImageCaption, slideshowBrand, categories) <> (SlideshowsCustomRow.tupled, SlideshowsCustomRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (slideshowpartnerid.?, fkarticleid.?, slideshowContentpartner.?, slideshowTitle, slideshowSubtitle, slideshowAuthor, slideshowPhotographer, slideshowIntro, slideshowCoverimage, slideshowImageCaption.?, slideshowBrand, categories.?).shaped.<>({ r => import r._; _1.map(_ => SlideshowsCustomRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10.get, _11, _12.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column SlideshowPartnerID  */
    val slideshowpartnerid: Column[Int] = column[Int]("SlideshowPartnerID")
    /** Database column fkArticleID Default(0) */
    val fkarticleid: Column[Int] = column[Int]("fkArticleID", O.Default(0))
    /** Database column Slideshow_ContentPartner  */
    val slideshowContentpartner: Column[String] = column[String]("Slideshow_ContentPartner")
    /** Database column Slideshow_Title  */
    val slideshowTitle: Column[Option[String]] = column[Option[String]]("Slideshow_Title")
    /** Database column Slideshow_SubTitle  */
    val slideshowSubtitle: Column[Option[String]] = column[Option[String]]("Slideshow_SubTitle")
    /** Database column Slideshow_Author  */
    val slideshowAuthor: Column[Option[String]] = column[Option[String]]("Slideshow_Author")
    /** Database column Slideshow_Photographer  */
    val slideshowPhotographer: Column[Option[String]] = column[Option[String]]("Slideshow_Photographer")
    /** Database column Slideshow_Intro  */
    val slideshowIntro: Column[Option[String]] = column[Option[String]]("Slideshow_Intro")
    /** Database column Slideshow_CoverImage  */
    val slideshowCoverimage: Column[Option[String]] = column[Option[String]]("Slideshow_CoverImage")
    /** Database column Slideshow_Image_Caption  */
    val slideshowImageCaption: Column[String] = column[String]("Slideshow_Image_Caption")
    /** Database column Slideshow_Brand  */
    val slideshowBrand: Column[Option[String]] = column[Option[String]]("Slideshow_Brand")
    /** Database column Categories  */
    val categories: Column[String] = column[String]("Categories")
  }
  /** Collection-like TableQuery object for table SlideshowsCustom */
  lazy val SlideshowsCustom = new TableQuery(genTag => new SlideshowsCustom(genTag))

  /**
   * Entity class storing rows of table SlideshowSlides
   *  @param fkarticleid Database column fkArticleID Default(0)
   *  @param slideNumber Database column Slide_Number
   *  @param slideImage Database column Slide_Image
   *  @param slidePhotographer Database column Slide_Photographer
   *  @param slideTitle Database column Slide_Title
   *  @param slideBody Database column Slide_Body
   *  @param slideRecipeid Database column Slide_RecipeID
   */
  case class SlideshowSlidesRow(fkarticleid: Int = 0, slideNumber: Option[Int], slideImage: Option[String], slidePhotographer: Option[String], slideTitle: Option[String], slideBody: Option[String], slideRecipeid: Option[Int])
  /** GetResult implicit for fetching SlideshowSlidesRow objects using plain SQL queries */
  implicit def GetResultSlideshowSlidesRow(implicit e0: GR[Int], e1: GR[Option[Int]], e2: GR[Option[String]]): GR[SlideshowSlidesRow] = GR {
    prs =>
      import prs._
      SlideshowSlidesRow.tupled((<<[Int], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int]))
  }
  /** Table description of table slideshow_slides. Objects of this class serve as prototypes for rows in queries. */
  class SlideshowSlides(genTag: Tag) extends Table[SlideshowSlidesRow](genTag, "slideshow_slides") {
    def * = (fkarticleid, slideNumber, slideImage, slidePhotographer, slideTitle, slideBody, slideRecipeid) <> (SlideshowSlidesRow.tupled, SlideshowSlidesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (fkarticleid.?, slideNumber, slideImage, slidePhotographer, slideTitle, slideBody, slideRecipeid).shaped.<>({ r => import r._; _1.map(_ => SlideshowSlidesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column fkArticleID Default(0) */
    val fkarticleid: Column[Int] = column[Int]("fkArticleID", O.Default(0))
    /** Database column Slide_Number  */
    val slideNumber: Column[Option[Int]] = column[Option[Int]]("Slide_Number")
    /** Database column Slide_Image  */
    val slideImage: Column[Option[String]] = column[Option[String]]("Slide_Image")
    /** Database column Slide_Photographer  */
    val slidePhotographer: Column[Option[String]] = column[Option[String]]("Slide_Photographer")
    /** Database column Slide_Title  */
    val slideTitle: Column[Option[String]] = column[Option[String]]("Slide_Title")
    /** Database column Slide_Body  */
    val slideBody: Column[Option[String]] = column[Option[String]]("Slide_Body")
    /** Database column Slide_RecipeID  */
    val slideRecipeid: Column[Option[Int]] = column[Option[Int]]("Slide_RecipeID")
  }
  /** Collection-like TableQuery object for table SlideshowSlides */
  lazy val SlideshowSlides = new TableQuery(genTag => new SlideshowSlides(genTag))

  /**
   * Entity class storing rows of table SlideshowSlidesCustom
   *  @param fkslideshowpartnerid Database column fkSlideshowPartnerID Default(0)
   *  @param fkarticleid Database column fkArticleID
   *  @param slideNumber Database column Slide_Number
   *  @param slideImage Database column Slide_Image
   *  @param slideImageCaption Database column Slide_Image_Caption
   *  @param slidePhotographer Database column Slide_Photographer
   *  @param slideTitle Database column Slide_Title
   *  @param slideBody Database column Slide_Body
   *  @param slideRecipeid Database column Slide_RecipeID
   */
  case class SlideshowSlidesCustomRow(fkslideshowpartnerid: Int = 0, fkarticleid: Int, slideNumber: Option[Int], slideImage: Option[String], slideImageCaption: String, slidePhotographer: Option[String], slideTitle: Option[String], slideBody: Option[String], slideRecipeid: Option[Int])
  /** GetResult implicit for fetching SlideshowSlidesCustomRow objects using plain SQL queries */
  implicit def GetResultSlideshowSlidesCustomRow(implicit e0: GR[Int], e1: GR[Option[Int]], e2: GR[Option[String]], e3: GR[String]): GR[SlideshowSlidesCustomRow] = GR {
    prs =>
      import prs._
      SlideshowSlidesCustomRow.tupled((<<[Int], <<[Int], <<?[Int], <<?[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[Int]))
  }
  /** Table description of table slideshow_slides_custom. Objects of this class serve as prototypes for rows in queries. */
  class SlideshowSlidesCustom(genTag: Tag) extends Table[SlideshowSlidesCustomRow](genTag, "slideshow_slides_custom") {
    def * = (fkslideshowpartnerid, fkarticleid, slideNumber, slideImage, slideImageCaption, slidePhotographer, slideTitle, slideBody, slideRecipeid) <> (SlideshowSlidesCustomRow.tupled, SlideshowSlidesCustomRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (fkslideshowpartnerid.?, fkarticleid.?, slideNumber, slideImage, slideImageCaption.?, slidePhotographer, slideTitle, slideBody, slideRecipeid).shaped.<>({ r => import r._; _1.map(_ => SlideshowSlidesCustomRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6, _7, _8, _9))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column fkSlideshowPartnerID Default(0) */
    val fkslideshowpartnerid: Column[Int] = column[Int]("fkSlideshowPartnerID", O.Default(0))
    /** Database column fkArticleID  */
    val fkarticleid: Column[Int] = column[Int]("fkArticleID")
    /** Database column Slide_Number  */
    val slideNumber: Column[Option[Int]] = column[Option[Int]]("Slide_Number")
    /** Database column Slide_Image  */
    val slideImage: Column[Option[String]] = column[Option[String]]("Slide_Image")
    /** Database column Slide_Image_Caption  */
    val slideImageCaption: Column[String] = column[String]("Slide_Image_Caption")
    /** Database column Slide_Photographer  */
    val slidePhotographer: Column[Option[String]] = column[Option[String]]("Slide_Photographer")
    /** Database column Slide_Title  */
    val slideTitle: Column[Option[String]] = column[Option[String]]("Slide_Title")
    /** Database column Slide_Body  */
    val slideBody: Column[Option[String]] = column[Option[String]]("Slide_Body")
    /** Database column Slide_RecipeID  */
    val slideRecipeid: Column[Option[Int]] = column[Option[Int]]("Slide_RecipeID")
  }
  /** Collection-like TableQuery object for table SlideshowSlidesCustom */
  lazy val SlideshowSlidesCustom = new TableQuery(genTag => new SlideshowSlidesCustom(genTag))

  /**
   * Entity class storing rows of table Tags
   *  @param id Database column id AutoInc, PrimaryKey
   *  @param categoryId Database column category_id
   *  @param tag Database column tag
   */
  case class TagsRow(id: Int, categoryId: Int, tag: String)
  /** GetResult implicit for fetching TagsRow objects using plain SQL queries */
  implicit def GetResultTagsRow(implicit e0: GR[Int], e1: GR[String]): GR[TagsRow] = GR {
    prs =>
      import prs._
      TagsRow.tupled((<<[Int], <<[Int], <<[String]))
  }
  /** Table description of table tags. Objects of this class serve as prototypes for rows in queries. */
  class Tags(genTag: Tag) extends Table[TagsRow](genTag, "tags") {
    def * = (id, categoryId, tag) <> (TagsRow.tupled, TagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, categoryId.?, tag.?).shaped.<>({ r => import r._; _1.map(_ => TagsRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column category_id  */
    val categoryId: Column[Int] = column[Int]("category_id")
    /** Database column tag  */
    val tag: Column[String] = column[String]("tag")
  }
  /** Collection-like TableQuery object for table Tags */
  lazy val Tags = new TableQuery(genTag => new Tags(genTag))
}
