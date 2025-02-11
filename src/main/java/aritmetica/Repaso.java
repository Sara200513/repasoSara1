package aritmetica;


import java.util.Scanner;

/**
 * Clase Repaso
 * 
 * Esta clase imprime un menú en el cual el usuario debe escoger qué área desea calcular.
 * Luego, solicita los valores necesarios y llama a los métodos de la clase CalcularArea
 * para realizar los cálculos.
 * 
 * @see <a href= "https://www.bing.com/ck/a?!&&p=df9ad58a5e78e8d01d00e291f22e1f76e70201f5a0c6b065242c1b2daa9ef841JmltdHM9MTczOTIzMjAwMA&ptn=3&ver=2&hsh=4&fclid=2ad5264d-488b-6d8e-1933-333949236c02&u=a1L3ZpZGVvcy9yaXZlcnZpZXcvcmVsYXRlZHZpZGVvP3E9dmlkZW8rZGUreW91dGliZStxdWUrZXhwbGlxdWUrY29tbytjYWxjdWxhcithcmVhcyZtaWQ9RjQ4MzA1NUJBNEI5QzM0RkNDQTFGNDgzMDU1QkE0QjlDMzRGQ0NBMSZGT1JNPVZJUkU&ntb=1"></a>
 * @author Sara Lorenzo
 * @version 1.0
 * @since 2024-02-11
 */


public class Repaso extends CalcularArea {
    
    /**
     * Método principal que ejecuta el menú y permite al usuario seleccionar una figura
     * para calcular su área.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */

    
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