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

package leap.core.monitor;

import leap.core.annotation.Inject;
import leap.lang.Arrays2;

public class SimpleMonitorProvider implements MonitorProvider {

    protected @Inject MonitorConfig config;

    @Override
    public MethodMonitor startMethodMonitor(String className, String methodDesc) {
        return startMethodMonitor(className, methodDesc, Arrays2.EMPTY_OBJECT_ARRAY);
    }

    @Override
    public MethodMonitor startMethodMonitor(String className, String methodDesc, Object[] args) {
        return new SimpleMethodMonitor(this, className, methodDesc, args);
    }

}