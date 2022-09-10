package com.Try;

public class Employee {private double amount;
    private int hoursWorked;
    private double salary;

    public Employee(double amount, int hoursWorked) {
        this.amount = amount;
        this.hoursWorked = hoursWorked;
    }

    public void getInfo(double salary, double hoursWorked) {
        salary = this.finalSalary();
        hoursWorked = (double)this.hoursWorked;
        System.out.println("The employee worked for " + hoursWorked + "and was paid " + salary);
    }

    public double calcSalary() {
        return this.salary = this.amount * (double)this.hoursWorked;
    }

    public double AddSal() {
        double newSal = 0.0D;
        if (this.calcSalary() < 500.0D) {
            newSal = this.calcSalary() + 10.0D;
        } else {
            newSal = this.calcSalary();
        }

        return newSal;
    }

    public double AddWork() {
        double newSal = 0.0D;
        if (this.hoursWorked > 6) {
            newSal = this.AddSal() + 5.0D;
        } else {
            newSal = this.AddSal();
        }

        return newSal;
    }

    public double finalSalary() {
        return this.AddWork();
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public double getSalary() {
        return this.salary;
    }
}



