package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyControllerTest {

	@Autowired
	private MyCntontroller myCntontroller;
	
	@Test
	public void contextLoad()
	{
		assertThat(myCntontroller).isNotNull();
		assertThat(myCntontroller.greeting()).isEqualTo("Welcome to Test ");
	}
}
