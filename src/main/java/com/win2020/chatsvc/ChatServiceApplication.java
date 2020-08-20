package com.win2020.chatsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatServiceApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(ChatServiceApplication.class, args);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
