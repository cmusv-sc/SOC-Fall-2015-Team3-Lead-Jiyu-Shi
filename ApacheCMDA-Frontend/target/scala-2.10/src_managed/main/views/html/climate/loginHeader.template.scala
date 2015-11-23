
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
object loginHeader extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(email:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""

<div class="navbar navbar-default navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="row">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse"
        data-target=".navbar-collapse">
          <span class="sr-only">Toggle navigation</span> <span
        class="icon-bar"></span> <span class="icon-bar"></span> <span
        class="icon-bar"></span>
        </button>
        <a class="navbar-brand" style="padding-bottom: 0 ;" href=""""),_display_(Seq[Any](/*13.68*/{routes.ClimateServiceController.home(email,"loginAlready")})),format.raw/*13.128*/(""""><img
        src='"""),_display_(Seq[Any](/*14.15*/routes/*14.21*/.Assets.at("images/logo.png"))),format.raw/*14.50*/("""' style="height: 15px ; width: 250px ;">
        </a>

      </div>

      <div class="navbar-collapse collapse" style="height:">
        <ul class="nav navbar-nav navbar-right">
          <h10 class="navbar-brand navbar-left">Welcome,"""),_display_(Seq[Any](/*21.58*/email)),format.raw/*21.63*/("""!</h10>
        <form class="navbar-form navbar-right" role="logout">
          <a class="btn btn-primary" href=""""),_display_(Seq[Any](/*23.45*/{routes.ClimateServiceController.home(null,null,"logout")})),format.raw/*23.103*/("""" role="button">Log Out&raquo;</a>
        </form>
        <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Service<b class="caret"></b> </a>
          <ul class="dropdown-menu">
            <li><a href=""""),_display_(Seq[Any](/*27.27*/routes/*27.33*/.ClimateServiceController.searchService(email))),format.raw/*27.79*/("""">Search Service </a></li>
            <li><a href=""""),_display_(Seq[Any](/*28.27*/routes/*28.33*/.ClimateServiceController.climateServices(email))),format.raw/*28.81*/("""">Service List</a></li>
            <li><a href=""""),_display_(Seq[Any](/*29.27*/routes/*29.33*/.ClimateServiceController.mostPopularClimateServices(email))),format.raw/*29.92*/("""">Most Popular Service</a></li>
            <li><a href=""""),_display_(Seq[Any](/*30.27*/routes/*30.33*/.ClimateServiceController.mostRecentlyAddedClimateServices(email))),format.raw/*30.98*/("""">Recent Added Service</a></li>
            <li><a href=""""),_display_(Seq[Any](/*31.27*/routes/*31.33*/.ClimateServiceController.mostRecentlyUsedClimateServices(email))),format.raw/*31.97*/("""">Recent Used  Service</a></li>
          </ul>
        </li>

        <li class="dropdown"><a href="#"
        class="dropdown-toggle" data-toggle="dropdown">Dataset<b
        class="caret"></b> </a>
          <ul class="dropdown-menu">
            <li><a href=""""),_display_(Seq[Any](/*39.27*/routes/*39.33*/.DatasetController.datasetList(email))),format.raw/*39.70*/("""">Dataset List</a></li>
            <li><a href=""""),_display_(Seq[Any](/*40.27*/routes/*40.33*/.DatasetController.searchDataset(email))),format.raw/*40.72*/("""">Search dataset</a></li>
          </ul>
        </li>
        """),format.raw/*43.45*/("""
        """),format.raw/*44.69*/("""
        """),format.raw/*45.35*/("""
        """),format.raw/*46.39*/("""
        """),format.raw/*47.102*/("""
        """),format.raw/*48.107*/("""
        """),format.raw/*49.18*/("""
        """),format.raw/*50.18*/("""
        <li class="dropdown"><a href="#"
        class="dropdown-toggle" data-toggle="dropdown">About<b
        class="caret"></b> </a>
          <ul class="dropdown-menu">
            <li><a href=""""),_display_(Seq[Any](/*55.27*/routes/*55.33*/.ClimateServiceController.home(email))),format.raw/*55.70*/("""">Home</a></li>
            <li><a href=""""),_display_(Seq[Any](/*56.27*/routes/*56.33*/.AboutusController.aboutUs(email))),format.raw/*56.66*/("""">About Us</a></li>
            <li><a href=""""),_display_(Seq[Any](/*57.27*/routes/*57.33*/.AboutusController.aboutProject(email))),format.raw/*57.71*/("""">About project</a></li>
          </ul>
        </li>
        </ul>
      </div>

    </div>
  </div>
</div>"""))}
    }
    
    def render(email:String): play.api.templates.HtmlFormat.Appendable = apply(email)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (email) => apply(email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 23 01:18:52 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/loginHeader.scala.html
                    HASH: de30612e237b31b54d9d4bcf75f861c322276219
                    MATRIX: 788->1|896->15|1453->536|1536->596|1593->617|1608->623|1659->652|1931->888|1958->893|2108->1007|2189->1065|2461->1301|2476->1307|2544->1353|2633->1406|2648->1412|2718->1460|2804->1510|2819->1516|2900->1575|2994->1633|3009->1639|3096->1704|3190->1762|3205->1768|3291->1832|3591->2096|3606->2102|3665->2139|3751->2189|3766->2195|3827->2234|3919->2334|3956->2403|3993->2438|4030->2477|4068->2579|4106->2686|4143->2704|4180->2722|4416->2922|4431->2928|4490->2965|4568->3007|4583->3013|4638->3046|4720->3092|4735->3098|4795->3136
                    LINES: 26->1|29->1|41->13|41->13|42->14|42->14|42->14|49->21|49->21|51->23|51->23|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|67->39|67->39|67->39|68->40|68->40|68->40|71->43|72->44|73->45|74->46|75->47|76->48|77->49|78->50|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57
                    -- GENERATED --
                */
            