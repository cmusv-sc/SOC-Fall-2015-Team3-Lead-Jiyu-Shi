
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
object oneService extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,String,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(url: String,email:String):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*18.28*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*66.2*/("""

"""),_display_(Seq[Any](/*68.2*/main("Service",email, scripts)/*68.32*/ {_display_(Seq[Any](format.raw/*68.34*/("""
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
    
    def render(url:String,email:String): play.api.templates.HtmlFormat.Appendable = apply(url,email)
    
    def f:((String,String) => play.api.templates.HtmlFormat.Appendable) = (url,email) => apply(url,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 23 00:32:56 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/oneService.scala.html
                    HASH: 957583c5d4241542067a49c19d92fd80eed14c61
                    MATRIX: 3189->1204|3309->1251|3324->1258|3409->1262|3500->1325|3529->1326|3626->1396|3654->1397|3714->1429|3743->1430|3846->1506|3874->1507|3920->1525|3949->1526|4049->1598|4078->1599|4199->1692|4228->1693|4670->2107|4699->2108|4789->2170|4818->2171|5118->2434|5134->2440|5190->2473|5833->3088|5862->3089|5898->3098|5927->3099|5961->3106|5989->3107|6043->1230|6072->1249|6100->3121|6138->3124|6177->3154|6217->3156|6335->3246|6364->3247|6482->3338|6511->3339|6571->3371|6600->3372|6730->3475|6759->3476|6811->3500|6840->3501|6905->3539|6934->3540|6981->3559|7010->3560|7072->3595|7101->3596|7150->3617|7179->3618|7247->3659|7276->3660|7324->3680|7353->3681|7457->3758|7486->3759|7532->3776|7562->3777|7630->3817|7660->3818|7769->3890|7795->3893
                    LINES: 56->18|59->22|59->22|61->22|64->25|64->25|67->28|67->28|69->30|69->30|71->32|71->32|73->34|73->34|76->37|76->37|78->39|78->39|87->48|87->48|89->50|89->50|92->53|92->53|92->53|101->62|101->62|102->63|102->63|103->64|103->64|106->18|108->21|109->66|111->68|111->68|111->68|116->73|116->73|120->77|120->77|121->78|121->78|125->82|125->82|127->84|127->84|129->86|129->86|131->88|131->88|133->90|133->90|135->92|135->92|137->94|137->94|139->96|139->96|142->99|142->99|144->101|144->101|146->103|146->103|148->105|148->105
                    -- GENERATED --
                */
            