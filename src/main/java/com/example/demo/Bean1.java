package com.example.demo;

import org.springframework.stereotype.Service;

@Service//("bean1")
public class Bean1 extends Base {

  @Override
  public String metodo() {
    return "Bean1 | toString:(" + this.toString() +")";
  }
}
