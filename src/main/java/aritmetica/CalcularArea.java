package aritmetica;
/**
 * Clase CalcularArea
 * 
 * Proporciona métodos para calcular el área de diferentes figuras geométricas.
 * 
 * @author Sara Lorenzo
 * @version 1.0
 * @since 2024-02-11
 */
public class CalcularArea {
    
     /**
     * Calcula y muestra el área de un triángulo.
     * 
     * @param base   La base del triángulo en unidades de longitud.
     * @param altura La altura del triángulo en unidades de longitud.
     */
    
    protected static void areaTriangulo(double base, double altura) {
        double areaTriangulo = (base * altura) / 2;
        final String areaFigura = "El area de la figura es: ";
        System.out.println(areaFigura + areaTriangulo);
    }
    
    /**
     * Calcula y muestra el área de un círculo.
     * 
     * @param radio El radio del círculo en unidades de longitud.
     */

    protected static void areaCirculo(double radio) {
        double areaCirculo = Math.PI * radio * radio;
        final String areaFigura = "El area de la figura es: ";
        System.out.println(areaFigura + areaCirculo);
    }
    
    /**
     * Calcula y muestra el área de un cuadrado.
     * 
     * @param lado La longitud de un lado del cuadrado en unidades de longitud.
     */

    protected static void areaCuadrado(double lado) {
        double areaCuadrado = lado * lado;
        final String areaFigura = "El area de la figura es: ";
        System.out.println(areaFigura + areaCuadrado);
    }
    
}
