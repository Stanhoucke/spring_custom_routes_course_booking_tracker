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
        Customer customer2 = new Customer("Sandra", "Rome", 33);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Stan", "Geneva", 29);
        customerRepository.save(customer3);
        Customer customer4 = new Customer("Giulia", "Edinburgh", 35);
        customerRepository.save(customer4);

        Course course1 = new Course("Being a Good Baby","Glasgow",5);
        courseRepository.save(course1);
        Course course2 = new Course("Being a Nosey Neighbour", "London", 4);
        courseRepository.save(course2);
        Course course3 = new Course("Being a Tea Pot", "Edinburgh", 5);
        courseRepository.save(course3);

        Booking booking1 = new Booking("25-02-2021", customer1, course1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("01-01-2021", customer2, course2);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("22-03-2021", customer3, course3);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("01-04-2021", customer4, course3);
        bookingRepository.save(booking4);
    }
}
