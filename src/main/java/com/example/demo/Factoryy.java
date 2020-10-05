package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Factoryy {

  private final Base bean1;
  private final Base bean2;
  private final Base beanN;
  //private final Base mederu;

  public Factoryy(Base bean1, Base bean2, Base beanN/*, Base base*/) {
    this.bean1 = bean1;
    this.bean2 = bean2;
    this.beanN = beanN;
    //this.base = base;
  }

  public Base obtenerBean(String p) {

    if(p.equals("1")){
      return bean1;
    } else if (p.equals("2")) {
      return bean2;
    } else if (p.equals("b")) {
      return null; //base;
    } else if (p.equals("n")) {
      return beanN;
    }
    throw new RuntimeException();
  }

}
