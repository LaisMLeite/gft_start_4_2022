package desafio2;

public class Quadrado implements calculosGerais{
    private double L;

    public double getL() {
        return L;
    }

    public void setL(double l) {
        L = l;
    }

    @Override
    public double calculoDeArea() {

        double A = Math.pow(L, 2);

        return A;
    }

}
