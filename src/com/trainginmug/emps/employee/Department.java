package com.trainginmug.emps.employee;

public class Department{

    //For Members we can use any access specifier

    public int id;
    private String name; //Private member can be accessible only with in the same class
    String managerName;

    public Department() {
    }

    public Department(int id, String name, String managerName) {
        this.id = id;
        this.name = name;
        this.managerName = managerName;
    }

    public void departmentDetails(){
        System.out.println("Department id : " + id);
        System.out.println("Department Name : " + name);
        System.out.println("Department Manager : " + managerName);
    }

}
