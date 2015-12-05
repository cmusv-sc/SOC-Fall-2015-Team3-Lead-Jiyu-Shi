
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
object searchFriend extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[play.data.Form[metadata.ClimateService],String,List[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(climateServiceForm: play.data.Form[metadata.ClimateService],email:String,result:List[String]):play.api.templates.HtmlFormat.Appendable = {
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
                    "jiyu shi",
                    "xiaoyu wang",
                    "yuan liu",
                    "zhongao tang"
            ];

            $("#firends").autocomplete("""),format.raw/*19.40*/("""{"""),format.raw/*19.41*/("""
              source : availableServiceNames
            """),format.raw/*21.13*/("""}"""),format.raw/*21.14*/(""");
          """),format.raw/*22.11*/("""}"""),format.raw/*22.12*/(""");


  </script>
""")))};
Seq[Any](format.raw/*1.96*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*26.2*/("""

"""),_display_(Seq[Any](/*28.2*/main("Find Friend",email,scripts)/*28.35*/{_display_(Seq[Any](format.raw/*28.36*/("""
  """),_display_(Seq[Any](/*29.4*/flash_message())),format.raw/*29.19*/("""

  """),format.raw/*31.56*/("""
  """),_display_(Seq[Any](/*32.4*/form(routes.Application.getFindFriendResult(email))/*32.55*/ {_display_(Seq[Any](format.raw/*32.57*/("""
    """),format.raw/*33.100*/("""
    <div class="ui-widget col-sm-offset-3 col-sm-7">
      <div class = "form-group" align="center" >
        """),_display_(Seq[Any](/*36.10*/inputText(climateServiceForm("Find friend"), 'class -> "form-control",'id -> "firends", 'placeholder -> "Find your friend by email", 'size->70))),format.raw/*36.153*/("""
        <input type="text" class="hidden" name="email" value="""),_display_(Seq[Any](/*37.63*/email)),format.raw/*37.68*/(""">
      </div>
      <div align="center">
        <input class="btn btn-info" type="submit" value="GO">
      </div>
    </div>
    """),format.raw/*43.16*/("""
  """)))})),format.raw/*44.4*/("""
""")))})))}
    }
    
    def render(climateServiceForm:play.data.Form[metadata.ClimateService],email:String,result:List[String]): play.api.templates.HtmlFormat.Appendable = apply(climateServiceForm,email,result)
    
    def f:((play.data.Form[metadata.ClimateService],String,List[String]) => play.api.templates.HtmlFormat.Appendable) = (climateServiceForm,email,result) => apply(climateServiceForm,email,result)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 04 16:46:11 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/searchFriend.scala.html
                    HASH: cc40ca21cdb2e678253b093db319bcf4d4be69d4
                    MATRIX: 842->1|1029->116|1043->123|1127->127|1179->144|1193->150|1254->190|1572->480|1601->481|1861->713|1890->714|1976->772|2005->773|2046->786|2075->787|2132->95|2160->114|2188->805|2226->808|2268->841|2307->842|2346->846|2383->861|2415->918|2454->922|2514->973|2554->975|2588->1075|2736->1187|2902->1330|3001->1393|3028->1398|3188->1541|3223->1545
                    LINES: 26->1|29->5|29->5|31->5|32->6|32->6|32->6|37->11|37->11|45->19|45->19|47->21|47->21|48->22|48->22|53->1|55->4|56->26|58->28|58->28|58->28|59->29|59->29|61->31|62->32|62->32|62->32|63->33|66->36|66->36|67->37|67->37|73->43|74->44
                    -- GENERATED --
                */
            