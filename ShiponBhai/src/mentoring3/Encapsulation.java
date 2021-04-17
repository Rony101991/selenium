package mentoring3;

public class Encapsulation {

    private int sSN;

    public int getsSN() {
        return sSN;
    }

    public void setsSN(int sSN) {
        this.sSN = sSN;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    private int bankAccount;

    public static void main(String[] args) {
        Encapsulation x=new Encapsulation();
        //x.getsSN();
        x.setsSN(54547);
        System.out.println(x.sSN);
        x.setBankAccount(3213);
        System.out.println(x.bankAccount);

    }
}
