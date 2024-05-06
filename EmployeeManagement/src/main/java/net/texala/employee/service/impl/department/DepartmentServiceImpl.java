package net.texala.employee.service.impl.department;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.texala.employee.model.department.Department;
import net.texala.employee.repository.department.DepartmentRepository;
import net.texala.employee.service.department.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> findAll() {

		return (List<Department>) departmentRepository.findAll();
	}

	@Override
	public Department save(Department department) {

		return departmentRepository.save(department);
	}

}