
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
    /*.atwho-query """),format.raw/*28.20*/("""{"""),format.raw/*28.21*/("""*/
    /*color: #4183C4;*/
    /*"""),format.raw/*30.7*/("""}"""),format.raw/*30.8*/("""*/
    </style>
    <script src='"""),_display_(Seq[Any](/*32.19*/routes/*32.25*/.Assets.at("javascripts/jquery.atwho.js"))),format.raw/*32.66*/("""'
    type="text/javascript"></script>
    <link href='"""),_display_(Seq[Any](/*34.18*/routes/*34.24*/.Assets.at("stylesheets/Hashstyle.css"))),format.raw/*34.63*/("""'
    rel="stylesheet" />
    <link href='"""),_display_(Seq[Any](/*36.18*/routes/*36.24*/.Assets.at("stylesheets/jquery.atwho.css"))),format.raw/*36.66*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src="http://ichord.github.io/Caret.js/src/jquery.caret.js"></script>
    <script type="text/javascript">
            $(document).ready(function()"""),format.raw/*40.41*/("""{"""),format.raw/*40.42*/("""
                var obj = document.getElementById("iframe");
                resizeIframe(obj);
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/(""");

            function resizeIframe(obj) """),format.raw/*45.40*/("""{"""),format.raw/*45.41*/("""
                obj.style.height = obj.contentWindow.document.body.scrollHeight + 'px';
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/("""

            $(function()"""),format.raw/*49.25*/("""{"""),format.raw/*49.26*/("""
                var idNumber = 0;
                var ServiceList = [];
                var i = 0;
                """),_display_(Seq[Any](/*53.18*/for(climateService <- climateServices) yield /*53.56*/ {_display_(Seq[Any](format.raw/*53.58*/("""
                ServiceList[i] = (""""),_display_(Seq[Any](/*54.37*/climateService/*54.51*/.getClimateServiceName)),format.raw/*54.73*/("""");
                i = i + 1;
                """)))})),format.raw/*56.18*/("""
//        console.log(ServiceList);
                var tags = ["ShiZong","Tangzhongao","WangXiaoYu","LiuYuan"];
                $('#commentActionArea').atwho("""),format.raw/*59.47*/("""{"""),format.raw/*59.48*/("""
                    at: "@",
                    data: tags,
                    limit: 200,
                """),format.raw/*63.17*/("""}"""),format.raw/*63.18*/(""");
                $('#commentActionArea').atwho("""),format.raw/*64.47*/("""{"""),format.raw/*64.48*/("""
                    at: "#",
                    data: ServiceList,
                    limit: 200,
                """),format.raw/*68.17*/("""}"""),format.raw/*68.18*/(""");
                $.ajax("""),format.raw/*69.24*/("""{"""),format.raw/*69.25*/("""
                    type: 'GET',
                    url: 'http://localhost:9034/posts/getAllPosts/json',
                    success: function(data) """),format.raw/*72.45*/("""{"""),format.raw/*72.46*/("""
                        console.log(data);

                        $.each($.parseJSON(data), function(i, aComment) """),format.raw/*75.73*/("""{"""),format.raw/*75.74*/("""
                            var climateID = aComment.climateServiceID;
                            if (climateID == """),_display_(Seq[Any](/*77.47*/id)),format.raw/*77.49*/(""")"""),format.raw/*77.50*/("""{"""),format.raw/*77.51*/("""
                                var postTime = new Date(aComment.postTime);
                                idNumber = idNumber + 1;
                                var year = postTime.getFullYear();
                                var month = postTime.getMonth() + 1;
                                var day = postTime.getDate();
                                var hours=postTime.getHours();
                                var minutes = postTime.getMinutes();
                                if(parseInt(minutes) < 10)"""),format.raw/*85.59*/("""{"""),format.raw/*85.60*/("""
                                    minutes = "0" + minutes;
                                """),format.raw/*87.33*/("""}"""),format.raw/*87.34*/("""
                                var seconds =postTime.getSeconds();
                                if(parseInt(seconds) < 10)"""),format.raw/*89.59*/("""{"""),format.raw/*89.60*/("""
                                    seconds = "0" + seconds;
                                """),format.raw/*91.33*/("""}"""),format.raw/*91.34*/("""
                                var dateString = year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
                                $("#post").append("<div id='"+idNumber+"'class='col-md-8 blogShort'></div>");
                                var imgString = "<img id='userIcon' class='pull-left img-responsive thumb margin10 img-thumbnail' src='"""),_display_(Seq[Any](/*94.137*/routes/*94.143*/.Assets.at("images/Usericon.jpg"))),format.raw/*94.176*/("""'>";
                                $("#"+idNumber).append("<h4>By " +aComment.user +"</h4>");
                                $("#"+idNumber).append("<input id='rating" +idNumber +"' value="+ aComment.grade +" class='rating userRating' type='number' data-size='xs' readonly/>");
                                $("#rating"+idNumber).rating('create');
                                $("#"+idNumber).append(imgString);
                                $("#"+idNumber).append("</img>");
                                $("#"+idNumber).append("<article><p>"+aComment.comment+"<article></p>");
                                $("#"+idNumber).append("<p class='text-right'>"+dateString+"</p>");
                            """),format.raw/*102.29*/("""}"""),format.raw/*102.30*/("""
                        """),format.raw/*103.25*/("""}"""),format.raw/*103.26*/(""");
                    """),format.raw/*104.21*/("""}"""),format.raw/*104.22*/(""",
                    error: function() """),format.raw/*105.39*/("""{"""),format.raw/*105.40*/("""
                        alert('error');
                    """),format.raw/*107.21*/("""}"""),format.raw/*107.22*/("""
                """),format.raw/*108.17*/("""}"""),format.raw/*108.18*/(""");
                $("#submitComment").click(function()"""),format.raw/*109.53*/("""{"""),format.raw/*109.54*/("""
                    var comment = $("#commentActionArea").text();
                    var atService = "null";
                    var Count = 1;
                    console.log(comment);
                    var start_index = -1;
                    $('.atwho-inserted').each(function()"""),format.raw/*115.57*/("""{"""),format.raw/*115.58*/("""
                        if($(this).text().indexOf("#") > -1) """),format.raw/*116.62*/("""{"""),format.raw/*116.63*/("""
                            var hashTagInThis  = $(this).text().indexOf("#");
                            var hashTagIndex = comment.indexOf("#",start_index+1 );
                            start_index = hashTagIndex;
                        """),format.raw/*120.25*/("""}"""),format.raw/*120.26*/(""" else """),format.raw/*120.32*/("""{"""),format.raw/*120.33*/("""
                            hashTagInThis = $(this).text().indexOf("@");
                            var hashTagIndex = comment.indexOf("@",start_index+1);
                            start_index = hashTagIndex;
                        """),format.raw/*124.25*/("""}"""),format.raw/*124.26*/("""
                        console.log(hashTagIndex + "......");
                        console.log(hashTagInThis + "dddddd");
                        if(hashTagIndex > -1)"""),format.raw/*127.46*/("""{"""),format.raw/*127.47*/("""
                            var hashText = $(this).text();
                            console.log(hashText);
                            Count = 2;
                            SymbolIndex = hashTagIndex + hashText.length;
                            comment = comment.substr(0,SymbolIndex) + comment.substr(SymbolIndex + 1);
//                            hashTagIndex = comment.indexOf("#");
//                            comment = comment.substr(0,hashTagIndex)+ "<span>" + comment.substr(hashTagIndex,hashTagIndex+hashText.length)
//                                    +"</span>" + comment.substr(hashTagIndex+hashText.length);
//                            start_index = hashTagIndex+hashText.length;
                            //            console.log(SymbolIndex);
                            console.log(comment);
                            if(hashText.indexOf("#") > -1) """),format.raw/*139.60*/("""{"""),format.raw/*139.61*/("""
                                atService = hashText.substring(1);
                            """),format.raw/*141.29*/("""}"""),format.raw/*141.30*/("""
                        """),format.raw/*142.25*/("""}"""),format.raw/*142.26*/("""
                    """),format.raw/*143.21*/("""}"""),format.raw/*143.22*/(""");
//                    var hashText = $("#commentActionArea").find(".atwho-inserted").text();
//                    if(hashText != "")"""),format.raw/*145.41*/("""{"""),format.raw/*145.42*/("""
//                    """),format.raw/*146.23*/("""}"""),format.raw/*146.24*/("""
                    console.log(atService);
                    if(comment.length > 0) """),format.raw/*148.44*/("""{"""),format.raw/*148.45*/("""
                        var star_rating = $("#commentRating").val();
                        var date = new Date();
                        var year = date.getFullYear();
                        var month = date.getMonth() + 1;
                        var day = date.getDate();
                        var hours=date.getHours();
                        var minutes = date.getMinutes();
                        var email = """"),_display_(Seq[Any](/*156.39*/email)),format.raw/*156.44*/("""";
                        if(email=="")
                            email = "Guest";
                        var serviceID = -1;
                        serviceID = """"),_display_(Seq[Any](/*160.39*/id)),format.raw/*160.41*/("""";
                        if(parseInt(minutes) < 10)"""),format.raw/*161.51*/("""{"""),format.raw/*161.52*/("""
                            minutes = "0" + minutes;
                        """),format.raw/*163.25*/("""}"""),format.raw/*163.26*/("""
                        var seconds =date.getSeconds();
                        var dateString = year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
                        var commentContent = new Object();
                        commentContent.comment = comment;
                        commentContent.userEmail = email;
                        commentContent.climateId = serviceID;
                        commentContent.grade = star_rating;
                        commentContent.createTime = date.getTime();
                        commentContent.atService = atService;
                        var commentJson = JSON.stringify(commentContent);
//                console.log(commentJson);
                        $.ajax("""),format.raw/*175.32*/("""{"""),format.raw/*175.33*/("""
                            type: 'POST',
                            url: 'http://localhost:9034/posts/add',
                            data: commentJson,
                            dataType: 'json',
                            contentType: 'application/json',
                            success: function()"""),format.raw/*181.48*/("""{"""),format.raw/*181.49*/("""
                                $('#CommentPrompt').modal('show');
                                idNumber = idNumber + 1;
                                $("#post").append("<div id='"+idNumber+"'class='col-md-8 blogShort'></div>");
                                var imgString = "<img id='userIcon' class='pull-left img-responsive thumb margin10 img-thumbnail' src='"""),_display_(Seq[Any](/*185.137*/routes/*185.143*/.Assets.at("images/Usericon.jpg"))),format.raw/*185.176*/("""'>";
                                $("#"+idNumber).append('<h4>By '+email+'</h4>');
                                $("#"+idNumber).append("<input id='rating" +idNumber +"' value="+ star_rating +" class='rating userRating' type='number' data-size='xs' readonly/>");
                                $("#rating"+idNumber).rating('create');
                                $("#"+idNumber).append(imgString);
                                $("#"+idNumber).append("</img>");
                                $("#"+idNumber).append("<article><p>"+comment+"<article></p>");
                                $("#"+idNumber).append("<p class='text-right'>"+dateString+"</p>");
                                $("#commentActionArea").html("");
                            """),format.raw/*194.29*/("""}"""),format.raw/*194.30*/(""",
                            error: function() """),format.raw/*195.47*/("""{"""),format.raw/*195.48*/("""
                                alert('error' + commentJson);
                            """),format.raw/*197.29*/("""}"""),format.raw/*197.30*/("""
                        """),format.raw/*198.25*/("""}"""),format.raw/*198.26*/(""");
                    """),format.raw/*199.21*/("""}"""),format.raw/*199.22*/("""
                """),format.raw/*200.17*/("""}"""),format.raw/*200.18*/(""");
            """),format.raw/*201.13*/("""}"""),format.raw/*201.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*18.114*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*203.2*/("""

"""),_display_(Seq[Any](/*205.2*/main("Service",email, scripts)/*205.32*/ {_display_(Seq[Any](format.raw/*205.34*/("""



    <script type="text/javascript">
    </script>

    <style>
    #commentActionArea"""),format.raw/*213.23*/("""{"""),format.raw/*213.24*/("""
    resize: none;
    width: 760px;
    margin-left: 5px;
    """),format.raw/*217.5*/("""}"""),format.raw/*217.6*/("""
    #commentActionContainer"""),format.raw/*218.28*/("""{"""),format.raw/*218.29*/("""
    border:1px solid #9e9e9e;
    width: 780px;
    margin-top: 10px;
    """),format.raw/*222.5*/("""}"""),format.raw/*222.6*/("""

    #commentAction"""),format.raw/*224.19*/("""{"""),format.raw/*224.20*/("""
    margin-top: 5px;
    """),format.raw/*226.5*/("""}"""),format.raw/*226.6*/("""

    #userIcon"""),format.raw/*228.14*/("""{"""),format.raw/*228.15*/("""
    height: 50px;
    """),format.raw/*230.5*/("""}"""),format.raw/*230.6*/("""

    .text-right"""),format.raw/*232.16*/("""{"""),format.raw/*232.17*/("""
    font-size: x-small;
    """),format.raw/*234.5*/("""}"""),format.raw/*234.6*/("""

    .blogShort"""),format.raw/*236.15*/("""{"""),format.raw/*236.16*/("""
    border:1px solid dimgray;
    margin-top: 10px;
    """),format.raw/*239.5*/("""}"""),format.raw/*239.6*/("""

    article"""),format.raw/*241.12*/("""{"""),format.raw/*241.13*/("""
    margin-left: 90px;
    """),format.raw/*243.5*/("""}"""),format.raw/*243.6*/("""
    </style>
    <iframe id="iframe" width="100%" height="600px" src=""""),_display_(Seq[Any](/*245.59*/url)),format.raw/*245.62*/("""" frameborder="0" >
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
                    DATE: Fri Dec 04 20:08:02 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/oneService.scala.html
                    HASH: 9894e8a3e57972a842cd9b4dea8ce3246d76a5b0
                    MATRIX: 3209->1189|3415->1322|3430->1329|3515->1333|3623->1413|3652->1414|3704->1439|3732->1440|3780->1460|3809->1461|3869->1494|3897->1495|3967->1529|3982->1535|4045->1576|4137->1632|4152->1638|4213->1677|4292->1720|4307->1726|4371->1768|4605->1974|4634->1975|4771->2084|4800->2085|4871->2128|4900->2129|5029->2230|5058->2231|5112->2257|5141->2258|5294->2375|5348->2413|5388->2415|5461->2452|5484->2466|5528->2488|5608->2536|5796->2696|5825->2697|5963->2808|5992->2809|6069->2858|6098->2859|6243->2976|6272->2977|6326->3003|6355->3004|6534->3155|6563->3156|6708->3273|6737->3274|6891->3392|6915->3394|6944->3395|6973->3396|7523->3918|7552->3919|7674->4013|7703->4014|7858->4141|7887->4142|8009->4236|8038->4237|8429->4591|8445->4597|8501->4630|9249->5349|9279->5350|9333->5375|9363->5376|9415->5399|9445->5400|9514->5440|9544->5441|9634->5502|9664->5503|9710->5520|9740->5521|9824->5576|9854->5577|10169->5863|10199->5864|10290->5926|10320->5927|10592->6170|10622->6171|10657->6177|10687->6178|10953->6417|10983->6418|11183->6589|11213->6590|12125->7473|12155->7474|12280->7570|12310->7571|12364->7596|12394->7597|12444->7618|12474->7619|12639->7755|12669->7756|12721->7779|12751->7780|12868->7868|12898->7869|13360->8294|13388->8299|13593->8467|13618->8469|13700->8522|13730->8523|13837->8601|13867->8602|14628->9334|14658->9335|14999->9647|15029->9648|15438->10019|15455->10025|15512->10058|16304->10821|16334->10822|16411->10870|16441->10871|16561->10962|16591->10963|16645->10988|16675->10989|16727->11012|16757->11013|16803->11030|16833->11031|16877->11046|16907->11047|16966->1301|16995->1320|17024->11065|17063->11068|17103->11098|17144->11100|17262->11189|17292->11190|17383->11253|17412->11254|17469->11282|17499->11283|17602->11358|17631->11359|17680->11379|17710->11380|17764->11406|17793->11407|17837->11422|17867->11423|17918->11446|17947->11447|17993->11464|18023->11465|18080->11494|18109->11495|18154->11511|18184->11512|18269->11569|18298->11570|18340->11583|18370->11584|18426->11612|18455->11613|18564->11685|18590->11688
                    LINES: 56->18|59->22|59->22|61->22|64->25|64->25|66->27|66->27|67->28|67->28|69->30|69->30|71->32|71->32|71->32|73->34|73->34|73->34|75->36|75->36|75->36|79->40|79->40|82->43|82->43|84->45|84->45|86->47|86->47|88->49|88->49|92->53|92->53|92->53|93->54|93->54|93->54|95->56|98->59|98->59|102->63|102->63|103->64|103->64|107->68|107->68|108->69|108->69|111->72|111->72|114->75|114->75|116->77|116->77|116->77|116->77|124->85|124->85|126->87|126->87|128->89|128->89|130->91|130->91|133->94|133->94|133->94|141->102|141->102|142->103|142->103|143->104|143->104|144->105|144->105|146->107|146->107|147->108|147->108|148->109|148->109|154->115|154->115|155->116|155->116|159->120|159->120|159->120|159->120|163->124|163->124|166->127|166->127|178->139|178->139|180->141|180->141|181->142|181->142|182->143|182->143|184->145|184->145|185->146|185->146|187->148|187->148|195->156|195->156|199->160|199->160|200->161|200->161|202->163|202->163|214->175|214->175|220->181|220->181|224->185|224->185|224->185|233->194|233->194|234->195|234->195|236->197|236->197|237->198|237->198|238->199|238->199|239->200|239->200|240->201|240->201|243->18|245->21|246->203|248->205|248->205|248->205|256->213|256->213|260->217|260->217|261->218|261->218|265->222|265->222|267->224|267->224|269->226|269->226|271->228|271->228|273->230|273->230|275->232|275->232|277->234|277->234|279->236|279->236|282->239|282->239|284->241|284->241|286->243|286->243|288->245|288->245
                    -- GENERATED --
                */
            