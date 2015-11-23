
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
object mostRecentlyUsedServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[metadata.ClimateService],play.data.Form[metadata.ClimateService],String,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(climateServices: List[metadata.ClimateService], climateServiceForm: play.data.Form[metadata.ClimateService],email:String):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*18.124*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Climate Services",email, scripts)/*31.41*/ {_display_(Seq[Any](format.raw/*31.43*/("""
	
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
		<td><a href = """"),_display_(Seq[Any](/*51.19*/{routes.ClimateServiceController.oneService(climateService.getUrl(),email)})),format.raw/*51.94*/("""">"""),_display_(Seq[Any](/*51.97*/climateService/*51.111*/.getClimateServiceName())),format.raw/*51.135*/("""</a></td>

		<td><span class=""""),_display_(Seq[Any](/*53.21*/climateService/*53.35*/.getClimateServiceName())),format.raw/*53.59*/(""" editable" data-name='purpose'>
				"""),_display_(Seq[Any](/*54.6*/climateService/*54.20*/.getPurpose())),format.raw/*54.33*/(""" </span></td>
		
		<td><span class=""""),_display_(Seq[Any](/*56.21*/climateService/*56.35*/.getClimateServiceName())),format.raw/*56.59*/(""" editable" id = "url" data-name='url'>
				<a href = """"),_display_(Seq[Any](/*57.17*/{routes.ClimateServiceController.oneService(climateService.getUrl(),email)})),format.raw/*57.92*/(""""><img src='"""),_display_(Seq[Any](/*57.105*/climateService/*57.119*/.getPhoto())),format.raw/*57.130*/("""' style="height: 100px; width: 100px" ></a> </span></td>
				
		<td><span class=""""),_display_(Seq[Any](/*59.21*/climateService/*59.35*/.getClimateServiceName())),format.raw/*59.59*/(""" editable" data-name='scenario'>
				"""),_display_(Seq[Any](/*60.6*/climateService/*60.20*/.getScenario())),format.raw/*60.34*/(""" </span></td>

		<td><span class=""""),_display_(Seq[Any](/*62.21*/climateService/*62.35*/.getClimateServiceName())),format.raw/*62.59*/(""" editable" data-name='versionNo'>
		"""),_display_(Seq[Any](/*63.4*/for(version <- climateService.getVerionList()) yield /*63.50*/{_display_(Seq[Any](format.raw/*63.51*/("""
			<a href = """"),_display_(Seq[Any](/*64.16*/{routes.ClimateServiceController.oneService(climateService.findUrl(version),email)})),format.raw/*64.99*/("""">"""),_display_(Seq[Any](/*64.102*/version)),format.raw/*64.109*/("""</a><br>
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
    
    def render(climateServices:List[metadata.ClimateService],climateServiceForm:play.data.Form[metadata.ClimateService],email:String): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm,email)
    
    def f:((List[metadata.ClimateService],play.data.Form[metadata.ClimateService],String) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm,email) => apply(climateServices,climateServiceForm,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 23 13:22:13 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/mostRecentlyUsedServices.scala.html
                    HASH: f8a1960f0aa0769e79280f6157942d360ffe5408
                    MATRIX: 3266->1205|3482->1348|3497->1355|3582->1359|3634->1375|3649->1381|3711->1421|3813->1495|3842->1496|3900->1527|3928->1528|3984->1327|4013->1346|4041->1543|4079->1546|4127->1585|4167->1587|4207->1592|4244->1607|4296->1623|4320->1638|4349->1645|4740->2001|4757->2009|4796->2010|4875->2058|4921->2069|4975->2107|5014->2108|5076->2134|5173->2209|5212->2212|5236->2226|5283->2250|5350->2281|5373->2295|5419->2319|5491->2356|5514->2370|5549->2383|5622->2420|5645->2434|5691->2458|5782->2513|5879->2588|5929->2601|5953->2615|5987->2626|6105->2708|6128->2722|6174->2746|6247->2784|6270->2798|6306->2812|6377->2847|6400->2861|6446->2885|6518->2922|6580->2968|6619->2969|6671->2985|6776->3068|6816->3071|6846->3078|6889->3090|6966->3131|6989->3145|7035->3169|7113->3212|7136->3226|7175->3243|7232->3265|7249->3273|7288->3274|7439->3389|7462->3403|7508->3427|7562->3445|7577->3451|7645->3497|7694->3511|7763->3571|7802->3572|7917->3651|7940->3665|7970->3673|8175->3847|8220->3861|8261->3871|8323->3898|8340->3906|8379->3907|8428->3921|8546->4029|8587->4031|8707->4120|8744->4126|8777->4128
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|87->44|87->44|87->44|89->46|91->48|91->48|91->48|94->51|94->51|94->51|94->51|94->51|96->53|96->53|96->53|97->54|97->54|97->54|99->56|99->56|99->56|100->57|100->57|100->57|100->57|100->57|102->59|102->59|102->59|103->60|103->60|103->60|105->62|105->62|105->62|106->63|106->63|106->63|107->64|107->64|107->64|107->64|108->65|111->68|111->68|111->68|112->69|112->69|112->69|114->71|114->71|114->71|117->74|117->74|117->74|118->75|118->75|118->75|120->77|120->77|120->77|123->80|123->80|123->80|127->84|129->86|131->88|135->92|135->92|135->92|137->94|137->94|137->94|140->97|141->98|142->99
                    -- GENERATED --
                */
            