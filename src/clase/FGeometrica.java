package clase;

import java.util.Scanner;

public class FGeometrica {
    protected double ladoA;
    protected double ladoB;
    protected double ladoC;
    protected double area;

    public void pedirDatos(){
        Scanner RC = new Scanner(System.in);

        System.out.println("Ingrese lado A: ");
        ladoA =  RC.nextDouble();
        System.out.println("Ingrese lado B: ");
        ladoB = RC.nextDouble();
        System.out.println("Ingrese lado C: ");
        ladoC = RC.nextDouble();
    }

    public void mostrarArea(){
        System.out.println("El area solicitada es: "+area);

    }

}