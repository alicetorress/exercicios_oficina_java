package application;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do terreno em metros: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do terreno em metros: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite o preço por metro quadrado do terreno: ");
        double precoPorMetroQuadrado = scanner.nextDouble();

        Area area = new Area();

        double areaTerreno = area.calcularArea(largura, comprimento);

        double precoTerreno = area.calcularPreco(areaTerreno, precoPorMetroQuadrado);

        System.out.printf("Área do terreno: %.2f metros quadrados\n", areaTerreno);
        System.out.printf("Preço do terreno: R$%.2f\n", precoTerreno);

        scanner.close();
    }

    public double calcularArea(double largura, double comprimento) {
        return largura * comprimento;
    }

    public double calcularPreco(double area, double precoPorMetroQuadrado) {
        return area * precoPorMetroQuadrado;
    }
}
