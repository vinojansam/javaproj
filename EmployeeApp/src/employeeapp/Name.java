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
public class Name {
  private double fn;
private String mn;
private String ln;

    public Name() {
         this.fn =0 ;
        this.mn = "";
        this.ln = "";
    }

    public Name(double fn, String mn, String ln) {
        this.fn = fn;
        this.mn = mn;
        this.ln = ln;
    }
    
    public Name(Name n) {
        this.fn = n.fn;
        this.mn = n.mn;
        this.ln = n.ln;
    }

    @Override
    public String toString() {
        return fn+" "+mn+" "+ln;
    }
public void input(){
Scanner in=new Scanner (System.in);
    System.out.println("Enter Name");
    System.out.print("First: ");
    fn=in.nextDouble();
    System.out.print("Middle: ");
    mn =in.nextLine();    
    System.out.print("Last: ");
    ln =in.nextLine();    


}

}
