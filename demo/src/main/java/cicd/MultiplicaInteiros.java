package cicd;

public class MultiplicaInteiros {

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        MultiplicaInteiros multiplicaInteiros = new MultiplicaInteiros();
        int resultado = multiplicaInteiros.multiplicar(num1, num2);

        System.out.println("A multiplicacao de " + num1 + " e " + num2 + " é: " + resultado);
    }
}
