package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.brownfield.pss.search.apigateway.SearchApiGateway;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SearchApiGateway.class)
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
