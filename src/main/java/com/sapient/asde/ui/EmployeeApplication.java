package com.sapient.asde.ui;

import com.sapient.asde.exception.EmployeeException;
import com.sapient.asde.model.Employee;

public class EmployeeApplication {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,"Naveen",5000L,"Admin");
        Employee employee2=new Employee(2,"Kalidindi",-12L,"Worker");
        try{
            Long minSal=0L;
            if(employee2.getSalary().longValue()<=(minSal.longValue())){
                throw new EmployeeException("Salary Won't be LessThan zero");
            }
        } catch (EmployeeException e) {
            e.printStackTrace();
        }
    }
}
