package com.userFront.service;

import java.util.List;

import com.userFront.domain.Appointment;

public interface AppointmentService {
	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

   

    void confirmAppointment(Long id);
}
