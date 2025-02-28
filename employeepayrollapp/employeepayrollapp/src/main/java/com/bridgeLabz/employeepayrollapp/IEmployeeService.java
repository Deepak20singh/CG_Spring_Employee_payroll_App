package com.bridgeLabz.employeepayrollapp;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployeeByDepartment(String department);

}
