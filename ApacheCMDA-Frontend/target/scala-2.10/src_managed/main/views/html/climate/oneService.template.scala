
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
object oneService extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(url: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
<script type="text/javascript">

	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""
		var obj = document.getElementById("iframe");
		resizeIframe(obj);
	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/(""");

	function resizeIframe(obj) """),format.raw/*30.29*/("""{"""),format.raw/*30.30*/("""
		obj.style.height = obj.contentWindow.document.body.scrollHeight + 'px';
	"""),format.raw/*32.2*/("""}"""),format.raw/*32.3*/("""

    $(function()"""),format.raw/*34.17*/("""{"""),format.raw/*34.18*/("""
        var idNumber = 0;

        $("#submitComment").click(function()"""),format.raw/*37.45*/("""{"""),format.raw/*37.46*/("""
            var comment = $("#commentActionArea").val();
            if(comment.length > 0) """),format.raw/*39.36*/("""{"""),format.raw/*39.37*/("""
                idNumber = idNumber + 1;
                var star_rating = $("#commentRating").val();
                var date = new Date();
                var year = date.getFullYear();
                var month = date.getMonth() + 1;
                var day = date.getDate();
                var hours=date.getHours();
                var minutes = date.getMinutes();
                if(parseInt(minutes) < 10)"""),format.raw/*48.43*/("""{"""),format.raw/*48.44*/("""
                    minutes = "0" + minutes;
                """),format.raw/*50.17*/("""}"""),format.raw/*50.18*/("""
                var seconds =date.getSeconds();
                $("#post").append("<div id='"+idNumber+"'class='col-md-8 blogShort'></div>");
                var imgString = "<img id='userIcon' class='pull-left img-responsive thumb margin10 img-thumbnail' src='"""),_display_(Seq[Any](/*53.121*/routes/*53.127*/.Assets.at("images/Usericon.jpg"))),format.raw/*53.160*/("""'>";
                $("#"+idNumber).append('<h4>By Username</h4>');
                $("#"+idNumber).append("<input id='rating" +idNumber +"' value="+ star_rating +" class='rating userRating' type='number' data-size='xs' readonly/>");
                $("#rating"+idNumber).rating('create');
                $("#"+idNumber).append(imgString);
                $("#"+idNumber).append("</img>");
                $("#"+idNumber).append("<article><p>"+comment+"<article></p>");
                $("#"+idNumber).append("<p class='text-right'>"+year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds+"</p>");

            """),format.raw/*62.13*/("""}"""),format.raw/*62.14*/("""
        """),format.raw/*63.9*/("""}"""),format.raw/*63.10*/(""");
    """),format.raw/*64.5*/("""}"""),format.raw/*64.6*/(""");
</script>
""")))};
Seq[Any](format.raw/*18.15*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*66.2*/("""

"""),_display_(Seq[Any](/*68.2*/main("Service", scripts)/*68.26*/ {_display_(Seq[Any](format.raw/*68.28*/("""
    <script type="text/javascript">
    </script>

    <style>
        #commentActionArea"""),format.raw/*73.27*/("""{"""),format.raw/*73.28*/("""
            resize: none;
            width: 760px;
            margin-left: 5px;
        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/("""
        #commentActionContainer"""),format.raw/*78.32*/("""{"""),format.raw/*78.33*/("""
            border:1px solid #9e9e9e;
            width: 780px;
            margin-top: 10px;
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/("""

        #commentAction"""),format.raw/*84.23*/("""{"""),format.raw/*84.24*/("""
            margin-top: 5px;
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/("""

        #userIcon"""),format.raw/*88.18*/("""{"""),format.raw/*88.19*/("""
            height: 50px;
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""

        .text-right"""),format.raw/*92.20*/("""{"""),format.raw/*92.21*/("""
            font-size: x-small;
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""

        .blogShort"""),format.raw/*96.19*/("""{"""),format.raw/*96.20*/("""
            border:1px solid dimgray;
            margin-top: 10px;
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/("""

        article"""),format.raw/*101.16*/("""{"""),format.raw/*101.17*/("""
            margin-left: 90px;
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/("""
    </style>
    <iframe id="iframe" width="100%" height="600px" src=""""),_display_(Seq[Any](/*105.59*/url)),format.raw/*105.62*/("""" frameborder="0" >
    </iframe>



    <div id="commentArea" class="container">
        <div id="post">
        </div>
    </div>
    <div id = "commentActionContainer" class="container pull-left">
        <div class="row" id="commentAction">
            <textarea id="commentActionArea" class="form-control animated" placeholder="Enter your comment"></textarea>
        </div>
        <div class="row">
            <div class="col-sm-7 col-md-7">
                <input id="commentRating" class="rating" type="number" data-size="xs"/>
            </div>
            <div class="col-sm-5 col-md-5">
                <button id="submitComment" class="btn btn-success pull-right">Submit</button>
            </div>
        </div>
    </div>
""")))})))}
    }
    
    def render(url:String): play.api.templates.HtmlFormat.Appendable = apply(url)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (url) => apply(url)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 17 22:42:24 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/team_proj_sprint2/ApacheCMDA-Frontend/app/views/climate/oneService.scala.html
                    HASH: 82872503fdee59ba98754731cd60f97142d91fe1
                    MATRIX: 3182->1204|3289->1238|3304->1245|3389->1249|3480->1312|3509->1313|3606->1383|3634->1384|3694->1416|3723->1417|3826->1493|3854->1494|3900->1512|3929->1513|4029->1585|4058->1586|4179->1679|4208->1680|4650->2094|4679->2095|4769->2157|4798->2158|5098->2421|5114->2427|5170->2460|5813->3075|5842->3076|5878->3085|5907->3086|5941->3093|5969->3094|6023->1217|6052->1236|6080->3108|6118->3111|6151->3135|6191->3137|6309->3227|6338->3228|6456->3319|6485->3320|6545->3352|6574->3353|6704->3456|6733->3457|6785->3481|6814->3482|6879->3520|6908->3521|6955->3540|6984->3541|7046->3576|7075->3577|7124->3598|7153->3599|7221->3640|7250->3641|7298->3661|7327->3662|7431->3739|7460->3740|7506->3757|7536->3758|7604->3798|7634->3799|7743->3871|7769->3874
                    LINES: 56->18|59->22|59->22|61->22|64->25|64->25|67->28|67->28|69->30|69->30|71->32|71->32|73->34|73->34|76->37|76->37|78->39|78->39|87->48|87->48|89->50|89->50|92->53|92->53|92->53|101->62|101->62|102->63|102->63|103->64|103->64|106->18|108->21|109->66|111->68|111->68|111->68|116->73|116->73|120->77|120->77|121->78|121->78|125->82|125->82|127->84|127->84|129->86|129->86|131->88|131->88|133->90|133->90|135->92|135->92|137->94|137->94|139->96|139->96|142->99|142->99|144->101|144->101|146->103|146->103|148->105|148->105
                    -- GENERATED --
                */
            