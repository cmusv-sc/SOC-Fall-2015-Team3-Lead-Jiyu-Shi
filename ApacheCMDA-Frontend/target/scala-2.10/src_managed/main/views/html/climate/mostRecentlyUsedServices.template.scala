
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
object mostRecentlyUsedServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.ClimateService],play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
	 
    <h1>"""),_display_(Seq[Any](/*35.10*/climateServices/*35.25*/.size())),format.raw/*35.32*/(""" Most Recently Used Climate Services</h1>
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
		<td><a href = """"),_display_(Seq[Any](/*50.19*/climateService/*50.33*/.getUrl())),format.raw/*50.42*/("""">"""),_display_(Seq[Any](/*50.45*/climateService/*50.59*/.getClimateServiceName())),format.raw/*50.83*/("""</a></td>

		<td><span class=""""),_display_(Seq[Any](/*52.21*/climateService/*52.35*/.getClimateServiceName())),format.raw/*52.59*/(""" editable" data-name='purpose'>
				"""),_display_(Seq[Any](/*53.6*/climateService/*53.20*/.getPurpose())),format.raw/*53.33*/(""" </span></td>
		
		<td><span class=""""),_display_(Seq[Any](/*55.21*/climateService/*55.35*/.getClimateServiceName())),format.raw/*55.59*/(""" editable" id = "url" data-name='url'>
				<a href = """"),_display_(Seq[Any](/*56.17*/climateService/*56.31*/.getUrl())),format.raw/*56.40*/(""""><img src='"""),_display_(Seq[Any](/*56.53*/climateService/*56.67*/.getPhoto())),format.raw/*56.78*/("""' style="height: 100px; width: 100px" ></a> </span></td>
				
		<td><span class=""""),_display_(Seq[Any](/*58.21*/climateService/*58.35*/.getClimateServiceName())),format.raw/*58.59*/(""" editable" data-name='scenario'>
				"""),_display_(Seq[Any](/*59.6*/climateService/*59.20*/.getScenario())),format.raw/*59.34*/(""" </span></td>
				
		<td><span class=""""),_display_(Seq[Any](/*61.21*/climateService/*61.35*/.getClimateServiceName())),format.raw/*61.59*/(""" editable" data-name='versionNo'>
				"""),_display_(Seq[Any](/*62.6*/climateService/*62.20*/.getVersion())),format.raw/*62.33*/(""" </span></td>
				
		<td><span class=""""),_display_(Seq[Any](/*64.21*/climateService/*64.35*/.getClimateServiceName())),format.raw/*64.59*/(""" editable" data-name='rootServiceId'>
				"""),_display_(Seq[Any](/*65.6*/climateService/*65.20*/.getRootservice())),format.raw/*65.37*/(""" </span></td>
				
		"""),_display_(Seq[Any](/*67.4*/if(true)/*67.12*/{_display_(Seq[Any](format.raw/*67.13*/(""" 
			<td class="operation">
				<input type="button" class="edit-btn btn btn-primary" value="Edit" 
					data-pk='"""),_display_(Seq[Any](/*70.16*/climateService/*70.30*/.getClimateServiceName())),format.raw/*70.54*/("""'
					data-url='"""),_display_(Seq[Any](/*71.17*/routes/*71.23*/.ClimateServiceController.editClimateService())),format.raw/*71.69*/("""' 
				>
				"""),_display_(Seq[Any](/*73.6*/form(routes.ClimateServiceController.deleteClimateService())/*73.66*/{_display_(Seq[Any](format.raw/*73.67*/(""" 
					<input
						name="idHolder" class="hidden" type="hidden"
						value=""""),_display_(Seq[Any](/*76.15*/climateService/*76.29*/.getId())),format.raw/*76.37*/(""""> 
					<input
						type="submit" class="btn btn-danger delete-btn span2" value="Delete"
						onclick="return confirm('Are you sure you want to delete this item?')">
				""")))})),format.raw/*80.6*/("""
			</td> 
		""")))})),format.raw/*82.4*/("""
	</tr>
	""")))})),format.raw/*84.3*/("""
    </table>
 
    
     """),_display_(Seq[Any](/*88.7*/if(true)/*88.15*/{_display_(Seq[Any](format.raw/*88.16*/("""
		    
	    """),_display_(Seq[Any](/*90.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*90.115*/ {_display_(Seq[Any](format.raw/*90.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*93.7*/("""
    """)))})),format.raw/*94.6*/("""
""")))})),format.raw/*95.2*/("""
"""))}
    }
    
    def render(climateServices:List[metadata.ClimateService],climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm)
    
    def f:((List[metadata.ClimateService],play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm) => apply(climateServices,climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 04:17:49 EST 2015
                    SOURCE: C:/Users/Joe/Desktop/activator and projects/ApacheCMDA-Frontend/app/views/climate/mostRecentlyUsedServices.scala.html
                    HASH: 2c49775b38b94b67784475eb1af1a946a448451d
                    MATRIX: 3289->1222|3493->1356|3508->1363|3593->1367|3646->1384|3661->1390|3723->1430|3827->1506|3856->1507|3916->1540|3944->1541|4002->1331|4033->1353|4062->1558|4102->1563|4144->1596|4184->1598|4226->1605|4263->1620|4317->1638|4341->1653|4370->1660|4770->2025|4787->2033|4826->2034|4907->2084|4955->2097|5009->2135|5048->2136|5111->2163|5134->2177|5165->2186|5204->2189|5227->2203|5273->2227|5342->2260|5365->2274|5411->2298|5484->2336|5507->2350|5542->2363|5617->2402|5640->2416|5686->2440|5778->2496|5801->2510|5832->2519|5881->2532|5904->2546|5937->2557|6057->2641|6080->2655|6126->2679|6200->2718|6223->2732|6259->2746|6336->2787|6359->2801|6405->2825|6480->2865|6503->2879|6538->2892|6615->2933|6638->2947|6684->2971|6763->3015|6786->3029|6825->3046|6884->3070|6901->3078|6940->3079|7094->3197|7117->3211|7163->3235|7218->3254|7233->3260|7301->3306|7352->3322|7421->3382|7460->3383|7578->3465|7601->3479|7631->3487|7840->3665|7887->3681|7930->3693|7996->3724|8013->3732|8052->3733|8103->3749|8221->3857|8262->3859|8385->3951|8423->3958|8457->3961
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|87->44|87->44|87->44|89->46|91->48|91->48|91->48|93->50|93->50|93->50|93->50|93->50|93->50|95->52|95->52|95->52|96->53|96->53|96->53|98->55|98->55|98->55|99->56|99->56|99->56|99->56|99->56|99->56|101->58|101->58|101->58|102->59|102->59|102->59|104->61|104->61|104->61|105->62|105->62|105->62|107->64|107->64|107->64|108->65|108->65|108->65|110->67|110->67|110->67|113->70|113->70|113->70|114->71|114->71|114->71|116->73|116->73|116->73|119->76|119->76|119->76|123->80|125->82|127->84|131->88|131->88|131->88|133->90|133->90|133->90|136->93|137->94|138->95
                    -- GENERATED --
                */
            