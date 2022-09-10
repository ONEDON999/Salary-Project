package com.Try;

import com.onedon.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter the amount: ");
    double amount=scanner.nextDouble();
    System.out.println("Please enter the hours worked: ");
    int hours=scanner.nextInt();
    com.onedon.Employee james = new Employee(amount, hours);
    System.out.println(james.finalSalary());
    james.getInfo(james.getSalary(), (double)james.getHoursWorked());


}


}


