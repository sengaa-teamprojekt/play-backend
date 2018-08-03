// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/johannesschimmer/play-backend/conf/routes
// @DATE:Thu Aug 02 17:00:09 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
