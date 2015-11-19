
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
		<td><a href = """"),_display_(Seq[Any](/*51.19*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*51.88*/("""">"""),_display_(Seq[Any](/*51.91*/climateService/*51.105*/.getClimateServiceName())),format.raw/*51.129*/("""</a></td>

		<td><span class=""""),_display_(Seq[Any](/*53.21*/climateService/*53.35*/.getClimateServiceName())),format.raw/*53.59*/(""" editable" data-name='purpose'>
				"""),_display_(Seq[Any](/*54.6*/climateService/*54.20*/.getPurpose())),format.raw/*54.33*/(""" </span></td>
		
		<td><span class=""""),_display_(Seq[Any](/*56.21*/climateService/*56.35*/.getClimateServiceName())),format.raw/*56.59*/(""" editable" id = "url" data-name='url'>
				<a href = """"),_display_(Seq[Any](/*57.17*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*57.86*/(""""><img src='"""),_display_(Seq[Any](/*57.99*/climateService/*57.113*/.getPhoto())),format.raw/*57.124*/("""' style="height: 100px; width: 100px" ></a> </span></td>
				
		<td><span class=""""),_display_(Seq[Any](/*59.21*/climateService/*59.35*/.getClimateServiceName())),format.raw/*59.59*/(""" editable" data-name='scenario'>
				"""),_display_(Seq[Any](/*60.6*/climateService/*60.20*/.getScenario())),format.raw/*60.34*/(""" </span></td>

		<td><span class=""""),_display_(Seq[Any](/*62.21*/climateService/*62.35*/.getClimateServiceName())),format.raw/*62.59*/(""" editable" data-name='versionNo'>
		"""),_display_(Seq[Any](/*63.4*/for(version <- climateService.getVerionList()) yield /*63.50*/{_display_(Seq[Any](format.raw/*63.51*/("""
			<a href = """"),_display_(Seq[Any](/*64.16*/{routes.ClimateServiceController.oneService(climateService.findUrl(version))})),format.raw/*64.93*/("""">"""),_display_(Seq[Any](/*64.96*/version)),format.raw/*64.103*/("""</a><br>
		""")))})),format.raw/*65.4*/("""
		</span></td>
				
		<td><span class=""""),_display_(Seq[Any](/*68.21*/climateService/*68.35*/.getClimateServiceName())),format.raw/*68.59*/(""" editable" data-name='rootServiceId'>
				"""),_display_(Seq[Any](/*69.6*/climateService/*69.20*/.getRootservice())),format.raw/*69.37*/(""" </span></td>
				
		"""),_display_(Seq[Any](/*71.4*/if(true)/*71.12*/{_display_(Seq[Any](format.raw/*71.13*/(""" 
			<td class="operation">
				<input type="button" class="edit-btn btn btn-primary" value="Edit" 
					data-pk='"""),_display_(Seq[Any](/*74.16*/climateService/*74.30*/.getClimateServiceName())),format.raw/*74.54*/("""'
					data-url='"""),_display_(Seq[Any](/*75.17*/routes/*75.23*/.ClimateServiceController.editClimateService())),format.raw/*75.69*/("""' 
				>
				"""),_display_(Seq[Any](/*77.6*/form(routes.ClimateServiceController.deleteClimateService())/*77.66*/{_display_(Seq[Any](format.raw/*77.67*/(""" 
					<input
						name="idHolder" class="hidden" type="hidden"
						value=""""),_display_(Seq[Any](/*80.15*/climateService/*80.29*/.getId())),format.raw/*80.37*/(""""> 
					<input
						type="submit" class="btn btn-danger delete-btn span2" value="Delete"
						onclick="return confirm('Are you sure you want to delete this item?')">
				""")))})),format.raw/*84.6*/("""
			</td> 
		""")))})),format.raw/*86.4*/("""
	</tr>
	""")))})),format.raw/*88.3*/("""
    </table>
 
    
     """),_display_(Seq[Any](/*92.7*/if(true)/*92.15*/{_display_(Seq[Any](format.raw/*92.16*/("""
		    
	    """),_display_(Seq[Any](/*94.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*94.115*/ {_display_(Seq[Any](format.raw/*94.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*97.7*/("""
    """)))})),format.raw/*98.6*/("""
""")))})),format.raw/*99.2*/("""
"""))}
    }
    
    def render(climateServices:List[metadata.ClimateService],climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm)
    
    def f:((List[metadata.ClimateService],play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm) => apply(climateServices,climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 18 15:27:33 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/team_proj_sprint2/ApacheCMDA-Frontend/app/views/climate/mostRecentlyUsedServices.scala.html
                    HASH: ec43b4df9bd782577e1b69128555fc160ea383bf
                    MATRIX: 3259->1205|3462->1335|3477->1342|3562->1346|3614->1362|3629->1368|3691->1408|3793->1482|3822->1483|3880->1514|3908->1515|3964->1314|3993->1333|4021->1530|4059->1533|4101->1566|4141->1568|4181->1573|4218->1588|4270->1604|4294->1619|4323->1626|4714->1982|4731->1990|4770->1991|4849->2039|4895->2050|4949->2088|4988->2089|5050->2115|5141->2184|5180->2187|5204->2201|5251->2225|5318->2256|5341->2270|5387->2294|5459->2331|5482->2345|5517->2358|5590->2395|5613->2409|5659->2433|5750->2488|5841->2557|5890->2570|5914->2584|5948->2595|6066->2677|6089->2691|6135->2715|6208->2753|6231->2767|6267->2781|6338->2816|6361->2830|6407->2854|6479->2891|6541->2937|6580->2938|6632->2954|6731->3031|6770->3034|6800->3041|6843->3053|6920->3094|6943->3108|6989->3132|7067->3175|7090->3189|7129->3206|7186->3228|7203->3236|7242->3237|7393->3352|7416->3366|7462->3390|7516->3408|7531->3414|7599->3460|7648->3474|7717->3534|7756->3535|7871->3614|7894->3628|7924->3636|8129->3810|8174->3824|8215->3834|8277->3861|8294->3869|8333->3870|8382->3884|8500->3992|8541->3994|8661->4083|8698->4089|8731->4091
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|87->44|87->44|87->44|89->46|91->48|91->48|91->48|94->51|94->51|94->51|94->51|94->51|96->53|96->53|96->53|97->54|97->54|97->54|99->56|99->56|99->56|100->57|100->57|100->57|100->57|100->57|102->59|102->59|102->59|103->60|103->60|103->60|105->62|105->62|105->62|106->63|106->63|106->63|107->64|107->64|107->64|107->64|108->65|111->68|111->68|111->68|112->69|112->69|112->69|114->71|114->71|114->71|117->74|117->74|117->74|118->75|118->75|118->75|120->77|120->77|120->77|123->80|123->80|123->80|127->84|129->86|131->88|135->92|135->92|135->92|137->94|137->94|137->94|140->97|141->98|142->99
                    -- GENERATED --
                */
            