package com.codeclan.example.coursebooker.repositories;

import com.codeclan.example.coursebooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryNameSpaceHandler;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findCustomerByBookingsCourseId(Long id);

    List<Customer> findCustomerByTownIgnoreCase(String town);
}
