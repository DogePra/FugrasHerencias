import Geometria.FiguraGeometricA;

public class Rectangulo extends FiguraGeometricA {


    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura){
        super(color);
        this.base=base;
        this.altura=altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {

        this.base = base;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return base+base+altura+altura;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Base del rectangulo: "+base);
        System.out.println("Altura del rectangulo: "+altura);
        super.imprimirDatos();
    }
}
