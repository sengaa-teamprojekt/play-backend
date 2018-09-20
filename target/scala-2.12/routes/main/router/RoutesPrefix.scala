// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/johannesschimmer/play-java-forms-example/conf/routes
// @DATE:Wed Sep 19 16:48:42 CEST 2018


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
