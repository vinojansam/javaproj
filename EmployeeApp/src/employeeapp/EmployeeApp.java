/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/**
 *
 * @author User
 */
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Date d=new Date(13, 10, 1995);
       // System.out.println(""+d);
   // Name n=new Name("Vinodya","Janarangi","Samarasinghe");
   // System.out.println(""+n);
    Manager me=new Manager();
    me.input();
    me.print();
    }
}
