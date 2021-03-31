package com.antimonitor.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CoreApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void someTest(){
		assertEquals(1, 1);
	}

}
