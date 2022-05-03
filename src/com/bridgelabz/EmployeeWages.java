package com.bridgelabz;

public class EmployeeWages {
    public static void main(String[] args) {

        //Welcome Message for Initial Purpose
        System.out.println("Welcome to Employee Wages Problem Developed by Nilesh Darekar.");

        //Constants
        int IS_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;

        //Variable for Calculating Employee Wage
        int empWage = 0;

        //Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if(empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            empWage = WAGE_PER_HOUR * FULL_DAY_HOUR ;   // Calculating Employee Wage if Employee is Present
            System.out.println("Employee Wage = " + empWage);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}