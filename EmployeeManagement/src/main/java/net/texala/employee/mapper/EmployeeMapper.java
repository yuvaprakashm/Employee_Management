package net.texala.employee.mapper;

import net.texala.employee.model.employee.Employee;
import net.texala.employee.vo.employee.EmployeeVo;
 

public interface EmployeeMapper {

	EmployeeVo toVo(Employee employee);

	Employee toEntity(EmployeeVo employeeVo);
}
