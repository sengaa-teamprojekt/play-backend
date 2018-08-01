// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/johannesschimmer/hornbach/hornbach_timeRecording/conf/routes
// @DATE:Tue Jul 17 14:34:33 CEST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseEmployeeTimeRecordingController EmployeeTimeRecordingController = new controllers.ReverseEmployeeTimeRecordingController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseEmployeeNameController EmployeeNameController = new controllers.ReverseEmployeeNameController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMgmtAnalyticsController MgmtAnalyticsController = new controllers.ReverseMgmtAnalyticsController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseEmployeeAnalyticsController EmployeeAnalyticsController = new controllers.ReverseEmployeeAnalyticsController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseEmployeeTimeRecordingController EmployeeTimeRecordingController = new controllers.javascript.ReverseEmployeeTimeRecordingController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseEmployeeNameController EmployeeNameController = new controllers.javascript.ReverseEmployeeNameController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMgmtAnalyticsController MgmtAnalyticsController = new controllers.javascript.ReverseMgmtAnalyticsController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseEmployeeAnalyticsController EmployeeAnalyticsController = new controllers.javascript.ReverseEmployeeAnalyticsController(RoutesPrefix.byNamePrefix());
  }

}
