/*22/*
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
public class Employee {
    private Name name;
    private Date dob;
    private String nic;

   

    public Employee(Name name, Date dob, String nic) {
        this.name = new Name(name);
        this.dob = new Date(dob);
        this.nic = nic;
    }

    public Employee() {
         this.name = new Name();
        this.dob = new Date();
        this.nic = "00000000v";
    }

    @Override
    public String toString() {
        return "Employee: "+name; //To change body of generated methods, choose Tools | Templates.
    }
    
   public void input(){
Scanner in=new Scanner (System.in);
  System.out.println("Enter Employee Information");
   name.input();
   dob.input();
   System.out.print("NIC: ");
   nic=in.nextLine();
   } 
   public void print()
   {System.out.println("Employee details");
   System.out.println("Name :"+name);
   System.out.println("DoB :"+dob);
   System.out.println("NIC:"+nic);
   }
}
