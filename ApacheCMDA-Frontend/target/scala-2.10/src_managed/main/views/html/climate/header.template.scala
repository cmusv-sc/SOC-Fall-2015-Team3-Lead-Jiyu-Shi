
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
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" style="padding-bottom: 0;" href="/climate"><img
					src='"""),_display_(Seq[Any](/*29.12*/routes/*29.18*/.Assets.at("images/logo.png"))),format.raw/*29.47*/("""' style="height: 15px; width: 250px;"></a>
			</div>
			<div class="navbar-collapse collapse" style="height:">
				<form class="navbar-form navbar-right" role="register">
					<a class="btn btn-primary" href="climate/sign" role="button">Register &raquo;</a>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<form class="navbar-form navbar-right" role="login">
							<div class="form-group">
							<input class="form-control" id="ex1" type="text"  placeholder="Username">
							<input type="password" class="form-control" placeholder="Password">
						</div>
						<button type="submit" class="btn btn-success">Login</button>
					</form>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Service<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						<li><a href=""""),_display_(Seq[Any](/*47.21*/routes/*47.27*/.ClimateServiceController.climateServices())),format.raw/*47.70*/("""">Service List</a></li>
						</ul>
					</li>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Dataset<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						
						<li><a href=""""),_display_(Seq[Any](/*55.21*/routes/*55.27*/.DatasetController.datasetList())),format.raw/*55.59*/("""">Dataset List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*56.21*/routes/*56.27*/.DatasetController.searchDataset())),format.raw/*56.61*/("""">Search dataset</a></li>
						</ul>
					</li>
					"""),format.raw/*59.42*/("""
						"""),format.raw/*60.67*/("""
							"""),format.raw/*61.34*/("""
						"""),format.raw/*62.37*/("""
							"""),format.raw/*63.101*/("""
							"""),format.raw/*64.106*/("""
						"""),format.raw/*65.16*/("""
					"""),format.raw/*66.15*/("""
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">About<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						<li><a href=""""),_display_(Seq[Any](/*72.21*/routes/*72.27*/.ClimateServiceController.home())),format.raw/*72.59*/("""">Home</a></li>
						<li><a href=""""),_display_(Seq[Any](/*73.21*/routes/*73.27*/.AboutusController.aboutUs())),format.raw/*73.55*/("""">About Us</a></li>
						<li><a href=""""),_display_(Seq[Any](/*74.21*/routes/*74.27*/.AboutusController.aboutProject())),format.raw/*74.60*/("""">About project</a></li>
						</ul>
					</li>
				</ul>
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
                    DATE: Fri Nov 06 17:33:20 EST 2015
                    SOURCE: C:/Users/Joe/Desktop/activator and projects/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: 01bc64bc31241020bc635f61e46f401c27c93ed0
                    MATRIX: 3201->1222|3297->1224|3840->1731|3855->1737|3906->1766|4798->2622|4813->2628|4878->2671|5160->2917|5175->2923|5229->2955|5310->3000|5325->3006|5381->3040|5466->3133|5502->3201|5539->3236|5575->3274|5613->3376|5651->3483|5687->3500|5722->3516|5953->3711|5968->3717|6022->3749|6095->3786|6110->3792|6160->3820|6237->3861|6252->3867|6307->3900
                    LINES: 56->18|59->18|70->29|70->29|70->29|88->47|88->47|88->47|96->55|96->55|96->55|97->56|97->56|97->56|100->59|101->60|102->61|103->62|104->63|105->64|106->65|107->66|113->72|113->72|113->72|114->73|114->73|114->73|115->74|115->74|115->74
                    -- GENERATED --
                */
            