package Services;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


import Models.CalculatedSavingsAcc;

public final class SavingsCalculator {

    private static ArrayList<Integer> YearsToCount = new ArrayList<>(Arrays.asList(5,10,15));

    public static void completeCalculation(CalculatedSavingsAcc user){

        if(user.getYearsToSave() != 0){
            YearsToCount.add(user.getYearsToSave());
        };

        normalAccount(user);
        accountWithInterest(user);
        savingsOnStockMarket(user);

        if(YearsToCount.size() == 4){
            YearsToCount.remove(4);
        }

    }
    
    // calc how much on normal bank account
    private static void normalAccount(CalculatedSavingsAcc user){

        HashMap<Integer, Integer> savings = new HashMap<>();
        for(int i = 0; i < YearsToCount.size(); i++){
            savings.put(YearsToCount.get(i), (YearsToCount.get(i) * user.getMoneyToSave()));
        }

        user.setSimpleBankAccount(savings);
        
    }

    // calc amount on account with interest
    // NOT WORKING MATH -------------------------!!!!!!!!!!!!!!!!!!!!!---------------------
    private static void accountWithInterest(CalculatedSavingsAcc user){

        
        HashMap<Integer, Double> savings = new HashMap<>();
        for(int i = 0; i < YearsToCount.size(); i++){
            //räkna ut ränta på ränta
            
            double savedWithInterest = Math.pow((user.getMoneyToSave() * 12) * (1 + 0.0025), YearsToCount.get(i));
            

            savings.put(YearsToCount.get(i), savedWithInterest);
        }

        user.setBankWithInterest(savings);
    }

    // calc amount on stockmarket
    private static void savingsOnStockMarket(CalculatedSavingsAcc user){

        HashMap<Integer, Double> savings = new HashMap<>();
        for(int i = 0; i < YearsToCount.size(); i++){

            double savedWithInterest = Math.pow((user.getMoneyToSave() * 12) * (1 + 0.8), YearsToCount.get(i));

            savings.put(YearsToCount.get(i), savedWithInterest);
        }

        user.setOnStockMarket(savings);
    }

}
