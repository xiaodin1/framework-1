/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package app.controllers;

import leap.web.annotation.Parent;
import leap.web.annotation.Path;
import leap.web.annotation.Restful;
import leap.web.annotation.http.GET;
import leap.web.annotation.http.POST;

@Restful
public class RestTestController {

    @Parent(RestTestController.class)
    public static abstract class SubController {

    }

    @GET
    public TestObject getObject() {
        return new TestObject("a");
    }

    @POST
    public void createObject(TestObject o) {

    }

    @GET
    @Path("/children")
    public void getChildren() {

    }

    static final class TestObject {
        public String v;

        TestObject() {}
        TestObject(String v) { this.v = v;}
    }

    public static class NestedController {
        @GET
        public void index() {

        }
    }

    @Path("/nested1")
    public static class Nested1Controller {

        @GET
        public void index() {

        }
    }

    @Path("nested2")
    public static class Nested2Controller {

        @GET
        public void index() {

        }

        public static class Nested3Controller {

            @GET
            public void index() {

            }
        }
    }
}
