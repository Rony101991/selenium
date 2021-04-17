package mentoring3;

public class NewEncapsulation {
 public int sSN;
 public int bankAccount;

    public int getsSN() {

        return sSN;
    }

    public void setsSN(int sSN) {
        this.sSN = sSN;
        System.out.println(sSN);
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
        System.out.println(bankAccount);}

    public static void main(String[] args) {
        NewEncapsulation x= new NewEncapsulation();
        x.setsSN(8457);
        System.out.println("...............");
        x.setBankAccount(5487);
        x.getsSN();
    }
}
