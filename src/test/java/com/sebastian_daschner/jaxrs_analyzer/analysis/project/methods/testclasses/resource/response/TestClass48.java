/*
 * Copyright (C) 2015 Sebastian Daschner, sebastian-daschner.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sebastian_daschner.jaxrs_analyzer.analysis.project.methods.testclasses.resource.response;

import com.sebastian_daschner.jaxrs_analyzer.model.elements.HttpResponse;
import com.sebastian_daschner.jaxrs_analyzer.model.types.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.*;

public class TestClass48 {

    private List<Object> tasks;

    public Response method() {
        List<User> users = new LinkedList<>();
        if ("".equals(""))
            throw new WebApplicationException("message", new RuntimeException());
        return Response.ok(users).build();
    }

    public static Set<HttpResponse> getResult() {
        final HttpResponse firstResult = new HttpResponse();

        firstResult.getStatuses().add(200);
        firstResult.getEntityTypes().add(new Type("java.util.List<com.sebastian_daschner.jaxrs_analyzer.analysis.project.methods.testclasses.resource.response.TestClass48$User>"));
        firstResult.getEntityTypes().add(new Type("java.util.LinkedList"));

        final HttpResponse secondResult = new HttpResponse();
        secondResult.getStatuses().add(500);

        return new HashSet<>(Arrays.asList(firstResult, secondResult));
    }

    private static class User {
        private String name;
    }

}
