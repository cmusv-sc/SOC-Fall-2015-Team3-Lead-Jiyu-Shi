
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
object signUp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[User],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[User],flag:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""
  <html>

    <style>
    .form-signin """),format.raw/*5.18*/("""{"""),format.raw/*5.19*/("""
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
    """),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""
    </style>
  </html>
"""),_display_(Seq[Any](/*20.2*/if(flag == "failure")/*20.23*/{_display_(Seq[Any](format.raw/*20.24*/("""
  <div class="alert alert-danger fade in">
    <strong>User ID has been used!</strong>
    <button class="btn btn-danger pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
  </div>
""")))})),format.raw/*25.2*/("""

"""),_display_(Seq[Any](/*27.2*/if(flag == "invalid")/*27.23*/{_display_(Seq[Any](format.raw/*27.24*/("""
  <div class="alert alert-danger">
    <strong>Invalid User ID or Password!</strong>
    <button class="btn btn-danger pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
  </div>
""")))})),format.raw/*32.2*/("""

  """),_display_(Seq[Any](/*34.4*/main("Sign Up",null)/*34.24*/ {_display_(Seq[Any](format.raw/*34.26*/("""


    """),_display_(Seq[Any](/*37.6*/helper/*37.12*/.form(routes.Application.authenticate)/*37.50*/ {_display_(Seq[Any](format.raw/*37.52*/("""
      <div class="form-signin">
        <h3 class="form-signin-heading" align="center">Sign Up</h3>
        <hr>
        <div class="form-group" align="center">
          <input type="userName" name="userName" placeholder="Username" value=""""),_display_(Seq[Any](/*42.81*/form("userName")/*42.97*/.value)),format.raw/*42.103*/("""">
        </div>

        <div class="form-group" align="center">
          <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*46.72*/form("email")/*46.85*/.value)),format.raw/*46.91*/("""">
        </div>
        <div class="form-group" align="center">
          <input type="password" name="password" placeholder="Password" value=""""),_display_(Seq[Any](/*49.81*/form("password")/*49.97*/.value)),format.raw/*49.103*/("""">
        </div>

        <div class="form-group" align="center">
          <input type="firstName" name="firstName" placeholder="Firstname" value=""""),_display_(Seq[Any](/*53.84*/form("firstName")/*53.101*/.value)),format.raw/*53.107*/("""">
        </div>
        <div class="form-group" align="center">
          <input type="lastName" name="lastName" placeholder="Lirstname" value=""""),_display_(Seq[Any](/*56.82*/form("lastName")/*56.98*/.value)),format.raw/*56.104*/("""">
        </div>
        <hr>
        <p align="center">
          <button class="btn btn-primary" type="submit">Sign Up for Service</button>
        </p>
      </div>
    """)))})),format.raw/*63.6*/("""

  """)))})))}
    }
    
    def render(form:Form[User],flag:String): play.api.templates.HtmlFormat.Appendable = apply(form,flag)
    
    def f:((Form[User],String) => play.api.templates.HtmlFormat.Appendable) = (form,flag) => apply(form,flag)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 21 20:41:38 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/signUp.scala.html
                    HASH: 504c2b390749afa84a2047a0d3a7a5fac712ac02
                    MATRIX: 794->1|918->31|985->71|1013->72|1407->439|1435->440|1495->465|1525->486|1564->487|1795->687|1833->690|1863->711|1902->712|2131->910|2171->915|2200->935|2240->937|2283->945|2298->951|2345->989|2385->991|2663->1233|2688->1249|2717->1255|2891->1393|2913->1406|2941->1412|3123->1558|3148->1574|3177->1580|3363->1730|3390->1747|3419->1753|3602->1900|3627->1916|3656->1922|3861->2096
                    LINES: 26->1|29->1|33->5|33->5|45->17|45->17|48->20|48->20|48->20|53->25|55->27|55->27|55->27|60->32|62->34|62->34|62->34|65->37|65->37|65->37|65->37|70->42|70->42|70->42|74->46|74->46|74->46|77->49|77->49|77->49|81->53|81->53|81->53|84->56|84->56|84->56|91->63
                    -- GENERATED --
                */
            