
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

		<title>"""),_display_(Seq[Any](/*25.11*/title)),format.raw/*25.16*/("""</title>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<link rel="stylesheet"
		href='"""),_display_(Seq[Any](/*31.10*/routes/*31.16*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*31.55*/("""'>
		<link rel="stylesheet"
		href='"""),_display_(Seq[Any](/*33.10*/routes/*33.16*/.Assets.at("stylesheets/navbar-fixed-top.css"))),format.raw/*33.62*/("""'>
		<link rel="stylesheet"
		href='"""),_display_(Seq[Any](/*35.10*/routes/*35.16*/.Assets.at("stylesheets/custom.css"))),format.raw/*35.52*/("""'>
		<link rel="stylesheet" media="screen"
		href='"""),_display_(Seq[Any](/*37.10*/routes/*37.16*/.Assets.at("stylesheets/main.css"))),format.raw/*37.50*/("""'>
		<link rel="shortcut icon" type="image/png"
		href='"""),_display_(Seq[Any](/*39.10*/routes/*39.16*/.Assets.at("images/favicon.png"))),format.raw/*39.48*/("""'>
		<link href='"""),_display_(Seq[Any](/*40.16*/routes/*40.22*/.Assets.at("stylesheets/bootstrap-editable.css"))),format.raw/*40.70*/("""'
		rel="stylesheet" />
		<link href='"""),_display_(Seq[Any](/*42.16*/routes/*42.22*/.Assets.at("stylesheets/jquery.tablesorter.pager.css"))),format.raw/*42.76*/("""'
		rel="stylesheet" />
		<link href='"""),_display_(Seq[Any](/*44.16*/routes/*44.22*/.Assets.at("stylesheets/style.css"))),format.raw/*44.57*/("""'
		rel="stylesheet" />
		<link rel="stylesheet"  href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
		<link rel="stylesheet" href='"""),_display_(Seq[Any](/*48.33*/routes/*48.39*/.Assets.at("stylesheets/star-rating.css"))),format.raw/*48.80*/("""' media="all" rel="stylesheet" type="text/css"/>

		<script src='"""),_display_(Seq[Any](/*50.17*/routes/*50.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*50.68*/("""'
		type="text/javascript"></script>
		<script src='"""),_display_(Seq[Any](/*52.17*/routes/*52.23*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*52.65*/("""'
		type="text/javascript"></script>
		<script type='text/javascript' src='"""),_display_(Seq[Any](/*54.40*/routes/*54.46*/.Assets.at("javascripts/lastLoader.js"))),format.raw/*54.85*/("""'></script>
		<script type='text/javascript' src='"""),_display_(Seq[Any](/*55.40*/routes/*55.46*/.Assets.at("javascripts/jquery.metadata.js"))),format.raw/*55.90*/("""'></script>
		<script type='text/javascript' src='"""),_display_(Seq[Any](/*56.40*/routes/*56.46*/.Assets.at("javascripts/jquery.tablesorter.js"))),format.raw/*56.93*/("""'></script>
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

		<script type='text/javascript' src='"""),_display_(Seq[Any](/*59.40*/routes/*59.46*/.Assets.at("javascripts/jstree.js"))),format.raw/*59.81*/("""'></script>
		<script type='text/javascript' src='"""),_display_(Seq[Any](/*60.40*/routes/*60.46*/.Assets.at("javascripts/keyword_tree.js"))),format.raw/*60.87*/("""'></script>
		<script src='"""),_display_(Seq[Any](/*61.17*/routes/*61.23*/.Assets.at("javascripts/star-rating.js"))),format.raw/*61.63*/("""' type="text/javascript"></script>

		<script src='"""),_display_(Seq[Any](/*63.17*/routes/*63.23*/.Assets.at("javascripts/bootstrap-editable.min.js"))),format.raw/*63.74*/("""'></script>




"""),_display_(Seq[Any](/*68.2*/moreScripts)),format.raw/*68.13*/("""
</head>

<body>
	"""),_display_(Seq[Any](/*72.3*/if(email == null || email =="")/*72.34*/{_display_(Seq[Any](format.raw/*72.35*/("""
		"""),_display_(Seq[Any](/*73.4*/header())),format.raw/*73.12*/("""
	""")))}/*74.3*/else/*74.7*/{_display_(Seq[Any](format.raw/*74.8*/("""
		"""),_display_(Seq[Any](/*75.4*/loginHeader(email))),format.raw/*75.22*/("""
	""")))})),format.raw/*76.3*/("""


	<div class="container">

		"""),_display_(Seq[Any](/*81.4*/content)),format.raw/*81.11*/("""

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
                    DATE: Sun Nov 29 15:58:08 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/tangzhongao/ApacheCMDA-Frontend/app/views/climate/main.scala.html
                    HASH: 6dd4a9cae111b8678b8959c731c9907568f775e0
                    MATRIX: 3163->1189|3331->1262|3412->1307|3439->1312|3673->1510|3688->1516|3749->1555|3822->1592|3837->1598|3905->1644|3978->1681|3993->1687|4051->1723|4139->1775|4154->1781|4210->1815|4303->1872|4318->1878|4372->1910|4426->1928|4441->1934|4511->1982|4586->2021|4601->2027|4677->2081|4752->2120|4767->2126|4824->2161|5144->2445|5159->2451|5222->2492|5324->2558|5339->2564|5406->2609|5495->2662|5510->2668|5574->2710|5686->2786|5701->2792|5762->2831|5849->2882|5864->2888|5930->2932|6017->2983|6032->2989|6101->3036|6279->3178|6294->3184|6351->3219|6438->3270|6453->3276|6516->3317|6580->3345|6595->3351|6657->3391|6745->3443|6760->3449|6833->3500|6885->3517|6918->3528|6972->3547|7012->3578|7051->3579|7090->3583|7120->3591|7141->3594|7153->3598|7191->3599|7230->3603|7270->3621|7304->3624|7371->3656|7400->3663
                    LINES: 56->18|59->18|66->25|66->25|72->31|72->31|72->31|74->33|74->33|74->33|76->35|76->35|76->35|78->37|78->37|78->37|80->39|80->39|80->39|81->40|81->40|81->40|83->42|83->42|83->42|85->44|85->44|85->44|89->48|89->48|89->48|91->50|91->50|91->50|93->52|93->52|93->52|95->54|95->54|95->54|96->55|96->55|96->55|97->56|97->56|97->56|100->59|100->59|100->59|101->60|101->60|101->60|102->61|102->61|102->61|104->63|104->63|104->63|109->68|109->68|113->72|113->72|113->72|114->73|114->73|115->74|115->74|115->74|116->75|116->75|117->76|122->81|122->81
                    -- GENERATED --
                */
            