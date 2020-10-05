package com.example.demo;

import java.util.stream.IntStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private Mainn main;

	@Autowired
	private Factoryy factoryy;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//1 - Ejemplo con factory
		//Base implementacion = factoryy.obtenerBean("1");
		//System.out.println("implementacion: " + implementacion);




		main.run();
		/*
		//2 - Ejemplo con un bean que imprime toString de todos los beans de un tipo
		IntStream.range(1, 5)
				.forEach(value -> {
					try {
						main.run();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
		 */

	}
}
