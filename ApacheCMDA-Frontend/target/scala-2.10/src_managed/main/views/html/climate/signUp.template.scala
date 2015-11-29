
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



  """),_display_(Seq[Any](/*23.4*/main("Sign Up",null)/*23.24*/ {_display_(Seq[Any](format.raw/*23.26*/("""

  """),_display_(Seq[Any](/*25.4*/if(flag == "failure")/*25.25*/{_display_(Seq[Any](format.raw/*25.26*/("""
    <div class="alert alert-danger fade in">
      <strong>User ID has been used!</strong>
      <button class="btn btn-danger pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
    </div>
  """)))})),format.raw/*30.4*/("""


  """),_display_(Seq[Any](/*33.4*/if(flag == "invalid")/*33.25*/{_display_(Seq[Any](format.raw/*33.26*/("""
    <div class="alert alert-danger">
      <strong>Invalid User ID or Password!</strong>
      <button class="btn btn-danger pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
    </div>
  """)))})),format.raw/*38.4*/("""

    """),_display_(Seq[Any](/*40.6*/helper/*40.12*/.form(routes.Application.authenticate)/*40.50*/ {_display_(Seq[Any](format.raw/*40.52*/("""
      <div class="form-signin">
        <h3 class="form-signin-heading" align="center">Sign Up</h3>
        <hr>
        <div class="form-group" align="center">
          <input type="userName" name="userName" placeholder="Username" value=""""),_display_(Seq[Any](/*45.81*/form("userName")/*45.97*/.value)),format.raw/*45.103*/("""">
        </div>

        <div class="form-group" align="center">
          <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*49.72*/form("email")/*49.85*/.value)),format.raw/*49.91*/("""">
        </div>
        <div class="form-group" align="center">
          <input type="password" name="password" placeholder="Password" value=""""),_display_(Seq[Any](/*52.81*/form("password")/*52.97*/.value)),format.raw/*52.103*/("""">
        </div>

        <div class="form-group" align="center">
          <input type="firstName" name="firstName" placeholder="Firstname" value=""""),_display_(Seq[Any](/*56.84*/form("firstName")/*56.101*/.value)),format.raw/*56.107*/("""">
        </div>
        <div class="form-group" align="center">
          <input type="lastName" name="lastName" placeholder="Lirstname" value=""""),_display_(Seq[Any](/*59.82*/form("lastName")/*59.98*/.value)),format.raw/*59.104*/("""">
        </div>
        <hr>
        <p align="center">
          <button class="btn btn-primary" type="submit">Sign Up for Service</button>
        </p>
      </div>
    """)))})),format.raw/*66.6*/("""

  """)))})))}
    }
    
    def render(form:Form[User],flag:String): play.api.templates.HtmlFormat.Appendable = apply(form,flag)
    
    def f:((Form[User],String) => play.api.templates.HtmlFormat.Appendable) = (form,flag) => apply(form,flag)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 29 15:28:50 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/tangzhongao/ApacheCMDA-Frontend/app/views/climate/signUp.scala.html
                    HASH: 2e009e4244dd16f83edb8d1c6cfc7003f5817e08
                    MATRIX: 794->1|918->31|985->71|1013->72|1407->439|1435->440|1500->470|1529->490|1569->492|1609->497|1639->518|1678->519|1919->729|1960->735|1990->756|2029->757|2268->965|2310->972|2325->978|2372->1016|2412->1018|2690->1260|2715->1276|2744->1282|2918->1420|2940->1433|2968->1439|3150->1585|3175->1601|3204->1607|3390->1757|3417->1774|3446->1780|3629->1927|3654->1943|3683->1949|3888->2123
                    LINES: 26->1|29->1|33->5|33->5|45->17|45->17|51->23|51->23|51->23|53->25|53->25|53->25|58->30|61->33|61->33|61->33|66->38|68->40|68->40|68->40|68->40|73->45|73->45|73->45|77->49|77->49|77->49|80->52|80->52|80->52|84->56|84->56|84->56|87->59|87->59|87->59|94->66
                    -- GENERATED --
                */
            