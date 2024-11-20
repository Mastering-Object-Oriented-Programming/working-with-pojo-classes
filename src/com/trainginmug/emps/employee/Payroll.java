package com.trainginmug.emps.employee;

public class Payroll {

    int empId;
    double salary;

    Department department;

    public Payroll() {
       // department = new Department(); //can't access since it is private
        department = new Department(111, "development", "Madhu Samala");
    }

    void processEmployeeSalary(){
        System.out.println("Employee Salary is processed");
        System.out.println("Department id : " + department.id);
        //System.out.println("Department Name : " + department.name); can't access since it is a private property
        System.out.println("Department Manager Name : " + department.managerName);
        department.departmentDetails();
    }
}
