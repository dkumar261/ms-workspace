package com.practice.ms.webservice.filter;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;


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
