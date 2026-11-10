import Geometria.FiguraGeometricA;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Circulo");
        Circulo c1 = new Circulo("amarillo", 3.12);
        c1.imprimirDatos();
        System.out.println("Triangulo:");
        Triangulo t1 = new Triangulo("rojo",12,21,3);
        t1.imprimirDatos();
        System.out.println("Rectangulo:");
        Rectangulo r1 = new Rectangulo("verdeluco",12,43);
        r1.imprimirDatos();

        Scanner sc =new Scanner(System.in);



        int opcion;
        do {
            System.out.println("Ingrese de que figura quiere saber sus componentes :)");
            System.out.println("1. Circulo");
            System.out.println("2. Triangulo");
            System.out.println("3. Rectangulo");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    double radio;
                    String color;
                    System.out.println("Ingrese el radio del circulo");
                    radio = sc.nextDouble();
                    c1.setRadio(radio);
                    System.out.println("Ingrese el color");
                    color = sc.nextLine();
                    c1.setColor(color);
                    c1.imprimirDatos();
                    break;
                case 2:
                    double l1;
                    double l2;
                    double l3;
                    String color2;
                    System.out.println("Ingrese el lado 1 del triangulo");
                    l1 = sc.nextDouble();
                    t1.setLadoA(l1);
                    System.out.println("Ingrese el lado 2 del triangulo");
                    l2 = sc.nextDouble();
                    t1.setLadoB(l2);
                    System.out.println("Ingrese el lado 3 del triangulo");
                    l3 = sc.nextDouble();
                    t1.setLadoC(l3);
                    System.out.println("Ingrese el color");
                    color2 = sc.nextLine();
                    t1.setColor(color2);
                    t1.imprimirDatos();
                    break;
                case 3:
                    double base;
                    double altura;
                    String color1;
                    System.out.println("Ingrese la base");
                    base = sc.nextDouble();
                    r1.setBase(base);
                    System.out.println("Ingrese la altura");
                    altura = sc.nextDouble();
                    r1.setAltura(altura);
                    System.out.println("Ingrese el color");
                    color1 = sc.next();
                    r1.setColor(color1);
                    r1.imprimirDatos();
                    break;
                case 0:
                    System.out.println("Gracias por usar...");
                    break;
                default:
                    System.out.println("Ingresa bien mamaverga");


            }
        }while (opcion !=0);



    }
}