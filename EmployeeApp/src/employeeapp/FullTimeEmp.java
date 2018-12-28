/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FullTimeEmp extends Employee {

    private float salary;

    public FullTimeEmp() {
        super();
        this.salary = 0;
    }

    public FullTimeEmp(float salary, Name name, Date dob, String nic) {
        super(name, dob, nic);
        this.salary = salary;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Full Time Employee");
        //get employee input
        super.input();
        System.out.println("Salary ");
        salary = in.nextFloat();
    }

    public void print() {
        System.out.println("Full Time Employee");
        super.print();
        System.out.println("Salary" + salary);
    }

    @Override
    public String toString() {
        return "Full Time Employee";
    }

}
