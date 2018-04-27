import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

//test of syncing git on amazon awz server



class main {
    public static void main(String[] args) {
        
    Customer Zach = new Customer(432, 26, 25);   
    printCustomerInfo(Zach);
    Zach.addCharge(5.21);
    printCustomerInfo(Zach);
    
    
    
}
public static void printCustomerInfo(Customer inCustomer){
    System.out.println("Account Number: "+inCustomer.getAccountNumber());
    System.out.println("Beginning Balance: "+inCustomer.getBeginningBalance());
    System.out.println("Total Charged : "+inCustomer.getTotalCharged());
    System.out.println("Credit Limit: "+inCustomer.getCreditLimit());
    System.out.println("Ending Balance: "+inCustomer.getEndingBalance());
    System.out.println("Over Credit Limit? "+inCustomer.overCreditLimit());
    System.out.println();
}
}    
