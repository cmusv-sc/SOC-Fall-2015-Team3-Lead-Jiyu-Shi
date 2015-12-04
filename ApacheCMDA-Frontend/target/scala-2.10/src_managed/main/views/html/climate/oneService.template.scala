
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
                    var hashText = $("#commentActionArea").find(".atwho-inserted").text();
                    var comment = $("#commentActionArea").text();
                    if(hashText != "")"""),format.raw/*112.39*/("""{"""),format.raw/*112.40*/("""
                        var hashTagIndex = comment.indexOf("#");
                        SymbolIndex = hashTagIndex + hashText.length;
                        comment = comment.substr(0,SymbolIndex) + comment.substr(SymbolIndex + 1);
                        hashTagIndex = comment.indexOf("#");
                        comment = comment.substr(0,hashTagIndex)+"<span style='color:#4183C4'>" + comment.substr(hashTagIndex,hashTagIndex+hashText.length)
                                +"</span>" + comment.substr(hashTagIndex+hashText.length);
        //            console.log(SymbolIndex);
                        var atService = "null";
                        if(hashText.indexOf("#") > -1) """),format.raw/*121.56*/("""{"""),format.raw/*121.57*/("""
                            atService = hashText.substring(1);
                        """),format.raw/*123.25*/("""}"""),format.raw/*123.26*/("""
                    """),format.raw/*124.21*/("""}"""),format.raw/*124.22*/("""
                    console.log(atService);
                    if(comment.length > 0) """),format.raw/*126.44*/("""{"""),format.raw/*126.45*/("""
                        var star_rating = $("#commentRating").val();
                        var date = new Date();
                        var year = date.getFullYear();
                        var month = date.getMonth() + 1;
                        var day = date.getDate();
                        var hours=date.getHours();
                        var minutes = date.getMinutes();
                        var email = """"),_display_(Seq[Any](/*134.39*/email)),format.raw/*134.44*/("""";
                        if(email=="")
                            email = "Guest";
                        var serviceID = -1;
                        serviceID = """"),_display_(Seq[Any](/*138.39*/id)),format.raw/*138.41*/("""";
                        if(parseInt(minutes) < 10)"""),format.raw/*139.51*/("""{"""),format.raw/*139.52*/("""
                            minutes = "0" + minutes;
                        """),format.raw/*141.25*/("""}"""),format.raw/*141.26*/("""
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
                        $.ajax("""),format.raw/*153.32*/("""{"""),format.raw/*153.33*/("""
                            type: 'POST',
                            url: 'http://localhost:9034/posts/add',
                            data: commentJson,
                            dataType: 'json',
                            contentType: 'application/json',
                            success: function()"""),format.raw/*159.48*/("""{"""),format.raw/*159.49*/("""
                                $('#CommentPrompt').modal('show');
                                idNumber = idNumber + 1;
                                $("#post").append("<div id='"+idNumber+"'class='col-md-8 blogShort'></div>");
                                var imgString = "<img id='userIcon' class='pull-left img-responsive thumb margin10 img-thumbnail' src='"""),_display_(Seq[Any](/*163.137*/routes/*163.143*/.Assets.at("images/Usericon.jpg"))),format.raw/*163.176*/("""'>";
                                $("#"+idNumber).append('<h4>By'+email+'</h4>');
                                $("#"+idNumber).append("<input id='rating" +idNumber +"' value="+ star_rating +" class='rating userRating' type='number' data-size='xs' readonly/>");
                                $("#rating"+idNumber).rating('create');
                                $("#"+idNumber).append(imgString);
                                $("#"+idNumber).append("</img>");
                                $("#"+idNumber).append("<article><p>"+comment+"<article></p>");
                                $("#"+idNumber).append("<p class='text-right'>"+dateString+"</p>");
                                $("#commentActionArea").html("");
                            """),format.raw/*172.29*/("""}"""),format.raw/*172.30*/(""",
                            error: function() """),format.raw/*173.47*/("""{"""),format.raw/*173.48*/("""
                                alert('error' + commentJson);
                            """),format.raw/*175.29*/("""}"""),format.raw/*175.30*/("""
                        """),format.raw/*176.25*/("""}"""),format.raw/*176.26*/(""");
                    """),format.raw/*177.21*/("""}"""),format.raw/*177.22*/("""
                """),format.raw/*178.17*/("""}"""),format.raw/*178.18*/(""");
            """),format.raw/*179.13*/("""}"""),format.raw/*179.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*18.114*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*181.2*/("""

"""),_display_(Seq[Any](/*183.2*/main("Service",email, scripts)/*183.32*/ {_display_(Seq[Any](format.raw/*183.34*/("""



    <script type="text/javascript">
    </script>

    <style>
    #commentActionArea"""),format.raw/*191.23*/("""{"""),format.raw/*191.24*/("""
    resize: none;
    width: 760px;
    margin-left: 5px;
    """),format.raw/*195.5*/("""}"""),format.raw/*195.6*/("""
    #commentActionContainer"""),format.raw/*196.28*/("""{"""),format.raw/*196.29*/("""
    border:1px solid #9e9e9e;
    width: 780px;
    margin-top: 10px;
    """),format.raw/*200.5*/("""}"""),format.raw/*200.6*/("""

    #commentAction"""),format.raw/*202.19*/("""{"""),format.raw/*202.20*/("""
    margin-top: 5px;
    """),format.raw/*204.5*/("""}"""),format.raw/*204.6*/("""

    #userIcon"""),format.raw/*206.14*/("""{"""),format.raw/*206.15*/("""
    height: 50px;
    """),format.raw/*208.5*/("""}"""),format.raw/*208.6*/("""

    .text-right"""),format.raw/*210.16*/("""{"""),format.raw/*210.17*/("""
    font-size: x-small;
    """),format.raw/*212.5*/("""}"""),format.raw/*212.6*/("""

    .blogShort"""),format.raw/*214.15*/("""{"""),format.raw/*214.16*/("""
    border:1px solid dimgray;
    margin-top: 10px;
    """),format.raw/*217.5*/("""}"""),format.raw/*217.6*/("""

    article"""),format.raw/*219.12*/("""{"""),format.raw/*219.13*/("""
    margin-left: 90px;
    """),format.raw/*221.5*/("""}"""),format.raw/*221.6*/("""
    </style>
    <iframe id="iframe" width="100%" height="600px" src=""""),_display_(Seq[Any](/*223.59*/url)),format.raw/*223.62*/("""" frameborder="0" >
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
                    DATE: Thu Dec 03 22:47:03 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/oneService.scala.html
                    HASH: a6e49e9aa1f4eaeb75a536ab68a440add06dd9f9
                    MATRIX: 3209->1189|3415->1322|3430->1329|3515->1333|3623->1413|3652->1414|3704->1439|3732->1440|3780->1460|3809->1461|3869->1494|3897->1495|3967->1529|3982->1535|4045->1576|4137->1632|4152->1638|4213->1677|4292->1720|4307->1726|4371->1768|4605->1974|4634->1975|4771->2084|4800->2085|4871->2128|4900->2129|5029->2230|5058->2231|5112->2257|5141->2258|5294->2375|5348->2413|5388->2415|5461->2452|5484->2466|5528->2488|5608->2536|5796->2696|5825->2697|5963->2808|5992->2809|6069->2858|6098->2859|6243->2976|6272->2977|6326->3003|6355->3004|6534->3155|6563->3156|6708->3273|6737->3274|6891->3392|6915->3394|6944->3395|6973->3396|7523->3918|7552->3919|7674->4013|7703->4014|7858->4141|7887->4142|8009->4236|8038->4237|8429->4591|8445->4597|8501->4630|9249->5349|9279->5350|9333->5375|9363->5376|9415->5399|9445->5400|9514->5440|9544->5441|9634->5502|9664->5503|9710->5520|9740->5521|9824->5576|9854->5577|10079->5773|10109->5774|10832->6468|10862->6469|10979->6557|11009->6558|11059->6579|11089->6580|11206->6668|11236->6669|11698->7094|11726->7099|11931->7267|11956->7269|12038->7322|12068->7323|12175->7401|12205->7402|12966->8134|12996->8135|13337->8447|13367->8448|13776->8819|13793->8825|13850->8858|14641->9620|14671->9621|14748->9669|14778->9670|14898->9761|14928->9762|14982->9787|15012->9788|15064->9811|15094->9812|15140->9829|15170->9830|15214->9845|15244->9846|15303->1301|15332->1320|15361->9864|15400->9867|15440->9897|15481->9899|15599->9988|15629->9989|15720->10052|15749->10053|15806->10081|15836->10082|15939->10157|15968->10158|16017->10178|16047->10179|16101->10205|16130->10206|16174->10221|16204->10222|16255->10245|16284->10246|16330->10263|16360->10264|16417->10293|16446->10294|16491->10310|16521->10311|16606->10368|16635->10369|16677->10382|16707->10383|16763->10411|16792->10412|16901->10484|16927->10487
                    LINES: 56->18|59->22|59->22|61->22|64->25|64->25|66->27|66->27|67->28|67->28|69->30|69->30|71->32|71->32|71->32|73->34|73->34|73->34|75->36|75->36|75->36|79->40|79->40|82->43|82->43|84->45|84->45|86->47|86->47|88->49|88->49|92->53|92->53|92->53|93->54|93->54|93->54|95->56|98->59|98->59|102->63|102->63|103->64|103->64|107->68|107->68|108->69|108->69|111->72|111->72|114->75|114->75|116->77|116->77|116->77|116->77|124->85|124->85|126->87|126->87|128->89|128->89|130->91|130->91|133->94|133->94|133->94|141->102|141->102|142->103|142->103|143->104|143->104|144->105|144->105|146->107|146->107|147->108|147->108|148->109|148->109|151->112|151->112|160->121|160->121|162->123|162->123|163->124|163->124|165->126|165->126|173->134|173->134|177->138|177->138|178->139|178->139|180->141|180->141|192->153|192->153|198->159|198->159|202->163|202->163|202->163|211->172|211->172|212->173|212->173|214->175|214->175|215->176|215->176|216->177|216->177|217->178|217->178|218->179|218->179|221->18|223->21|224->181|226->183|226->183|226->183|234->191|234->191|238->195|238->195|239->196|239->196|243->200|243->200|245->202|245->202|247->204|247->204|249->206|249->206|251->208|251->208|253->210|253->210|255->212|255->212|257->214|257->214|260->217|260->217|262->219|262->219|264->221|264->221|266->223|266->223
                    -- GENERATED --
                */
            