package Services;

import Models.CalculatedSavingsAcc;

public final class SpenderCalculator {
    
    public static void spender(CalculatedSavingsAcc user){
        moneyToSave(user);
        maxFixedAmount(user);
        maxSpendable(user);
    }

    // calc money to save
    private static void moneyToSave(CalculatedSavingsAcc user){
        user.setMoneyToSave((user.getSalary() / 100) * 5);
    } 

    //calc what max fixed should be
    private static void maxFixedAmount(CalculatedSavingsAcc user){
        user.setFixedExpenses((user.getSalary() / 100 ) * 50);
    }

    // calc max to spend
    private static void maxSpendable(CalculatedSavingsAcc user){
        user.setMoneyToSpend((user.getSalary() / 100 ) * 45);
    }

}
