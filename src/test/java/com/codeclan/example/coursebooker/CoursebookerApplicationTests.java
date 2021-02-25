package com.codeclan.example.coursebooker;

import com.codeclan.example.coursebooker.repositories.BookingRepository;
import com.codeclan.example.coursebooker.repositories.CourseRepository;
import com.codeclan.example.coursebooker.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class CoursebookerApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canGetBob(){
		assertEquals("Bob", customerRepository.getOne(1L).getName());
	}

}
