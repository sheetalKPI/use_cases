package com.country.demo;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService empS;
	
	@Test
	public void contextLoads()
	{
	List<EmployeeEntity> employees = empS.list();
	
	Assert.assertEquals(employees.size(), 6);
	}
}
