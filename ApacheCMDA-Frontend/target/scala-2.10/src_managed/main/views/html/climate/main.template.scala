
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,Html,Html,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(title: String,email:String, moreScripts: Html = Html(""))(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.75*/("""

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
	"""),_display_(Seq[Any](/*76.3*/if(email == null)/*76.20*/{_display_(Seq[Any](format.raw/*76.21*/("""
		"""),_display_(Seq[Any](/*77.4*/header())),format.raw/*77.12*/("""
	""")))}/*78.3*/else/*78.7*/{_display_(Seq[Any](format.raw/*78.8*/("""
		"""),_display_(Seq[Any](/*79.4*/loginHeader(email))),format.raw/*79.22*/("""
	""")))})),format.raw/*80.3*/("""


	<div class="container">

		"""),_display_(Seq[Any](/*85.4*/content)),format.raw/*85.11*/("""

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
    
    def render(title:String,email:String,moreScripts:Html,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,email,moreScripts)(content)
    
    def f:((String,String,Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,email,moreScripts) => (content) => apply(title,email,moreScripts)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 21 21:02:18 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/main.scala.html
                    HASH: 635f83c58b69329fb9b6fae6d099cdf6e8a61729
                    MATRIX: 3193->1205|3361->1278|3438->1320|3465->1325|3689->1514|3704->1520|3765->1559|3834->1593|3849->1599|3917->1645|3986->1679|4001->1685|4059->1721|4143->1770|4158->1776|4214->1810|4303->1864|4318->1870|4372->1902|4424->1918|4439->1924|4509->1972|4581->2008|4596->2014|4672->2068|4744->2104|4759->2110|4816->2145|5132->2425|5147->2431|5210->2472|5310->2536|5325->2542|5392->2587|5478->2637|5493->2643|5557->2685|5666->2758|5681->2764|5742->2803|5827->2852|5842->2858|5908->2902|5993->2951|6008->2957|6077->3004|6252->3143|6267->3149|6324->3184|6409->3233|6424->3239|6487->3280|6550->3307|6565->3313|6627->3353|6713->3403|6728->3409|6801->3460|6857->3481|6890->3492|6944->3511|6970->3528|7009->3529|7048->3533|7078->3541|7099->3544|7111->3548|7149->3549|7188->3553|7228->3571|7262->3574|7329->3606|7358->3613
                    LINES: 56->18|59->18|66->25|66->25|72->31|72->31|72->31|74->33|74->33|74->33|76->35|76->35|76->35|78->37|78->37|78->37|80->39|80->39|80->39|81->40|81->40|81->40|83->42|83->42|83->42|85->44|85->44|85->44|89->48|89->48|89->48|91->50|91->50|91->50|93->52|93->52|93->52|95->54|95->54|95->54|96->55|96->55|96->55|97->56|97->56|97->56|100->59|100->59|100->59|101->60|101->60|101->60|102->61|102->61|102->61|104->63|104->63|104->63|113->72|113->72|117->76|117->76|117->76|118->77|118->77|119->78|119->78|119->78|120->79|120->79|121->80|126->85|126->85
                    -- GENERATED --
                */
            