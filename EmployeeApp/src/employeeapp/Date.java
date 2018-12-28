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
public class Date {
    private int day;
    private int mon;
    private int year;

    public Date() {
         this.day =0;
        this.mon = 0;
        this.year =0;
    }

    public Date(int day, int mon, int year) {
        this.day = day;
        this.mon = mon;
        this.year = year;
    }
    
    public Date(Date date) {
        this.day = date.day;
        this.mon = date.mon;
        this.year = date.year;}

    @Override
    public String toString() {
       return year+"."+mon+"."+day;
    }
    public void input(){
    Scanner in=new Scanner (System.in);
    System.out.println("Enter Date");
    System.out.print("Year: ");
    year =in.nextInt(); 
    System.out.print("Month: ");
    mon =in.nextInt();    
    System.out.print("Day: ");
    day =in.nextInt();    
    }
    
    
    
}

