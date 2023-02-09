public class Exercicio2 {
    public static void main(String[] args) {
        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };
        float soma;
        System.out.println("Primeiro elemento do terceiro array " + notas[2][0]);
        System.out.println("Segundo elemento do quarto array " + notas[3][1]);
        for(int i = 0; i < notas.length; i++){
            soma = 0;
            for(int j = 0; j < notas[i].length; j++){
                soma += notas[i][j];
            }
            System.out.printf("Soma da linha %d é: %.2f \n", (i+1), soma);
        }
    }
}
