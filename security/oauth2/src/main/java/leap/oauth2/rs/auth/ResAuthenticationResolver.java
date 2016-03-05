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
package leap.oauth2.rs.auth;

import leap.lang.Result;
import leap.web.Request;
import leap.web.Response;
import leap.core.security.Authentication;
import leap.web.security.authc.AuthenticationContext;
import leap.web.security.authc.AuthenticationResolver;

public interface ResAuthenticationResolver extends AuthenticationResolver {

    /**
     * Resolves {@link Authentication} in the request.
     *
     * <p/>
     * Returns a failure result if failed to resolve authentication and the request was handled by the resolver.
     */
    Result<Authentication> resolveAuthentication(Request request, Response response, AuthenticationContext context) throws Throwable;

}
