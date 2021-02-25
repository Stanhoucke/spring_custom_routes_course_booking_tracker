package com.codeclan.example.coursebooker.repositories;

import com.codeclan.example.coursebooker.models.Booking;
import com.codeclan.example.coursebooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByDate(String date);
}
