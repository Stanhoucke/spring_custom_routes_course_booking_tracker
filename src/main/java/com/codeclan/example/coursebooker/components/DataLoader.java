package com.codeclan.example.coursebooker.components;

import com.codeclan.example.coursebooker.models.Booking;
import com.codeclan.example.coursebooker.models.Course;
import com.codeclan.example.coursebooker.models.Customer;
import com.codeclan.example.coursebooker.repositories.BookingRepository;
import com.codeclan.example.coursebooker.repositories.CourseRepository;
import com.codeclan.example.coursebooker.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("Bob","Edinburgh",1);
        customerRepository.save(customer1);

        Course course1 = new Course("Being a Good Baby","Glasgow",5);
        courseRepository.save(course1);

        Booking booking1 = new Booking("25-02-2021", customer1, course1);
        bookingRepository.save(booking1);


    }
}
