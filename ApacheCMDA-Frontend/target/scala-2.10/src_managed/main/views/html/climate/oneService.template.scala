
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
object oneService extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,List[metadata.ClimateService],List[String],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(url: String, email: String, id: String,climateServices: List[metadata.ClimateService],friendList: List[String]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
    <style type="text/css">
    /*override atwho's style*/
    .atwho-inserted """),format.raw/*25.21*/("""{"""),format.raw/*25.22*/("""
    color: #4183C4;
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/("""
    .atwho-query """),format.raw/*28.18*/("""{"""),format.raw/*28.19*/("""
    color: #4183C4;
    """),format.raw/*30.5*/("""}"""),format.raw/*30.6*/("""
    </style>
    <script src='"""),_display_(Seq[Any](/*32.19*/routes/*32.25*/.Assets.at("javascripts/jquery.atwho.js"))),format.raw/*32.66*/("""'
    type="text/javascript"></script>
    <link href='"""),_display_(Seq[Any](/*34.18*/routes/*34.24*/.Assets.at("stylesheets/Hashstyle.css"))),format.raw/*34.63*/("""'
    rel="stylesheet" />
    <link href='"""),_display_(Seq[Any](/*36.18*/routes/*36.24*/.Assets.at("stylesheets/jquery.atwho.css"))),format.raw/*36.66*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src="http://ichord.github.io/Caret.js/src/jquery.caret.js"></script>
<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*40.30*/("""{"""),format.raw/*40.31*/("""
		var obj = document.getElementById("iframe");
		resizeIframe(obj);
	"""),format.raw/*43.2*/("""}"""),format.raw/*43.3*/(""");

	function resizeIframe(obj) """),format.raw/*45.29*/("""{"""),format.raw/*45.30*/("""
		obj.style.height = obj.contentWindow.document.body.scrollHeight + 'px';
	"""),format.raw/*47.2*/("""}"""),format.raw/*47.3*/("""

    $(function()"""),format.raw/*49.17*/("""{"""),format.raw/*49.18*/("""
        var idNumber = 0;
        var tags = ["ShiZong","Tangzhongao","WangXiaoYu","LiuYuan"];
        $('#commentActionArea').atwho("""),format.raw/*52.39*/("""{"""),format.raw/*52.40*/("""
            at: "@",
            data: tags,
            limit: 200,
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/(""");
        $('#commentActionArea').atwho("""),format.raw/*57.39*/("""{"""),format.raw/*57.40*/("""
            at: "#",
            data: tags,
            limit: 200,
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/(""");
        $.ajax("""),format.raw/*62.16*/("""{"""),format.raw/*62.17*/("""
            type: 'GET',
            url: 'http://localhost:9034/posts/getAllPosts/json',
            success: function(data) """),format.raw/*65.37*/("""{"""),format.raw/*65.38*/("""
                console.log(data);

                $.each($.parseJSON(data), function(i, aComment) """),format.raw/*68.65*/("""{"""),format.raw/*68.66*/("""
                    var climateID = aComment.climateServiceID;
                    if (climateID == """),_display_(Seq[Any](/*70.39*/id)),format.raw/*70.41*/(""")"""),format.raw/*70.42*/("""{"""),format.raw/*70.43*/("""
                        var postTime = new Date(aComment.postTime);
                        idNumber = idNumber + 1;
                        var year = postTime.getFullYear();
                        var month = postTime.getMonth() + 1;
                        var day = postTime.getDate();
                        var hours=postTime.getHours();
                        var minutes = postTime.getMinutes();
                        if(parseInt(minutes) < 10)"""),format.raw/*78.51*/("""{"""),format.raw/*78.52*/("""
                            minutes = "0" + minutes;
                        """),format.raw/*80.25*/("""}"""),format.raw/*80.26*/("""
                        var seconds =postTime.getSeconds();
                        if(parseInt(seconds) < 10)"""),format.raw/*82.51*/("""{"""),format.raw/*82.52*/("""
                            seconds = "0" + seconds;
                        """),format.raw/*84.25*/("""}"""),format.raw/*84.26*/("""
                        var dateString = year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
                        $("#post").append("<div id='"+idNumber+"'class='col-md-8 blogShort'></div>");
                        var imgString = "<img id='userIcon' class='pull-left img-responsive thumb margin10 img-thumbnail' src='"""),_display_(Seq[Any](/*87.129*/routes/*87.135*/.Assets.at("images/Usericon.jpg"))),format.raw/*87.168*/("""'>";
                        $("#"+idNumber).append("<h4>By " +aComment.user +"</h4>");
                        $("#"+idNumber).append("<input id='rating" +idNumber +"' value="+ aComment.grade +" class='rating userRating' type='number' data-size='xs' readonly/>");
                        $("#rating"+idNumber).rating('create');
                        $("#"+idNumber).append(imgString);
                        $("#"+idNumber).append("</img>");
                        $("#"+idNumber).append("<article><p>"+aComment.comment+"<article></p>");
                        $("#"+idNumber).append("<p class='text-right'>"+dateString+"</p>");
                    """),format.raw/*95.21*/("""}"""),format.raw/*95.22*/("""
                """),format.raw/*96.17*/("""}"""),format.raw/*96.18*/(""");
            """),format.raw/*97.13*/("""}"""),format.raw/*97.14*/(""",
            error: function() """),format.raw/*98.31*/("""{"""),format.raw/*98.32*/("""
                alert('error');
            """),format.raw/*100.13*/("""}"""),format.raw/*100.14*/("""
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/(""");
        $("#submitComment").click(function()"""),format.raw/*102.45*/("""{"""),format.raw/*102.46*/("""
            var comment = $("#commentActionArea").html();
            if(comment.length > 0) """),format.raw/*104.36*/("""{"""),format.raw/*104.37*/("""
                var star_rating = $("#commentRating").val();
                var date = new Date();
                var year = date.getFullYear();
                var month = date.getMonth() + 1;
                var day = date.getDate();
                var hours=date.getHours();
                var minutes = date.getMinutes();
                var email = """"),_display_(Seq[Any](/*112.31*/email)),format.raw/*112.36*/("""";
                if(email=="")
                    email = "Guest";
                var serviceID = -1;
                serviceID = """"),_display_(Seq[Any](/*116.31*/id)),format.raw/*116.33*/("""";
                if(parseInt(minutes) < 10)"""),format.raw/*117.43*/("""{"""),format.raw/*117.44*/("""
                    minutes = "0" + minutes;
                """),format.raw/*119.17*/("""}"""),format.raw/*119.18*/("""
                var seconds =date.getSeconds();
                var dateString = year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
                var commentContent = new Object();
                commentContent.comment = comment;
                commentContent.userEmail = email;
                commentContent.climateId = serviceID;
                commentContent.grade = star_rating;
                commentContent.createTime = date.getTime();
                var commentJson = JSON.stringify(commentContent);
                console.log(commentJson);
                $.ajax("""),format.raw/*130.24*/("""{"""),format.raw/*130.25*/("""
                    type: 'POST',
                    url: 'http://localhost:9034/posts/add',
                    data: commentJson,
                    dataType: 'json',
                    contentType: 'application/json',
                    success: function()"""),format.raw/*136.40*/("""{"""),format.raw/*136.41*/("""
                        $('#CommentPrompt').modal('show');
                        idNumber = idNumber + 1;
                        $("#post").append("<div id='"+idNumber+"'class='col-md-8 blogShort'></div>");
                        var imgString = "<img id='userIcon' class='pull-left img-responsive thumb margin10 img-thumbnail' src='"""),_display_(Seq[Any](/*140.129*/routes/*140.135*/.Assets.at("images/Usericon.jpg"))),format.raw/*140.168*/("""'>";
                        $("#"+idNumber).append('<h4>By Username</h4>');
                        $("#"+idNumber).append("<input id='rating" +idNumber +"' value="+ star_rating +" class='rating userRating' type='number' data-size='xs' readonly/>");
                        $("#rating"+idNumber).rating('create');
                        $("#"+idNumber).append(imgString);
                        $("#"+idNumber).append("</img>");
                        $("#"+idNumber).append("<article><p>"+comment+"<article></p>");
                        $("#"+idNumber).append("<p class='text-right'>"+dateString+"</p>");
                     """),format.raw/*148.22*/("""}"""),format.raw/*148.23*/(""",
                    error: function() """),format.raw/*149.39*/("""{"""),format.raw/*149.40*/("""
                        alert('error' + commentJson);
                    """),format.raw/*151.21*/("""}"""),format.raw/*151.22*/("""
                """),format.raw/*152.17*/("""}"""),format.raw/*152.18*/(""");
            """),format.raw/*153.13*/("""}"""),format.raw/*153.14*/("""
        """),format.raw/*154.9*/("""}"""),format.raw/*154.10*/(""");
    """),format.raw/*155.5*/("""}"""),format.raw/*155.6*/(""");
</script>
""")))};
Seq[Any](format.raw/*18.114*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*157.2*/("""

"""),_display_(Seq[Any](/*159.2*/main("Service",email, scripts)/*159.32*/ {_display_(Seq[Any](format.raw/*159.34*/("""



    <script type="text/javascript">
    </script>

    <style>
        #commentActionArea"""),format.raw/*167.27*/("""{"""),format.raw/*167.28*/("""
            resize: none;
            width: 760px;
            margin-left: 5px;
        """),format.raw/*171.9*/("""}"""),format.raw/*171.10*/("""
        #commentActionContainer"""),format.raw/*172.32*/("""{"""),format.raw/*172.33*/("""
            border:1px solid #9e9e9e;
            width: 780px;
            margin-top: 10px;
        """),format.raw/*176.9*/("""}"""),format.raw/*176.10*/("""

        #commentAction"""),format.raw/*178.23*/("""{"""),format.raw/*178.24*/("""
            margin-top: 5px;
        """),format.raw/*180.9*/("""}"""),format.raw/*180.10*/("""

        #userIcon"""),format.raw/*182.18*/("""{"""),format.raw/*182.19*/("""
            height: 50px;
        """),format.raw/*184.9*/("""}"""),format.raw/*184.10*/("""

        .text-right"""),format.raw/*186.20*/("""{"""),format.raw/*186.21*/("""
            font-size: x-small;
        """),format.raw/*188.9*/("""}"""),format.raw/*188.10*/("""

        .blogShort"""),format.raw/*190.19*/("""{"""),format.raw/*190.20*/("""
            border:1px solid dimgray;
            margin-top: 10px;
        """),format.raw/*193.9*/("""}"""),format.raw/*193.10*/("""

        article"""),format.raw/*195.16*/("""{"""),format.raw/*195.17*/("""
            margin-left: 90px;
        """),format.raw/*197.9*/("""}"""),format.raw/*197.10*/("""
    </style>
    <iframe id="iframe" width="100%" height="600px" src=""""),_display_(Seq[Any](/*199.59*/url)),format.raw/*199.62*/("""" frameborder="0" >
    </iframe>


    <div id="commentArea" class="container">
        <h2>Comment Area</h2>
        <div id="post">
        </div>
    </div>
    <div id = "commentActionContainer" class="container pull-left">
        <div class="row" id="commentAction">
            <div id="commentActionArea" class="inputor" placeholder="Please enter your comment." contentEditable="true"></div>
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
    <div class="modal fade" id="CommentPrompt" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="exampleModalLabel">Contratulations!</h4>
                </div>
                <div class="modal-body">
                    <form>
                        <span>Your post has been submitted to the server successfully</span>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-success" data-dismiss="modal">OK</button>
                </div>
            </div>
        </div>
    </div>
""")))})))}
    }
    
    def render(url:String,email:String,id:String,climateServices:List[metadata.ClimateService],friendList:List[String]): play.api.templates.HtmlFormat.Appendable = apply(url,email,id,climateServices,friendList)
    
    def f:((String,String,String,List[metadata.ClimateService],List[String]) => play.api.templates.HtmlFormat.Appendable) = (url,email,id,climateServices,friendList) => apply(url,email,id,climateServices,friendList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 03 16:11:41 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/oneService.scala.html
                    HASH: 9c100ea413456f1f9099031b43f6f8fbd06be7d5
                    MATRIX: 3239->1204|3445->1337|3460->1344|3545->1348|3653->1428|3682->1429|3734->1454|3762->1455|3808->1473|3837->1474|3889->1499|3917->1500|3985->1532|4000->1538|4063->1579|4155->1635|4170->1641|4231->1680|4310->1723|4325->1729|4389->1771|4608->1962|4637->1963|4734->2033|4762->2034|4822->2066|4851->2067|4954->2143|4982->2144|5028->2162|5057->2163|5219->2297|5248->2298|5353->2377|5382->2378|5451->2419|5480->2420|5585->2498|5614->2499|5660->2517|5689->2518|5844->2645|5873->2646|6002->2747|6031->2748|6169->2850|6193->2852|6222->2853|6251->2854|6737->3312|6766->3313|6872->3391|6901->3392|7040->3503|7069->3504|7175->3582|7204->3583|7571->3913|7587->3919|7643->3952|8326->4607|8355->4608|8400->4625|8429->4626|8472->4641|8501->4642|8561->4674|8590->4675|8664->4720|8694->4721|8731->4730|8761->4731|8837->4778|8867->4779|8990->4873|9020->4874|9418->5235|9446->5240|9619->5376|9644->5378|9718->5423|9748->5424|9839->5486|9869->5487|10486->6075|10516->6076|10809->6340|10839->6341|11216->6680|11233->6686|11290->6719|11952->7352|11982->7353|12051->7393|12081->7394|12185->7469|12215->7470|12261->7487|12291->7488|12335->7503|12365->7504|12402->7513|12432->7514|12467->7521|12496->7522|12551->1316|12580->1335|12609->7536|12648->7539|12688->7569|12729->7571|12851->7664|12881->7665|13000->7756|13030->7757|13091->7789|13121->7790|13252->7893|13282->7894|13335->7918|13365->7919|13431->7957|13461->7958|13509->7977|13539->7978|13602->8013|13632->8014|13682->8035|13712->8036|13781->8077|13811->8078|13860->8098|13890->8099|13995->8176|14025->8177|14071->8194|14101->8195|14169->8235|14199->8236|14308->8308|14334->8311
                    LINES: 56->18|59->22|59->22|61->22|64->25|64->25|66->27|66->27|67->28|67->28|69->30|69->30|71->32|71->32|71->32|73->34|73->34|73->34|75->36|75->36|75->36|79->40|79->40|82->43|82->43|84->45|84->45|86->47|86->47|88->49|88->49|91->52|91->52|95->56|95->56|96->57|96->57|100->61|100->61|101->62|101->62|104->65|104->65|107->68|107->68|109->70|109->70|109->70|109->70|117->78|117->78|119->80|119->80|121->82|121->82|123->84|123->84|126->87|126->87|126->87|134->95|134->95|135->96|135->96|136->97|136->97|137->98|137->98|139->100|139->100|140->101|140->101|141->102|141->102|143->104|143->104|151->112|151->112|155->116|155->116|156->117|156->117|158->119|158->119|169->130|169->130|175->136|175->136|179->140|179->140|179->140|187->148|187->148|188->149|188->149|190->151|190->151|191->152|191->152|192->153|192->153|193->154|193->154|194->155|194->155|197->18|199->21|200->157|202->159|202->159|202->159|210->167|210->167|214->171|214->171|215->172|215->172|219->176|219->176|221->178|221->178|223->180|223->180|225->182|225->182|227->184|227->184|229->186|229->186|231->188|231->188|233->190|233->190|236->193|236->193|238->195|238->195|240->197|240->197|242->199|242->199
                    -- GENERATED --
                */
            