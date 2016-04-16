package models
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.driver.MySQLDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.driver.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{ GetResult => GR }

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(ArticleBatches.schema, Batches.schema, Categories.schema, EwlarticlecustomXml.schema, EwlarticleXml.schema, EwltipBatch.schema, EwltipsTechniquesXml.schema, MsnLinks.schema, RecipeBatches.schema, RecipeCategories.schema, RecipeCategoriesOld.schema, RecipeNutritionEsha.schema, Recipes.schema, Slideshows.schema, SlideshowsCustom.schema, SlideshowSlides.schema, SlideshowSlidesCustom.schema, Tags.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /**
   * Entity class storing rows of table ArticleBatches
   *  @param idBatch Database column id_batch SqlType(INT)
   *  @param idArticle Database column id_article SqlType(INT)
   *  @param version Database column version SqlType(INT), Default(1)
   */
  case class ArticleBatchesRow(idBatch: Int, idArticle: Int, version: Int = 1)
  /** GetResult implicit for fetching ArticleBatchesRow objects using plain SQL queries */
  implicit def GetResultArticleBatchesRow(implicit e0: GR[Int]): GR[ArticleBatchesRow] = GR {
    prs =>
      import prs._
      ArticleBatchesRow.tupled((<<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table article_batches. Objects of this class serve as prototypes for rows in queries. */
  class ArticleBatches(_tableTag: Tag) extends Table[ArticleBatchesRow](_tableTag, "article_batches") {
    def * = (idBatch, idArticle, version) <> (ArticleBatchesRow.tupled, ArticleBatchesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idBatch), Rep.Some(idArticle), Rep.Some(version)).shaped.<>({ r => import r._; _1.map(_ => ArticleBatchesRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id_batch SqlType(INT) */
    val idBatch: Rep[Int] = column[Int]("id_batch")
    /** Database column id_article SqlType(INT) */
    val idArticle: Rep[Int] = column[Int]("id_article")
    /** Database column version SqlType(INT), Default(1) */
    val version: Rep[Int] = column[Int]("version", O.Default(1))
  }
  /** Collection-like TableQuery object for table ArticleBatches */
  lazy val ArticleBatches = new TableQuery(tag => new ArticleBatches(tag))

  /**
   * Entity class storing rows of table Batches
   *  @param idBatch Database column id_batch SqlType(INT), PrimaryKey
   *  @param idPartner Database column id_partner SqlType(INT)
   *  @param description Database column description SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param notes Database column notes SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param deliveryDate Database column delivery_date SqlType(DATE), Default(None)
   */
  case class BatchesRow(idBatch: Int, idPartner: Int, description: Option[String] = None, notes: Option[String] = None, deliveryDate: Option[java.sql.Date] = None)
  /** GetResult implicit for fetching BatchesRow objects using plain SQL queries */
  implicit def GetResultBatchesRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[java.sql.Date]]): GR[BatchesRow] = GR {
    prs =>
      import prs._
      BatchesRow.tupled((<<[Int], <<[Int], <<?[String], <<?[String], <<?[java.sql.Date]))
  }
  /** Table description of table batches. Objects of this class serve as prototypes for rows in queries. */
  class Batches(_tableTag: Tag) extends Table[BatchesRow](_tableTag, "batches") {
    def * = (idBatch, idPartner, description, notes, deliveryDate) <> (BatchesRow.tupled, BatchesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idBatch), Rep.Some(idPartner), description, notes, deliveryDate).shaped.<>({ r => import r._; _1.map(_ => BatchesRow.tupled((_1.get, _2.get, _3, _4, _5))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id_batch SqlType(INT), PrimaryKey */
    val idBatch: Rep[Int] = column[Int]("id_batch", O.PrimaryKey)
    /** Database column id_partner SqlType(INT) */
    val idPartner: Rep[Int] = column[Int]("id_partner")
    /** Database column description SqlType(VARCHAR), Length(254,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(254, varying = true), O.Default(None))
    /** Database column notes SqlType(VARCHAR), Length(254,true), Default(None) */
    val notes: Rep[Option[String]] = column[Option[String]]("notes", O.Length(254, varying = true), O.Default(None))
    /** Database column delivery_date SqlType(DATE), Default(None) */
    val deliveryDate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("delivery_date", O.Default(None))
  }
  /** Collection-like TableQuery object for table Batches */
  lazy val Batches = new TableQuery(tag => new Batches(tag))

  /**
   * Entity class storing rows of table Categories
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param category Database column category SqlType(VARCHAR), Length(254,true)
   */
  case class CategoriesRow(id: Int, category: String)
  /** GetResult implicit for fetching CategoriesRow objects using plain SQL queries */
  implicit def GetResultCategoriesRow(implicit e0: GR[Int], e1: GR[String]): GR[CategoriesRow] = GR {
    prs =>
      import prs._
      CategoriesRow.tupled((<<[Int], <<[String]))
  }
  /** Table description of table categories. Objects of this class serve as prototypes for rows in queries. */
  class Categories(_tableTag: Tag) extends Table[CategoriesRow](_tableTag, "categories") {
    def * = (id, category) <> (CategoriesRow.tupled, CategoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(category)).shaped.<>({ r => import r._; _1.map(_ => CategoriesRow.tupled((_1.get, _2.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column category SqlType(VARCHAR), Length(254,true) */
    val category: Rep[String] = column[String]("category", O.Length(254, varying = true))
  }
  /** Collection-like TableQuery object for table Categories */
  lazy val Categories = new TableQuery(tag => new Categories(tag))

  /**
   * Entity class storing rows of table EwlarticlecustomXml
   *  @param articlepartnerid Database column ArticlePartnerID SqlType(INT)
   *  @param fkarticleid Database column fkArticleID SqlType(INT), Default(0)
   *  @param articleContentpartner Database column Article_ContentPartner SqlType(VARCHAR), Length(254,true)
   *  @param articleTitle Database column Article_Title SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param articleSubtitle Database column Article_SubTitle SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param articleAuthor Database column Article_Author SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param articlePhotographer Database column Article_Photographer SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param articleBody Database column Article_Body SqlType(VARCHAR), Length(254,true), Default(None)
   */
  case class EwlarticlecustomXmlRow(articlepartnerid: Int, fkarticleid: Int = 0, articleContentpartner: String, articleTitle: Option[String] = None, articleSubtitle: Option[String] = None, articleAuthor: Option[String] = None, articlePhotographer: Option[String] = None, articleBody: Option[String] = None)
  /** GetResult implicit for fetching EwlarticlecustomXmlRow objects using plain SQL queries */
  implicit def GetResultEwlarticlecustomXmlRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[EwlarticlecustomXmlRow] = GR {
    prs =>
      import prs._
      EwlarticlecustomXmlRow.tupled((<<[Int], <<[Int], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table EWLArticleCustom_XML. Objects of this class serve as prototypes for rows in queries. */
  class EwlarticlecustomXml(_tableTag: Tag) extends Table[EwlarticlecustomXmlRow](_tableTag, "EWLArticleCustom_XML") {
    def * = (articlepartnerid, fkarticleid, articleContentpartner, articleTitle, articleSubtitle, articleAuthor, articlePhotographer, articleBody) <> (EwlarticlecustomXmlRow.tupled, EwlarticlecustomXmlRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(articlepartnerid), Rep.Some(fkarticleid), Rep.Some(articleContentpartner), articleTitle, articleSubtitle, articleAuthor, articlePhotographer, articleBody).shaped.<>({ r => import r._; _1.map(_ => EwlarticlecustomXmlRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column ArticlePartnerID SqlType(INT) */
    val articlepartnerid: Rep[Int] = column[Int]("ArticlePartnerID")
    /** Database column fkArticleID SqlType(INT), Default(0) */
    val fkarticleid: Rep[Int] = column[Int]("fkArticleID", O.Default(0))
    /** Database column Article_ContentPartner SqlType(VARCHAR), Length(254,true) */
    val articleContentpartner: Rep[String] = column[String]("Article_ContentPartner", O.Length(254, varying = true))
    /** Database column Article_Title SqlType(VARCHAR), Length(254,true), Default(None) */
    val articleTitle: Rep[Option[String]] = column[Option[String]]("Article_Title", O.Length(254, varying = true), O.Default(None))
    /** Database column Article_SubTitle SqlType(VARCHAR), Length(254,true), Default(None) */
    val articleSubtitle: Rep[Option[String]] = column[Option[String]]("Article_SubTitle", O.Length(254, varying = true), O.Default(None))
    /** Database column Article_Author SqlType(VARCHAR), Length(254,true), Default(None) */
    val articleAuthor: Rep[Option[String]] = column[Option[String]]("Article_Author", O.Length(254, varying = true), O.Default(None))
    /** Database column Article_Photographer SqlType(VARCHAR), Length(254,true), Default(None) */
    val articlePhotographer: Rep[Option[String]] = column[Option[String]]("Article_Photographer", O.Length(254, varying = true), O.Default(None))
    /** Database column Article_Body SqlType(VARCHAR), Length(254,true), Default(None) */
    val articleBody: Rep[Option[String]] = column[Option[String]]("Article_Body", O.Length(254, varying = true), O.Default(None))
  }
  /** Collection-like TableQuery object for table EwlarticlecustomXml */
  lazy val EwlarticlecustomXml = new TableQuery(tag => new EwlarticlecustomXml(tag))

  /**
   * Entity class storing rows of table EwlarticleXml
   *  @param articleid Database column ArticleID SqlType(INT), Default(0)
   *  @param articleBrand Database column Article_Brand SqlType(VARCHAR), Length(254,true)
   *  @param articleTitle Database column Article_Title SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param articleSubtitle Database column Article_SubTitle SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param articleKeywords Database column Article_Keywords SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param articleByline Database column Article_ByLine SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param articlePhotographer Database column Article_Photographer SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param articleAbstract Database column Article_Abstract SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param articleBody Database column Article_Body SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param articleTitleShort Database column Article_Title_Short SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param articleBodyShort Database column Article_Body_Short SqlType(VARCHAR), Length(254,true), Default(None)
   */
  case class EwlarticleXmlRow(articleid: Int = 0, articleBrand: String, articleTitle: Option[String] = None, articleSubtitle: Option[String] = None, articleKeywords: Option[String] = None, articleByline: Option[String] = None, articlePhotographer: Option[String] = None, articleAbstract: Option[String] = None, articleBody: Option[String] = None, articleTitleShort: Option[String] = None, articleBodyShort: Option[String] = None)
  /** GetResult implicit for fetching EwlarticleXmlRow objects using plain SQL queries */
  implicit def GetResultEwlarticleXmlRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[EwlarticleXmlRow] = GR {
    prs =>
      import prs._
      EwlarticleXmlRow.tupled((<<[Int], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table EWLArticle_XML. Objects of this class serve as prototypes for rows in queries. */
  class EwlarticleXml(_tableTag: Tag) extends Table[EwlarticleXmlRow](_tableTag, "EWLArticle_XML") {
    def * = (articleid, articleBrand, articleTitle, articleSubtitle, articleKeywords, articleByline, articlePhotographer, articleAbstract, articleBody, articleTitleShort, articleBodyShort) <> (EwlarticleXmlRow.tupled, EwlarticleXmlRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(articleid), Rep.Some(articleBrand), articleTitle, articleSubtitle, articleKeywords, articleByline, articlePhotographer, articleAbstract, articleBody, articleTitleShort, articleBodyShort).shaped.<>({ r => import r._; _1.map(_ => EwlarticleXmlRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column ArticleID SqlType(INT), Default(0) */
    val articleid: Rep[Int] = column[Int]("ArticleID", O.Default(0))
    /** Database column Article_Brand SqlType(VARCHAR), Length(254,true) */
    val articleBrand: Rep[String] = column[String]("Article_Brand", O.Length(254, varying = true))
    /** Database column Article_Title SqlType(VARCHAR), Length(254,true), Default(None) */
    val articleTitle: Rep[Option[String]] = column[Option[String]]("Article_Title", O.Length(254, varying = true), O.Default(None))
    /** Database column Article_SubTitle SqlType(VARCHAR), Length(254,true), Default(None) */
    val articleSubtitle: Rep[Option[String]] = column[Option[String]]("Article_SubTitle", O.Length(254, varying = true), O.Default(None))
    /** Database column Article_Keywords SqlType(VARCHAR), Length(254,true), Default(None) */
    val articleKeywords: Rep[Option[String]] = column[Option[String]]("Article_Keywords", O.Length(254, varying = true), O.Default(None))
    /** Database column Article_ByLine SqlType(VARCHAR), Length(254,true), Default(None) */
    val articleByline: Rep[Option[String]] = column[Option[String]]("Article_ByLine", O.Length(254, varying = true), O.Default(None))
    /** Database column Article_Photographer SqlType(VARCHAR), Length(254,true), Default(None) */
    val articlePhotographer: Rep[Option[String]] = column[Option[String]]("Article_Photographer", O.Length(254, varying = true), O.Default(None))
    /** Database column Article_Abstract SqlType(VARCHAR), Length(254,true), Default(None) */
    val articleAbstract: Rep[Option[String]] = column[Option[String]]("Article_Abstract", O.Length(254, varying = true), O.Default(None))
    /** Database column Article_Body SqlType(VARCHAR), Length(254,true), Default(None) */
    val articleBody: Rep[Option[String]] = column[Option[String]]("Article_Body", O.Length(254, varying = true), O.Default(None))
    /** Database column Article_Title_Short SqlType(VARCHAR), Length(254,true), Default(None) */
    val articleTitleShort: Rep[Option[String]] = column[Option[String]]("Article_Title_Short", O.Length(254, varying = true), O.Default(None))
    /** Database column Article_Body_Short SqlType(VARCHAR), Length(254,true), Default(None) */
    val articleBodyShort: Rep[Option[String]] = column[Option[String]]("Article_Body_Short", O.Length(254, varying = true), O.Default(None))
  }
  /** Collection-like TableQuery object for table EwlarticleXml */
  lazy val EwlarticleXml = new TableQuery(tag => new EwlarticleXml(tag))

  /**
   * Entity class storing rows of table EwltipBatch
   *  @param transactionid Database column TransactionID SqlType(VARCHAR), PrimaryKey, Length(254,true)
   *  @param fkbatchid Database column fkBatchID SqlType(INT), Default(0)
   *  @param fktipid Database column fkTipID SqlType(INT), Default(0)
   */
  case class EwltipBatchRow(transactionid: String, fkbatchid: Int = 0, fktipid: Int = 0)
  /** GetResult implicit for fetching EwltipBatchRow objects using plain SQL queries */
  implicit def GetResultEwltipBatchRow(implicit e0: GR[String], e1: GR[Int]): GR[EwltipBatchRow] = GR {
    prs =>
      import prs._
      EwltipBatchRow.tupled((<<[String], <<[Int], <<[Int]))
  }
  /** Table description of table EWLTip_Batch. Objects of this class serve as prototypes for rows in queries. */
  class EwltipBatch(_tableTag: Tag) extends Table[EwltipBatchRow](_tableTag, "EWLTip_Batch") {
    def * = (transactionid, fkbatchid, fktipid) <> (EwltipBatchRow.tupled, EwltipBatchRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(transactionid), Rep.Some(fkbatchid), Rep.Some(fktipid)).shaped.<>({ r => import r._; _1.map(_ => EwltipBatchRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column TransactionID SqlType(VARCHAR), PrimaryKey, Length(254,true) */
    val transactionid: Rep[String] = column[String]("TransactionID", O.PrimaryKey, O.Length(254, varying = true))
    /** Database column fkBatchID SqlType(INT), Default(0) */
    val fkbatchid: Rep[Int] = column[Int]("fkBatchID", O.Default(0))
    /** Database column fkTipID SqlType(INT), Default(0) */
    val fktipid: Rep[Int] = column[Int]("fkTipID", O.Default(0))
  }
  /** Collection-like TableQuery object for table EwltipBatch */
  lazy val EwltipBatch = new TableQuery(tag => new EwltipBatch(tag))

  /**
   * Entity class storing rows of table EwltipsTechniquesXml
   *  @param tipid Database column TipID SqlType(INT), Default(0)
   *  @param tiptitle Database column TipTitle SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param tipkeywords Database column TipKeywords SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param tipbody Database column TipBody SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param tipcategory Database column TipCategory SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param tiphealthtopic Database column TipHealthTopic SqlType(VARCHAR), Length(254,true), Default(None)
   */
  case class EwltipsTechniquesXmlRow(tipid: Int = 0, tiptitle: Option[String] = None, tipkeywords: Option[String] = None, tipbody: Option[String] = None, tipcategory: Option[String] = None, tiphealthtopic: Option[String] = None)
  /** GetResult implicit for fetching EwltipsTechniquesXmlRow objects using plain SQL queries */
  implicit def GetResultEwltipsTechniquesXmlRow(implicit e0: GR[Int], e1: GR[Option[String]]): GR[EwltipsTechniquesXmlRow] = GR {
    prs =>
      import prs._
      EwltipsTechniquesXmlRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table EWLTips_Techniques_XML. Objects of this class serve as prototypes for rows in queries. */
  class EwltipsTechniquesXml(_tableTag: Tag) extends Table[EwltipsTechniquesXmlRow](_tableTag, "EWLTips_Techniques_XML") {
    def * = (tipid, tiptitle, tipkeywords, tipbody, tipcategory, tiphealthtopic) <> (EwltipsTechniquesXmlRow.tupled, EwltipsTechniquesXmlRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(tipid), tiptitle, tipkeywords, tipbody, tipcategory, tiphealthtopic).shaped.<>({ r => import r._; _1.map(_ => EwltipsTechniquesXmlRow.tupled((_1.get, _2, _3, _4, _5, _6))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column TipID SqlType(INT), Default(0) */
    val tipid: Rep[Int] = column[Int]("TipID", O.Default(0))
    /** Database column TipTitle SqlType(VARCHAR), Length(254,true), Default(None) */
    val tiptitle: Rep[Option[String]] = column[Option[String]]("TipTitle", O.Length(254, varying = true), O.Default(None))
    /** Database column TipKeywords SqlType(VARCHAR), Length(254,true), Default(None) */
    val tipkeywords: Rep[Option[String]] = column[Option[String]]("TipKeywords", O.Length(254, varying = true), O.Default(None))
    /** Database column TipBody SqlType(VARCHAR), Length(254,true), Default(None) */
    val tipbody: Rep[Option[String]] = column[Option[String]]("TipBody", O.Length(254, varying = true), O.Default(None))
    /** Database column TipCategory SqlType(VARCHAR), Length(254,true), Default(None) */
    val tipcategory: Rep[Option[String]] = column[Option[String]]("TipCategory", O.Length(254, varying = true), O.Default(None))
    /** Database column TipHealthTopic SqlType(VARCHAR), Length(254,true), Default(None) */
    val tiphealthtopic: Rep[Option[String]] = column[Option[String]]("TipHealthTopic", O.Length(254, varying = true), O.Default(None))
  }
  /** Collection-like TableQuery object for table EwltipsTechniquesXml */
  lazy val EwltipsTechniquesXml = new TableQuery(tag => new EwltipsTechniquesXml(tag))

  /**
   * Entity class storing rows of table MsnLinks
   *  @param fkarticleid Database column fkArticleID SqlType(INT)
   *  @param alias Database column alias SqlType(VARCHAR), Length(254,true)
   *  @param link Database column link SqlType(VARCHAR), Length(254,true)
   *  @param position Database column position SqlType(INT)
   */
  case class MsnLinksRow(fkarticleid: Int, alias: String, link: String, position: Int)
  /** GetResult implicit for fetching MsnLinksRow objects using plain SQL queries */
  implicit def GetResultMsnLinksRow(implicit e0: GR[Int], e1: GR[String]): GR[MsnLinksRow] = GR {
    prs =>
      import prs._
      MsnLinksRow.tupled((<<[Int], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table msn_links. Objects of this class serve as prototypes for rows in queries. */
  class MsnLinks(_tableTag: Tag) extends Table[MsnLinksRow](_tableTag, "msn_links") {
    def * = (fkarticleid, alias, link, position) <> (MsnLinksRow.tupled, MsnLinksRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(fkarticleid), Rep.Some(alias), Rep.Some(link), Rep.Some(position)).shaped.<>({ r => import r._; _1.map(_ => MsnLinksRow.tupled((_1.get, _2.get, _3.get, _4.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column fkArticleID SqlType(INT) */
    val fkarticleid: Rep[Int] = column[Int]("fkArticleID")
    /** Database column alias SqlType(VARCHAR), Length(254,true) */
    val alias: Rep[String] = column[String]("alias", O.Length(254, varying = true))
    /** Database column link SqlType(VARCHAR), Length(254,true) */
    val link: Rep[String] = column[String]("link", O.Length(254, varying = true))
    /** Database column position SqlType(INT) */
    val position: Rep[Int] = column[Int]("position")
  }
  /** Collection-like TableQuery object for table MsnLinks */
  lazy val MsnLinks = new TableQuery(tag => new MsnLinks(tag))

  /**
   * Entity class storing rows of table RecipeBatches
   *  @param idBatch Database column id_batch SqlType(INT)
   *  @param idRecipe Database column id_recipe SqlType(INT)
   */
  case class RecipeBatchesRow(idBatch: Int, idRecipe: Int)
  /** GetResult implicit for fetching RecipeBatchesRow objects using plain SQL queries */
  implicit def GetResultRecipeBatchesRow(implicit e0: GR[Int]): GR[RecipeBatchesRow] = GR {
    prs =>
      import prs._
      RecipeBatchesRow.tupled((<<[Int], <<[Int]))
  }
  /** Table description of table recipe_batches. Objects of this class serve as prototypes for rows in queries. */
  class RecipeBatches(_tableTag: Tag) extends Table[RecipeBatchesRow](_tableTag, "recipe_batches") {
    def * = (idBatch, idRecipe) <> (RecipeBatchesRow.tupled, RecipeBatchesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(idBatch), Rep.Some(idRecipe)).shaped.<>({ r => import r._; _1.map(_ => RecipeBatchesRow.tupled((_1.get, _2.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id_batch SqlType(INT) */
    val idBatch: Rep[Int] = column[Int]("id_batch")
    /** Database column id_recipe SqlType(INT) */
    val idRecipe: Rep[Int] = column[Int]("id_recipe")

    /** Index over (idBatch,idRecipe) (database name id_batch) */
    val index1 = index("id_batch", (idBatch, idRecipe))
  }
  /** Collection-like TableQuery object for table RecipeBatches */
  lazy val RecipeBatches = new TableQuery(tag => new RecipeBatches(tag))

  /**
   * Entity class storing rows of table RecipeCategories
   *  @param id Database column id SqlType(INT)
   *  @param category Database column category SqlType(VARCHAR), Length(254,true)
   *  @param tag Database column tag SqlType(VARCHAR), Length(254,true)
   */
  case class RecipeCategoriesRow(id: Int, category: String, tag: String)
  /** GetResult implicit for fetching RecipeCategoriesRow objects using plain SQL queries */
  implicit def GetResultRecipeCategoriesRow(implicit e0: GR[Int], e1: GR[String]): GR[RecipeCategoriesRow] = GR {
    prs =>
      import prs._
      RecipeCategoriesRow.tupled((<<[Int], <<[String], <<[String]))
  }
  /** Table description of table recipe_categories. Objects of this class serve as prototypes for rows in queries. */
  class RecipeCategories(_tableTag: Tag) extends Table[RecipeCategoriesRow](_tableTag, "recipe_categories") {
    def * = (id, category, tag) <> (RecipeCategoriesRow.tupled, RecipeCategoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(category), Rep.Some(tag)).shaped.<>({ r => import r._; _1.map(_ => RecipeCategoriesRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT) */
    val id: Rep[Int] = column[Int]("id")
    /** Database column category SqlType(VARCHAR), Length(254,true) */
    val category: Rep[String] = column[String]("category", O.Length(254, varying = true))
    /** Database column tag SqlType(VARCHAR), Length(254,true) */
    val tag: Rep[String] = column[String]("tag", O.Length(254, varying = true))

    /** Index over (id) (database name id) */
    val index1 = index("id", id)
  }
  /** Collection-like TableQuery object for table RecipeCategories */
  lazy val RecipeCategories = new TableQuery(tag => new RecipeCategories(tag))

  /**
   * Entity class storing rows of table RecipeCategoriesOld
   *  @param id Database column id SqlType(INT)
   *  @param category Database column category SqlType(VARCHAR), Length(254,true)
   *  @param tag Database column tag SqlType(VARCHAR), Length(254,true)
   */
  case class RecipeCategoriesOldRow(id: Int, category: String, tag: String)
  /** GetResult implicit for fetching RecipeCategoriesOldRow objects using plain SQL queries */
  implicit def GetResultRecipeCategoriesOldRow(implicit e0: GR[Int], e1: GR[String]): GR[RecipeCategoriesOldRow] = GR {
    prs =>
      import prs._
      RecipeCategoriesOldRow.tupled((<<[Int], <<[String], <<[String]))
  }
  /** Table description of table recipe_categories_old. Objects of this class serve as prototypes for rows in queries. */
  class RecipeCategoriesOld(_tableTag: Tag) extends Table[RecipeCategoriesOldRow](_tableTag, "recipe_categories_old") {
    def * = (id, category, tag) <> (RecipeCategoriesOldRow.tupled, RecipeCategoriesOldRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(category), Rep.Some(tag)).shaped.<>({ r => import r._; _1.map(_ => RecipeCategoriesOldRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT) */
    val id: Rep[Int] = column[Int]("id")
    /** Database column category SqlType(VARCHAR), Length(254,true) */
    val category: Rep[String] = column[String]("category", O.Length(254, varying = true))
    /** Database column tag SqlType(VARCHAR), Length(254,true) */
    val tag: Rep[String] = column[String]("tag", O.Length(254, varying = true))

    /** Index over (id) (database name id) */
    val index1 = index("id", id)
  }
  /** Collection-like TableQuery object for table RecipeCategoriesOld */
  lazy val RecipeCategoriesOld = new TableQuery(tag => new RecipeCategoriesOld(tag))

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
  class RecipeNutritionEsha(_tableTag: Tag) extends Table[RecipeNutritionEshaRow](_tableTag, "recipe_nutrition_esha") {
    def * = id :: calories :: fat :: satfat :: monofat :: cholesterol :: carbohydrates :: protein :: fiber :: sodium :: potassium :: calcium :: chromium :: folate :: iron :: magnesium :: omega3 :: omega6 :: selenium :: transfat :: vitamina :: vitaminb3 :: vitaminb12 :: vitaminc :: vitamine :: zinc :: totalsugars :: mealtype :: HNil

    /** Database column id SqlType(INT), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column calories SqlType(INT) */
    val calories: Rep[Int] = column[Int]("calories")
    /** Database column fat SqlType(INT) */
    val fat: Rep[Int] = column[Int]("fat")
    /** Database column satFat SqlType(INT) */
    val satfat: Rep[Int] = column[Int]("satFat")
    /** Database column monoFat SqlType(INT) */
    val monofat: Rep[Int] = column[Int]("monoFat")
    /** Database column cholesterol SqlType(INT) */
    val cholesterol: Rep[Int] = column[Int]("cholesterol")
    /** Database column carbohydrates SqlType(INT) */
    val carbohydrates: Rep[Int] = column[Int]("carbohydrates")
    /** Database column protein SqlType(INT) */
    val protein: Rep[Int] = column[Int]("protein")
    /** Database column fiber SqlType(INT) */
    val fiber: Rep[Int] = column[Int]("fiber")
    /** Database column sodium SqlType(INT) */
    val sodium: Rep[Int] = column[Int]("sodium")
    /** Database column potassium SqlType(INT) */
    val potassium: Rep[Int] = column[Int]("potassium")
    /** Database column calcium SqlType(INT) */
    val calcium: Rep[Int] = column[Int]("calcium")
    /** Database column chromium SqlType(INT) */
    val chromium: Rep[Int] = column[Int]("chromium")
    /** Database column folate SqlType(INT) */
    val folate: Rep[Int] = column[Int]("folate")
    /** Database column iron SqlType(INT) */
    val iron: Rep[Int] = column[Int]("iron")
    /** Database column magnesium SqlType(INT) */
    val magnesium: Rep[Int] = column[Int]("magnesium")
    /** Database column omega3 SqlType(INT) */
    val omega3: Rep[Int] = column[Int]("omega3")
    /** Database column omega6 SqlType(INT) */
    val omega6: Rep[Int] = column[Int]("omega6")
    /** Database column selenium SqlType(INT) */
    val selenium: Rep[Int] = column[Int]("selenium")
    /** Database column transFat SqlType(INT) */
    val transfat: Rep[Int] = column[Int]("transFat")
    /** Database column vitaminA SqlType(INT) */
    val vitamina: Rep[Int] = column[Int]("vitaminA")
    /** Database column vitaminB3 SqlType(INT) */
    val vitaminb3: Rep[Int] = column[Int]("vitaminB3")
    /** Database column VitaminB12 SqlType(INT) */
    val vitaminb12: Rep[Int] = column[Int]("VitaminB12")
    /** Database column vitaminC SqlType(INT) */
    val vitaminc: Rep[Int] = column[Int]("vitaminC")
    /** Database column vitaminE SqlType(INT) */
    val vitamine: Rep[Int] = column[Int]("vitaminE")
    /** Database column zinc SqlType(INT) */
    val zinc: Rep[Int] = column[Int]("zinc")
    /** Database column totalSugars SqlType(INT) */
    val totalsugars: Rep[Int] = column[Int]("totalSugars")
    /** Database column mealType SqlType(INT) */
    val mealtype: Rep[Int] = column[Int]("mealType")
  }
  /** Collection-like TableQuery object for table RecipeNutritionEsha */
  lazy val RecipeNutritionEsha = new TableQuery(tag => new RecipeNutritionEsha(tag))

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
  class Recipes(_tableTag: Tag) extends Table[RecipesRow](_tableTag, "recipes") {
    def * = id :: title :: brand :: author :: photographer :: image :: servings :: servingsize :: `yield` :: totaltime :: totaltimedesc :: activetime :: activetimedesc :: hednote :: servingsuggestion :: makeaheadtip :: equipment :: ingredientxml :: method :: tips :: nutritionBonus :: nutritionNote :: nutritionCarbservings :: nutritionExchanges :: nutritionServing :: nutritionAddedsugars :: HNil

    /** Database column id SqlType(INT) */
    val id: Rep[Int] = column[Int]("id")
    /** Database column title SqlType(VARCHAR), Length(254,true) */
    val title: Rep[String] = column[String]("title", O.Length(254, varying = true))
    /** Database column brand SqlType(VARCHAR), Length(254,true) */
    val brand: Rep[String] = column[String]("brand", O.Length(254, varying = true))
    /** Database column author SqlType(VARCHAR), Length(254,true) */
    val author: Rep[String] = column[String]("author", O.Length(254, varying = true))
    /** Database column photographer SqlType(VARCHAR), Length(254,true) */
    val photographer: Rep[String] = column[String]("photographer", O.Length(254, varying = true))
    /** Database column image SqlType(VARCHAR), Length(254,true) */
    val image: Rep[String] = column[String]("image", O.Length(254, varying = true))
    /** Database column servings SqlType(INT) */
    val servings: Rep[Int] = column[Int]("servings")
    /** Database column servingSize SqlType(VARCHAR), Length(254,true) */
    val servingsize: Rep[String] = column[String]("servingSize", O.Length(254, varying = true))
    /**
     * Database column yield SqlType(VARCHAR), Length(254,true)
     *  NOTE: The name was escaped because it collided with a Scala keyword.
     */
    val `yield`: Rep[String] = column[String]("yield", O.Length(254, varying = true))
    /** Database column totalTime SqlType(INT) */
    val totaltime: Rep[Int] = column[Int]("totalTime")
    /** Database column totalTimeDesc SqlType(VARCHAR), Length(254,true) */
    val totaltimedesc: Rep[String] = column[String]("totalTimeDesc", O.Length(254, varying = true))
    /** Database column activeTime SqlType(INT) */
    val activetime: Rep[Int] = column[Int]("activeTime")
    /** Database column activeTimeDesc SqlType(VARCHAR), Length(254,true) */
    val activetimedesc: Rep[String] = column[String]("activeTimeDesc", O.Length(254, varying = true))
    /** Database column hednote SqlType(VARCHAR), Length(254,true) */
    val hednote: Rep[String] = column[String]("hednote", O.Length(254, varying = true))
    /** Database column servingSuggestion SqlType(VARCHAR), Length(254,true) */
    val servingsuggestion: Rep[String] = column[String]("servingSuggestion", O.Length(254, varying = true))
    /** Database column makeAheadTip SqlType(VARCHAR), Length(254,true) */
    val makeaheadtip: Rep[String] = column[String]("makeAheadTip", O.Length(254, varying = true))
    /** Database column equipment SqlType(VARCHAR), Length(254,true) */
    val equipment: Rep[String] = column[String]("equipment", O.Length(254, varying = true))
    /** Database column ingredientXml SqlType(VARCHAR), Length(254,true) */
    val ingredientxml: Rep[String] = column[String]("ingredientXml", O.Length(254, varying = true))
    /** Database column method SqlType(VARCHAR), Length(254,true) */
    val method: Rep[String] = column[String]("method", O.Length(254, varying = true))
    /** Database column tips SqlType(VARCHAR), Length(254,true) */
    val tips: Rep[String] = column[String]("tips", O.Length(254, varying = true))
    /** Database column nutrition_bonus SqlType(VARCHAR), Length(254,true) */
    val nutritionBonus: Rep[String] = column[String]("nutrition_bonus", O.Length(254, varying = true))
    /** Database column nutrition_note SqlType(VARCHAR), Length(254,true) */
    val nutritionNote: Rep[String] = column[String]("nutrition_note", O.Length(254, varying = true))
    /** Database column nutrition_carbServings SqlType(VARCHAR), Length(254,true) */
    val nutritionCarbservings: Rep[String] = column[String]("nutrition_carbServings", O.Length(254, varying = true))
    /** Database column nutrition_exchanges SqlType(VARCHAR), Length(254,true) */
    val nutritionExchanges: Rep[String] = column[String]("nutrition_exchanges", O.Length(254, varying = true))
    /** Database column nutrition_serving SqlType(VARCHAR), Length(254,true) */
    val nutritionServing: Rep[String] = column[String]("nutrition_serving", O.Length(254, varying = true))
    /** Database column nutrition_addedSugars SqlType(INT) */
    val nutritionAddedsugars: Rep[Int] = column[Int]("nutrition_addedSugars")

    /** Uniqueness Index over (id) (database name id) */
    val index1 = index("id", id :: HNil, unique = true)
  }
  /** Collection-like TableQuery object for table Recipes */
  lazy val Recipes = new TableQuery(tag => new Recipes(tag))

  /**
   * Entity class storing rows of table Slideshows
   *  @param articleid Database column ArticleID SqlType(INT), Default(0)
   *  @param slideshowTitle Database column Slideshow_Title SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideshowSubtitle Database column Slideshow_SubTitle SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideshowAuthor Database column Slideshow_Author SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideshowPhotographer Database column Slideshow_Photographer SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideshowIntro Database column Slideshow_Intro SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideshowCoverimage Database column Slideshow_CoverImage SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideshowBrand Database column Slideshow_Brand SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param categories Database column Categories SqlType(VARCHAR), Length(254,true)
   */
  case class SlideshowsRow(articleid: Int = 0, slideshowTitle: Option[String] = None, slideshowSubtitle: Option[String] = None, slideshowAuthor: Option[String] = None, slideshowPhotographer: Option[String] = None, slideshowIntro: Option[String] = None, slideshowCoverimage: Option[String] = None, slideshowBrand: Option[String] = None, categories: String)
  /** GetResult implicit for fetching SlideshowsRow objects using plain SQL queries */
  implicit def GetResultSlideshowsRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[String]): GR[SlideshowsRow] = GR {
    prs =>
      import prs._
      SlideshowsRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[String]))
  }
  /** Table description of table slideshows. Objects of this class serve as prototypes for rows in queries. */
  class Slideshows(_tableTag: Tag) extends Table[SlideshowsRow](_tableTag, "slideshows") {
    def * = (articleid, slideshowTitle, slideshowSubtitle, slideshowAuthor, slideshowPhotographer, slideshowIntro, slideshowCoverimage, slideshowBrand, categories) <> (SlideshowsRow.tupled, SlideshowsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(articleid), slideshowTitle, slideshowSubtitle, slideshowAuthor, slideshowPhotographer, slideshowIntro, slideshowCoverimage, slideshowBrand, Rep.Some(categories)).shaped.<>({ r => import r._; _1.map(_ => SlideshowsRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column ArticleID SqlType(INT), Default(0) */
    val articleid: Rep[Int] = column[Int]("ArticleID", O.Default(0))
    /** Database column Slideshow_Title SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowTitle: Rep[Option[String]] = column[Option[String]]("Slideshow_Title", O.Length(254, varying = true), O.Default(None))
    /** Database column Slideshow_SubTitle SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowSubtitle: Rep[Option[String]] = column[Option[String]]("Slideshow_SubTitle", O.Length(254, varying = true), O.Default(None))
    /** Database column Slideshow_Author SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowAuthor: Rep[Option[String]] = column[Option[String]]("Slideshow_Author", O.Length(254, varying = true), O.Default(None))
    /** Database column Slideshow_Photographer SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowPhotographer: Rep[Option[String]] = column[Option[String]]("Slideshow_Photographer", O.Length(254, varying = true), O.Default(None))
    /** Database column Slideshow_Intro SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowIntro: Rep[Option[String]] = column[Option[String]]("Slideshow_Intro", O.Length(254, varying = true), O.Default(None))
    /** Database column Slideshow_CoverImage SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowCoverimage: Rep[Option[String]] = column[Option[String]]("Slideshow_CoverImage", O.Length(254, varying = true), O.Default(None))
    /** Database column Slideshow_Brand SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowBrand: Rep[Option[String]] = column[Option[String]]("Slideshow_Brand", O.Length(254, varying = true), O.Default(None))
    /** Database column Categories SqlType(VARCHAR), Length(254,true) */
    val categories: Rep[String] = column[String]("Categories", O.Length(254, varying = true))
  }
  /** Collection-like TableQuery object for table Slideshows */
  lazy val Slideshows = new TableQuery(tag => new Slideshows(tag))

  /**
   * Entity class storing rows of table SlideshowsCustom
   *  @param slideshowpartnerid Database column SlideshowPartnerID SqlType(INT)
   *  @param fkarticleid Database column fkArticleID SqlType(INT), Default(0)
   *  @param slideshowContentpartner Database column Slideshow_ContentPartner SqlType(VARCHAR), Length(254,true)
   *  @param slideshowTitle Database column Slideshow_Title SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideshowSubtitle Database column Slideshow_SubTitle SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideshowAuthor Database column Slideshow_Author SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideshowPhotographer Database column Slideshow_Photographer SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideshowIntro Database column Slideshow_Intro SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideshowCoverimage Database column Slideshow_CoverImage SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideshowImageCaption Database column Slideshow_Image_Caption SqlType(VARCHAR), Length(254,true)
   *  @param slideshowBrand Database column Slideshow_Brand SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param categories Database column Categories SqlType(VARCHAR), Length(254,true)
   */
  case class SlideshowsCustomRow(slideshowpartnerid: Int, fkarticleid: Int = 0, slideshowContentpartner: String, slideshowTitle: Option[String] = None, slideshowSubtitle: Option[String] = None, slideshowAuthor: Option[String] = None, slideshowPhotographer: Option[String] = None, slideshowIntro: Option[String] = None, slideshowCoverimage: Option[String] = None, slideshowImageCaption: String, slideshowBrand: Option[String] = None, categories: String)
  /** GetResult implicit for fetching SlideshowsCustomRow objects using plain SQL queries */
  implicit def GetResultSlideshowsCustomRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[SlideshowsCustomRow] = GR {
    prs =>
      import prs._
      SlideshowsCustomRow.tupled((<<[Int], <<[Int], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[String], <<?[String], <<[String]))
  }
  /** Table description of table slideshows_custom. Objects of this class serve as prototypes for rows in queries. */
  class SlideshowsCustom(_tableTag: Tag) extends Table[SlideshowsCustomRow](_tableTag, "slideshows_custom") {
    def * = (slideshowpartnerid, fkarticleid, slideshowContentpartner, slideshowTitle, slideshowSubtitle, slideshowAuthor, slideshowPhotographer, slideshowIntro, slideshowCoverimage, slideshowImageCaption, slideshowBrand, categories) <> (SlideshowsCustomRow.tupled, SlideshowsCustomRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(slideshowpartnerid), Rep.Some(fkarticleid), Rep.Some(slideshowContentpartner), slideshowTitle, slideshowSubtitle, slideshowAuthor, slideshowPhotographer, slideshowIntro, slideshowCoverimage, Rep.Some(slideshowImageCaption), slideshowBrand, Rep.Some(categories)).shaped.<>({ r => import r._; _1.map(_ => SlideshowsCustomRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10.get, _11, _12.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column SlideshowPartnerID SqlType(INT) */
    val slideshowpartnerid: Rep[Int] = column[Int]("SlideshowPartnerID")
    /** Database column fkArticleID SqlType(INT), Default(0) */
    val fkarticleid: Rep[Int] = column[Int]("fkArticleID", O.Default(0))
    /** Database column Slideshow_ContentPartner SqlType(VARCHAR), Length(254,true) */
    val slideshowContentpartner: Rep[String] = column[String]("Slideshow_ContentPartner", O.Length(254, varying = true))
    /** Database column Slideshow_Title SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowTitle: Rep[Option[String]] = column[Option[String]]("Slideshow_Title", O.Length(254, varying = true), O.Default(None))
    /** Database column Slideshow_SubTitle SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowSubtitle: Rep[Option[String]] = column[Option[String]]("Slideshow_SubTitle", O.Length(254, varying = true), O.Default(None))
    /** Database column Slideshow_Author SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowAuthor: Rep[Option[String]] = column[Option[String]]("Slideshow_Author", O.Length(254, varying = true), O.Default(None))
    /** Database column Slideshow_Photographer SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowPhotographer: Rep[Option[String]] = column[Option[String]]("Slideshow_Photographer", O.Length(254, varying = true), O.Default(None))
    /** Database column Slideshow_Intro SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowIntro: Rep[Option[String]] = column[Option[String]]("Slideshow_Intro", O.Length(254, varying = true), O.Default(None))
    /** Database column Slideshow_CoverImage SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowCoverimage: Rep[Option[String]] = column[Option[String]]("Slideshow_CoverImage", O.Length(254, varying = true), O.Default(None))
    /** Database column Slideshow_Image_Caption SqlType(VARCHAR), Length(254,true) */
    val slideshowImageCaption: Rep[String] = column[String]("Slideshow_Image_Caption", O.Length(254, varying = true))
    /** Database column Slideshow_Brand SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideshowBrand: Rep[Option[String]] = column[Option[String]]("Slideshow_Brand", O.Length(254, varying = true), O.Default(None))
    /** Database column Categories SqlType(VARCHAR), Length(254,true) */
    val categories: Rep[String] = column[String]("Categories", O.Length(254, varying = true))
  }
  /** Collection-like TableQuery object for table SlideshowsCustom */
  lazy val SlideshowsCustom = new TableQuery(tag => new SlideshowsCustom(tag))

  /**
   * Entity class storing rows of table SlideshowSlides
   *  @param fkarticleid Database column fkArticleID SqlType(INT), Default(0)
   *  @param slideNumber Database column Slide_Number SqlType(INT), Default(None)
   *  @param slideImage Database column Slide_Image SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slidePhotographer Database column Slide_Photographer SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideTitle Database column Slide_Title SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideBody Database column Slide_Body SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideRecipeid Database column Slide_RecipeID SqlType(INT), Default(None)
   */
  case class SlideshowSlidesRow(fkarticleid: Int = 0, slideNumber: Option[Int] = None, slideImage: Option[String] = None, slidePhotographer: Option[String] = None, slideTitle: Option[String] = None, slideBody: Option[String] = None, slideRecipeid: Option[Int] = None)
  /** GetResult implicit for fetching SlideshowSlidesRow objects using plain SQL queries */
  implicit def GetResultSlideshowSlidesRow(implicit e0: GR[Int], e1: GR[Option[Int]], e2: GR[Option[String]]): GR[SlideshowSlidesRow] = GR {
    prs =>
      import prs._
      SlideshowSlidesRow.tupled((<<[Int], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int]))
  }
  /** Table description of table slideshow_slides. Objects of this class serve as prototypes for rows in queries. */
  class SlideshowSlides(_tableTag: Tag) extends Table[SlideshowSlidesRow](_tableTag, "slideshow_slides") {
    def * = (fkarticleid, slideNumber, slideImage, slidePhotographer, slideTitle, slideBody, slideRecipeid) <> (SlideshowSlidesRow.tupled, SlideshowSlidesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(fkarticleid), slideNumber, slideImage, slidePhotographer, slideTitle, slideBody, slideRecipeid).shaped.<>({ r => import r._; _1.map(_ => SlideshowSlidesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column fkArticleID SqlType(INT), Default(0) */
    val fkarticleid: Rep[Int] = column[Int]("fkArticleID", O.Default(0))
    /** Database column Slide_Number SqlType(INT), Default(None) */
    val slideNumber: Rep[Option[Int]] = column[Option[Int]]("Slide_Number", O.Default(None))
    /** Database column Slide_Image SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideImage: Rep[Option[String]] = column[Option[String]]("Slide_Image", O.Length(254, varying = true), O.Default(None))
    /** Database column Slide_Photographer SqlType(VARCHAR), Length(254,true), Default(None) */
    val slidePhotographer: Rep[Option[String]] = column[Option[String]]("Slide_Photographer", O.Length(254, varying = true), O.Default(None))
    /** Database column Slide_Title SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideTitle: Rep[Option[String]] = column[Option[String]]("Slide_Title", O.Length(254, varying = true), O.Default(None))
    /** Database column Slide_Body SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideBody: Rep[Option[String]] = column[Option[String]]("Slide_Body", O.Length(254, varying = true), O.Default(None))
    /** Database column Slide_RecipeID SqlType(INT), Default(None) */
    val slideRecipeid: Rep[Option[Int]] = column[Option[Int]]("Slide_RecipeID", O.Default(None))
  }
  /** Collection-like TableQuery object for table SlideshowSlides */
  lazy val SlideshowSlides = new TableQuery(tag => new SlideshowSlides(tag))

  /**
   * Entity class storing rows of table SlideshowSlidesCustom
   *  @param fkslideshowpartnerid Database column fkSlideshowPartnerID SqlType(INT), Default(0)
   *  @param fkarticleid Database column fkArticleID SqlType(INT)
   *  @param slideNumber Database column Slide_Number SqlType(INT), Default(None)
   *  @param slideImage Database column Slide_Image SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideImageCaption Database column Slide_Image_Caption SqlType(VARCHAR), Length(254,true)
   *  @param slidePhotographer Database column Slide_Photographer SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideTitle Database column Slide_Title SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideBody Database column Slide_Body SqlType(VARCHAR), Length(254,true), Default(None)
   *  @param slideRecipeid Database column Slide_RecipeID SqlType(INT), Default(None)
   */
  case class SlideshowSlidesCustomRow(fkslideshowpartnerid: Int = 0, fkarticleid: Int, slideNumber: Option[Int] = None, slideImage: Option[String] = None, slideImageCaption: String, slidePhotographer: Option[String] = None, slideTitle: Option[String] = None, slideBody: Option[String] = None, slideRecipeid: Option[Int] = None)
  /** GetResult implicit for fetching SlideshowSlidesCustomRow objects using plain SQL queries */
  implicit def GetResultSlideshowSlidesCustomRow(implicit e0: GR[Int], e1: GR[Option[Int]], e2: GR[Option[String]], e3: GR[String]): GR[SlideshowSlidesCustomRow] = GR {
    prs =>
      import prs._
      SlideshowSlidesCustomRow.tupled((<<[Int], <<[Int], <<?[Int], <<?[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[Int]))
  }
  /** Table description of table slideshow_slides_custom. Objects of this class serve as prototypes for rows in queries. */
  class SlideshowSlidesCustom(_tableTag: Tag) extends Table[SlideshowSlidesCustomRow](_tableTag, "slideshow_slides_custom") {
    def * = (fkslideshowpartnerid, fkarticleid, slideNumber, slideImage, slideImageCaption, slidePhotographer, slideTitle, slideBody, slideRecipeid) <> (SlideshowSlidesCustomRow.tupled, SlideshowSlidesCustomRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(fkslideshowpartnerid), Rep.Some(fkarticleid), slideNumber, slideImage, Rep.Some(slideImageCaption), slidePhotographer, slideTitle, slideBody, slideRecipeid).shaped.<>({ r => import r._; _1.map(_ => SlideshowSlidesCustomRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6, _7, _8, _9))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column fkSlideshowPartnerID SqlType(INT), Default(0) */
    val fkslideshowpartnerid: Rep[Int] = column[Int]("fkSlideshowPartnerID", O.Default(0))
    /** Database column fkArticleID SqlType(INT) */
    val fkarticleid: Rep[Int] = column[Int]("fkArticleID")
    /** Database column Slide_Number SqlType(INT), Default(None) */
    val slideNumber: Rep[Option[Int]] = column[Option[Int]]("Slide_Number", O.Default(None))
    /** Database column Slide_Image SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideImage: Rep[Option[String]] = column[Option[String]]("Slide_Image", O.Length(254, varying = true), O.Default(None))
    /** Database column Slide_Image_Caption SqlType(VARCHAR), Length(254,true) */
    val slideImageCaption: Rep[String] = column[String]("Slide_Image_Caption", O.Length(254, varying = true))
    /** Database column Slide_Photographer SqlType(VARCHAR), Length(254,true), Default(None) */
    val slidePhotographer: Rep[Option[String]] = column[Option[String]]("Slide_Photographer", O.Length(254, varying = true), O.Default(None))
    /** Database column Slide_Title SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideTitle: Rep[Option[String]] = column[Option[String]]("Slide_Title", O.Length(254, varying = true), O.Default(None))
    /** Database column Slide_Body SqlType(VARCHAR), Length(254,true), Default(None) */
    val slideBody: Rep[Option[String]] = column[Option[String]]("Slide_Body", O.Length(254, varying = true), O.Default(None))
    /** Database column Slide_RecipeID SqlType(INT), Default(None) */
    val slideRecipeid: Rep[Option[Int]] = column[Option[Int]]("Slide_RecipeID", O.Default(None))
  }
  /** Collection-like TableQuery object for table SlideshowSlidesCustom */
  lazy val SlideshowSlidesCustom = new TableQuery(tag => new SlideshowSlidesCustom(tag))

  /**
   * Entity class storing rows of table Tags
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param categoryId Database column category_id SqlType(INT)
   *  @param tag Database column tag SqlType(VARCHAR), Length(254,true)
   */
  case class TagsRow(id: Int, categoryId: Int, tag: String)
  /** GetResult implicit for fetching TagsRow objects using plain SQL queries */
  implicit def GetResultTagsRow(implicit e0: GR[Int], e1: GR[String]): GR[TagsRow] = GR {
    prs =>
      import prs._
      TagsRow.tupled((<<[Int], <<[Int], <<[String]))
  }
  /** Table description of table tags. Objects of this class serve as prototypes for rows in queries. */
  class Tags(_tableTag: Tag) extends Table[TagsRow](_tableTag, "tags") {
    def * = (id, categoryId, tag) <> (TagsRow.tupled, TagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(categoryId), Rep.Some(tag)).shaped.<>({ r => import r._; _1.map(_ => TagsRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column category_id SqlType(INT) */
    val categoryId: Rep[Int] = column[Int]("category_id")
    /** Database column tag SqlType(VARCHAR), Length(254,true) */
    val tag: Rep[String] = column[String]("tag", O.Length(254, varying = true))
  }
  /** Collection-like TableQuery object for table Tags */
  lazy val Tags = new TableQuery(tag => new Tags(tag))
}
