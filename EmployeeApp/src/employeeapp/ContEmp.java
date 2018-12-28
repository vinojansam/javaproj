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
public class ContEmp extends Employee {
 private float hrate;
 private int nh;

    public ContEmp() {
        super();
        this.hrate = hrate;
        this.nh = 0;
    }

    public ContEmp(float hrate, int nh, Name name, Date dob, String nic) {
        super(name, dob, nic);
        this.hrate = hrate;
        this.nh = nh;
    }
 
  public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Contract Employee");
        //get employee input
        super.input();
        System.out.println("H Rate ");
        hrate= in.nextFloat();
        System.out.println("Total hours ");
        nh= in.nextInt();
    }
public void print() {
        System.out.println("Contract Employee");
        super.print();
        System.out.println("H rate" + hrate);
        System.out.println("Number of hours"+nh);

    }

    @Override
    public String toString() {
        return "Contractor";
    }

 
}
