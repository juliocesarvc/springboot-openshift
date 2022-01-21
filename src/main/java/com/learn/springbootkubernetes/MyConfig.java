package com.learn.springbootkubernetes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties
public class MyConfig {

  @Value("${property.1}")
  private String property1;

  @Value("${property.2}")
  private String property2;

  @Value("${property.3}")
  private String property3;


  public String getProperty1() {
    return property1;
  }

  public void setProperty1(String property1) {
    this.property1 = property1;
  }

  public String getProperty2() {
    return property2;
  }

  public void setProperty2(String property2) {
    this.property2 = property2;
  }

  public String getProperty3() {
    return property3;
  }

  public void setProperty3(String property3) {
    this.property3 = property3;
  }
}
