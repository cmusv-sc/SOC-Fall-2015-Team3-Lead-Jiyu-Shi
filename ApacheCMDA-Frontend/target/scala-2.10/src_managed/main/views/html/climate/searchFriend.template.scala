
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
object searchFriend extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.data.Form[metadata.ClimateService],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(climateServiceForm: play.data.Form[metadata.ClimateService],email:String,result:String,friend:String):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.104*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*26.2*/("""

"""),_display_(Seq[Any](/*28.2*/main("Find Friend",email,scripts)/*28.35*/{_display_(Seq[Any](format.raw/*28.36*/("""
  """),_display_(Seq[Any](/*29.4*/flash_message())),format.raw/*29.19*/("""

    """),_display_(Seq[Any](/*31.6*/if(result!= null && result.compareTo("success")==0)/*31.57*/{_display_(Seq[Any](format.raw/*31.58*/("""
        <div class="alert alert-success fade in">
            <strong>YOU HAS ADDED """),_display_(Seq[Any](/*33.36*/friend)),format.raw/*33.42*/(""" SUCCEEFULLY!</strong>
            <button class="btn btn-success pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
        </div>
    """)))})),format.raw/*36.6*/("""

    """),_display_(Seq[Any](/*38.6*/if(result!= null && result.compareTo("error")==0)/*38.55*/{_display_(Seq[Any](format.raw/*38.56*/("""
        <div class="alert alert-warning fade in">
            <strong>NO USER HAS BEEN FOUND, PLEASE GIVE THE CORRECT USER!</strong>
            <button class="btn btn-warning  pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
        </div>
    """)))})),format.raw/*43.6*/("""

    """),_display_(Seq[Any](/*45.6*/if(result!= null && result.compareTo("failure")==0)/*45.57*/{_display_(Seq[Any](format.raw/*45.58*/("""
        <div class="alert alert-info fade in">
            <strong>You and """),_display_(Seq[Any](/*47.30*/friend)),format.raw/*47.36*/(""" are friends already!</strong>
            <button class="btn btn-info pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
        </div>
    """)))})),format.raw/*50.6*/("""

    """),format.raw/*52.58*/("""
  """),_display_(Seq[Any](/*53.4*/form(routes.Application.getFindFriendResult(email))/*53.55*/ {_display_(Seq[Any](format.raw/*53.57*/("""
    """),format.raw/*54.100*/("""
    <div class="ui-widget col-sm-offset-3 col-sm-7">
      <div class = "form-group" align="center" >
        """),_display_(Seq[Any](/*57.10*/inputText(climateServiceForm("Find friend"), 'class -> "form-control",'id -> "firends", 'placeholder -> "Find your friend by email", 'size->70))),format.raw/*57.153*/("""
        <input type="text" class="hidden" name="email" value="""),_display_(Seq[Any](/*58.63*/email)),format.raw/*58.68*/(""">
      </div>
      <div align="center">
        <input class="btn btn-info" type="submit" value="GO">
      </div>
    </div>
    """),format.raw/*64.16*/("""
  """)))})),format.raw/*65.4*/("""
""")))})))}
    }
    
    def render(climateServiceForm:play.data.Form[metadata.ClimateService],email:String,result:String,friend:String): play.api.templates.HtmlFormat.Appendable = apply(climateServiceForm,email,result,friend)
    
    def f:((play.data.Form[metadata.ClimateService],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (climateServiceForm,email,result,friend) => apply(climateServiceForm,email,result,friend)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 05 21:01:37 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/searchFriend.scala.html
                    HASH: d2d45d57fa9634a2ef473c7ea3f5dabe6aa72341
                    MATRIX: 843->1|1038->124|1052->131|1136->135|1188->152|1202->158|1263->198|1581->488|1610->489|1870->721|1899->722|1985->780|2014->781|2055->794|2084->795|2142->103|2170->122|2198->813|2236->816|2278->849|2317->850|2356->854|2393->869|2435->876|2495->927|2534->928|2656->1014|2684->1020|2869->1174|2911->1181|2969->1230|3008->1231|3305->1497|3347->1504|3407->1555|3446->1556|3559->1633|3587->1639|3777->1798|3811->1857|3850->1861|3910->1912|3950->1914|3984->2014|4132->2126|4298->2269|4397->2332|4424->2337|4584->2480|4619->2484
                    LINES: 26->1|29->5|29->5|31->5|32->6|32->6|32->6|37->11|37->11|45->19|45->19|47->21|47->21|48->22|48->22|53->1|55->4|56->26|58->28|58->28|58->28|59->29|59->29|61->31|61->31|61->31|63->33|63->33|66->36|68->38|68->38|68->38|73->43|75->45|75->45|75->45|77->47|77->47|80->50|82->52|83->53|83->53|83->53|84->54|87->57|87->57|88->58|88->58|94->64|95->65
                    -- GENERATED --
                */
            