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
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import models.UserService;
import models.metadata.ClimateService;
import play.libs.Json;
import play.mvc.*;
import util.Constants;
import views.html.*;
import play.data.*;
import views.html.climate.home;
import views.html.climate.signUp;


import static play.data.Form.form;

public class Application extends Controller {

    final static UserService userService = new UserService();

    public static Result index() {
        return ok(index.render(""));
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
                signUp.render(form(User.class))
        );
    }

    public static Result authenticate() {
        Form<User> loginForm = form(User.class).bindFromRequest();

        ObjectNode jsonData = Json.newObject();


        System.out.println("email = "+ loginForm.get().getEmail());
        System.out.println("password = "+ loginForm.get().getPassword());
        System.out.println("username = "+loginForm.get().getUserName());
        System.out.println("id = "+loginForm.get().getId());
        System.out.println("first = "+loginForm.get().getFirstName());
        System.out.println("last = "+loginForm.get().getLastName());
//        if (userService.register(loginForm.get()).compareTo("failure") == 0 ){
//            System.out.println("User ID has been used.");
//            return  ok(signUp.render(form(User.class)));
//        }else if (userService.register(loginForm.get()).compareTo("success") == 0 ){
            return ok(home.render(loginForm.get().getEmail(),loginForm.get().getPassword()
                    ,loginForm.get().getUserName(), ClimateService.all()));
//        }

    }

}
