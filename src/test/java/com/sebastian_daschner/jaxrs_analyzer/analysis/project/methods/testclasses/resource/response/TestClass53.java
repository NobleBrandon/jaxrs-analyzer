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

import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.Set;

public class TestClass53 {

    public Response method(final String id) {
        final InnerTestClass innerTestClass = new InnerTestClass(400);
        final int status = innerTestClass.method();
        return Response.status(status).build();
    }

    public static Set<HttpResponse> getResult() {
        final HttpResponse result = new HttpResponse();

        result.getStatuses().add(404);

        return Collections.singleton(result);
    }

    private class InnerTestClass {

        public InnerTestClass(final int number) {
            System.out.println(number);
        }

        public int method() {
            return 404;
        }

    }

}
