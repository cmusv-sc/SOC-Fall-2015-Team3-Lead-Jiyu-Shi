
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
    def apply/*18.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.4*/("""
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
				src='"""),_display_(Seq[Any](/*30.11*/routes/*30.17*/.Assets.at("images/logo.png"))),format.raw/*30.46*/("""' style="height: 15px ; width: 250px ;">
				</a>
			</div>
			<div class="navbar-collapse collapse" style="height:">
				<form class="navbar-form navbar-right" role="register">
					<a class="btn btn-primary" href="/climate/sign" role="button">Register &raquo;</a>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<form class="navbar-form navbar-right" role="login">
						<div class="form-group">
							<input class="form-control" id="ex1" type="text" placeholder="Username">
							<input type="password" class="form-control" placeholder="Password">
						</div>
						<button type="submit" class="btn btn-success">Login</button>
					</form>
					<li class="dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown">Service<b
					class="caret"></b> </a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*49.22*/routes/*49.28*/.ClimateServiceController.searchService())),format.raw/*49.69*/("""">Search Service </a></li>
							<li><a href=""""),_display_(Seq[Any](/*50.22*/routes/*50.28*/.ClimateServiceController.climateServices())),format.raw/*50.71*/("""">Service List</a></li>
							<li><a href=""""),_display_(Seq[Any](/*51.22*/routes/*51.28*/.ClimateServiceController.mostPopularClimateServices())),format.raw/*51.82*/("""">Most Popular Service</a></li>
							<li><a href=""""),_display_(Seq[Any](/*52.22*/routes/*52.28*/.ClimateServiceController.mostRecentlyAddedClimateServices())),format.raw/*52.88*/("""">Recent Added Service</a></li>
							<li><a href=""""),_display_(Seq[Any](/*53.22*/routes/*53.28*/.ClimateServiceController.mostRecentlyUsedClimateServices())),format.raw/*53.87*/("""">Recent Used  Service</a></li>
						</ul>
					</li>
					<li class="dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown">Dataset<b
					class="caret"></b> </a>
						<ul class="dropdown-menu">

							<li><a href=""""),_display_(Seq[Any](/*61.22*/routes/*61.28*/.DatasetController.datasetList())),format.raw/*61.60*/("""">Dataset List</a></li>
							<li><a href=""""),_display_(Seq[Any](/*62.22*/routes/*62.28*/.DatasetController.searchDataset())),format.raw/*62.62*/("""">Search dataset</a></li>
						</ul>
					</li>
					"""),format.raw/*65.42*/("""
					"""),format.raw/*66.66*/("""
					"""),format.raw/*67.32*/("""
					"""),format.raw/*68.36*/("""
					"""),format.raw/*69.99*/("""
					"""),format.raw/*70.104*/("""
					"""),format.raw/*71.15*/("""
					"""),format.raw/*72.15*/("""
					<li class="dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown">About<b
					class="caret"></b> </a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*77.22*/routes/*77.28*/.ClimateServiceController.home())),format.raw/*77.60*/("""">Home</a></li>
							<li><a href=""""),_display_(Seq[Any](/*78.22*/routes/*78.28*/.AboutusController.aboutUs())),format.raw/*78.56*/("""">About Us</a></li>
							<li><a href=""""),_display_(Seq[Any](/*79.22*/routes/*79.28*/.AboutusController.aboutProject())),format.raw/*79.61*/("""">About project</a></li>
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
                    DATE: Tue Nov 17 21:34:02 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/team_proj_sprint2/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: ae9e2ab798ac08d1031812b665bba39bfc0ee159
                    MATRIX: 3171->1205|3267->1207|3812->1716|3827->1722|3878->1751|4757->2594|4772->2600|4835->2641|4919->2689|4934->2695|4999->2738|5080->2783|5095->2789|5171->2843|5260->2896|5275->2902|5357->2962|5446->3015|5461->3021|5542->3080|5817->3319|5832->3325|5886->3357|5967->3402|5982->3408|6038->3442|6120->3532|6154->3598|6188->3630|6222->3666|6256->3765|6291->3869|6325->3884|6359->3899|6577->4081|6592->4087|6646->4119|6719->4156|6734->4162|6784->4190|6861->4231|6876->4237|6931->4270
                    LINES: 56->18|59->18|71->30|71->30|71->30|90->49|90->49|90->49|91->50|91->50|91->50|92->51|92->51|92->51|93->52|93->52|93->52|94->53|94->53|94->53|102->61|102->61|102->61|103->62|103->62|103->62|106->65|107->66|108->67|109->68|110->69|111->70|112->71|113->72|118->77|118->77|118->77|119->78|119->78|119->78|120->79|120->79|120->79
                    -- GENERATED --
                */
            