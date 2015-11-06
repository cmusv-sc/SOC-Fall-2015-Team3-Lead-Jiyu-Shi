
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
object signUp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Account],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Account]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.35*/("""
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
        <input type="username" name="username" placeholder="Username" value=""""),_display_(Seq[Any](/*27.79*/form("email")/*27.92*/.value)),format.raw/*27.98*/("""">
      </div>

      <div class="form-group" align="center">
        <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*31.70*/form("email")/*31.83*/.value)),format.raw/*31.89*/("""">
      </div>
      <div class="form-group" align="center">
        <input type="password" name="password" placeholder="Password" value=""""),_display_(Seq[Any](/*34.79*/form("password")/*34.95*/.value)),format.raw/*34.101*/("""">
      </div>
      <hr>
      <p align="center">
        <button class="btn btn-primary" type="submit">Sign Up for Service</button>
      </p>
      </div>
    """)))})),format.raw/*41.6*/("""

  """)))})))}
    }
    
    def render(form:Form[Application.Account]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Account]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 06 17:33:20 EST 2015
                    SOURCE: C:/Users/Joe/Desktop/activator and projects/ApacheCMDA-Frontend/app/views/climate/signUp.scala.html
                    HASH: dbbdb1dcf6e305dddd551c35b76b52677267fd81
                    MATRIX: 802->1|929->34|990->68|1018->69|1388->412|1416->413|1476->438|1500->453|1540->455|1582->462|1597->468|1644->506|1684->508|1954->742|1976->755|2004->761|2172->893|2194->906|2222->912|2398->1052|2423->1068|2452->1074|2647->1238
                    LINES: 26->1|29->1|33->5|33->5|45->17|45->17|48->20|48->20|48->20|50->22|50->22|50->22|50->22|55->27|55->27|55->27|59->31|59->31|59->31|62->34|62->34|62->34|69->41
                    -- GENERATED --
                */
            