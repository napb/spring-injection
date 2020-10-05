package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mainn {

  private final Base bean1;
  private final Base bean2;
  private final Base base;

  public Mainn(
      Base bean1,
      @Qualifier("bean2") Base bean2,
      Base base
  ) {
    this.bean1 = bean1;
    this.bean2 = bean2;
    this.base = base;
  }

  public String run() {
    return "---------------------------------\n" +
        "Bean:" + bean1.toString() + "| Mensaje:" + bean1.metodo() + "\n" +
        "Bean:" + bean2.toString() + "| Mensaje:" + bean2.metodo() + "\n" +
        "Bean:" + base.toString() + "| Mensaje:" + base.metodo() + "\n" +
        "---------------------------------\n";
  }
}
