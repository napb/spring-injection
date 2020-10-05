package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class Config {

  @Bean
  public Integer integer(){

    return new Integer(1);
  }

}
