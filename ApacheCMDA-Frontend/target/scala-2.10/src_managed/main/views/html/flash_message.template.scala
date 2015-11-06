
package views.html

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
object flash_message extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*19.1*/("""
"""),_display_(Seq[Any](/*20.2*/if(flash.containsKey("error"))/*20.32*/ {_display_(Seq[Any](format.raw/*20.34*/("""
        
        <div class="alert alert-danger">
                <strong>Oops!</strong> """),_display_(Seq[Any](/*23.41*/flash/*23.46*/.get("error"))),format.raw/*23.59*/("""
                <a class="close" data-dismiss="alert">x</a>
        </div>
        
""")))})),format.raw/*27.2*/("""

"""),_display_(Seq[Any](/*29.2*/if(flash.containsKey("success"))/*29.34*/ {_display_(Seq[Any](format.raw/*29.36*/("""
        
        <div class="alert alert-success">
                """),_display_(Seq[Any](/*32.18*/flash/*32.23*/.get("success"))),format.raw/*32.38*/("""
                <a class="close" data-dismiss="alert">x</a>
        </div>
        
""")))})),format.raw/*36.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 04:17:49 EST 2015
                    SOURCE: C:/Users/Joe/Desktop/activator and projects/ApacheCMDA-Frontend/app/views/flash_message.scala.html
                    HASH: 61460f44c956ce6f04f80083774481c8ddd8753a
                    MATRIX: 3305->1239|3343->1242|3382->1272|3422->1274|3552->1368|3566->1373|3601->1386|3722->1476|3762->1481|3803->1513|3843->1515|3951->1587|3965->1592|4002->1607|4123->1697
                    LINES: 60->19|61->20|61->20|61->20|64->23|64->23|64->23|68->27|70->29|70->29|70->29|73->32|73->32|73->32|77->36
                    -- GENERATED --
                */
            