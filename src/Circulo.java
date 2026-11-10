import Geometria.FiguraGeometricA;

public class Circulo extends FiguraGeometricA {

    private double radio;




    public Circulo(String color, double radio){
        super(color);
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        System.out.println("Area circulo: ");
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Radio: "+this.radio);
        super.imprimirDatos();
    }
}
