
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,List[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(email: String, vfile: String, dataset: String, climateServices: List[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*18.97*/("""

"""),format.raw/*21.1*/("""
"""),_display_(Seq[Any](/*22.2*/main("Home")/*22.14*/ {_display_(Seq[Any](format.raw/*22.16*/("""
<div class="jumbotron">
	"""),_display_(Seq[Any](/*24.3*/if(email!= null)/*24.19*/{_display_(Seq[Any](format.raw/*24.20*/("""
		<div class="alert alert-success fade in">
			<strong>You have been registered successfully!</strong>
			<button class="btn btn-success pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
		</div>
	""")))})),format.raw/*29.3*/("""


	<div class="row">
		<div class="col-lg-5">
			<br>
			<br>
			<img src="/assets/images/iceberg.jpg" height="400" width="430" />
		</div>
		<div class="col-lg-7">
			<h2>Climate Service List</h2>
			"""),_display_(Seq[Any](/*40.5*/for(climateService <- climateServices) yield /*40.43*/{_display_(Seq[Any](format.raw/*40.44*/("""
				<div class="row">
					<div class="col-md-7"><a href = """"),_display_(Seq[Any](/*42.40*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*42.109*/(""""><font size="3">"""),_display_(Seq[Any](/*42.127*/climateService/*42.141*/.getClimateServiceName())),format.raw/*42.165*/("""</a></font></div>
					<span><div class="col-md-3 col-md-offset-2" ><input value ="3.7" class="rating-input" data-size="xs" type="number" readonly/></div></span>
				</div>
			""")))})),format.raw/*45.5*/("""

			<!-- """),_display_(Seq[Any](/*47.10*/if(!session.get("username"))/*47.38*/{_display_(Seq[Any](format.raw/*47.39*/(""" -->

			<p>
				"""),_display_(Seq[Any](/*50.6*/if(false)/*50.15*/{_display_(Seq[Any](format.raw/*50.16*/(""" <a class="btn btn-primary" href="climate/register"
					role="button">Register &raquo;</a> """)))})),format.raw/*51.42*/("""
			</p>
			<!-- """)))})),format.raw/*53.10*/(""" -->
		</div>
	</div>
</div>
	<script>
		jQuery(document).ready(function () """),format.raw/*58.38*/("""{"""),format.raw/*58.39*/("""
			$('.rating-input').rating("""),format.raw/*59.30*/("""{"""),format.raw/*59.31*/("""
				min: 0,
				max: 5,
				step: 0.1,
				size: 'xs',
				showClear: false,
				showCaption: false,
				hoverEnabled:false,
				hoverChangeStars: false
			"""),format.raw/*68.4*/("""}"""),format.raw/*68.5*/(""");
	"""),format.raw/*69.2*/("""}"""),format.raw/*69.3*/(""");
	</script>
""")))})))}
    }
    
    def render(email:String,vfile:String,dataset:String,climateServices:List[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(email,vfile,dataset,climateServices)
    
    def f:((String,String,String,List[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (email,vfile,dataset,climateServices) => apply(email,vfile,dataset,climateServices)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 20 23:16:22 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/home.scala.html
                    HASH: 1464403cc7b6ff4eb0c56947de8176b415a121e4
                    MATRIX: 3220->1205|3426->1300|3455->1319|3492->1321|3513->1333|3553->1335|3615->1362|3640->1378|3679->1379|3927->1596|4165->1799|4219->1837|4258->1838|4356->1900|4448->1969|4503->1987|4527->2001|4574->2025|4782->2202|4829->2213|4866->2241|4905->2242|4958->2260|4976->2269|5015->2270|5140->2363|5190->2381|5294->2457|5323->2458|5381->2488|5410->2489|5594->2646|5622->2647|5653->2651|5681->2652
                    LINES: 56->18|60->18|62->21|63->22|63->22|63->22|65->24|65->24|65->24|70->29|81->40|81->40|81->40|83->42|83->42|83->42|83->42|83->42|86->45|88->47|88->47|88->47|91->50|91->50|91->50|92->51|94->53|99->58|99->58|100->59|100->59|109->68|109->68|110->69|110->69
                    -- GENERATED --
                */
            