
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
object mostPopularServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.ClimateService],play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
	 
    <h1>"""),_display_(Seq[Any](/*35.10*/climateServices/*35.25*/.size())),format.raw/*35.32*/(""" Most Popular Used Climate Services</h1>
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
                    SOURCE: C:/Users/Joe/Desktop/activator and projects/ApacheCMDA-Frontend/app/views/climate/mostPopularServices.scala.html
                    HASH: 0bf0f0e764b569f05e4b12ea9be78c1103e086d9
                    MATRIX: 3284->1222|3488->1356|3503->1363|3588->1367|3641->1384|3656->1390|3718->1430|3822->1506|3851->1507|3911->1540|3939->1541|3997->1331|4028->1353|4057->1558|4097->1563|4139->1596|4179->1598|4221->1605|4258->1620|4312->1638|4336->1653|4365->1660|4764->2024|4781->2032|4820->2033|4901->2083|4949->2096|5003->2134|5042->2135|5105->2162|5128->2176|5159->2185|5198->2188|5221->2202|5267->2226|5336->2259|5359->2273|5405->2297|5478->2335|5501->2349|5536->2362|5611->2401|5634->2415|5680->2439|5772->2495|5795->2509|5826->2518|5875->2531|5898->2545|5931->2556|6051->2640|6074->2654|6120->2678|6194->2717|6217->2731|6253->2745|6330->2786|6353->2800|6399->2824|6474->2864|6497->2878|6532->2891|6609->2932|6632->2946|6678->2970|6757->3014|6780->3028|6819->3045|6878->3069|6895->3077|6934->3078|7088->3196|7111->3210|7157->3234|7212->3253|7227->3259|7295->3305|7346->3321|7415->3381|7454->3382|7572->3464|7595->3478|7625->3486|7834->3664|7881->3680|7924->3692|7990->3723|8007->3731|8046->3732|8097->3748|8215->3856|8256->3858|8379->3950|8417->3957|8451->3960
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|87->44|87->44|87->44|89->46|91->48|91->48|91->48|93->50|93->50|93->50|93->50|93->50|93->50|95->52|95->52|95->52|96->53|96->53|96->53|98->55|98->55|98->55|99->56|99->56|99->56|99->56|99->56|99->56|101->58|101->58|101->58|102->59|102->59|102->59|104->61|104->61|104->61|105->62|105->62|105->62|107->64|107->64|107->64|108->65|108->65|108->65|110->67|110->67|110->67|113->70|113->70|113->70|114->71|114->71|114->71|116->73|116->73|116->73|119->76|119->76|119->76|123->80|125->82|127->84|131->88|131->88|131->88|133->90|133->90|133->90|136->93|137->94|138->95
                    -- GENERATED --
                */
            