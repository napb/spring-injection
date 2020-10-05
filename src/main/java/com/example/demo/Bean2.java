package com.example.demo;

import org.springframework.stereotype.Service;

@Service//("bean2")
public class Bean2 extends Base {

  @Override
  public String metodo() {
    return "Bean2 | toString:(" + this.toString() +")";
  }
}
