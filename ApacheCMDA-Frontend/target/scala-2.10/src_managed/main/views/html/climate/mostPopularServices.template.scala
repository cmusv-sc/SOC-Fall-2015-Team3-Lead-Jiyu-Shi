
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
object mostPopularServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[metadata.ClimateService],play.data.Form[metadata.ClimateService],String,play.api.templates.HtmlFormat.Appendable] {

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
		<td><a href = """"),_display_(Seq[Any](/*50.19*/{routes.ClimateServiceController.oneService(climateService.getUrl(),email)})),format.raw/*50.94*/("""">"""),_display_(Seq[Any](/*50.97*/climateService/*50.111*/.getClimateServiceName())),format.raw/*50.135*/("""</a></td>

		<td><span class=""""),_display_(Seq[Any](/*52.21*/climateService/*52.35*/.getClimateServiceName())),format.raw/*52.59*/(""" editable" data-name='purpose'>
				"""),_display_(Seq[Any](/*53.6*/climateService/*53.20*/.getPurpose())),format.raw/*53.33*/(""" </span></td>
		
		<td><span class=""""),_display_(Seq[Any](/*55.21*/climateService/*55.35*/.getClimateServiceName())),format.raw/*55.59*/(""" editable" id = "url" data-name='url'>
				<a href = """"),_display_(Seq[Any](/*56.17*/{routes.ClimateServiceController.oneService(climateService.getUrl(),email)})),format.raw/*56.92*/(""""><img src='"""),_display_(Seq[Any](/*56.105*/climateService/*56.119*/.getPhoto())),format.raw/*56.130*/("""' style="height: 100px; width: 100px" ></a> </span></td>
				
		<td><span class=""""),_display_(Seq[Any](/*58.21*/climateService/*58.35*/.getClimateServiceName())),format.raw/*58.59*/(""" editable" data-name='scenario'>
				"""),_display_(Seq[Any](/*59.6*/climateService/*59.20*/.getScenario())),format.raw/*59.34*/(""" </span></td>

		<td><span class=""""),_display_(Seq[Any](/*61.21*/climateService/*61.35*/.getClimateServiceName())),format.raw/*61.59*/(""" editable" data-name='versionNo'>
		"""),_display_(Seq[Any](/*62.4*/for(version <- climateService.getVerionList()) yield /*62.50*/{_display_(Seq[Any](format.raw/*62.51*/("""
			<a href = """"),_display_(Seq[Any](/*63.16*/{routes.ClimateServiceController.oneService(climateService.findUrl(version),email)})),format.raw/*63.99*/("""">"""),_display_(Seq[Any](/*63.102*/version)),format.raw/*63.109*/("""</a><br>
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
    
    def render(climateServices:List[metadata.ClimateService],climateServiceForm:play.data.Form[metadata.ClimateService],email:String): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm,email)
    
    def f:((List[metadata.ClimateService],play.data.Form[metadata.ClimateService],String) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm,email) => apply(climateServices,climateServiceForm,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 23 13:22:12 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/mostPopularServices.scala.html
                    HASH: f4496904c61bbc2e5ed6254d2483efe237052bda
                    MATRIX: 3261->1205|3477->1348|3492->1355|3577->1359|3629->1375|3644->1381|3706->1421|3808->1495|3837->1496|3895->1527|3923->1528|3979->1327|4008->1346|4036->1543|4074->1546|4122->1585|4162->1587|4202->1592|4239->1607|4291->1623|4315->1638|4344->1645|4734->2000|4751->2008|4790->2009|4869->2057|4915->2068|4969->2106|5008->2107|5069->2132|5166->2207|5205->2210|5229->2224|5276->2248|5343->2279|5366->2293|5412->2317|5484->2354|5507->2368|5542->2381|5615->2418|5638->2432|5684->2456|5775->2511|5872->2586|5922->2599|5946->2613|5980->2624|6098->2706|6121->2720|6167->2744|6240->2782|6263->2796|6299->2810|6370->2845|6393->2859|6439->2883|6511->2920|6573->2966|6612->2967|6664->2983|6769->3066|6809->3069|6839->3076|6882->3088|6959->3129|6982->3143|7028->3167|7106->3210|7129->3224|7168->3241|7225->3263|7242->3271|7281->3272|7432->3387|7455->3401|7501->3425|7555->3443|7570->3449|7638->3495|7687->3509|7756->3569|7795->3570|7910->3649|7933->3663|7963->3671|8168->3845|8213->3859|8254->3869|8316->3896|8333->3904|8372->3905|8421->3919|8539->4027|8580->4029|8700->4118|8737->4124|8770->4126
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|87->44|87->44|87->44|89->46|91->48|91->48|91->48|93->50|93->50|93->50|93->50|93->50|95->52|95->52|95->52|96->53|96->53|96->53|98->55|98->55|98->55|99->56|99->56|99->56|99->56|99->56|101->58|101->58|101->58|102->59|102->59|102->59|104->61|104->61|104->61|105->62|105->62|105->62|106->63|106->63|106->63|106->63|107->64|110->67|110->67|110->67|111->68|111->68|111->68|113->70|113->70|113->70|116->73|116->73|116->73|117->74|117->74|117->74|119->76|119->76|119->76|122->79|122->79|122->79|126->83|128->85|130->87|134->91|134->91|134->91|136->93|136->93|136->93|139->96|140->97|141->98
                    -- GENERATED --
                */
            