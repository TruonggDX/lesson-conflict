package com.exo.resolveconflict.service;

import com.exo.resolveconflict.entity.Employee;
import java.util.List;

public interface IEmployeeSerivce {

  List<Employee> getEmployees();

  Employee getEmployee(Long id);

  void addEmployee(Employee employee);

  void updateEmployee(Employee employee);
}
