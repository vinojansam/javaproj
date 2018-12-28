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
public class Manager extends FullTimeEmp {

    private String car;
    private String phone;

    public Manager(String car, String phone, float salary, Name name, Date dob, String nic) {
        super(salary, name, dob, nic);
        this.car = car;
        this.phone = phone;
    }

    public Manager() {
        super();
        this.car = "";
        this.phone = "";
    }

    @Override
    public String toString() {
        return "Manager";
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Manager");
        //get employee input
        super.input();
        System.out.println("Car Number:");
        car = in.nextLine();
        System.out.println("Phone Number:");
        phone = in.nextLine();
    }

    public void print() {
        System.out.println("Manager");
        super.print();
        System.out.println("Car :" + car);
        System.out.println("Phone :" + phone);
    }
}
