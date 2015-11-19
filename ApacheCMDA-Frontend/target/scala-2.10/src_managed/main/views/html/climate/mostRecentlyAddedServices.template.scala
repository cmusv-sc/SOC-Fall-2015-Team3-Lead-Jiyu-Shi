
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
/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
object mostRecentlyAddedServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.ClimateService],play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
    def apply/*18.2*/(climateServices: List[metadata.ClimateService], climateServiceForm: play.data.Form[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""
		//alert($("#url").text());
	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.111*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Climate Services", scripts)/*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""
	
	"""),_display_(Seq[Any](/*33.3*/flash_message())),format.raw/*33.18*/("""   
	 
    <h1>"""),_display_(Seq[Any](/*35.10*/climateServices/*35.25*/.size())),format.raw/*35.32*/(""" Most Recently Added Climate Services</h1>
		<table class="table table-striped table-bordered table-condensed ex2">
	<tr>
		<td class="col-md-2">Climate Service Name</td>
		<td class="col-md-4">Purpose</td>
		<td class="col-md-4">Url</td>
		<td class="col-md-2">Scenario</td>
		<td class="col-md-2">Version</td>
		<td class="col-md-2">Root Service</td>
		 """),_display_(Seq[Any](/*44.5*/if(true)/*44.13*/{_display_(Seq[Any](format.raw/*44.14*/("""
			<td class="col-md-3">Operation</td> 
	     """)))})),format.raw/*46.8*/(""" 
	</tr>
	"""),_display_(Seq[Any](/*48.3*/for(climateService <- climateServices) yield /*48.41*/{_display_(Seq[Any](format.raw/*48.42*/("""
	<tr>
		<td><a href = """"),_display_(Seq[Any](/*50.19*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*50.88*/("""">"""),_display_(Seq[Any](/*50.91*/climateService/*50.105*/.getClimateServiceName())),format.raw/*50.129*/("""</a></td>

		<td><span class=""""),_display_(Seq[Any](/*52.21*/climateService/*52.35*/.getClimateServiceName())),format.raw/*52.59*/(""" editable" data-name='purpose'>
				"""),_display_(Seq[Any](/*53.6*/climateService/*53.20*/.getPurpose())),format.raw/*53.33*/(""" </span></td>
		
		<td><span class=""""),_display_(Seq[Any](/*55.21*/climateService/*55.35*/.getClimateServiceName())),format.raw/*55.59*/(""" editable" id = "url" data-name='url'>
				<a href = """"),_display_(Seq[Any](/*56.17*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*56.86*/(""""><img src='"""),_display_(Seq[Any](/*56.99*/climateService/*56.113*/.getPhoto())),format.raw/*56.124*/("""' style="height: 100px; width: 100px" ></a> </span></td>
				
		<td><span class=""""),_display_(Seq[Any](/*58.21*/climateService/*58.35*/.getClimateServiceName())),format.raw/*58.59*/(""" editable" data-name='scenario'>
				"""),_display_(Seq[Any](/*59.6*/climateService/*59.20*/.getScenario())),format.raw/*59.34*/(""" </span></td>

		<td><span class=""""),_display_(Seq[Any](/*61.21*/climateService/*61.35*/.getClimateServiceName())),format.raw/*61.59*/(""" editable" data-name='versionNo'>
		"""),_display_(Seq[Any](/*62.4*/for(version <- climateService.getVerionList()) yield /*62.50*/{_display_(Seq[Any](format.raw/*62.51*/("""
			<a href = """"),_display_(Seq[Any](/*63.16*/{routes.ClimateServiceController.oneService(climateService.findUrl(version))})),format.raw/*63.93*/("""">"""),_display_(Seq[Any](/*63.96*/version)),format.raw/*63.103*/("""</a><br>
		""")))})),format.raw/*64.4*/("""
		</span></td>
				
		<td><span class=""""),_display_(Seq[Any](/*67.21*/climateService/*67.35*/.getClimateServiceName())),format.raw/*67.59*/(""" editable" data-name='rootServiceId'>
				"""),_display_(Seq[Any](/*68.6*/climateService/*68.20*/.getRootservice())),format.raw/*68.37*/(""" </span></td>
				
		"""),_display_(Seq[Any](/*70.4*/if(true)/*70.12*/{_display_(Seq[Any](format.raw/*70.13*/(""" 
			<td class="operation">
				<input type="button" class="edit-btn btn btn-primary" value="Edit" 
					data-pk='"""),_display_(Seq[Any](/*73.16*/climateService/*73.30*/.getClimateServiceName())),format.raw/*73.54*/("""'
					data-url='"""),_display_(Seq[Any](/*74.17*/routes/*74.23*/.ClimateServiceController.editClimateService())),format.raw/*74.69*/("""' 
				>
				"""),_display_(Seq[Any](/*76.6*/form(routes.ClimateServiceController.deleteClimateService())/*76.66*/{_display_(Seq[Any](format.raw/*76.67*/(""" 
					<input
						name="idHolder" class="hidden" type="hidden"
						value=""""),_display_(Seq[Any](/*79.15*/climateService/*79.29*/.getId())),format.raw/*79.37*/(""""> 
					<input
						type="submit" class="btn btn-danger delete-btn span2" value="Delete"
						onclick="return confirm('Are you sure you want to delete this item?')">
				""")))})),format.raw/*83.6*/("""
			</td> 
		""")))})),format.raw/*85.4*/("""
	</tr>
	""")))})),format.raw/*87.3*/("""
    </table>
 
    
     """),_display_(Seq[Any](/*91.7*/if(true)/*91.15*/{_display_(Seq[Any](format.raw/*91.16*/("""
		    
	    """),_display_(Seq[Any](/*93.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*93.115*/ {_display_(Seq[Any](format.raw/*93.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*96.7*/("""
    """)))})),format.raw/*97.6*/("""
""")))})),format.raw/*98.2*/("""
"""))}
    }
    
    def render(climateServices:List[metadata.ClimateService],climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm)
    
    def f:((List[metadata.ClimateService],play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm) => apply(climateServices,climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 18 15:27:33 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/team_proj_sprint2/ApacheCMDA-Frontend/app/views/climate/mostRecentlyAddedServices.scala.html
                    HASH: 383425b06457688ccc2b965359aa0b17c97e9e0f
                    MATRIX: 3260->1205|3463->1335|3478->1342|3563->1346|3615->1362|3630->1368|3692->1408|3794->1482|3823->1483|3881->1514|3909->1515|3965->1314|3994->1333|4022->1530|4060->1533|4102->1566|4142->1568|4182->1573|4219->1588|4271->1604|4295->1619|4324->1626|4716->1983|4733->1991|4772->1992|4851->2040|4897->2051|4951->2089|4990->2090|5051->2115|5142->2184|5181->2187|5205->2201|5252->2225|5319->2256|5342->2270|5388->2294|5460->2331|5483->2345|5518->2358|5591->2395|5614->2409|5660->2433|5751->2488|5842->2557|5891->2570|5915->2584|5949->2595|6067->2677|6090->2691|6136->2715|6209->2753|6232->2767|6268->2781|6339->2816|6362->2830|6408->2854|6480->2891|6542->2937|6581->2938|6633->2954|6732->3031|6771->3034|6801->3041|6844->3053|6921->3094|6944->3108|6990->3132|7068->3175|7091->3189|7130->3206|7187->3228|7204->3236|7243->3237|7394->3352|7417->3366|7463->3390|7517->3408|7532->3414|7600->3460|7649->3474|7718->3534|7757->3535|7872->3614|7895->3628|7925->3636|8130->3810|8175->3824|8216->3834|8278->3861|8295->3869|8334->3870|8383->3884|8501->3992|8542->3994|8662->4083|8699->4089|8732->4091
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|87->44|87->44|87->44|89->46|91->48|91->48|91->48|93->50|93->50|93->50|93->50|93->50|95->52|95->52|95->52|96->53|96->53|96->53|98->55|98->55|98->55|99->56|99->56|99->56|99->56|99->56|101->58|101->58|101->58|102->59|102->59|102->59|104->61|104->61|104->61|105->62|105->62|105->62|106->63|106->63|106->63|106->63|107->64|110->67|110->67|110->67|111->68|111->68|111->68|113->70|113->70|113->70|116->73|116->73|116->73|117->74|117->74|117->74|119->76|119->76|119->76|122->79|122->79|122->79|126->83|128->85|130->87|134->91|134->91|134->91|136->93|136->93|136->93|139->96|140->97|141->98
                    -- GENERATED --
                */
            