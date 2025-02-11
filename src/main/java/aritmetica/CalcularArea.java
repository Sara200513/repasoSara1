package aritmetica;


public class CalcularArea {
    
    protected static void areaTriangulo(double base, double altura) {
        double areaTriangulo = (base * altura) / 2;
        final String areaFigura = "El area de la figura es: ";
        System.out.println(areaFigura + areaTriangulo);
    }

    protected static void areaCirculo(double radio) {
        double areaCirculo = Math.PI * radio * radio;
        final String areaFigura = "El area de la figura es: ";
        System.out.println(areaFigura + areaCirculo);
    }

    protected static void areaCuadrado(double lado) {
        double areaCuadrado = lado * lado;
        final String areaFigura = "El area de la figura es: ";
        System.out.println(areaFigura + areaCuadrado);
    }
    
}
