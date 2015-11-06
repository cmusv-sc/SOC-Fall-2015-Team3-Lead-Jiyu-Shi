
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
object dataSetList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[DataSet],play.data.Form[DataSet],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(dataSets: List[DataSet], dataSetForm: play.data.Form[DataSet]):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*18.65*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Dataset List", scripts)/*31.31*/ {_display_(Seq[Any](format.raw/*31.33*/("""
	
	"""),_display_(Seq[Any](/*33.3*/flash_message())),format.raw/*33.18*/("""   
	 
    <h1>Climate Datasets</h1>
    <h2>"""),_display_(Seq[Any](/*36.10*/dataSets/*36.18*/.size())),format.raw/*36.25*/(""" Datasets Found</h2>
    <div style="overflow-y:scroll">

		<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable">
		<thead>
	<tr >
		<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
		<th style = "vertical-align: top;" class="col-md-2">Dataset Name</th>
		<th style = "vertical-align: top;" class="col-md-1">Agency</th>
		<th style = "vertical-align: top;" class="col-md-1">Instrument</th>
		<th style = "vertical-align: top;" class="col-md-2">Physical variable</th>
		<th style = "vertical-align: top;" class="col-md-1">Variable short name</th>
		<th style = "vertical-align: top;" class="col-md-1">Units</th>
		<th style = "vertical-align: top;" class="col-md-1">Grid Dimension</th>
		<!--  
		<th style = "vertical-align: top;" class="col-md-3">Source</th> 
		<th style = "vertical-align: top;" class="col-md-3">Status</th>
		<th style = "vertical-align: top;" class="col-md-4">Responsible Person</th>
		<th style = "vertical-align: top;" class="col-md-4">Data Source Name in Web Interface</th> 
		-->
		<th style = "vertical-align: top;" class="col-md-2">Variable Name in Web Interface</th>
		<th style = "vertical-align: top;" class="col-md-1">Data Source Input Parameter</th>
		<!-- <th style = "vertical-align: top;" class="col-md-3">Variable Name Input Parameter</th> -->
		<th style = "vertical-align: top;" class="col-md-1">Dataset Start Time</th>
		<th style = "vertical-align: top;"class="col-md-1">Dataset End Time</th>

	</tr>
	</thead>
	<tbody>
	"""),_display_(Seq[Any](/*65.3*/for(dataSet <- dataSets) yield /*65.27*/{_display_(Seq[Any](format.raw/*65.28*/("""
	<tr>
		<td><font size="2">"""),_display_(Seq[Any](/*67.23*/dataSet/*67.30*/.getId())),format.raw/*67.38*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*68.23*/dataSet/*68.30*/.getDataSetName())),format.raw/*68.47*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*69.23*/dataSet/*69.30*/.getAgencyId())),format.raw/*69.44*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*70.23*/dataSet/*70.30*/.getInstrument())),format.raw/*70.46*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*71.23*/dataSet/*71.30*/.getPhysicalVariable())),format.raw/*71.52*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*72.23*/dataSet/*72.30*/.getCMIP5VarName())),format.raw/*72.48*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*73.23*/dataSet/*73.30*/.getUnits())),format.raw/*73.41*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*74.23*/dataSet/*74.30*/.getGridDimension())),format.raw/*74.49*/("""</font></td>
		<!--
		<td><font size="2">"""),_display_(Seq[Any](/*76.23*/dataSet/*76.30*/.getSource())),format.raw/*76.42*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*77.23*/dataSet/*77.30*/.getStatus())),format.raw/*77.42*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*78.23*/dataSet/*78.30*/.getResponsiblePerson())),format.raw/*78.53*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*79.23*/dataSet/*79.30*/.getDataSourceName())),format.raw/*79.50*/("""</font></td>
		-->
		<td><font size="2">"""),_display_(Seq[Any](/*81.23*/dataSet/*81.30*/.getVariableName())),format.raw/*81.48*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*82.23*/dataSet/*82.30*/.getDataSourceInput())),format.raw/*82.51*/("""</font></td>
		<!--<td><font size="2">"""),_display_(Seq[Any](/*83.27*/dataSet/*83.34*/.getVariableNameInput())),format.raw/*83.57*/("""</font></td> -->
		<td><font size="2">"""),_display_(Seq[Any](/*84.23*/dataSet/*84.30*/.getStartTime())),format.raw/*84.45*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*85.23*/dataSet/*85.30*/.getEndTime())),format.raw/*85.43*/("""</font></td>
		
	</tr>
	
	""")))})),format.raw/*89.3*/("""
	</tbody>
    </table>
    
 
    
    </div>
""")))})),format.raw/*96.2*/("""
"""))}
    }
    
    def render(dataSets:List[DataSet],dataSetForm:play.data.Form[DataSet]): play.api.templates.HtmlFormat.Appendable = apply(dataSets,dataSetForm)
    
    def f:((List[DataSet],play.data.Form[DataSet]) => play.api.templates.HtmlFormat.Appendable) = (dataSets,dataSetForm) => apply(dataSets,dataSetForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 04:17:49 EST 2015
                    SOURCE: C:/Users/Joe/Desktop/activator and projects/ApacheCMDA-Frontend/app/views/climate/dataSetList.scala.html
                    HASH: 6827dd3ebe527f589e90c42d60e3a8eaf36a3a23
                    MATRIX: 3244->1222|3402->1310|3417->1317|3502->1321|3555->1338|3570->1344|3632->1384|3736->1460|3765->1461|3825->1494|3853->1495|3910->1285|3941->1307|3970->1512|4010->1517|4048->1546|4088->1548|4130->1555|4167->1570|4252->1619|4269->1627|4298->1634|5881->3182|5921->3206|5960->3207|6027->3238|6043->3245|6073->3253|6145->3289|6161->3296|6200->3313|6272->3349|6288->3356|6324->3370|6396->3406|6412->3413|6450->3429|6522->3465|6538->3472|6582->3494|6654->3530|6670->3537|6710->3555|6782->3591|6798->3598|6831->3609|6903->3645|6919->3652|6960->3671|7040->3715|7056->3722|7090->3734|7162->3770|7178->3777|7212->3789|7284->3825|7300->3832|7345->3855|7417->3891|7433->3898|7475->3918|7554->3961|7570->3968|7610->3986|7682->4022|7698->4029|7741->4050|7817->4090|7833->4097|7878->4120|7954->4160|7970->4167|8007->4182|8079->4218|8095->4225|8130->4238|8192->4269|8278->4324
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|79->36|79->36|79->36|108->65|108->65|108->65|110->67|110->67|110->67|111->68|111->68|111->68|112->69|112->69|112->69|113->70|113->70|113->70|114->71|114->71|114->71|115->72|115->72|115->72|116->73|116->73|116->73|117->74|117->74|117->74|119->76|119->76|119->76|120->77|120->77|120->77|121->78|121->78|121->78|122->79|122->79|122->79|124->81|124->81|124->81|125->82|125->82|125->82|126->83|126->83|126->83|127->84|127->84|127->84|128->85|128->85|128->85|132->89|139->96
                    -- GENERATED --
                */
            