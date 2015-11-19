
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object signUp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""
<html>

  <style>
  .form-signin """),format.raw/*5.16*/("""{"""),format.raw/*5.17*/("""
  max-width: 300px;
  padding: 19px 29px 29px;
  margin: 0 auto 20px;
  background-color: #fff;
  border: 1px solid #e5e5e5;
  -webkit-border-radius: 5px;
  -moz-border-radius: 5px;
  border-radius: 5px;
  -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
  -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
  box-shadow: 0 1px 2px rgba(0,0,0,.05);
  """),format.raw/*17.3*/("""}"""),format.raw/*17.4*/("""
  </style>
</html>
  """),_display_(Seq[Any](/*20.4*/main("Sign Up")/*20.19*/ {_display_(Seq[Any](format.raw/*20.21*/("""

    """),_display_(Seq[Any](/*22.6*/helper/*22.12*/.form(routes.Application.authenticate)/*22.50*/ {_display_(Seq[Any](format.raw/*22.52*/("""
      <div class="form-signin">
        <h3 class="form-signin-heading" align="center">Sign Up</h3>
        <hr>
        <div class="form-group" align="center">
          <input type="userName" name="userName" placeholder="Username" value=""""),_display_(Seq[Any](/*27.81*/form("userName")/*27.97*/.value)),format.raw/*27.103*/("""">
        </div>

        <div class="form-group" align="center">
          <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*31.72*/form("email")/*31.85*/.value)),format.raw/*31.91*/("""">
        </div>
        <div class="form-group" align="center">
          <input type="password" name="password" placeholder="Password" value=""""),_display_(Seq[Any](/*34.81*/form("password")/*34.97*/.value)),format.raw/*34.103*/("""">
        </div>

        <div class="form-group" align="center">
          <input type="firstName" name="firstName" placeholder="Firstname" value=""""),_display_(Seq[Any](/*38.84*/form("firstName")/*38.101*/.value)),format.raw/*38.107*/("""">
        </div>
        <div class="form-group" align="center">
          <input type="lastName" name="lastName" placeholder="Lirstname" value=""""),_display_(Seq[Any](/*41.82*/form("lastName")/*41.98*/.value)),format.raw/*41.104*/("""">
        </div>
        <hr>
        <p align="center">
          <button class="btn btn-primary" type="submit">Sign Up for Service</button>
        </p>
      </div>
    """)))})),format.raw/*48.6*/("""

  """)))})))}
    }
    
    def render(form:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 17 21:34:03 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/team_proj_sprint2/ApacheCMDA-Frontend/app/views/climate/signUp.scala.html
                    HASH: 431b6de5ef23d9095b824148f730221330e763a4
                    MATRIX: 787->1|899->19|960->53|988->54|1358->397|1386->398|1444->421|1468->436|1508->438|1550->445|1565->451|1612->489|1652->491|1930->733|1955->749|1984->755|2158->893|2180->906|2208->912|2390->1058|2415->1074|2444->1080|2630->1230|2657->1247|2686->1253|2869->1400|2894->1416|2923->1422|3128->1596
                    LINES: 26->1|29->1|33->5|33->5|45->17|45->17|48->20|48->20|48->20|50->22|50->22|50->22|50->22|55->27|55->27|55->27|59->31|59->31|59->31|62->34|62->34|62->34|66->38|66->38|66->38|69->41|69->41|69->41|76->48
                    -- GENERATED --
                */
            