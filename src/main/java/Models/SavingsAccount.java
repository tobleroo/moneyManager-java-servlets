package Models;

public class SavingsAccount {

    private int salary, 
        moneyToSave, 
        yearsToSave, 
        fixedExpenses,
        moneyToSpend;
    

    public SavingsAccount(int salary, int moneyToSave, int yearsToSave, int fixedExpenses) {
        this.salary = salary;
        this.moneyToSave = moneyToSave;
        this.yearsToSave = yearsToSave;
        this.fixedExpenses = fixedExpenses;
        this.moneyToSpend = salary - moneyToSave;
    }

    public SavingsAccount(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getMoneyToSave() {
        return moneyToSave;
    }

    public void setMoneyToSave(int moneyToSave) {
        this.moneyToSave = moneyToSave;
    }

    public int getYearsToSave() {
        return yearsToSave;
    }

    public void setYearsToSave(int yearsToSave) {
        this.yearsToSave = yearsToSave;
    }

    public int getFixedExpenses() {
        return fixedExpenses;
    }

    public void setFixedExpenses(int fixedExpenses) {
        this.fixedExpenses = fixedExpenses;
    }

    public int getMoneyToSpend() {
        return moneyToSpend;
    }

    public void setMoneyToSpend(int moneyToSpend) {
        this.moneyToSpend = moneyToSpend;
    }

    @Override
    public String toString() {
        return "SavingsAccount [salary=" + salary + ", moneyToSave=" + moneyToSave + ", yearsToSave=" + yearsToSave
                + ", fixedExpenses=" + fixedExpenses + ", moneyToSpend=" + moneyToSpend + "]";
    }

    

    
    

    
}
