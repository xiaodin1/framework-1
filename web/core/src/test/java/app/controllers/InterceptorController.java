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
package app.controllers;

import leap.core.validation.Validation;
import leap.lang.intercepting.State;
import leap.web.Request;
import leap.web.action.ActionContext;
import leap.web.action.ActionInterceptor;
import leap.web.annotation.InterceptedBy;

public class InterceptorController implements ActionInterceptor {

	@Override
    public State preExecuteAction(ActionContext context, Validation validation) throws Throwable {
		context.getRequest().setAttribute("aaa", "bbb");
		return State.CONTINUE;
	}
	
	public String test(Request request) {
		return (String)request.getAttribute("aaa");
	}
	
	@InterceptedBy(TestActionInterceptor1.class)
	public Object test1() {
		return "test";
	}

	public static final class TestActionInterceptor1 implements ActionInterceptor {

		@Override
        public State preExecuteAction(ActionContext context, Validation validation) throws Throwable {
			context.getResponse().getWriter().print("intercepted");
			return State.INTERCEPTED;
		}
		
	}
}
