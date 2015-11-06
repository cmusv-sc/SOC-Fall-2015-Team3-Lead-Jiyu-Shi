/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import java.util.Iterator;
import java.util.Map.Entry;
import com.fasterxml.jackson.databind.JsonNode;
import models.metadata.ClimateService;
import play.mvc.*;
import views.html.*;
import play.data.*;
import views.html.climate.home;
import views.html.climate.signUp;
import static play.data.Form.form;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render(""));
    }

    public static class Account {

        public String email;
        public String password;
        public String username;
        public String validate() {
            return null;
        }
        public String getEmail(){
            return email;
        }
        public String getPassword(){
            return password;
        }
        public String getUsername(){
            return username;
        }
    }

    public static void flashMsg(JsonNode jsonNode){
        Iterator<Entry<String, JsonNode>> it = jsonNode.fields();
        while (it.hasNext()) {
            Entry<String, JsonNode> field = it.next();
            flash(field.getKey(),field.getValue().asText());
        }
    }

    public static Result sign() {
        return ok(
                signUp.render(form(Account.class))
        );
    }

    public static Result authenticate() {
        Form<Account> loginForm = form(Account.class).bindFromRequest();
        System.out.println(loginForm.get().email);
        System.out.println(loginForm.get().password);
        return ok(home.render(loginForm.get().email,loginForm.get().password,loginForm.get().username, ClimateService.all()));
    }

}
