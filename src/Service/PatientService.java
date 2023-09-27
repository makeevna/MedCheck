package Service;

import Model.Patient;

import java.util.List;
import java.util.Map;

public interface PatientService {

    Map<Integer, Patient> getPatientByAge();
    List<Patient> sortPatientsByAge(String ascOrDesc);

    String addPatientsToHospital(Long id, List<Patient> patients);
    Patient getPatientById(Long id);


}
