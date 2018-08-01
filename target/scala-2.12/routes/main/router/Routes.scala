// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/johannesschimmer/hornbach/hornbach_timeRecording/conf/routes
// @DATE:Tue Jul 17 14:34:33 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Assets_3: controllers.Assets,
  // @LINE:17
  EmployeeAnalyticsController_4: controllers.EmployeeAnalyticsController,
  // @LINE:24
  MgmtAnalyticsController_0: controllers.MgmtAnalyticsController,
  // @LINE:31
  EmployeeTimeRecordingController_1: controllers.EmployeeTimeRecordingController,
  // @LINE:34
  EmployeeNameController_2: controllers.EmployeeNameController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Assets_3: controllers.Assets,
    // @LINE:17
    EmployeeAnalyticsController_4: controllers.EmployeeAnalyticsController,
    // @LINE:24
    MgmtAnalyticsController_0: controllers.MgmtAnalyticsController,
    // @LINE:31
    EmployeeTimeRecordingController_1: controllers.EmployeeTimeRecordingController,
    // @LINE:34
    EmployeeNameController_2: controllers.EmployeeNameController
  ) = this(errorHandler, Assets_3, EmployeeAnalyticsController_4, MgmtAnalyticsController_0, EmployeeTimeRecordingController_1, EmployeeNameController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_3, EmployeeAnalyticsController_4, MgmtAnalyticsController_0, EmployeeTimeRecordingController_1, EmployeeNameController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[0-9]+>/weeklyWorkingHours""", """controllers.EmployeeAnalyticsController.getWeeklyWorkingHours(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[0-9]+>/monthlyWorkingHours""", """controllers.EmployeeAnalyticsController.getMonthlyWorkingHours(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[0-9]+>/projects""", """controllers.EmployeeAnalyticsController.getProjects(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[0-9]+>/projectBudgets""", """controllers.EmployeeAnalyticsController.getProjectBudgets(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[0-9]+>/overallWorkingHours""", """controllers.EmployeeAnalyticsController.getOverallWorkingHours(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mgmt/projects""", """controllers.MgmtAnalyticsController.getProjects()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mgmt/projectBudgets""", """controllers.MgmtAnalyticsController.getProjectBudgets()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mgmt/projectStaffing""", """controllers.MgmtAnalyticsController.getProjectStaffing()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mgmt/weeklyHoursPerProject""", """controllers.MgmtAnalyticsController.getWeeklyHoursPerProject()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mgmt/projectDuration""", """controllers.MgmtAnalyticsController.getProjectDuration()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recording/""" + "$" + """id<[0-9]+>/projects""", """controllers.EmployeeTimeRecordingController.getProjects(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.EmployeeTimeRecordingController.authenticate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recording/task""", """controllers.EmployeeTimeRecordingController.storeTask()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """name""", """controllers.EmployeeNameController.getFullName()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_EmployeeAnalyticsController_getWeeklyWorkingHours1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/weeklyWorkingHours")))
  )
  private[this] lazy val controllers_EmployeeAnalyticsController_getWeeklyWorkingHours1_invoker = createInvoker(
    EmployeeAnalyticsController_4.getWeeklyWorkingHours(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeAnalyticsController",
      "getWeeklyWorkingHours",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """employee/""" + "$" + """id<[0-9]+>/weeklyWorkingHours""",
      """ REST API - Employee Analytics""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_EmployeeAnalyticsController_getMonthlyWorkingHours2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/monthlyWorkingHours")))
  )
  private[this] lazy val controllers_EmployeeAnalyticsController_getMonthlyWorkingHours2_invoker = createInvoker(
    EmployeeAnalyticsController_4.getMonthlyWorkingHours(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeAnalyticsController",
      "getMonthlyWorkingHours",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """employee/""" + "$" + """id<[0-9]+>/monthlyWorkingHours""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_EmployeeAnalyticsController_getProjects3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/projects")))
  )
  private[this] lazy val controllers_EmployeeAnalyticsController_getProjects3_invoker = createInvoker(
    EmployeeAnalyticsController_4.getProjects(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeAnalyticsController",
      "getProjects",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """employee/""" + "$" + """id<[0-9]+>/projects""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_EmployeeAnalyticsController_getProjectBudgets4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/projectBudgets")))
  )
  private[this] lazy val controllers_EmployeeAnalyticsController_getProjectBudgets4_invoker = createInvoker(
    EmployeeAnalyticsController_4.getProjectBudgets(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeAnalyticsController",
      "getProjectBudgets",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """employee/""" + "$" + """id<[0-9]+>/projectBudgets""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_EmployeeAnalyticsController_getOverallWorkingHours5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/overallWorkingHours")))
  )
  private[this] lazy val controllers_EmployeeAnalyticsController_getOverallWorkingHours5_invoker = createInvoker(
    EmployeeAnalyticsController_4.getOverallWorkingHours(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeAnalyticsController",
      "getOverallWorkingHours",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """employee/""" + "$" + """id<[0-9]+>/overallWorkingHours""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_MgmtAnalyticsController_getProjects6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mgmt/projects")))
  )
  private[this] lazy val controllers_MgmtAnalyticsController_getProjects6_invoker = createInvoker(
    MgmtAnalyticsController_0.getProjects(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MgmtAnalyticsController",
      "getProjects",
      Nil,
      "GET",
      this.prefix + """mgmt/projects""",
      """ REST API - Mgmt Analytics""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_MgmtAnalyticsController_getProjectBudgets7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mgmt/projectBudgets")))
  )
  private[this] lazy val controllers_MgmtAnalyticsController_getProjectBudgets7_invoker = createInvoker(
    MgmtAnalyticsController_0.getProjectBudgets(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MgmtAnalyticsController",
      "getProjectBudgets",
      Nil,
      "GET",
      this.prefix + """mgmt/projectBudgets""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_MgmtAnalyticsController_getProjectStaffing8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mgmt/projectStaffing")))
  )
  private[this] lazy val controllers_MgmtAnalyticsController_getProjectStaffing8_invoker = createInvoker(
    MgmtAnalyticsController_0.getProjectStaffing(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MgmtAnalyticsController",
      "getProjectStaffing",
      Nil,
      "GET",
      this.prefix + """mgmt/projectStaffing""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_MgmtAnalyticsController_getWeeklyHoursPerProject9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mgmt/weeklyHoursPerProject")))
  )
  private[this] lazy val controllers_MgmtAnalyticsController_getWeeklyHoursPerProject9_invoker = createInvoker(
    MgmtAnalyticsController_0.getWeeklyHoursPerProject(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MgmtAnalyticsController",
      "getWeeklyHoursPerProject",
      Nil,
      "GET",
      this.prefix + """mgmt/weeklyHoursPerProject""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_MgmtAnalyticsController_getProjectDuration10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mgmt/projectDuration")))
  )
  private[this] lazy val controllers_MgmtAnalyticsController_getProjectDuration10_invoker = createInvoker(
    MgmtAnalyticsController_0.getProjectDuration(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MgmtAnalyticsController",
      "getProjectDuration",
      Nil,
      "GET",
      this.prefix + """mgmt/projectDuration""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_EmployeeTimeRecordingController_getProjects11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recording/"), DynamicPart("id", """[0-9]+""",false), StaticPart("/projects")))
  )
  private[this] lazy val controllers_EmployeeTimeRecordingController_getProjects11_invoker = createInvoker(
    EmployeeTimeRecordingController_1.getProjects(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeTimeRecordingController",
      "getProjects",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """recording/""" + "$" + """id<[0-9]+>/projects""",
      """ REST API - Employee Time Recording""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_EmployeeTimeRecordingController_authenticate12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_EmployeeTimeRecordingController_authenticate12_invoker = createInvoker(
    EmployeeTimeRecordingController_1.authenticate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeTimeRecordingController",
      "authenticate",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_EmployeeTimeRecordingController_storeTask13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recording/task")))
  )
  private[this] lazy val controllers_EmployeeTimeRecordingController_storeTask13_invoker = createInvoker(
    EmployeeTimeRecordingController_1.storeTask(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeTimeRecordingController",
      "storeTask",
      Nil,
      "POST",
      this.prefix + """recording/task""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_EmployeeNameController_getFullName14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("name")))
  )
  private[this] lazy val controllers_EmployeeNameController_getFullName14_invoker = createInvoker(
    EmployeeNameController_2.getFullName(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeNameController",
      "getFullName",
      Nil,
      "POST",
      this.prefix + """name""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_EmployeeAnalyticsController_getWeeklyWorkingHours1_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeAnalyticsController_getWeeklyWorkingHours1_invoker.call(EmployeeAnalyticsController_4.getWeeklyWorkingHours(id))
      }
  
    // @LINE:18
    case controllers_EmployeeAnalyticsController_getMonthlyWorkingHours2_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeAnalyticsController_getMonthlyWorkingHours2_invoker.call(EmployeeAnalyticsController_4.getMonthlyWorkingHours(id))
      }
  
    // @LINE:19
    case controllers_EmployeeAnalyticsController_getProjects3_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeAnalyticsController_getProjects3_invoker.call(EmployeeAnalyticsController_4.getProjects(id))
      }
  
    // @LINE:20
    case controllers_EmployeeAnalyticsController_getProjectBudgets4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeAnalyticsController_getProjectBudgets4_invoker.call(EmployeeAnalyticsController_4.getProjectBudgets(id))
      }
  
    // @LINE:21
    case controllers_EmployeeAnalyticsController_getOverallWorkingHours5_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeAnalyticsController_getOverallWorkingHours5_invoker.call(EmployeeAnalyticsController_4.getOverallWorkingHours(id))
      }
  
    // @LINE:24
    case controllers_MgmtAnalyticsController_getProjects6_route(params@_) =>
      call { 
        controllers_MgmtAnalyticsController_getProjects6_invoker.call(MgmtAnalyticsController_0.getProjects())
      }
  
    // @LINE:25
    case controllers_MgmtAnalyticsController_getProjectBudgets7_route(params@_) =>
      call { 
        controllers_MgmtAnalyticsController_getProjectBudgets7_invoker.call(MgmtAnalyticsController_0.getProjectBudgets())
      }
  
    // @LINE:26
    case controllers_MgmtAnalyticsController_getProjectStaffing8_route(params@_) =>
      call { 
        controllers_MgmtAnalyticsController_getProjectStaffing8_invoker.call(MgmtAnalyticsController_0.getProjectStaffing())
      }
  
    // @LINE:27
    case controllers_MgmtAnalyticsController_getWeeklyHoursPerProject9_route(params@_) =>
      call { 
        controllers_MgmtAnalyticsController_getWeeklyHoursPerProject9_invoker.call(MgmtAnalyticsController_0.getWeeklyHoursPerProject())
      }
  
    // @LINE:28
    case controllers_MgmtAnalyticsController_getProjectDuration10_route(params@_) =>
      call { 
        controllers_MgmtAnalyticsController_getProjectDuration10_invoker.call(MgmtAnalyticsController_0.getProjectDuration())
      }
  
    // @LINE:31
    case controllers_EmployeeTimeRecordingController_getProjects11_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EmployeeTimeRecordingController_getProjects11_invoker.call(EmployeeTimeRecordingController_1.getProjects(id))
      }
  
    // @LINE:32
    case controllers_EmployeeTimeRecordingController_authenticate12_route(params@_) =>
      call { 
        controllers_EmployeeTimeRecordingController_authenticate12_invoker.call(EmployeeTimeRecordingController_1.authenticate())
      }
  
    // @LINE:33
    case controllers_EmployeeTimeRecordingController_storeTask13_route(params@_) =>
      call { 
        controllers_EmployeeTimeRecordingController_storeTask13_invoker.call(EmployeeTimeRecordingController_1.storeTask())
      }
  
    // @LINE:34
    case controllers_EmployeeNameController_getFullName14_route(params@_) =>
      call { 
        controllers_EmployeeNameController_getFullName14_invoker.call(EmployeeNameController_2.getFullName())
      }
  }
}
