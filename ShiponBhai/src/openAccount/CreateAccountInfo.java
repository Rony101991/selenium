package openAccount;

public class CreateAccountInfo {

    public String bankAccountName;// String x="sk";
    public String bankAccountNumber;
    public double bankAmount;




    public CreateAccountInfo ()
    {
       this.bankAccountName="Account Name";
       this.bankAccountNumber="Account number";
       this.bankAmount=102.5;

    }
    public CreateAccountInfo(String Name, String AccNumber,double Balance)
    {
        this.bankAccountName=Name;
        this.bankAccountNumber=AccNumber;
        this.bankAmount = Balance;
    }


    public void withdraw(double withdrawAmount )
    {
        double currentBalance= this.bankAmount-withdrawAmount;
        System.out.println("withdrawAmount"+withdrawAmount);
        System.out.println("currentBalance"+withdrawAmount);
    }
    public void deposit(double depositAmount)
    {
        double currentBalance = this.bankAmount+depositAmount;
        System.out.println("depositAmount"+depositAmount);
        System.out.println("currentBalance"+depositAmount);
    }
    public void printInfo()
    {
        System.out.println("Name: "+ this.bankAccountName);
        System.out.println("Account Number: "+this.bankAccountNumber);
        System.out.println("Current Balance: "+this.bankAmount);
    }

}
