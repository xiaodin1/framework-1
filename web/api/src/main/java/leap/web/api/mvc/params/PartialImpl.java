/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package leap.web.api.mvc.params;

import java.util.Map;

public class PartialImpl implements Partial {

    private final Map m;

    public PartialImpl(Map m) {
        this.m = m;
    }

    @Override
    public boolean isEmpty() {
        return null == m || m.isEmpty();
    }

    @Override
    public Map<String, Object> getProperties() {
        return (Map<String,Object>)m;
    }

}