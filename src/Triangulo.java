import Geometria.FiguraGeometricA;

public class Triangulo extends FiguraGeometricA {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(String color, double ladoA, double ladoB, double ladoC) {
        super(color);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        double s = (ladoA+ladoB+ladoC)/2;
        return Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
    }

    @Override
    public double calcularPerimetro() {
        return ladoC+ladoB+ladoA;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Lados del triamgulo:");
        System.out.println("Lado1: "+ladoA);
        System.out.println("Lado2: "+ladoB);
        System.out.println("Lado3: "+ladoC);
        super.imprimirDatos();
    }
}
