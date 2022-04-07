package desafio2;

public class Triangulo implements calculosGerais{
    private double b;
    private double h;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculoDeArea(){

        double A = (b*h)/2;

        return A;
    }
}
