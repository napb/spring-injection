package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

  private final Mainn main;
  private final Factoryy factoryy;

  public Controlador(Mainn main, Factoryy factoryy) {
    this.main = main;
    this.factoryy = factoryy;
  }

  @GetMapping("/")
  public String obtenerInfoBeans() {
    return main.run();
  }

  @GetMapping("/{parametro}")
  public String obtenerBean(@PathVariable String s) {
    return factoryy.obtenerBean(s).toString();
  }

}
