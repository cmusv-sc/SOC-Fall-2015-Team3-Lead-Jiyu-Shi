
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
object climateServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.ClimateService],play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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

	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.111*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Climate Services", scripts)/*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""
	
	"""),_display_(Seq[Any](/*33.3*/flash_message())),format.raw/*33.18*/("""   
	 
    <h1>"""),_display_(Seq[Any](/*35.10*/climateServices/*35.25*/.size())),format.raw/*35.32*/(""" Climate Services</h1>
		<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
		<thead>
	<tr>
		<th class="col-md-2">Climate Service Name</td>
		<th class="col-md-4">Purpose</td>
		<th class="col-md-2">Url</td>
		<th class="col-md-2">Version</td>
		
	</tr>
	</thead>
	"""),_display_(Seq[Any](/*46.3*/for(climateService <- climateServices) yield /*46.41*/{_display_(Seq[Any](format.raw/*46.42*/("""
	<tr>
		<td><a href = """"),_display_(Seq[Any](/*48.19*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*48.88*/(""""><font size="3">"""),_display_(Seq[Any](/*48.106*/climateService/*48.120*/.getClimateServiceName())),format.raw/*48.144*/("""</a></font></td>

		<td><span class=""""),_display_(Seq[Any](/*50.21*/climateService/*50.35*/.getClimateServiceName())),format.raw/*50.59*/(""" editable"  data-name='purpose'><font size="3">
				"""),_display_(Seq[Any](/*51.6*/climateService/*51.20*/.getPurpose())),format.raw/*51.33*/(""" </font></span></td>
		
		<td class = "text-center" ><span class=""""),_display_(Seq[Any](/*53.44*/climateService/*53.58*/.getClimateServiceName())),format.raw/*53.82*/(""" editable" id = "url" data-name='url'>
				<a href = """"),_display_(Seq[Any](/*54.17*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*54.86*/("""">
					<img src='"""),_display_(Seq[Any](/*55.17*/climateService/*55.31*/.getPhoto())),format.raw/*55.42*/("""' style="height: 150px; width: 150px" ></a>
		</span></td>

		<td><span class=""""),_display_(Seq[Any](/*58.21*/climateService/*58.35*/.getClimateServiceName())),format.raw/*58.59*/(""" editable" data-name='versionNo'>
		"""),_display_(Seq[Any](/*59.4*/for(version <- climateService.getVerionList()) yield /*59.50*/{_display_(Seq[Any](format.raw/*59.51*/("""
			<a href = """"),_display_(Seq[Any](/*60.16*/{routes.ClimateServiceController.oneService(climateService.findUrl(version))})),format.raw/*60.93*/("""">"""),_display_(Seq[Any](/*60.96*/version)),format.raw/*60.103*/("""</a><br>
		""")))})),format.raw/*61.4*/("""
		</span></td>




	
	</tr>
	""")))})),format.raw/*69.3*/("""
    </table>
 
    
     """),_display_(Seq[Any](/*73.7*/if(false)/*73.16*/{_display_(Seq[Any](format.raw/*73.17*/("""
		    
	    """),_display_(Seq[Any](/*75.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*75.115*/ {_display_(Seq[Any](format.raw/*75.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*78.7*/("""
    """)))})),format.raw/*79.6*/("""
""")))})),format.raw/*80.2*/("""
"""))}
    }
    
    def render(climateServices:List[metadata.ClimateService],climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm)
    
    def f:((List[metadata.ClimateService],play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm) => apply(climateServices,climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 18 15:18:50 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/team_proj_sprint2/ApacheCMDA-Frontend/app/views/climate/climateServices.scala.html
                    HASH: de45c4a80c9d9c63500c7cf8a966aa58b1d9dc7b
                    MATRIX: 3250->1205|3453->1335|3468->1342|3553->1346|3605->1362|3620->1368|3682->1408|3784->1482|3813->1483|3843->1486|3871->1487|3927->1314|3956->1333|3984->1502|4022->1505|4064->1538|4104->1540|4144->1545|4181->1560|4233->1576|4257->1591|4286->1598|4635->1912|4689->1950|4728->1951|4789->1976|4880->2045|4935->2063|4959->2077|5006->2101|5080->2139|5103->2153|5149->2177|5237->2230|5260->2244|5295->2257|5398->2324|5421->2338|5467->2362|5558->2417|5649->2486|5704->2505|5727->2519|5760->2530|5876->2610|5899->2624|5945->2648|6017->2685|6079->2731|6118->2732|6170->2748|6269->2825|6308->2828|6338->2835|6381->2847|6443->2878|6505->2905|6523->2914|6562->2915|6611->2929|6729->3037|6770->3039|6890->3128|6927->3134|6960->3136
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|89->46|89->46|89->46|91->48|91->48|91->48|91->48|91->48|93->50|93->50|93->50|94->51|94->51|94->51|96->53|96->53|96->53|97->54|97->54|98->55|98->55|98->55|101->58|101->58|101->58|102->59|102->59|102->59|103->60|103->60|103->60|103->60|104->61|112->69|116->73|116->73|116->73|118->75|118->75|118->75|121->78|122->79|123->80
                    -- GENERATED --
                */
            