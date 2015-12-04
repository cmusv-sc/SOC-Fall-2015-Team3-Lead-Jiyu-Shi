
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
object searchService extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[play.data.Form[metadata.ClimateService],String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(climateServiceForm: play.data.Form[metadata.ClimateService],email:String,comment:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*5.2*/scripts/*5.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
  <script src='"""),_display_(Seq[Any](/*6.17*/routes/*6.23*/.Assets.at("javascripts/edit_button.js"))),format.raw/*6.63*/("""'></script>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
  <script type="text/javascript">
          $(function() """),format.raw/*11.24*/("""{"""),format.raw/*11.25*/("""
            var availableServiceNames = [
                    "2-D-Variable-Map",
                    "2-D-Variable-Zonal-Mean",
                    "2-D-Variable-Time-Series",
                    "3-D-Variable-2-D-Slice",
                    "3-D-Variable-Zonal-Mean",
                    "3-D-Variable-Average-Vertical-Profile",
                    "Scatter-and-Histogram-Plot-of-Two-Variables",
                    "Difference-Plot-of-Two-Time-Averaged-Variables",
                    "Conditional-Sampling-with-One-Variable",
                    "Conditional-Sampling-with-Two-Variables",
                    "Time-Lagged-Correlation-Map-of-Two-Variables",
                    "Regrid-and-Download"
            ];



            $("#serviceName").autocomplete("""),format.raw/*29.44*/("""{"""),format.raw/*29.45*/("""
              source : availableServiceNames
            """),format.raw/*31.13*/("""}"""),format.raw/*31.14*/(""");
          """),format.raw/*32.11*/("""}"""),format.raw/*32.12*/(""");


  </script>
""")))};
Seq[Any](format.raw/*1.91*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main("Search Service",email,scripts)/*38.38*/{_display_(Seq[Any](format.raw/*38.39*/("""
  """),_display_(Seq[Any](/*39.4*/flash_message())),format.raw/*39.19*/("""

  """),format.raw/*41.56*/("""
    """),_display_(Seq[Any](/*42.6*/form(routes.ClimateServiceController.getSearchServiceResult(email))/*42.73*/ {_display_(Seq[Any](format.raw/*42.75*/("""
    """),format.raw/*43.100*/("""
    <div class="ui-widget col-sm-offset-3 col-sm-7">
      <div class = "form-group" align="center" >
      """),_display_(Seq[Any](/*46.8*/inputText(climateServiceForm("Search"), 'class -> "form-control",'id -> "serviceName", 'placeholder -> "Service Name", 'size->70))),format.raw/*46.137*/("""
          <input type="text" class="hidden" name="email" value="""),_display_(Seq[Any](/*47.65*/email)),format.raw/*47.70*/(""">
      </div>
      <div align="center">
        <input class="btn btn-info" type="submit" value="GO">
      </div>
    </div>
    """),format.raw/*53.16*/("""
    """)))})),format.raw/*54.6*/("""
""")))})))}
    }
    
    def render(climateServiceForm:play.data.Form[metadata.ClimateService],email:String,comment:String): play.api.templates.HtmlFormat.Appendable = apply(climateServiceForm,email,comment)
    
    def f:((play.data.Form[metadata.ClimateService],String,String) => play.api.templates.HtmlFormat.Appendable) = (climateServiceForm,email,comment) => apply(climateServiceForm,email,comment)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 03 23:11:39 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/searchService.scala.html
                    HASH: 290c803e40b4e35d6fdf61418e537e183f758acc
                    MATRIX: 837->1|1019->111|1033->118|1117->122|1169->139|1183->145|1244->185|1562->475|1591->476|2384->1241|2413->1242|2499->1300|2528->1301|2569->1314|2598->1315|2655->90|2683->109|2711->1333|2749->1336|2794->1372|2833->1373|2872->1377|2909->1392|2941->1449|2982->1455|3058->1522|3098->1524|3132->1624|3277->1734|3429->1863|3530->1928|3557->1933|3717->2076|3754->2082
                    LINES: 26->1|29->5|29->5|31->5|32->6|32->6|32->6|37->11|37->11|55->29|55->29|57->31|57->31|58->32|58->32|63->1|65->4|66->36|68->38|68->38|68->38|69->39|69->39|71->41|72->42|72->42|72->42|73->43|76->46|76->46|77->47|77->47|83->53|84->54
                    -- GENERATED --
                */
            