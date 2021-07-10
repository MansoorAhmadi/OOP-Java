package fr.epita.bank.datamodel;

public class SavingAccount extends Account {
    double interestRate;

    //public double computeInterest() {
    //    return interestRate * balance;
        // To compute the interestRate. We multiply it by the balance.
    //}

    public void withDraw(int moneyAmount) {
        balance = balance - moneyAmount;
        // we have access to balance because of extends Account inheritance.
        // balance is = to the current balance - moneyAmount.
    }

    //creating a constructor in order to initialize the balance and interest rate.
    //now to initialize, we cannot have any empty instance of SavingAccount class
    //unless we declare it explicitly
    //**
    // @Const*/
    public SavingAccount(double initialBalance, double initialInterestRate) {
        //with super we are calling the constructor of account class containing balance.
        super(initialBalance); //it connects to the account class and the parameter of SavingAccount constructor.
        interestRate = initialInterestRate;
    }

    //**
    // This is an empty instance of SavingAccount class - after the constructor to fix the error*/
    // public SavingAccount(double interestRate) {
    //    super(0);
    //    this.interestRate = interestRate;
        //this keyword is the current instance we are considering.
    //}

    //** public double getInterestRate() {
    //   return interestRate;
    // }

    //** public void setInterestRate(double interestRate) {
    //    this.interestRate = interestRate;
    //}
}