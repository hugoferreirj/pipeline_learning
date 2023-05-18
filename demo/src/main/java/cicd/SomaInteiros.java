package cicd;

public class SomaInteiros {

    public int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        SomaInteiros somaInteiros = new SomaInteiros();
        int resultado = somaInteiros.somar(num1, num2);

        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + resultado);
    }
}
