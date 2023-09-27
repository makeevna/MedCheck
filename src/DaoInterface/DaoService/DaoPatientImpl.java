package DaoInterface.DaoService;

import DaoInterface.PatientDao;
import DataBase.Dao;
import Model.Hospital;
import Model.Patient;

import java.util.*;

public class DaoPatientImpl implements PatientDao {

    private final Dao dao;

    public DaoPatientImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public String addPatientsToHospital(Long id, List<Patient> patients) {
        for (Hospital hospital : dao.getHospitals()) {
            if (hospital.getInstanceId() == id) {
                List<Patient> patients1 = hospital.getPatients();
                if (!patients1.equals(patients)) {
                    patients1.addAll(patients);
                    System.out.println(dao.getHospitals());
                    return "Added";
                }
            }
        }
        return "Already exist";
    }


    @Override
    public Patient getPatientById(Long id) {
        for (Hospital hospital : dao.getHospitals()) {
            List<Patient> patients = hospital.getPatients();
            for (Patient pp : patients) {
                if (pp.getInstanceId() == id) {
                    return pp;
                }
            }
        }
        return null;
    }

    @Override
    public Map<Integer, Patient> getPatientByAge() {
        Map<Integer, Patient> patientMap = new HashMap<>();

        for (Hospital hospital : dao.getHospitals()) {
            List<Patient> patients = hospital.getPatients();

            for (Patient patient : patients) {
                int age = patient.getAge();
                patientMap.put(age, patient);
            }
        }
        return patientMap;
    }


    @Override
    public List<Patient> sortPatientsByAge(String ascOrDesc) {
        return null;
    }
}
