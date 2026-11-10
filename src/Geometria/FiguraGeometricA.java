package Geometria;

public class FiguraGeometricA {
    String color;


    public FiguraGeometricA(String color) {
        this.color = color;
    }

    public FiguraGeometricA() {
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double calcularArea(){
        return 0;
    }

    public double calcularPerimetro(){
        return 0;
    }

    public void imprimirDatos(){

        System.out.println("Color: "+this.color);
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPerimetro());
    }
}
