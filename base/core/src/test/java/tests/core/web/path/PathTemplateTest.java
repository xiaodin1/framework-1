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
package tests.core.web.path;

import leap.core.web.path.JerseyPathTemplateFactory;
import leap.core.web.path.PathTemplate;
import leap.core.web.path.PathTemplateFactory;
import org.junit.Test;

import leap.junit.TestBase;

public class PathTemplateTest extends TestBase {
	
	private static PathTemplateFactory factory = new JerseyPathTemplateFactory();
	
	private static PathTemplate pt(String t) {
		return factory.createPathTemplate(t);
	}

	@Test
	public void testPathTemplateToPathPattern() {
		assertEquals("/", pt("/").pattern());
		assertEquals("/*",pt("/{id}").pattern());
		assertEquals("/a/b/*/c",pt("/a/b/{id}/c").pattern());
	}
	
}