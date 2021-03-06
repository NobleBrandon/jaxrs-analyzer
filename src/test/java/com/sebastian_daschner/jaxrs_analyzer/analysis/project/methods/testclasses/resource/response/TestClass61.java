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
import com.sebastian_daschner.jaxrs_analyzer.model.types.Types;

import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.Set;

public class TestClass61 {

    public Response method(final String name) {
        return Response.ok(getInstance(String.class)).build();
    }

    public <T> T getInstance(final Class<T> clazz) {
        // some reflection magic
        return null;
    }

    public static Set<HttpResponse> getResult() {
        final HttpResponse responseFound = new HttpResponse();
        responseFound.getStatuses().add(200);
        // TODO uncomment analyze generic method type inference
//        responseFound.getEntityTypes().add(Types.STRING);
        responseFound.getEntityTypes().add(Types.OBJECT);

        return Collections.singleton(responseFound);
    }

}
