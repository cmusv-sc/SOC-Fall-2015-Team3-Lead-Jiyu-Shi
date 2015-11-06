
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
			"""),_display_(Seq[Any](/*36.5*/for(climateService <- climateServices) yield /*36.43*/{_display_(Seq[Any](format.raw/*36.44*/("""
				<div class="row">
					<div class="col-md-7"><a href = """"),_display_(Seq[Any](/*38.40*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*38.109*/(""""><font size="3">"""),_display_(Seq[Any](/*38.127*/climateService/*38.141*/.getClimateServiceName())),format.raw/*38.165*/("""</a></font></div>
					<div class="col-md-4"><span class="glyphicon glyphicon-star"></span><span class="glyphicon glyphicon-star">
					</span><span class="glyphicon glyphicon-star"></span><span class="glyphicon glyphicon-star">
					</span><span class="glyphicon glyphicon-star-empty"></span>
					</div>
				"""),format.raw/*43.93*/("""</div>
			""")))})),format.raw/*44.5*/("""
			
			<!-- """),_display_(Seq[Any](/*46.10*/if(!session.get("username"))/*46.38*/{_display_(Seq[Any](format.raw/*46.39*/(""" -->
			
			<p>
				"""),_display_(Seq[Any](/*49.6*/if(false)/*49.15*/{_display_(Seq[Any](format.raw/*49.16*/(""" <a class="btn btn-primary" href="climate/register"
					role="button">Register &raquo;</a> """)))})),format.raw/*50.42*/("""
			</p>
			<!-- """)))})),format.raw/*52.10*/(""" -->
		</div>
	</div>
</div>

""")))})),format.raw/*57.2*/("""
"""))}
    }
    
    def render(email:String,vfile:String,dataset:String,climateServices:List[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(email,vfile,dataset,climateServices)
    
    def f:((String,String,String,List[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (email,vfile,dataset,climateServices) => apply(email,vfile,dataset,climateServices)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 06 01:51:33 EST 2015
                    SOURCE: C:/Users/Joe/Desktop/activator and projects/ApacheCMDA-Frontend/app/views/climate/home.scala.html
                    HASH: 654ceaa3633df3dcbd523844672844880b2e73b1
                    MATRIX: 3250->1222|3458->1317|3489->1340|3527->1343|3548->1355|3588->1357|3973->1707|4027->1745|4066->1746|4166->1810|4258->1879|4313->1897|4337->1911|4384->1935|4727->2338|4770->2350|4822->2366|4859->2394|4898->2395|4957->2419|4975->2428|5014->2429|5140->2523|5192->2543|5259->2579
                    LINES: 56->18|60->18|62->21|63->22|63->22|63->22|77->36|77->36|77->36|79->38|79->38|79->38|79->38|79->38|84->43|85->44|87->46|87->46|87->46|90->49|90->49|90->49|91->50|93->52|98->57
                    -- GENERATED --
                */
            