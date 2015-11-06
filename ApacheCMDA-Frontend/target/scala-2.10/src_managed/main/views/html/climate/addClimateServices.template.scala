
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
object addClimateServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(climateServiceForm: play.data.Form[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*21.2*/scripts/*21.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
	<script src='"""),_display_(Seq[Any](/*22.16*/routes/*22.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*22.62*/("""'></script>
""")))};
Seq[Any](format.raw/*18.63*/("""
"""),format.raw/*20.1*/("""
"""),format.raw/*23.2*/("""

"""),_display_(Seq[Any](/*25.2*/main("Climate Services", scripts)/*25.35*/ {_display_(Seq[Any](format.raw/*25.37*/("""
	
	"""),_display_(Seq[Any](/*27.3*/flash_message())),format.raw/*27.18*/("""    
     """),_display_(Seq[Any](/*28.7*/if(true)/*28.15*/{_display_(Seq[Any](format.raw/*28.16*/("""
	    <h1>Add a new climate service</h1>
	    """),_display_(Seq[Any](/*30.7*/form(routes.ClimateServiceController.newClimateService())/*30.64*/ {_display_(Seq[Any](format.raw/*30.66*/("""   
	        """),_display_(Seq[Any](/*31.11*/inputText(
	        	climateServiceForm("Name"),
	        	'_label -> "Name * (Please DO NOT contain spaces)"
	        ))),format.raw/*34.11*/("""
	        """),_display_(Seq[Any](/*35.11*/inputText(
	        	climateServiceForm("Purpose"),
	        	'_label -> "Purpose"
	        ))),format.raw/*38.11*/("""
	        """),_display_(Seq[Any](/*39.11*/inputText(
	        	climateServiceForm("Url"),
	        	'_label -> "Url"
	        ))),format.raw/*42.11*/(""" 
	        """),_display_(Seq[Any](/*43.11*/inputText(
	        	climateServiceForm("Scenario"),
	        	'_label -> "Scenario"
	        ))),format.raw/*46.11*/("""
	         """),_display_(Seq[Any](/*47.12*/inputText(
	        	climateServiceForm("Version"),
	        	'_label -> "Version"
	        ))),format.raw/*50.11*/(""" 
	        """),_display_(Seq[Any](/*51.11*/inputText(
	        	climateServiceForm("Root_Service"),
	        	'_label -> "Root_Service"
	        ))),format.raw/*54.11*/("""
	        
	        <input class="btn" type="submit" value="Add a new service">
	        <a href=""""),_display_(Seq[Any](/*57.20*/routes/*57.26*/.ClimateServiceController.climateServices())),format.raw/*57.69*/("""" class="btn">Cancel</a>
	    """)))})),format.raw/*58.7*/("""
	
		<br>
		    
	    """),_display_(Seq[Any](/*62.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*62.115*/ {_display_(Seq[Any](format.raw/*62.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*65.7*/("""
    """)))})),format.raw/*66.6*/("""
""")))})),format.raw/*67.2*/("""
"""))}
    }
    
    def render(climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServiceForm)
    
    def f:((play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServiceForm) => apply(climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 04:17:49 EST 2015
                    SOURCE: C:/Users/Joe/Desktop/activator and projects/ApacheCMDA-Frontend/app/views/climate/addClimateServices.scala.html
                    HASH: 72cdfbde38b56140fd34450de284e7c94bb2519c
                    MATRIX: 3253->1222|3409->1306|3424->1313|3509->1317|3562->1334|3577->1340|3639->1380|3693->1283|3722->1303|3751->1394|3791->1399|3833->1432|3873->1434|3915->1441|3952->1456|3999->1468|4016->1476|4055->1477|4139->1526|4205->1583|4245->1585|4296->1600|4441->1723|4489->1735|4607->1831|4655->1843|4765->1931|4814->1944|4934->2042|4983->2055|5101->2151|5150->2164|5278->2270|5416->2372|5431->2378|5496->2421|5559->2453|5621->2480|5739->2588|5780->2590|5903->2682|5941->2689|5975->2692
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|64->18|65->20|66->23|68->25|68->25|68->25|70->27|70->27|71->28|71->28|71->28|73->30|73->30|73->30|74->31|77->34|78->35|81->38|82->39|85->42|86->43|89->46|90->47|93->50|94->51|97->54|100->57|100->57|100->57|101->58|105->62|105->62|105->62|108->65|109->66|110->67
                    -- GENERATED --
                */
            