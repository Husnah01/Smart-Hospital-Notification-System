package smart_hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import smart_hospital.processor.PatientAlertProcessor;

@SpringBootApplication
public class SmartHospitalApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
				SpringApplication.run(SmartHospitalApplication.class, args);

		PatientAlertProcessor processor =
				context.getBean(PatientAlertProcessor.class);

		processor.displayHospitalName();

		processor.processRoutineAlert(
				"P001",
				"Your appointment is tomorrow."
		);

		processor.processEmergencyAlert(
				"P002",
				"Critical ICU alert. Immediate attention required."
		);

		context.close();
	}
}