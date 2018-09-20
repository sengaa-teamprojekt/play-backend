
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
  """),_display_(/*3.4*/main("Sengaa User Manager")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),format.raw/*4.5*/("""<div>
      <ul>
        <li>Please go to <a href=""""),_display_(/*6.36*/routes/*6.42*/.LoginController.listUsers),format.raw/*6.68*/("""">"""),_display_(/*6.71*/routes/*6.77*/.LoginController.listUsers),format.raw/*6.103*/("""</a></li>
      </ul>

    </div>

  """)))}),format.raw/*11.4*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Sep 19 16:14:06 CEST 2018
                  SOURCE: /Users/johannesschimmer/play-java-forms-example/app/views/index.scala.html
                  HASH: 846774e302a3bf1e62220e07889f06525146e1a2
                  MATRIX: 941->1|1037->4|1066->8|1101->35|1140->37|1171->42|1249->94|1263->100|1309->126|1338->129|1352->135|1399->161|1467->199
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|37->6|37->6|37->6|37->6|42->11
                  -- GENERATED --
              */
          