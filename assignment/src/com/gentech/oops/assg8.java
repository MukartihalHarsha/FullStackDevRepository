package com.gentech.oops;

public class BankAccount 
{
    private String accountNumber;
    private String holderName;

    public BankAccount(String accountNumber, String holderName)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getHolderName()
    {
        return holderName;
    }

    public void setHolderName(String holderName) 
    {
        this.holderName = holderName;
    }

    public void displayAccountInfo()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
    }
}

public class assg8
{
    public static void main(String[] args) 
    {
     
       BankAccount account = new BankAccount("1234567890", "John");

       System.out.println("Initial Account Info:");
       account.displayAccountInfo();

       account.setAccountNumber("0987654321");
       account.setHolderName("Jane");

       System.out.println("Updated Account Info:");
       account.displayAccountInfo();
   }
}


