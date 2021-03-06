/*
 * Copyright 2012 the original author or authors.
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
package leap.lang.edm;

import leap.lang.Named;

public abstract class EdmNamedStructualTypeBuilder extends EdmStructualTypeBuilder implements Named {

	protected String  name;
	protected String  title;
	protected boolean isAbstract;
	
	protected EdmNamedStructualTypeBuilder(){
		
	}
	
	protected EdmNamedStructualTypeBuilder(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public EdmNamedStructualTypeBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public String getTitle() {
		return title;
	}

	public EdmNamedStructualTypeBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

	public boolean isAbstract() {
    	return isAbstract;
    }

	public EdmNamedStructualTypeBuilder setAbstract(boolean isAbstract) {
    	this.isAbstract = isAbstract;
    	return this;
    }
}