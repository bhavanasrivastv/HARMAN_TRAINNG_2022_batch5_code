package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.service.BookService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
@OpenAPIDefinition
(info = @Info(title = "bookapp API", version = "2.0" , description = "HARMAN bookapp API"))
@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		bookService.addBook(new Book("effective java", 340.00));
//		bookService.addBook(new Book("rich dad poor dad", 240.00));
//		bookService.addBook(new Book("monk who sold farrari", 300.00));
//		
		
	}

}
