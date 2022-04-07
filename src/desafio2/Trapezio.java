package desafio2;

public class Trapezio implements calculosGerais{

 private double B;
 private double b;
 private double h;

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculoDeArea(){

        double A = ((B + b) * h)/2;

        return A;
    }
}
