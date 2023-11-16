/*******************************************************************************
 * Copyright (c) 2019 NIIT Technologies PVT LTD
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.practice.ms.webservice.filter;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;

/**
 * @author NIIT Technology Limited
 *
 */

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@AllArgsConstructor
public class UserPermissionAuthBean {
  
 /**
  * This is by default constructor for init
  */
  public UserPermissionAuthBean() {
    super();
    
  }

  private String functionCode;
  private String access = "N";
  private String applicationInterfaceUri;
  private String httpMethod;

  public String getFunctionCode() {
    return this.functionCode;
  }

  public void setFunctionCode(final String functionCode) {
    this.functionCode = functionCode;
  }

  public String getAccess() {
    return this.access;
  }

  public void setAccess(final String access) {
    this.access = access;
  }

  public String getApplicationInterfaceUri() {
    return this.applicationInterfaceUri;
  }

  public void setApplicationInterfaceUri(final String applicationInterfaceUri) {
    this.applicationInterfaceUri = applicationInterfaceUri;
  }

  public String getHttpMethod() {
    return this.httpMethod;
  }

  public void setHttpMethod(final String httpMethod) {
    this.httpMethod = httpMethod;
  }

}
