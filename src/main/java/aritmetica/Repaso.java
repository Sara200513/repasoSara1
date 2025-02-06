package aritmetica;


import java.util.Scanner;



public class Repaso {

    
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("\nSeleccione una figura para calcular su area:");

        	System.out.println("1. Cuadrado");

        	System.out.println("2. Circulo");

        	System.out.println("3. Triangulo");

        	System.out.print("Elige una opcion: ");


            
    int opcion = scanner.nextInt();


            
    switch (opcion) {

            		case 1:	System.out.print("Introduce el lado del cuadrado: ");

                		double lado = scanner.nextDouble();
	
                		areaCuadrado(lado);

                		break;
 
           		case 2:	System.out.print("Introduce el radio del circulo: ");

                		double radio = scanner.nextDouble();

                		areaCirculo(radio);

                		break;
            
			case 3:	System.out.print("Introduce la base del triangulo: ");

                		double base = scanner.nextDouble();

                		System.out.print("Introduce la altura del triangulo: ");

                		double altura = scanner.nextDouble();

                		areaTriangulo(base, altura);

                		break;

            		default:
                                   System.out.println("Opcion no valida. Intentalo de nuevo.");

        	}

    	}

    private static void areaTriangulo(double base, double altura) {
        double areaTriangulo = (base * altura) / 2;
        final String areaFigura = "El area de la figura es: ";
        
        System.out.println(areaFigura + areaTriangulo);
    }

    private static void areaCirculo(double radio) {
        double areaCirculo = Math.PI * radio * radio;
        final String areaFigura = "El area de la figura es: ";
        
        System.out.println(areaFigura + areaCirculo);
    }

    private static void areaCuadrado(double lado) {
        double areaCuadrado = lado * lado;
        final String areaFigura = "El area de la figura es: ";
        System.out.println(areaFigura + areaCuadrado);
    }

}