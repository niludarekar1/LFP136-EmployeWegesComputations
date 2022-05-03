package com.bridgelabz;

public class EmployeeWages {
    public static void main(String[] args) {

        //Welcome Message for Initial Purpose
        System.out.println("Welcome to Employee Wages Problem Developed by Nilesh Darekar.");

        //Constants
        int IS_FULL_TIME = 1;

        //Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if(empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}