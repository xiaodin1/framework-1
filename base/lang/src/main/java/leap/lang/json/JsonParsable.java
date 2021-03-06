/*
 * Copyright 2014 the original author or authors.
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
package leap.lang.json;

public interface JsonParsable {

    /**
     * Parse the json.
     */
	void parseJson(JsonValue json);

    /**
     * Parse the json.
     */
    default void parseJson(String json) {
        parseJson(JSON.parse(json));
    }

    /**
     * Parse the json and returns the object itself.
     */
	default <T> T withParsingJson(JsonValue json) {
        parseJson(json);
        return (T)this;
    }
}