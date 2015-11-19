
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
	<link rel="stylesheet"  href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
	<link rel="stylesheet" href='"""),_display_(Seq[Any](/*48.32*/routes/*48.38*/.Assets.at("stylesheets/star-rating.css"))),format.raw/*48.79*/("""' media="all" rel="stylesheet" type="text/css"/>

<script src='"""),_display_(Seq[Any](/*50.15*/routes/*50.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*50.66*/("""'
	type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*52.15*/routes/*52.21*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*52.63*/("""'
	type="text/javascript"></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*54.38*/routes/*54.44*/.Assets.at("javascripts/lastLoader.js"))),format.raw/*54.83*/("""'></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*55.38*/routes/*55.44*/.Assets.at("javascripts/jquery.metadata.js"))),format.raw/*55.88*/("""'></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*56.38*/routes/*56.44*/.Assets.at("javascripts/jquery.tablesorter.js"))),format.raw/*56.91*/("""'></script>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

<script type='text/javascript' src='"""),_display_(Seq[Any](/*59.38*/routes/*59.44*/.Assets.at("javascripts/jstree.js"))),format.raw/*59.79*/("""'></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*60.38*/routes/*60.44*/.Assets.at("javascripts/keyword_tree.js"))),format.raw/*60.85*/("""'></script>
	<script src='"""),_display_(Seq[Any](/*61.16*/routes/*61.22*/.Assets.at("javascripts/star-rating.js"))),format.raw/*61.62*/("""' type="text/javascript"></script>

<script src='"""),_display_(Seq[Any](/*63.15*/routes/*63.21*/.Assets.at("javascripts/bootstrap-editable.min.js"))),format.raw/*63.72*/("""'></script>








"""),_display_(Seq[Any](/*72.2*/moreScripts)),format.raw/*72.13*/("""
</head>

<body>
	"""),_display_(Seq[Any](/*76.3*/header())),format.raw/*76.11*/("""
	


	<div class="container">

		"""),_display_(Seq[Any](/*82.4*/content)),format.raw/*82.11*/("""

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
                    DATE: Tue Nov 17 21:34:02 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/team_proj_sprint2/ApacheCMDA-Frontend/app/views/climate/main.scala.html
                    HASH: 4749a4a7a70f4c3e8306adbe0628464a7fde057d
                    MATRIX: 3186->1205|3341->1265|3419->1308|3446->1313|3670->1502|3685->1508|3746->1547|3815->1581|3830->1587|3898->1633|3967->1667|3982->1673|4040->1709|4124->1758|4139->1764|4195->1798|4284->1852|4299->1858|4353->1890|4405->1906|4420->1912|4490->1960|4562->1996|4577->2002|4653->2056|4725->2092|4740->2098|4797->2133|5113->2413|5128->2419|5191->2460|5291->2524|5306->2530|5373->2575|5459->2625|5474->2631|5538->2673|5647->2746|5662->2752|5723->2791|5808->2840|5823->2846|5889->2890|5974->2939|5989->2945|6058->2992|6233->3131|6248->3137|6305->3172|6390->3221|6405->3227|6468->3268|6531->3295|6546->3301|6608->3341|6694->3391|6709->3397|6782->3448|6838->3469|6871->3480|6925->3499|6955->3507|7024->3541|7053->3548
                    LINES: 56->18|59->18|66->25|66->25|72->31|72->31|72->31|74->33|74->33|74->33|76->35|76->35|76->35|78->37|78->37|78->37|80->39|80->39|80->39|81->40|81->40|81->40|83->42|83->42|83->42|85->44|85->44|85->44|89->48|89->48|89->48|91->50|91->50|91->50|93->52|93->52|93->52|95->54|95->54|95->54|96->55|96->55|96->55|97->56|97->56|97->56|100->59|100->59|100->59|101->60|101->60|101->60|102->61|102->61|102->61|104->63|104->63|104->63|113->72|113->72|117->76|117->76|123->82|123->82
                    -- GENERATED --
                */
            