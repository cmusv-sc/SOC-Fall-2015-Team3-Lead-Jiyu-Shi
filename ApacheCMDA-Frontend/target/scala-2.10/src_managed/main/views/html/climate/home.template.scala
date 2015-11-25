
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

"""),_display_(Seq[Any](/*23.2*/main("Home",email)/*23.20*/ {_display_(Seq[Any](format.raw/*23.22*/("""
	<div class="jumbotron">

		"""),_display_(Seq[Any](/*26.4*/if(email!= null && vfile!= null && vfile.compareTo("loginSucess")==0)/*26.73*/{_display_(Seq[Any](format.raw/*26.74*/("""
			<div class="alert alert-success fade in">
				<strong>You have been log in successfully!</strong>
				<button class="btn btn-success pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
			</div>
		""")))})),format.raw/*31.4*/("""

		"""),_display_(Seq[Any](/*33.4*/if(vfile!= null && vfile.compareTo("logfailed")==0)/*33.55*/{_display_(Seq[Any](format.raw/*33.56*/("""
			<div class="alert alert-danger fade in">
				<strong>Invalid Password or User ID!</strong>
				<button class="btn btn-danger pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
			</div>
		""")))})),format.raw/*38.4*/("""

		"""),_display_(Seq[Any](/*40.4*/if(dataset!= null && dataset.compareTo("logout")==0)/*40.56*/{_display_(Seq[Any](format.raw/*40.57*/("""
			<div class="alert alert-success fade in">
				<strong>You have been log out successfully!</strong>
				<button class="btn btn-success pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
			</div>
		""")))})),format.raw/*45.4*/("""

		<div class="row">
			<div class="col-lg-5">
				<br>
				<br>
				<img src="/assets/images/iceberg.jpg" height="400" width="430" />
			</div>
			<div class="col-lg-7">
				<h2>Climate Service List</h2>
				"""),_display_(Seq[Any](/*55.6*/for(climateService <- climateServices) yield /*55.44*/{_display_(Seq[Any](format.raw/*55.45*/("""
					<div class="row">
						<div class="col-md-7"><a href = """"),_display_(Seq[Any](/*57.41*/{routes.ClimateServiceController.oneService(climateService.getUrl(),email,climateService.getId())})),format.raw/*57.139*/(""""><font size="3">"""),_display_(Seq[Any](/*57.157*/climateService/*57.171*/.getClimateServiceName())),format.raw/*57.195*/("""</a></font></div>
						<span><div class="col-md-3 col-md-offset-2" ><input value ="3.7" class="rating-input" data-size="xs" type="number" readonly/></div></span>
					</div>
				""")))})),format.raw/*60.6*/("""

					<!-- """),_display_(Seq[Any](/*62.12*/if(!session.get("username"))/*62.40*/{_display_(Seq[Any](format.raw/*62.41*/(""" -->

				<p>
				"""),_display_(Seq[Any](/*65.6*/if(false)/*65.15*/{_display_(Seq[Any](format.raw/*65.16*/(""" <a class="btn btn-primary" href="climate/register"
				role="button">Register &raquo;</a> """)))})),format.raw/*66.41*/("""
				</p>
					<!-- """)))})),format.raw/*68.12*/(""" -->
			</div>
		</div>
	</div>
	<script>
			jQuery(document).ready(function () """),format.raw/*73.39*/("""{"""),format.raw/*73.40*/("""
				$('.rating-input').rating("""),format.raw/*74.31*/("""{"""),format.raw/*74.32*/("""
					min: 0,
					max: 5,
					step: 0.1,
					size: 'xs',
					showClear: false,
					showCaption: false,
					hoverEnabled:false,
					hoverChangeStars: false
				"""),format.raw/*83.5*/("""}"""),format.raw/*83.6*/(""");
			"""),format.raw/*84.4*/("""}"""),format.raw/*84.5*/(""");
	</script>
""")))})),format.raw/*86.2*/("""


"""))}
    }
    
    def render(email:String,vfile:String,dataset:String,climateServices:List[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(email,vfile,dataset,climateServices)
    
    def f:((String,String,String,List[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (email,vfile,dataset,climateServices) => apply(email,vfile,dataset,climateServices)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 24 21:45:42 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/home.scala.html
                    HASH: a28a035be9800418e1589e530f854ab38dc678c1
                    MATRIX: 3220->1205|3426->1300|3455->1319|3493->1322|3520->1340|3560->1342|3625->1372|3703->1441|3742->1442|3991->1660|4031->1665|4091->1716|4130->1717|4371->1927|4411->1932|4472->1984|4511->1985|4761->2204|5007->2415|5061->2453|5100->2454|5200->2518|5321->2616|5376->2634|5400->2648|5447->2672|5658->2852|5707->2865|5744->2893|5783->2894|5837->2913|5855->2922|5894->2923|6018->3015|6071->3036|6179->3116|6208->3117|6267->3148|6296->3149|6489->3315|6517->3316|6550->3322|6578->3323|6624->3338
                    LINES: 56->18|60->18|62->21|64->23|64->23|64->23|67->26|67->26|67->26|72->31|74->33|74->33|74->33|79->38|81->40|81->40|81->40|86->45|96->55|96->55|96->55|98->57|98->57|98->57|98->57|98->57|101->60|103->62|103->62|103->62|106->65|106->65|106->65|107->66|109->68|114->73|114->73|115->74|115->74|124->83|124->83|125->84|125->84|127->86
                    -- GENERATED --
                */
            