package com.codeclan.example.coursebooker.repositories;

import com.codeclan.example.coursebooker.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
