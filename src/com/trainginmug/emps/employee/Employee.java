package com.trainginmug.emps.employee;

public class Employee extends Department{

    int id;
    String name;

    Payroll payroll;
    ProcessSalary processSalary;

    public Employee(){ //can't be accessible if Department() is private
    }

    public Employee(int id, String name) { //can't be accessible if Department() is private
        this.id = id;
        this.name = name;
    }

    void employeeDetails(){
        System.out.println("Department id : " + super.id);
        //System.out.println("Department Name : " + super.name); can't access since it is a private property
        System.out.println("Department Manager Name : " + managerName);
        super.departmentDetails();
    }
}
