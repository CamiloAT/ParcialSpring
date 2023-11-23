package co.edu.uptc.PetShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.uptc.PetShop.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
    
}
