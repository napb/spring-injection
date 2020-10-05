package com.example.demo;

import org.springframework.stereotype.Service;

@Service//("base")
public class Base {


  public String metodo() {
    return "Bean base | toString:(" + this.toString() +")";
  }
}
