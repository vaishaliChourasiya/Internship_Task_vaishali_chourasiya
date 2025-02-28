package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Appointments;

public interface AppointmentsRepository extends JpaRepository<Appointments, String>{

}
