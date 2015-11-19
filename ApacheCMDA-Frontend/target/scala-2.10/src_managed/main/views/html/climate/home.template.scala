
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
	<p> Our website is to provide you a quick and easy way to find the
		<b>Climate Services</b> you want.
	</p>

	<div class="row">
		<div class="col-lg-5">
			<br>
			<br>
			<img src="/assets/images/iceberg.jpg" height="400" width="430" />
		</div>
		<div class="col-lg-7">
			<h2>Climate Service List</h2>
			"""),_display_(Seq[Any](/*42.5*/for(climateService <- climateServices) yield /*42.43*/{_display_(Seq[Any](format.raw/*42.44*/("""
				<div class="row">
					<div class="col-md-7"><a href = """"),_display_(Seq[Any](/*44.40*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*44.109*/(""""><font size="3">"""),_display_(Seq[Any](/*44.127*/climateService/*44.141*/.getClimateServiceName())),format.raw/*44.165*/("""</a></font></div>
					<span><div class="col-md-3 col-md-offset-2" ><input value ="3.7" class="rating-input" data-size="xs" type="number" readonly/></div></span>
				</div>
			""")))})),format.raw/*47.5*/("""

			<!-- """),_display_(Seq[Any](/*49.10*/if(!session.get("username"))/*49.38*/{_display_(Seq[Any](format.raw/*49.39*/(""" -->

			<p>
				"""),_display_(Seq[Any](/*52.6*/if(false)/*52.15*/{_display_(Seq[Any](format.raw/*52.16*/(""" <a class="btn btn-primary" href="climate/register"
					role="button">Register &raquo;</a> """)))})),format.raw/*53.42*/("""
			</p>
			<!-- """)))})),format.raw/*55.10*/(""" -->
		</div>
	</div>
</div>
	<script>
		jQuery(document).ready(function () """),format.raw/*60.38*/("""{"""),format.raw/*60.39*/("""
			$('.rating-input').rating("""),format.raw/*61.30*/("""{"""),format.raw/*61.31*/("""
				min: 0,
				max: 5,
				step: 0.1,
				size: 'xs',
				showClear: false,
				showCaption: false,
				hoverEnabled:false,
				hoverChangeStars: false
			"""),format.raw/*70.4*/("""}"""),format.raw/*70.5*/(""");
	"""),format.raw/*71.2*/("""}"""),format.raw/*71.3*/(""");
	</script>
""")))})))}
    }
    
    def render(email:String,vfile:String,dataset:String,climateServices:List[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(email,vfile,dataset,climateServices)
    
    def f:((String,String,String,List[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (email,vfile,dataset,climateServices) => apply(email,vfile,dataset,climateServices)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 17 21:34:02 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/team_proj_sprint2/ApacheCMDA-Frontend/app/views/climate/home.scala.html
                    HASH: 76f27304189c7904a6f3f867e21794a97f225af1
                    MATRIX: 3220->1205|3426->1300|3455->1319|3492->1321|3513->1333|3553->1335|3615->1362|3640->1378|3679->1379|3927->1596|4274->1908|4328->1946|4367->1947|4465->2009|4557->2078|4612->2096|4636->2110|4683->2134|4891->2311|4938->2322|4975->2350|5014->2351|5067->2369|5085->2378|5124->2379|5249->2472|5299->2490|5403->2566|5432->2567|5490->2597|5519->2598|5703->2755|5731->2756|5762->2760|5790->2761
                    LINES: 56->18|60->18|62->21|63->22|63->22|63->22|65->24|65->24|65->24|70->29|83->42|83->42|83->42|85->44|85->44|85->44|85->44|85->44|88->47|90->49|90->49|90->49|93->52|93->52|93->52|94->53|96->55|101->60|101->60|102->61|102->61|111->70|111->70|112->71|112->71
                    -- GENERATED --
                */
            