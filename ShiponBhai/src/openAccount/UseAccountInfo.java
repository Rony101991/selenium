package openAccount;

public class UseAccountInfo {
    public static void main(String[] args) {
        CreateAccountInfo bluePrint= new CreateAccountInfo();
        //bluePrint.printInfo();
        CreateAccountInfo accForShipon=new CreateAccountInfo("Alimur","Acc0103",20075.2);
        /*accForShipon.bankAccountName="Shipon";
        accForShipon.bankAccountNumber="Acc0701";
        accForShipon.bankAmount=1002.5;*/
        accForShipon.printInfo();

    }



}
