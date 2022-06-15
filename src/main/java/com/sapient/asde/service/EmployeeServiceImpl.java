package com.sapient.asde.service;

import com.sapient.asde.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public String getEmployeeWithHighestSalary(List<Employee> employeeList) {
        return employeeList.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).map(Employee::getEname).orElse(null);
    }

    @Override
    public List<Employee> getEmployeesOfGivenJob(List<Employee> employeeList, String job) {
        return employeeList.stream().filter(employee -> employee.getJob().equals(job)).collect(Collectors.toList());
    }

    @Override
    public Double getTotalSalary(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
    }

    @Override
    public Map<String, Integer> getJobwiseEmployees(List<Employee> employeeList) {
        Map<String, Integer> mapper = new HashMap<>();
        employeeList.forEach(employee -> mapper.put(employee.getJob(), mapper.getOrDefault(employee.getJob(), 0) + 1));
        return mapper;
    }
}
