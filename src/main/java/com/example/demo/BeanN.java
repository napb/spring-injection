package com.example.demo;

import org.springframework.stereotype.Service;

@Service//("beanN")
public class BeanN extends Base {

  @Override
  public String metodo() {
    return "BeanN | toString:(" + this.toString() +")";
  }
}
