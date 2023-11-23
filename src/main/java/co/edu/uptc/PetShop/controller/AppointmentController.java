package co.edu.uptc.PetShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.PetShop.model.Appointment;
import co.edu.uptc.PetShop.service.AppointmentService;

@RequestMapping("/appointment")
@RestController
@Validated
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;


    @PostMapping("save")
    public ResponseEntity<Appointment> savePet(@RequestBody Appointment appointment) {
		Appointment newAppointment = this.appointmentService.saveAppointment(appointment);
		return ResponseEntity.ok(newAppointment);
	}
}
