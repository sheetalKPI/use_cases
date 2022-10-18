package com.country.demo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void
	whenApplicationStarts_thenHibernateCreatesInitialRecords() {
	List<EmployeeEntity> employees = employeeService.list();
	
	Assert.assertEquals(employees.size(), 6);
	}
}
