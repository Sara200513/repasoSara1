package aritmetica;


import java.util.Scanner;



public class Repaso extends CalcularArea {

    
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


}