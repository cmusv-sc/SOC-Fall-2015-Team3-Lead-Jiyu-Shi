
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
object datasetTime extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*20.2*/scripts/*20.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.13*/("""

<script type="text/javascript" src='"""),_display_(Seq[Any](/*22.38*/routes/*22.44*/.Assets.at("javascripts/dataList1.js"))),format.raw/*22.82*/("""'></script>
<script type="text/javascript">
	window.onload = function() """),format.raw/*24.29*/("""{"""),format.raw/*24.30*/("""
		var table = document.getElementById("myTable");	
		var obj = new Object();
		for (var group in dataList) """),format.raw/*27.31*/("""{"""),format.raw/*27.32*/("""
			for (var dataset in dataList[group][2]) """),format.raw/*28.44*/("""{"""),format.raw/*28.45*/("""
				var row = table.insertRow(1);
			    var groupName = row.insertCell(0);
			    var name = row.insertCell(1);
			    var startTime = row.insertCell(2);
			    var endTime = row.insertCell(3);
			    
			    groupName.innerHTML = group;
			    name.innerHTML = dataset;
			    startTime.innerHTML = dataList[group][2][dataset][0];
			    endTime.innerHTML = dataList[group][2][dataset][1];
			    
				obj[group + "_" + dataset] = [dataList[group][2][dataset][0],dataList[group][2][dataset][1]];
			"""),format.raw/*41.4*/("""}"""),format.raw/*41.5*/("""
		"""),format.raw/*42.3*/("""}"""),format.raw/*42.4*/("""
		document.getElementById("demo").innerHTML = Object.keys(obj).length + " Datasets";
	"""),format.raw/*44.2*/("""}"""),format.raw/*44.3*/("""
</script>
""")))};
Seq[Any](format.raw/*18.19*/(""" 

"""),format.raw/*46.2*/("""

"""),_display_(Seq[Any](/*48.2*/main("Dataset Time", scripts)/*48.31*/ {_display_(Seq[Any](format.raw/*48.33*/("""

<h1>Dataset Time</h1>

<h4 id="demo"></h4>

<table class="table table-striped table-bordered table-condensed" id="myTable">
	<tbody>
		<tr>
			<th class="col-md-3">Dataset Name</th>
			<th class="col-md-3">Variable Name</th>
			<th class="col-md-3">Start Time</th>
			<th class="col-md-3">End Time</th>
		</tr>
	</tbody>
</table>


""")))})))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 04:17:49 EST 2015
                    SOURCE: C:/Users/Joe/Desktop/activator and projects/ApacheCMDA-Frontend/app/views/climate/datasetTime.scala.html
                    HASH: f1b5ab0d314204f0dd8b2a1baee38441294527a7
                    MATRIX: 3213->1222|3308->1245|3323->1252|3408->1256|3485->1297|3500->1303|3560->1341|3662->1415|3691->1416|3830->1527|3859->1528|3932->1573|3961->1574|4503->2089|4531->2090|4562->2094|4590->2095|4706->2184|4734->2185|4788->1239|4820->2199|4860->2204|4898->2233|4938->2235
                    LINES: 56->18|58->20|58->20|60->20|62->22|62->22|62->22|64->24|64->24|67->27|67->27|68->28|68->28|81->41|81->41|82->42|82->42|84->44|84->44|87->18|89->46|91->48|91->48|91->48
                    -- GENERATED --
                */
            