package co.edu.uptc.PetShop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uptc.PetShop.model.Appointment;
import co.edu.uptc.PetShop.repository.AppointmentRepository;
import co.edu.uptc.PetShop.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService{
    
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }






}
