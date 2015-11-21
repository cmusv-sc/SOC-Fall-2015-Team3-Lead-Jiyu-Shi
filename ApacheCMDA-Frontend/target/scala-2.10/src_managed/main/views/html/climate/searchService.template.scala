
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
object searchService extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(climateServiceForm: play.data.Form[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.63*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main("Search Service", scripts)/*38.33*/{_display_(Seq[Any](format.raw/*38.34*/("""
  """),_display_(Seq[Any](/*39.4*/flash_message())),format.raw/*39.19*/("""
  """),format.raw/*40.56*/("""
  """),_display_(Seq[Any](/*41.4*/helper/*41.10*/.form(routes.ClimateServiceController.getSearchServiceResult())/*41.73*/ {_display_(Seq[Any](format.raw/*41.75*/("""
    <div class="ui-widget col-sm-offset-3 col-sm-7">
      <div class = "form-group" align="center" >
      """),_display_(Seq[Any](/*44.8*/inputText(climateServiceForm("Search Service"), 'class -> "form-control",'id -> "serviceName", 'placeholder -> "Service Name", 'size->70))),format.raw/*44.145*/("""
      </div>


      <div align="center">

        <input class="btn btn-info" type="submit" value="Search">
      </div>
    </div>

  """)))})),format.raw/*54.4*/("""
""")))})))}
    }
    
    def render(climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServiceForm)
    
    def f:((play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServiceForm) => apply(climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 20 23:16:23 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/searchService.scala.html
                    HASH: cfc85f6e303a95f5a5aec0ecef3fc79aa2a3061b
                    MATRIX: 823->1|977->83|991->90|1075->94|1127->111|1141->117|1202->157|1520->447|1549->448|2342->1213|2371->1214|2457->1272|2486->1273|2527->1286|2556->1287|2613->62|2641->81|2669->1305|2707->1308|2747->1339|2786->1340|2825->1344|2862->1359|2893->1415|2932->1419|2947->1425|3019->1488|3059->1490|3204->1600|3364->1737|3533->1875
                    LINES: 26->1|29->5|29->5|31->5|32->6|32->6|32->6|37->11|37->11|55->29|55->29|57->31|57->31|58->32|58->32|63->1|65->4|66->36|68->38|68->38|68->38|69->39|69->39|70->40|71->41|71->41|71->41|71->41|74->44|74->44|84->54
                    -- GENERATED --
                */
            