// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/johannesschimmer/play-backend/conf/routes
// @DATE:Thu Aug 02 17:00:09 CEST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseRegistrationController RegistrationController = new controllers.ReverseRegistrationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseRegistrationController RegistrationController = new controllers.javascript.ReverseRegistrationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
