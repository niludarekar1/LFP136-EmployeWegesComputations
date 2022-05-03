package com.bridgelabz;

public class EmployeeWages {
    public static void main(String[] args) {

        //Welcome Message for Initial Purpose
        System.out.println("Welcome to Employee Wages Problem Developed by Nilesh Darekar.");

        //Constants
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int WAGE_PER_HOUR = 20;

        //Variable for Calculating Employee Wage
        int empWage = 0;
        int empHrs = 0;

        //Computation
        double empCheck = Math.floor(Math.random() * 10) % 3;

        if(empCheck == IS_PART_TIME) {
            System.out.println("Employee is Present as PART TIME");
            empHrs = 4;
        } else if(empCheck == IS_FULL_TIME){
            System.out.println("Employee is Present as FULL TIME");
            empHrs = 8;
        } else {
            System.out.println("Employee is Absent");
            empHrs = 0;
        }

        empWage = WAGE_PER_HOUR * empHrs ;   // Calculating Employee Wage if Employee is Present as PART TIME Or FULL TIME
        System.out.println("Employee Wage = " + empWage);
    }
}