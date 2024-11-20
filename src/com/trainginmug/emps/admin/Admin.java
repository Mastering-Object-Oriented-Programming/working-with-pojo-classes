package com.trainginmug.emps.admin;

import com.trainginmug.emps.employee.Department;
import com.trainginmug.emps.employee.Payroll;
import com.trainginmug.emps.employee.ProcessSalary;

public class Admin {

    String name;
    String email;

    Payroll payroll;
    ProcessSalary processSalary;

    Department department;

    public Admin() {
        payroll = new Payroll();
        //department = new Department(); can't access since it is private
    }

    public Admin(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void processSalary(){
        //invoke ProcessSalary method
        System.out.println("Department id : "+department.id);
        //System.out.println("Department Name : " + department.name); can't access since it is a private property
        //System.out.println("Department Manager Name : " + department.managerName); can't access since it is defalut

        department.departmentDetails();
    }

}
