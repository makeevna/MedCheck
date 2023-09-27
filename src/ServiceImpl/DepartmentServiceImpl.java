package ServiceImpl;

import DaoInterface.DepartmentDao;
import Model.Department;
import Service.DepartmentService;


import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    public DepartmentDao departmentDao;

    public DepartmentServiceImpl(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public List<Department> getAllDepartmentByHospital(Long id) {
        return departmentDao.getAllDepartmentByHospital(id);
    }

    @Override
    public Department findDepartmentByName(String name) {
        return departmentDao.findDepartmentByName(name);
    }

    @Override
    public String addDepartmentToHospital(Long id, Department... departments) {
        return departmentDao.addDepartmentToHospital(id, departments);
    }
}