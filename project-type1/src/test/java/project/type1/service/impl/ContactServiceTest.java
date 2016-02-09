package project.type1.service.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import project.type1.dto.ContactDto;


@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = "/spring-test.xml" )
public class ContactServiceTest {

	@Autowired
	ContactService	service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void get() {
		long	id	= 1;
		ContactDto	item	= service.get( id );
		System.out.println( item );
	}

	@Test
	public void update() {
		long	id	= 2;
		int	result	= service.update( id, "010-0000-0002" );
		System.out.println( result );
	}

}
