// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/johannesschimmer/hornbach/hornbach_timeRecording/conf/routes
// @DATE:Tue Jul 17 14:34:33 CEST 2018


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
