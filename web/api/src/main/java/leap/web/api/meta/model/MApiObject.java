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
package leap.web.api.meta.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import leap.lang.accessor.AttributeGetter;
import leap.lang.meta.MObject;

public abstract class MApiObject implements AttributeGetter, MObject {
	
	protected final Map<String, Object> attributes;
	
	public MApiObject() {
		this(null);
	}
	
	@SuppressWarnings("unchecked")
    public MApiObject(Map<String, Object> attrs) {
		this.attributes = attrs == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap<String, Object>(attrs)); 
	}
	
	/**
	 * The returned {@link Map} is immutable.
	 */
	public final Map<String, Object> getAttributes() {
		return attributes;
	}

	@Override
    public Object getAttribute(String name) {
	    return attributes.get(name);
    }
	
}