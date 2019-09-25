package pt.dlt.health;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pt.dlt.health.dto.Appointment;
import pt.dlt.health.dto.Doctor;
import pt.dlt.health.dto.Patient;
import pt.dlt.health.routing.RoutingLayer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthApplicationTests {

	private @Autowired RoutingLayer routingLayer;

	@Test
	public void testDoctorsEndpoint() {
		routingLayer.getListDoctor();
		List<Doctor> doctors = routingLayer.getListDoctor();
		assertFalse(routingLayer.getListDoctor().isEmpty());
		assertNotNull(doctors);
	}

	@Test
	public void testPatientsEndPoint() {
		List<Patient> patients = routingLayer.getListPatient();
		assertNotNull(patients);
	}

	
	@Test
	public void testAppointmentsEndPoint() {
		List<Appointment> appointments = routingLayer.getListAppointment();
		assertNotNull(appointments);
	}

}
