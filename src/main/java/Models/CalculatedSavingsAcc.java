package Models;

import java.util.HashMap;

public class CalculatedSavingsAcc extends SavingsAccount{

    private HashMap<Integer, Integer> simpleBankAccount = new HashMap<>();
    private HashMap<Integer, Double> bankWithInterest = new HashMap<>();
    private HashMap<Integer, Double> onStockMarket = new HashMap<>();
    
    public CalculatedSavingsAcc(int salary, int moneyToSave, int yearsToSave, int fixedExpenses) {
        super(salary, moneyToSave, yearsToSave, fixedExpenses);
    }
    public CalculatedSavingsAcc(int salary) {
        super(salary);
    }
   
    public HashMap<Integer, Integer> getSimpleBankAccount() {
        return simpleBankAccount;
    }
    public void setSimpleBankAccount(HashMap<Integer, Integer> doubleankAccount) {
        simpleBankAccount = doubleankAccount;
    }
    public HashMap<Integer, Double> getBankWithInterest() {
        return bankWithInterest;
    }

    public void setBankWithInterest(HashMap<Integer, Double> doubleountWithInterest) {
        bankWithInterest = doubleountWithInterest;
    }

    public HashMap<Integer, Double> getOnStockMarket() {
        return onStockMarket;
    }

    public void setOnStockMarket(HashMap<Integer, Double> doubleMarket) {
        onStockMarket = doubleMarket;
    }


    public void deleteAddedYearToCount(){
        this.simpleBankAccount.clear();
        this.bankWithInterest.clear();
        this.onStockMarket.clear();
    }

}
