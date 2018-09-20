
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

object listUsers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[User],Form[UserData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(dummyUser: Seq[User], form: Form[UserData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Users")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""

    """),format.raw/*5.5*/("""<h1>Users</h1>

    """),format.raw/*7.40*/("""
    """),_display_(/*8.6*/flash/*8.11*/.asScala.map/*8.23*/{ case (email, password) =>_display_(Seq[Any](format.raw/*8.50*/("""
    """),format.raw/*9.5*/("""<div class=""""),_display_(/*9.18*/email),format.raw/*9.23*/("""">"""),_display_(/*9.26*/password),format.raw/*9.34*/("""</div>
    """)))}),format.raw/*10.6*/("""

    """),format.raw/*12.5*/("""<table>
        <thead>
            <tr><th>Email:</th><th>Password:</th>
        </thead>
        <tbody>
        """),_display_(/*17.10*/for(u <- dummyUser) yield /*17.29*/ {_display_(Seq[Any](format.raw/*17.31*/("""
            """),format.raw/*18.13*/("""<tr><td>"""),_display_(/*18.22*/u/*18.23*/.email),format.raw/*18.29*/("""</td><td>"""),_display_(/*18.39*/u/*18.40*/.password),format.raw/*18.49*/("""</td></tr>
        """)))}),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*25.66*/("""
    """),_display_(/*26.6*/if(form.hasGlobalErrors)/*26.30*/ {_display_(Seq[Any](format.raw/*26.32*/("""
        """),_display_(/*27.10*/form/*27.14*/.globalErrors.asScala.map/*27.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*27.88*/("""
            """),format.raw/*28.13*/("""<div>
                """),_display_(/*29.18*/error/*29.23*/.key),format.raw/*29.27*/(""": """),_display_(/*29.30*/error/*29.35*/.message),format.raw/*29.43*/("""
            """),format.raw/*30.13*/("""</div>
        """)))}),format.raw/*31.10*/("""
    """)))}),format.raw/*32.6*/("""

    """),_display_(/*34.6*/helper/*34.12*/.form(routes.LoginController.createUser)/*34.52*/ {_display_(Seq[Any](format.raw/*34.54*/("""
        """),_display_(/*35.10*/helper/*35.16*/.CSRF.formField),format.raw/*35.31*/("""

        """),_display_(/*37.10*/helper/*37.16*/.inputText(form("email"))),format.raw/*37.41*/("""

        """),_display_(/*39.10*/helper/*39.16*/.inputText(form("password"))),format.raw/*39.44*/("""

        """),format.raw/*41.9*/("""<button type="submit">Erstelle User</button>
    """)))}),format.raw/*42.6*/("""

""")))}),format.raw/*44.2*/("""
"""))
      }
    }
  }

  def render(dummyUser:Seq[User],form:Form[UserData]): play.twirl.api.HtmlFormat.Appendable = apply(dummyUser,form)

  def f:((Seq[User],Form[UserData]) => play.twirl.api.HtmlFormat.Appendable) = (dummyUser,form) => apply(dummyUser,form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Sep 20 14:20:04 CEST 2018
                  SOURCE: /Users/johannesschimmer/play-java-forms-example/app/views/listUsers.scala.html
                  HASH: 7d4ea4b5f4b186299f61d2042c57575d950f24c1
                  MATRIX: 970->1|1108->46|1135->48|1156->61|1195->63|1227->69|1274->124|1305->130|1318->135|1338->147|1402->174|1433->179|1472->192|1497->197|1526->200|1554->208|1596->220|1629->226|1772->342|1807->361|1847->363|1888->376|1924->385|1934->386|1961->392|1998->402|2008->403|2038->412|2089->432|2125->441|2191->540|2223->546|2256->570|2296->572|2333->582|2346->586|2380->611|2467->660|2508->673|2558->696|2572->701|2597->705|2627->708|2641->713|2670->721|2711->734|2758->750|2794->756|2827->763|2842->769|2891->809|2931->811|2968->821|2983->827|3019->842|3057->853|3072->859|3118->884|3156->895|3171->901|3220->929|3257->939|3337->989|3370->992
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|38->7|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|41->10|43->12|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|49->18|50->19|51->20|56->25|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|60->29|60->29|60->29|60->29|60->29|60->29|61->30|62->31|63->32|65->34|65->34|65->34|65->34|66->35|66->35|66->35|68->37|68->37|68->37|70->39|70->39|70->39|72->41|73->42|75->44
                  -- GENERATED --
              */
          