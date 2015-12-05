
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
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*19.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*19.4*/("""
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="row">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
				class="icon-bar"></span> <span class="icon-bar"></span> <span
				class="icon-bar"></span>
				</button>
				<a class="navbar-brand" style="padding-bottom: 0 ;" href="/climate"><img
				src='"""),_display_(Seq[Any](/*31.11*/routes/*31.17*/.Assets.at("images/logo.png"))),format.raw/*31.46*/("""' style="height: 15px ; width: 250px ;">
				</a>
			</div>
			<div class="navbar-collapse collapse" style="height:">
				<form class="navbar-form navbar-right" role="register">
					<a class="btn btn-primary" href="/climate/sign" role="button">Register&raquo;</a>
				</form>
				<ul class="nav navbar-nav navbar-right">

					"""),format.raw/*40.62*/("""
						"""),format.raw/*41.35*/("""
							"""),format.raw/*42.84*/("""
							"""),format.raw/*43.79*/("""
						"""),format.raw/*44.17*/("""
						"""),format.raw/*45.72*/("""
					"""),format.raw/*46.17*/("""

				<div class="navbar-form navbar-right">
					"""),_display_(Seq[Any](/*49.7*/helper/*49.13*/.form(routes.Application.login)/*49.44*/{_display_(Seq[Any](format.raw/*49.45*/("""
						<div class="form-group">
							<input class="form-control" id="ex1" type="email" name="email" placeholder="Email" >
							<input type="password" class="form-control" name="password" placeholder="Password" >
							<button type="submit" class="btn btn-success" >Login</button>
						</div>
					""")))})),format.raw/*55.7*/("""
				</div>

					<li class="dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown">Service<b class="caret"></b> </a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*61.22*/routes/*61.28*/.ClimateServiceController.searchService())),format.raw/*61.69*/("""">Search Service </a></li>
							<li><a href=""""),_display_(Seq[Any](/*62.22*/routes/*62.28*/.ClimateServiceController.climateServices())),format.raw/*62.71*/("""">Service List</a></li>
							<li><a href=""""),_display_(Seq[Any](/*63.22*/routes/*63.28*/.ClimateServiceController.mostPopularClimateServices())),format.raw/*63.82*/("""">Most Popular Service</a></li>
							<li><a href=""""),_display_(Seq[Any](/*64.22*/routes/*64.28*/.ClimateServiceController.mostRecentlyAddedClimateServices())),format.raw/*64.88*/("""">Recent Added Service</a></li>
							<li><a href=""""),_display_(Seq[Any](/*65.22*/routes/*65.28*/.ClimateServiceController.mostRecentlyUsedClimateServices())),format.raw/*65.87*/("""">Recent Used  Service</a></li>
						</ul>
					</li>
					<li class="dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown">Dataset<b
					class="caret"></b> </a>
						<ul class="dropdown-menu">

							<li><a href=""""),_display_(Seq[Any](/*73.22*/routes/*73.28*/.DatasetController.datasetList())),format.raw/*73.60*/("""">Dataset List</a></li>
							<li><a href=""""),_display_(Seq[Any](/*74.22*/routes/*74.28*/.DatasetController.searchDataset())),format.raw/*74.62*/("""">Search dataset</a></li>
						</ul>
					</li>
					"""),format.raw/*77.42*/("""
					"""),format.raw/*78.66*/("""
					"""),format.raw/*79.32*/("""
					"""),format.raw/*80.36*/("""
					"""),format.raw/*81.99*/("""
					"""),format.raw/*82.104*/("""
					"""),format.raw/*83.15*/("""
					"""),format.raw/*84.15*/("""
					<li class="dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown">About<b
					class="caret"></b> </a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*89.22*/routes/*89.28*/.ClimateServiceController.home())),format.raw/*89.60*/("""">Home</a></li>
							<li><a href=""""),_display_(Seq[Any](/*90.22*/routes/*90.28*/.AboutusController.aboutUs())),format.raw/*90.56*/("""">About Us</a></li>
							<li><a href=""""),_display_(Seq[Any](/*91.22*/routes/*91.28*/.AboutusController.aboutProject())),format.raw/*91.61*/("""">About project</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</div>
</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 04 15:30:00 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: 188a191d1301ec80f7aa32de400f5c523f3fd683
                    MATRIX: 3171->1205|3267->1207|3812->1716|3827->1722|3878->1751|4234->2135|4269->2170|4305->2254|4341->2333|4376->2350|4411->2422|4445->2439|4531->2490|4546->2496|4586->2527|4625->2528|4960->2832|5187->3023|5202->3029|5265->3070|5349->3118|5364->3124|5429->3167|5510->3212|5525->3218|5601->3272|5690->3325|5705->3331|5787->3391|5876->3444|5891->3450|5972->3509|6247->3748|6262->3754|6316->3786|6397->3831|6412->3837|6468->3871|6550->3961|6584->4027|6618->4059|6652->4095|6686->4194|6721->4298|6755->4313|6789->4328|7007->4510|7022->4516|7076->4548|7149->4585|7164->4591|7214->4619|7291->4660|7306->4666|7361->4699
                    LINES: 56->19|59->19|71->31|71->31|71->31|80->40|81->41|82->42|83->43|84->44|85->45|86->46|89->49|89->49|89->49|89->49|95->55|101->61|101->61|101->61|102->62|102->62|102->62|103->63|103->63|103->63|104->64|104->64|104->64|105->65|105->65|105->65|113->73|113->73|113->73|114->74|114->74|114->74|117->77|118->78|119->79|120->80|121->81|122->82|123->83|124->84|129->89|129->89|129->89|130->90|130->90|130->90|131->91|131->91|131->91
                    -- GENERATED --
                */
            