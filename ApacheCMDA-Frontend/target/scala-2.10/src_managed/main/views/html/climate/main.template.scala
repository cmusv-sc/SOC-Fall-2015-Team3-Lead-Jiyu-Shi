
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Html,Html,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(title: String, moreScripts: Html = Html(""))(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.62*/(""" 

<!DOCTYPE html>

<html>
<head>

<title>"""),_display_(Seq[Any](/*25.9*/title)),format.raw/*25.14*/("""</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*31.9*/routes/*31.15*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*31.54*/("""'>
<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*33.9*/routes/*33.15*/.Assets.at("stylesheets/navbar-fixed-top.css"))),format.raw/*33.61*/("""'>
<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*35.9*/routes/*35.15*/.Assets.at("stylesheets/custom.css"))),format.raw/*35.51*/("""'>
<link rel="stylesheet" media="screen"
	href='"""),_display_(Seq[Any](/*37.9*/routes/*37.15*/.Assets.at("stylesheets/main.css"))),format.raw/*37.49*/("""'>
<link rel="shortcut icon" type="image/png"
	href='"""),_display_(Seq[Any](/*39.9*/routes/*39.15*/.Assets.at("images/favicon.png"))),format.raw/*39.47*/("""'>
<link href='"""),_display_(Seq[Any](/*40.14*/routes/*40.20*/.Assets.at("stylesheets/bootstrap-editable.css"))),format.raw/*40.68*/("""'
	rel="stylesheet" />
<link href='"""),_display_(Seq[Any](/*42.14*/routes/*42.20*/.Assets.at("stylesheets/jquery.tablesorter.pager.css"))),format.raw/*42.74*/("""'
	rel="stylesheet" />
<link href='"""),_display_(Seq[Any](/*44.14*/routes/*44.20*/.Assets.at("stylesheets/style.css"))),format.raw/*44.55*/("""'
	rel="stylesheet" />

<script src='"""),_display_(Seq[Any](/*47.15*/routes/*47.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*47.66*/("""'
	type="text/javascript"></script>	
<script src='"""),_display_(Seq[Any](/*49.15*/routes/*49.21*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*49.63*/("""'
	type="text/javascript"></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*51.38*/routes/*51.44*/.Assets.at("javascripts/lastLoader.js"))),format.raw/*51.83*/("""'></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*52.38*/routes/*52.44*/.Assets.at("javascripts/jquery.metadata.js"))),format.raw/*52.88*/("""'></script>	
<script type='text/javascript' src='"""),_display_(Seq[Any](/*53.38*/routes/*53.44*/.Assets.at("javascripts/jquery.tablesorter.js"))),format.raw/*53.91*/("""'></script>


<script type='text/javascript' src='"""),_display_(Seq[Any](/*56.38*/routes/*56.44*/.Assets.at("javascripts/jstree.js"))),format.raw/*56.79*/("""'></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*57.38*/routes/*57.44*/.Assets.at("javascripts/keyword_tree.js"))),format.raw/*57.85*/("""'></script>

<script src='"""),_display_(Seq[Any](/*59.15*/routes/*59.21*/.Assets.at("javascripts/bootstrap-editable.min.js"))),format.raw/*59.72*/("""'></script>








"""),_display_(Seq[Any](/*68.2*/moreScripts)),format.raw/*68.13*/("""
</head>

<body>
	"""),_display_(Seq[Any](/*72.3*/header())),format.raw/*72.11*/("""
	


	<div class="container">

		"""),_display_(Seq[Any](/*78.4*/content)),format.raw/*78.11*/("""

	</div>
	
	<!-- Footer -->
		<div class="footer" >
			<div class="row">
				<div class="col-lg-6 col-lg-offset-3">
					<p class="text-muted" style="text-align: center; font-size: 14px;">&copy;
						Carnegie Mellon University - Silicon Valley ; NASA Jet Propulsion Laboratory 2015</p>
				</div>
			</div>
		</div>

</body>
</html>
"""))}
    }
    
    def render(title:String,moreScripts:Html,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,moreScripts)(content)
    
    def f:((String,Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,moreScripts) => (content) => apply(title,moreScripts)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 06 16:44:19 EST 2015
                    SOURCE: C:/Users/Joe/Desktop/activator and projects/ApacheCMDA-Frontend/app/views/climate/main.scala.html
                    HASH: ee9e1472b01da83ff51b2cae384ed3bed91d81b4
                    MATRIX: 3216->1222|3371->1282|3456->1332|3483->1337|3713->1532|3728->1538|3789->1577|3860->1613|3875->1619|3943->1665|4014->1701|4029->1707|4087->1743|4173->1794|4188->1800|4244->1834|4335->1890|4350->1896|4404->1928|4457->1945|4472->1951|4542->1999|4616->2037|4631->2043|4707->2097|4781->2135|4796->2141|4853->2176|4930->2217|4945->2223|5012->2268|5101->2321|5116->2327|5180->2369|5291->2444|5306->2450|5367->2489|5453->2539|5468->2545|5534->2589|5621->2640|5636->2646|5705->2693|5795->2747|5810->2753|5867->2788|5953->2838|5968->2844|6031->2885|6096->2914|6111->2920|6184->2971|6249->3001|6282->3012|6340->3035|6370->3043|6445->3083|6474->3090
                    LINES: 56->18|59->18|66->25|66->25|72->31|72->31|72->31|74->33|74->33|74->33|76->35|76->35|76->35|78->37|78->37|78->37|80->39|80->39|80->39|81->40|81->40|81->40|83->42|83->42|83->42|85->44|85->44|85->44|88->47|88->47|88->47|90->49|90->49|90->49|92->51|92->51|92->51|93->52|93->52|93->52|94->53|94->53|94->53|97->56|97->56|97->56|98->57|98->57|98->57|100->59|100->59|100->59|109->68|109->68|113->72|113->72|119->78|119->78
                    -- GENERATED --
                */
            