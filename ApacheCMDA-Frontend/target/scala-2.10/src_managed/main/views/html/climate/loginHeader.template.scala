
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
        <a class="navbar-brand" style="padding-bottom: 0 ;" href=""""),_display_(Seq[Any](/*15.68*/{routes.ClimateServiceController.home(email,"loginAlready")})),format.raw/*15.128*/(""""><img
        src='"""),_display_(Seq[Any](/*16.15*/routes/*16.21*/.Assets.at("images/logo.png"))),format.raw/*16.50*/("""' style="height: 15px ; width: 250px ;">
        </a>

      </div>

      <div class="navbar-collapse collapse" style="height:">



        <form class="navbar-form navbar-right" role="logout">
          <a class="btn btn-danger" href=""""),_display_(Seq[Any](/*26.44*/{routes.ClimateServiceController.home(null,null,"logout")})),format.raw/*26.102*/("""" role="button">Log Out&raquo;</a>
        </form>

        <ul class="nav navbar-nav navbar-right">

        <form class="navbar-form navbar-right" role="findFriend">
          <a class="btn btn-info" href=""""),_display_(Seq[Any](/*32.42*/{routes.Application.findFriend(email)})),format.raw/*32.80*/("""" role="button">Find friend</a>
        </form>
          <h10 class="navbar-brand navbar-left">Welcome,"""),_display_(Seq[Any](/*34.58*/email)),format.raw/*34.63*/("""!</h10>
        <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Service<b class="caret"></b> </a>

          <ul class="dropdown-menu">
            <li><a href=""""),_display_(Seq[Any](/*38.27*/routes/*38.33*/.ClimateServiceController.searchService(email))),format.raw/*38.79*/("""">Search Service </a></li>
            <li><a href=""""),_display_(Seq[Any](/*39.27*/routes/*39.33*/.ClimateServiceController.climateServices(email))),format.raw/*39.81*/("""">Service List</a></li>
            <li><a href=""""),_display_(Seq[Any](/*40.27*/routes/*40.33*/.ClimateServiceController.mostPopularClimateServices(email))),format.raw/*40.92*/("""">Most Popular Service</a></li>
            <li><a href=""""),_display_(Seq[Any](/*41.27*/routes/*41.33*/.ClimateServiceController.mostRecentlyAddedClimateServices(email))),format.raw/*41.98*/("""">Recent Added Service</a></li>
            <li><a href=""""),_display_(Seq[Any](/*42.27*/routes/*42.33*/.ClimateServiceController.mostRecentlyUsedClimateServices(email))),format.raw/*42.97*/("""">Recent Used  Service</a></li>
          </ul>
        </li>

        <li class="dropdown"><a href="#"
        class="dropdown-toggle" data-toggle="dropdown">Dataset<b
        class="caret"></b> </a>
          <ul class="dropdown-menu">
            <li><a href=""""),_display_(Seq[Any](/*50.27*/routes/*50.33*/.DatasetController.datasetList(email))),format.raw/*50.70*/("""">Dataset List</a></li>
            <li><a href=""""),_display_(Seq[Any](/*51.27*/routes/*51.33*/.DatasetController.searchDataset(email))),format.raw/*51.72*/("""">Search dataset</a></li>
          </ul>
        </li>
        """),format.raw/*54.45*/("""
        """),format.raw/*55.69*/("""
        """),format.raw/*56.35*/("""
        """),format.raw/*57.39*/("""
        """),format.raw/*58.102*/("""
        """),format.raw/*59.107*/("""
        """),format.raw/*60.18*/("""
        """),format.raw/*61.18*/("""
        <li class="dropdown"><a href="#"
        class="dropdown-toggle" data-toggle="dropdown">About<b
        class="caret"></b> </a>
          <ul class="dropdown-menu">
            <li><a href=""""),_display_(Seq[Any](/*66.27*/routes/*66.33*/.ClimateServiceController.home(email))),format.raw/*66.70*/("""">Home</a></li>
            <li><a href=""""),_display_(Seq[Any](/*67.27*/routes/*67.33*/.AboutusController.aboutUs(email))),format.raw/*67.66*/("""">About Us</a></li>
            <li><a href=""""),_display_(Seq[Any](/*68.27*/routes/*68.33*/.AboutusController.aboutProject(email))),format.raw/*68.71*/("""">About project</a></li>
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
                    DATE: Fri Dec 04 16:09:40 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/loginHeader.scala.html
                    HASH: 4880f436098be53c19834f93147af044f77c8e9d
                    MATRIX: 788->1|896->15|1455->538|1538->598|1595->619|1610->625|1661->654|1935->892|2016->950|2261->1159|2321->1197|2462->1302|2489->1307|2719->1501|2734->1507|2802->1553|2891->1606|2906->1612|2976->1660|3062->1710|3077->1716|3158->1775|3252->1833|3267->1839|3354->1904|3448->1962|3463->1968|3549->2032|3849->2296|3864->2302|3923->2339|4009->2389|4024->2395|4085->2434|4177->2534|4214->2603|4251->2638|4288->2677|4326->2779|4364->2886|4401->2904|4438->2922|4674->3122|4689->3128|4748->3165|4826->3207|4841->3213|4896->3246|4978->3292|4993->3298|5053->3336
                    LINES: 26->1|29->1|43->15|43->15|44->16|44->16|44->16|54->26|54->26|60->32|60->32|62->34|62->34|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|78->50|78->50|78->50|79->51|79->51|79->51|82->54|83->55|84->56|85->57|86->58|87->59|88->60|89->61|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68
                    -- GENERATED --
                */
            