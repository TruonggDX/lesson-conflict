package com.exo.resolveconflict.service.impl;

import com.exo.resolveconflict.entity.Employee;
import com.exo.resolveconflict.repository.EmployeeRepository;
import com.exo.resolveconflict.service.IEmployeeSerivce;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeSerivceImpl implements IEmployeeSerivce {

  private final EmployeeRepository employeeRepository;

  @Override
  public List<Employee> getEmployees() {
    return employeeRepository.findAll();
  }

  @Override
  public Employee getEmployee(Long id) {
    return employeeRepository.findById(id).orElse(null);
  }

  @Override
  public void addEmployee(Employee employee) {
    employeeRepository.save(employee);
  }

  @Override
  public void updateEmployee(Employee employee) {
    employeeRepository.save(employee);
  }
}
