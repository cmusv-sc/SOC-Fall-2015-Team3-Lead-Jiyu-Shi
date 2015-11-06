
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
	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/("""
	function resizeIframe(obj) """),format.raw/*29.29*/("""{"""),format.raw/*29.30*/("""
		obj.style.height = obj.contentWindow.document.body.scrollHeight + 'px';
	"""),format.raw/*31.2*/("""}"""),format.raw/*31.3*/("""
</script>
""")))};
Seq[Any](format.raw/*18.15*/(""" 

"""),format.raw/*21.1*/("""
"""),format.raw/*33.2*/("""

"""),_display_(Seq[Any](/*35.2*/main("Service", scripts)/*35.26*/ {_display_(Seq[Any](format.raw/*35.28*/("""

<iframe id="iframe" width="100%" height="1200px" src=""""),_display_(Seq[Any](/*37.56*/url)),format.raw/*37.59*/("""" frameborder="0" >
</iframe>

""")))})))}
    }
    
    def render(url:String): play.api.templates.HtmlFormat.Appendable = apply(url)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (url) => apply(url)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 04:17:49 EST 2015
                    SOURCE: C:/Users/Joe/Desktop/activator and projects/ApacheCMDA-Frontend/app/views/climate/oneService.scala.html
                    HASH: 6314558b424385d55f09f64f92ac3fb24a2ef8b7
                    MATRIX: 3212->1222|3321->1262|3336->1269|3421->1273|3515->1339|3544->1340|3644->1413|3672->1414|3730->1444|3759->1445|3864->1523|3892->1524|3946->1235|3978->1259|4007->1538|4047->1543|4080->1567|4120->1569|4215->1628|4240->1631
                    LINES: 56->18|59->22|59->22|61->22|64->25|64->25|67->28|67->28|68->29|68->29|70->31|70->31|73->18|75->21|76->33|78->35|78->35|78->35|80->37|80->37
                    -- GENERATED --
                */
            