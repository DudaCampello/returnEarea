package one.digitalinnovatio.basecamp;

public class Main {
    public static void main(String[] args) {
       //retorno
        System.out.println("Exercicios Retorno / Quadrilatero");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Area do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Area do Trapezio: " + areaTrapezio);

    }
}
