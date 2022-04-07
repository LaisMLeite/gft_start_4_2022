package desafio2;

public class Main {
    public static void main(String[] args) {

        Triangulo t1 = new Triangulo();
        t1.setB(5);
        t1.setH(6);
        System.out.println("Área do triângulo: " + t1.calculoDeArea());

        Retangulo r1 = new Retangulo();
        r1.setB(10);
        r1.setH(5);
        System.out.println("Área do retângulo: " + r1.calculoDeArea());

        Trapezio tr1 = new Trapezio();
        tr1.setB(10);
        tr1.setB(5);
        tr1.setH(5);
        System.out.println("Área do trapézio: " + tr1.calculoDeArea());

        Quadrado q1 = new Quadrado();
        q1.setL(3);
        System.out.println("Área do trapézio: " + q1.calculoDeArea());

    }





}
