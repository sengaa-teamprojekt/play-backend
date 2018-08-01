// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/johannesschimmer/hornbach/hornbach_timeRecording/conf/routes
// @DATE:Tue Jul 17 14:34:33 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:31
  class ReverseEmployeeTimeRecordingController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def storeTask(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "recording/task")
    }
  
    // @LINE:32
    def authenticate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:31
    def getProjects(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recording/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id) + "/projects")
    }
  
  }

  // @LINE:34
  class ReverseEmployeeNameController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def getFullName(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "name")
    }
  
  }

  // @LINE:24
  class ReverseMgmtAnalyticsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def getProjectDuration(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mgmt/projectDuration")
    }
  
    // @LINE:25
    def getProjectBudgets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mgmt/projectBudgets")
    }
  
    // @LINE:26
    def getProjectStaffing(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mgmt/projectStaffing")
    }
  
    // @LINE:27
    def getWeeklyHoursPerProject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mgmt/weeklyHoursPerProject")
    }
  
    // @LINE:24
    def getProjects(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mgmt/projects")
    }
  
  }

  // @LINE:17
  class ReverseEmployeeAnalyticsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def getWeeklyWorkingHours(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id) + "/weeklyWorkingHours")
    }
  
    // @LINE:21
    def getOverallWorkingHours(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id) + "/overallWorkingHours")
    }
  
    // @LINE:18
    def getMonthlyWorkingHours(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id) + "/monthlyWorkingHours")
    }
  
    // @LINE:19
    def getProjects(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id) + "/projects")
    }
  
    // @LINE:20
    def getProjectBudgets(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id) + "/projectBudgets")
    }
  
  }


}
