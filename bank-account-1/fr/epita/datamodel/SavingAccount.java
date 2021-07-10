package fr.epita.datamodel;

public class SavingAccount extends Account {
    double interestRate;

    public SavingAccount(double initialInterestRate, double initialBalance){
        super(initialBalance);
        balance = initialBalance;
        interestRate = initialInterestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public double computeInterest(){
        return interestRate * balance;
    }

    public void withDraw(int cash){
        balance = balance - cash;
    }

}
