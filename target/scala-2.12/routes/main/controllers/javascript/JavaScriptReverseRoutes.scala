// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/johannesschimmer/hornbach/hornbach_timeRecording/conf/routes
// @DATE:Tue Jul 17 14:34:33 CEST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseEmployeeTimeRecordingController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def storeTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeTimeRecordingController.storeTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recording/task"})
        }
      """
    )
  
    // @LINE:32
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeTimeRecordingController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:31
    def getProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeTimeRecordingController.getProjects",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recording/" + (""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0) + "/projects"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseEmployeeNameController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def getFullName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeNameController.getFullName",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "name"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseMgmtAnalyticsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def getProjectDuration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MgmtAnalyticsController.getProjectDuration",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mgmt/projectDuration"})
        }
      """
    )
  
    // @LINE:25
    def getProjectBudgets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MgmtAnalyticsController.getProjectBudgets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mgmt/projectBudgets"})
        }
      """
    )
  
    // @LINE:26
    def getProjectStaffing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MgmtAnalyticsController.getProjectStaffing",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mgmt/projectStaffing"})
        }
      """
    )
  
    // @LINE:27
    def getWeeklyHoursPerProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MgmtAnalyticsController.getWeeklyHoursPerProject",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mgmt/weeklyHoursPerProject"})
        }
      """
    )
  
    // @LINE:24
    def getProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MgmtAnalyticsController.getProjects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mgmt/projects"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseEmployeeAnalyticsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def getWeeklyWorkingHours: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeAnalyticsController.getWeeklyWorkingHours",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/" + (""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0) + "/weeklyWorkingHours"})
        }
      """
    )
  
    // @LINE:21
    def getOverallWorkingHours: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeAnalyticsController.getOverallWorkingHours",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/" + (""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0) + "/overallWorkingHours"})
        }
      """
    )
  
    // @LINE:18
    def getMonthlyWorkingHours: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeAnalyticsController.getMonthlyWorkingHours",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/" + (""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0) + "/monthlyWorkingHours"})
        }
      """
    )
  
    // @LINE:19
    def getProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeAnalyticsController.getProjects",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/" + (""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0) + "/projects"})
        }
      """
    )
  
    // @LINE:20
    def getProjectBudgets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeAnalyticsController.getProjectBudgets",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/" + (""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0) + "/projectBudgets"})
        }
      """
    )
  
  }


}
