/*
 * Copyright 2017 Alfresco, Inc. and/or its affiliates.
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

package org.activiti.services.core.pageable;

import org.activiti.engine.impl.identity.Authentication;

/**
 * Wrap Authentication.java so as to be able to mock static methods. May later want to move this to engine level but not necessary now.
 */
public class AuthenticationWrapper {

    public void setAuthenticatedUserId(String user) {
        Authentication.setAuthenticatedUserId(user);
    }

    public String getAuthenticatedUserId() {
        return Authentication.getAuthenticatedUserId();
    }
}
