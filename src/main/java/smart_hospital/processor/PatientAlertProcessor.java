package smart_hospital.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import smart_hospital.service.NotificationService;

@Component
public class PatientAlertProcessor {

    private final NotificationService defaultNotificationService;

    private final NotificationService emergencyNotificationService;

    @Value("${hospital.name:General City Hospital}")
    private String hospitalName;

    @Value("${HOSPITAL_API_SECRET}")
    private String apiSecret;

    @Autowired
    public PatientAlertProcessor(
            NotificationService defaultNotificationService,
            @Qualifier("emergencyService") NotificationService emergencyNotificationService) {

        this.defaultNotificationService = defaultNotificationService;
        this.emergencyNotificationService = emergencyNotificationService;
    }

    public void processRoutineAlert(String patientId, String message) {
        defaultNotificationService.sendNotification(patientId, message);
    }

    public void processEmergencyAlert(String patientId, String message) {
        emergencyNotificationService.sendNotification(patientId, message);
    }

    public void displayHospitalName() {
        System.out.println("Hospital: " + hospitalName);
    }
}