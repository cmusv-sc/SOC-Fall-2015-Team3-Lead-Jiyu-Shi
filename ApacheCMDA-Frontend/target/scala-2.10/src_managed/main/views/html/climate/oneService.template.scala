
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
object oneService extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(url: String, email: String, id: String):play.api.templates.HtmlFormat.Appendable = {
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
                    var postTime = new Date(aComment.postTime);
                    idNumber = idNumber + 1;
                    var year = postTime.getFullYear();
                    var month = postTime.getMonth() + 1;
                    var day = postTime.getDate();
                    var hours=postTime.getHours();
                    var minutes = postTime.getMinutes();
                    if(parseInt(minutes) < 10)"""),format.raw/*76.47*/("""{"""),format.raw/*76.48*/("""
                        minutes = "0" + minutes;
                    """),format.raw/*78.21*/("""}"""),format.raw/*78.22*/("""
                    var seconds =postTime.getSeconds();
                    if(parseInt(seconds) < 10)"""),format.raw/*80.47*/("""{"""),format.raw/*80.48*/("""
                        seconds = "0" + seconds;
                    """),format.raw/*82.21*/("""}"""),format.raw/*82.22*/("""
                    var dateString = year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
                    $("#post").append("<div id='"+idNumber+"'class='col-md-8 blogShort'></div>");
                    var imgString = "<img id='userIcon' class='pull-left img-responsive thumb margin10 img-thumbnail' src='"""),_display_(Seq[Any](/*85.125*/routes/*85.131*/.Assets.at("images/Usericon.jpg"))),format.raw/*85.164*/("""'>";
                    $("#"+idNumber).append("<h4>By " +aComment.user +"</h4>");
                    $("#"+idNumber).append("<input id='rating" +idNumber +"' value="+ aComment.grade +" class='rating userRating' type='number' data-size='xs' readonly/>");
                    $("#rating"+idNumber).rating('create');
                    $("#"+idNumber).append(imgString);
                    $("#"+idNumber).append("</img>");
                    $("#"+idNumber).append("<article><p>"+aComment.comment+"<article></p>");
                    $("#"+idNumber).append("<p class='text-right'>"+dateString+"</p>");
                """),format.raw/*93.17*/("""}"""),format.raw/*93.18*/(""");
            """),format.raw/*94.13*/("""}"""),format.raw/*94.14*/(""",
            error: function() """),format.raw/*95.31*/("""{"""),format.raw/*95.32*/("""
                alert('error');
            """),format.raw/*97.13*/("""}"""),format.raw/*97.14*/("""
        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/(""");
        $("#submitComment").click(function()"""),format.raw/*99.45*/("""{"""),format.raw/*99.46*/("""
            var comment = $("#commentActionArea").html();
            if(comment.length > 0) """),format.raw/*101.36*/("""{"""),format.raw/*101.37*/("""
                var star_rating = $("#commentRating").val();
                var date = new Date();
                var year = date.getFullYear();
                var month = date.getMonth() + 1;
                var day = date.getDate();
                var hours=date.getHours();
                var minutes = date.getMinutes();
                var email = """"),_display_(Seq[Any](/*109.31*/email)),format.raw/*109.36*/("""";
                if(email=="")
                    email = "Guest";
                var serviceID = -1;
                serviceID = """"),_display_(Seq[Any](/*113.31*/id)),format.raw/*113.33*/("""";
                if(parseInt(minutes) < 10)"""),format.raw/*114.43*/("""{"""),format.raw/*114.44*/("""
                    minutes = "0" + minutes;
                """),format.raw/*116.17*/("""}"""),format.raw/*116.18*/("""
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
                $.ajax("""),format.raw/*127.24*/("""{"""),format.raw/*127.25*/("""
                    type: 'POST',
                    url: 'http://localhost:9034/posts/add',
                    data: commentJson,
                    dataType: 'json',
                    contentType: 'application/json',
                    success: function()"""),format.raw/*133.40*/("""{"""),format.raw/*133.41*/("""
                        $('#CommentPrompt').modal('show');
                        idNumber = idNumber + 1;
                        $("#post").append("<div id='"+idNumber+"'class='col-md-8 blogShort'></div>");
                        var imgString = "<img id='userIcon' class='pull-left img-responsive thumb margin10 img-thumbnail' src='"""),_display_(Seq[Any](/*137.129*/routes/*137.135*/.Assets.at("images/Usericon.jpg"))),format.raw/*137.168*/("""'>";
                        $("#"+idNumber).append('<h4>By Username</h4>');
                        $("#"+idNumber).append("<input id='rating" +idNumber +"' value="+ star_rating +" class='rating userRating' type='number' data-size='xs' readonly/>");
                        $("#rating"+idNumber).rating('create');
                        $("#"+idNumber).append(imgString);
                        $("#"+idNumber).append("</img>");
                        $("#"+idNumber).append("<article><p>"+comment+"<article></p>");
                        $("#"+idNumber).append("<p class='text-right'>"+dateString+"</p>");
                     """),format.raw/*145.22*/("""}"""),format.raw/*145.23*/(""",
                    error: function() """),format.raw/*146.39*/("""{"""),format.raw/*146.40*/("""
                        alert('error' + commentJson);
                    """),format.raw/*148.21*/("""}"""),format.raw/*148.22*/("""
                """),format.raw/*149.17*/("""}"""),format.raw/*149.18*/(""");
            """),format.raw/*150.13*/("""}"""),format.raw/*150.14*/("""
        """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/(""");
    """),format.raw/*152.5*/("""}"""),format.raw/*152.6*/(""");
</script>
""")))};
Seq[Any](format.raw/*18.42*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*154.2*/("""

"""),_display_(Seq[Any](/*156.2*/main("Service",email, scripts)/*156.32*/ {_display_(Seq[Any](format.raw/*156.34*/("""
    <script type="text/javascript">
    </script>

    <style>
        #commentActionArea"""),format.raw/*161.27*/("""{"""),format.raw/*161.28*/("""
            resize: none;
            width: 760px;
            margin-left: 5px;
        """),format.raw/*165.9*/("""}"""),format.raw/*165.10*/("""
        #commentActionContainer"""),format.raw/*166.32*/("""{"""),format.raw/*166.33*/("""
            border:1px solid #9e9e9e;
            width: 780px;
            margin-top: 10px;
        """),format.raw/*170.9*/("""}"""),format.raw/*170.10*/("""

        #commentAction"""),format.raw/*172.23*/("""{"""),format.raw/*172.24*/("""
            margin-top: 5px;
        """),format.raw/*174.9*/("""}"""),format.raw/*174.10*/("""

        #userIcon"""),format.raw/*176.18*/("""{"""),format.raw/*176.19*/("""
            height: 50px;
        """),format.raw/*178.9*/("""}"""),format.raw/*178.10*/("""

        .text-right"""),format.raw/*180.20*/("""{"""),format.raw/*180.21*/("""
            font-size: x-small;
        """),format.raw/*182.9*/("""}"""),format.raw/*182.10*/("""

        .blogShort"""),format.raw/*184.19*/("""{"""),format.raw/*184.20*/("""
            border:1px solid dimgray;
            margin-top: 10px;
        """),format.raw/*187.9*/("""}"""),format.raw/*187.10*/("""

        article"""),format.raw/*189.16*/("""{"""),format.raw/*189.17*/("""
            margin-left: 90px;
        """),format.raw/*191.9*/("""}"""),format.raw/*191.10*/("""
    </style>
    <iframe id="iframe" width="100%" height="600px" src=""""),_display_(Seq[Any](/*193.59*/url)),format.raw/*193.62*/("""" frameborder="0" >
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
    
    def render(url:String,email:String,id:String): play.api.templates.HtmlFormat.Appendable = apply(url,email,id)
    
    def f:((String,String,String) => play.api.templates.HtmlFormat.Appendable) = (url,email,id) => apply(url,email,id)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 29 14:06:11 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/tangzhongao/ApacheCMDA-Frontend/app/views/climate/oneService.scala.html
                    HASH: fe3ed82af72b5a94fe50a16be95daa5f711522b0
                    MATRIX: 3196->1204|3330->1265|3345->1272|3430->1276|3538->1356|3567->1357|3619->1382|3647->1383|3693->1401|3722->1402|3774->1427|3802->1428|3870->1460|3885->1466|3948->1507|4040->1563|4055->1569|4116->1608|4195->1651|4210->1657|4274->1699|4493->1890|4522->1891|4619->1961|4647->1962|4707->1994|4736->1995|4839->2071|4867->2072|4913->2090|4942->2091|5104->2225|5133->2226|5238->2305|5267->2306|5336->2347|5365->2348|5470->2426|5499->2427|5545->2445|5574->2446|5729->2573|5758->2574|5887->2675|5916->2676|6370->3102|6399->3103|6497->3173|6526->3174|6657->3277|6686->3278|6784->3348|6813->3349|7168->3667|7184->3673|7240->3706|7891->4329|7920->4330|7963->4345|7992->4346|8052->4378|8081->4379|8154->4424|8183->4425|8219->4434|8248->4435|8323->4482|8352->4483|8475->4577|8505->4578|8903->4939|8931->4944|9104->5080|9129->5082|9203->5127|9233->5128|9324->5190|9354->5191|9971->5779|10001->5780|10294->6044|10324->6045|10701->6384|10718->6390|10775->6423|11437->7056|11467->7057|11536->7097|11566->7098|11670->7173|11700->7174|11746->7191|11776->7192|11820->7207|11850->7208|11887->7217|11917->7218|11952->7225|11981->7226|12035->1244|12064->1263|12093->7240|12132->7243|12172->7273|12213->7275|12332->7365|12362->7366|12481->7457|12511->7458|12572->7490|12602->7491|12733->7594|12763->7595|12816->7619|12846->7620|12912->7658|12942->7659|12990->7678|13020->7679|13083->7714|13113->7715|13163->7736|13193->7737|13262->7778|13292->7779|13341->7799|13371->7800|13476->7877|13506->7878|13552->7895|13582->7896|13650->7936|13680->7937|13789->8009|13815->8012
                    LINES: 56->18|59->22|59->22|61->22|64->25|64->25|66->27|66->27|67->28|67->28|69->30|69->30|71->32|71->32|71->32|73->34|73->34|73->34|75->36|75->36|75->36|79->40|79->40|82->43|82->43|84->45|84->45|86->47|86->47|88->49|88->49|91->52|91->52|95->56|95->56|96->57|96->57|100->61|100->61|101->62|101->62|104->65|104->65|107->68|107->68|115->76|115->76|117->78|117->78|119->80|119->80|121->82|121->82|124->85|124->85|124->85|132->93|132->93|133->94|133->94|134->95|134->95|136->97|136->97|137->98|137->98|138->99|138->99|140->101|140->101|148->109|148->109|152->113|152->113|153->114|153->114|155->116|155->116|166->127|166->127|172->133|172->133|176->137|176->137|176->137|184->145|184->145|185->146|185->146|187->148|187->148|188->149|188->149|189->150|189->150|190->151|190->151|191->152|191->152|194->18|196->21|197->154|199->156|199->156|199->156|204->161|204->161|208->165|208->165|209->166|209->166|213->170|213->170|215->172|215->172|217->174|217->174|219->176|219->176|221->178|221->178|223->180|223->180|225->182|225->182|227->184|227->184|230->187|230->187|232->189|232->189|234->191|234->191|236->193|236->193
                    -- GENERATED --
                */
            