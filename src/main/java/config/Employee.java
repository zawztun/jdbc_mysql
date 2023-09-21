package config;

import java.util.Scanner;

public class Employee implements Emp_interface {
    private Scanner sc = new Scanner(System.in);
    String name;
    int id;
    int age;
    float salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public float getSalary() {
        return salary;
    }

    public void askEmpInfo() {
        System.out.println("Employee Name: ");
        this.name = sc.next();
        System.out.println("Employee Id: ");
        this.id = sc.nextInt();
        System.out.println("Employee age: ");
        this.age = sc.nextInt();
        System.out.println("Employee Salary: ");
        this.salary = sc.nextFloat();
    }
    public int updateEmpInfo() {
        System.out.println("Enter update emp id: ");
        int updateID = sc.nextInt();
        askEmpInfo();
        return updateID;
    }

    public int deleteEmpInfo() {
        System.out.println("Enter Delete emp id: ");
        int id= sc.nextInt();
        return id;
    }


}
