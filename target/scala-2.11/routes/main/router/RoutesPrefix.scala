
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Krishna/ToDo/ToDo/conf/routes
// @DATE:Wed Jun 15 11:28:27 EDT 2016


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
