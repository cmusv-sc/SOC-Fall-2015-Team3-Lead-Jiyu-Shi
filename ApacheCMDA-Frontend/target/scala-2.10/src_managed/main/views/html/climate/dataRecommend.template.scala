
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
object dataRecommend extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(jsonData: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*31.2*/scripts/*31.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*31.13*/("""
    <script src='"""),_display_(Seq[Any](/*32.19*/routes/*32.25*/.Assets.at("javascripts/edit_button.js"))),format.raw/*32.65*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*33.19*/routes/*33.25*/.Assets.at("javascripts/livefilter.js"))),format.raw/*33.64*/("""'></script>
    <script type="text/javascript" src='"""),_display_(Seq[Any](/*34.42*/routes/*34.48*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*34.93*/("""'></script>
""")))};
Seq[Any](format.raw/*18.20*/("""
"""),format.raw/*20.1*/("""
<link rel="stylesheet"
    href='"""),_display_(Seq[Any](/*22.12*/routes/*22.18*/.Assets.at("stylesheets/custom_recommend.css"))),format.raw/*22.64*/("""'>

<link rel="stylesheet"
  href="https://cdnjs.cloudflare.com/ajax/libs/vis/3.11.0/vis.min.css"
>

<link rel="stylesheet"
    href='"""),_display_(Seq[Any](/*29.12*/routes/*29.18*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*29.58*/("""'>
    
"""),format.raw/*35.2*/("""

"""),_display_(Seq[Any](/*37.2*/main("Service Logs", scripts)/*37.31*/{_display_(Seq[Any](format.raw/*37.32*/("""
    
    """),_display_(Seq[Any](/*39.6*/flash_message())),format.raw/*39.21*/("""   

  <div id="jsonData" style="display: none;">"""),_display_(Seq[Any](/*41.46*/jsonData)),format.raw/*41.54*/("""</div>
  <div id="graphText">
    <div class="row">
      <div class="col-lg-9" id="testGraph">
      </div>
      <div class="col-lg-3" id="testText">
      </div>
    </div>
  </div>


  <script src="https://cdnjs.cloudflare.com/ajax/libs/vis/3.11.0/vis.min.js"></script>
  <script type="text/javascript">
      
      var jsonString = $('#jsonData').text();
      var data = JSON.parse(jsonString);
      var container = document.getElementById('testGraph');

      var options = """),format.raw/*59.21*/("""{"""),format.raw/*59.22*/("""
        stabilize:false,
        edges: """),format.raw/*61.16*/("""{"""),format.raw/*61.17*/("""
          color: """),format.raw/*62.18*/("""{"""),format.raw/*62.19*/("""
            color: "gray",
            highlight: "gray",
          """),format.raw/*65.11*/("""}"""),format.raw/*65.12*/(""",
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/(""",
        nodes: """),format.raw/*67.16*/("""{"""),format.raw/*67.17*/("""
          shape: 'dot',
          radiusMin: 10,
          radiusMax: 30,
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/(""",
        groups: """),format.raw/*72.17*/("""{"""),format.raw/*72.18*/("""
          user: """),format.raw/*73.17*/("""{"""),format.raw/*73.18*/("""
            color:"#F2545A",
            shape:"star",
          """),format.raw/*76.11*/("""}"""),format.raw/*76.12*/(""",
          feature: """),format.raw/*77.20*/("""{"""),format.raw/*77.21*/("""
            shape:"triangle",
            color:"#EC8F93",
          """),format.raw/*80.11*/("""}"""),format.raw/*80.12*/(""",
          service: """),format.raw/*81.20*/("""{"""),format.raw/*81.21*/("""
            color:"#EF777C",
            shape:"dot",
          """),format.raw/*84.11*/("""}"""),format.raw/*84.12*/(""",
          data: """),format.raw/*85.17*/("""{"""),format.raw/*85.18*/("""
            color:"#F46369",
            shape:"square",
          """),format.raw/*88.11*/("""}"""),format.raw/*88.12*/("""
        """),format.raw/*89.9*/("""}"""),format.raw/*89.10*/(""",
        tooltip: """),format.raw/*90.18*/("""{"""),format.raw/*90.19*/("""
          delay: 300,
          fontColor: "black",
          fontSize: 14,
          fontFace: "verdana",
          color: """),format.raw/*95.18*/("""{"""),format.raw/*95.19*/("""
            border: "#666",
            background: "#FFFFC6"
          """),format.raw/*98.11*/("""}"""),format.raw/*98.12*/("""
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/(""",
      """),format.raw/*100.7*/("""}"""),format.raw/*100.8*/(""";

      var network = new vis.Network(container, data, options);
      
      network.on('select', function(properties) """),format.raw/*104.49*/("""{"""),format.raw/*104.50*/("""
        var select_node = $.grep(data.nodes, function(e)"""),format.raw/*105.57*/("""{"""),format.raw/*105.58*/("""
          return e["id"] == properties.nodes[0];
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/(""")[0];
        $("#testText").html(select_node["title"]);
      """),format.raw/*109.7*/("""}"""),format.raw/*109.8*/(""");

      //focus on serviceid 19
      //network.focusOnNode(19);
    
  </script>
  
  
    
""")))})))}
    }
    
    def render(jsonData:String): play.api.templates.HtmlFormat.Appendable = apply(jsonData)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (jsonData) => apply(jsonData)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 04:17:49 EST 2015
                    SOURCE: C:/Users/Joe/Desktop/activator and projects/ApacheCMDA-Frontend/app/views/climate/dataRecommend.scala.html
                    HASH: bd6a458b21388274064659f0f740b30dba90df6a
                    MATRIX: 3215->1222|3328->1548|3343->1555|3428->1559|3484->1579|3499->1585|3561->1625|3628->1656|3643->1662|3704->1701|3794->1755|3809->1761|3876->1806|3930->1240|3959->1260|4032->1297|4047->1303|4115->1349|4293->1491|4308->1497|4370->1537|4407->1820|4447->1825|4485->1854|4524->1855|4572->1868|4609->1883|4697->1935|4727->1943|5256->2444|5285->2445|5356->2488|5385->2489|5432->2508|5461->2509|5561->2581|5590->2582|5628->2593|5657->2594|5703->2612|5732->2613|5846->2700|5875->2701|5922->2720|5951->2721|5997->2739|6026->2740|6123->2809|6152->2810|6202->2832|6231->2833|6332->2906|6361->2907|6411->2929|6440->2930|6536->2998|6565->2999|6612->3018|6641->3019|6740->3090|6769->3091|6806->3101|6835->3102|6883->3122|6912->3123|7070->3253|7099->3254|7203->3330|7232->3331|7269->3341|7298->3342|7335->3351|7364->3352|7518->3477|7548->3478|7635->3536|7665->3537|7753->3597|7783->3598|7876->3663|7905->3664
                    LINES: 56->18|59->31|59->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|66->18|67->20|69->22|69->22|69->22|76->29|76->29|76->29|78->35|80->37|80->37|80->37|82->39|82->39|84->41|84->41|102->59|102->59|104->61|104->61|105->62|105->62|108->65|108->65|109->66|109->66|110->67|110->67|114->71|114->71|115->72|115->72|116->73|116->73|119->76|119->76|120->77|120->77|123->80|123->80|124->81|124->81|127->84|127->84|128->85|128->85|131->88|131->88|132->89|132->89|133->90|133->90|138->95|138->95|141->98|141->98|142->99|142->99|143->100|143->100|147->104|147->104|148->105|148->105|150->107|150->107|152->109|152->109
                    -- GENERATED --
                */
            