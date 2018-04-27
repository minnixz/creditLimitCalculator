public class Customer{
    
    private int accountNumber = 0;
    private double beginningBalance = 0;
    private double totalCharged = 0;
    private double totalCredits = 0;
    private int creditLimit = 0;
    
    
    
    public Customer(int accountNumber, double beginningBalance,int creditLimit){
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.totalCharged = totalCharged;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
        
        
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public double getBeginningBalance(){
        return beginningBalance;
    }
    public double getTotalCharged(){
        return totalCharged;
    }
    public double getTotalCredits(){
        return totalCredits;
    }
    public int getCreditLimit(){
        return creditLimit;
    }
    public double getEndingBalance(){
        return beginningBalance - totalCharged + totalCredits;
        
    }
    
    public void addCharge(double charge){
        
        totalCharged += charge;
    }
    public void addCredit(int credit){
        totalCredits += credit;
    }
    
    public boolean overCreditLimit(){
        
        return getEndingBalance() > creditLimit;
    }
    
}