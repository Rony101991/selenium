package differentTypeOfOverloading;

public class PracticeEncapsulation {
    private int sSN;
    private int cVV;

    public int getsSN() {
        return sSN;
    }

    public void setsSN(int sSN) {
        this.sSN = sSN;
        System.out.println(sSN);
    }

    public int getcVV() {
        return cVV;
    }

    public void setcVV(int cVV) {
        this.cVV = cVV;
        System.out.println(cVV);
    }

    public static void main(String[] args) {
        PracticeEncapsulation w= new PracticeEncapsulation();
        w.setcVV(22222);
        //System.out.println(w.cVV);
        w.setsSN(33333);
        //System.out.println(w.sSN);
    }
}
