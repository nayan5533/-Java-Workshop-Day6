/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.savingsaccounttest;

/**
 *
 * @author nayan
 */
class SavingsAccount {
    public static double annualInterestRate;
    private double savingsBalance;
    
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }
    
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
    
    public double getSavingsBalance() {
        return savingsBalance;
    }
}
public class SavingsAccountTest {

    public static void main(String[] args) {
        
        // instantive 2 two savings A/c
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        
        // annual interest rate 4%
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Annual Interest Rate: " + SavingsAccount.annualInterestRate);
        
        //calculate monthly intrest 
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1's New Balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver2's New Balance: $" + saver2.getSavingsBalance());
        
        //now 5%
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("\nAnnual Interst Rate: " + SavingsAccount.annualInterestRate);
        
        //now calculate & print
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1's New Balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver2's New Balance: $" + saver2.getSavingsBalance());
    }
}
