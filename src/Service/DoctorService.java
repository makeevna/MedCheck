package Service;

import Model.Doctor;

import java.util.List;

public interface DoctorService {

    Doctor findDoctorById(Long id);
    String assignDoctorToDepartment(Long departmentId, List<Long> doctorsId);
    List<Doctor> getAllDoctorsByHospitalId(Long id);
    List<Doctor> getAllDoctorsByDepartmentId(Long id);

    String addDoctorToDepartment(Long id, List<Doctor> doctors);
}