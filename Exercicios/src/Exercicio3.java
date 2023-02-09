public class Exercicio3 {
    public static void main(String[] args) {
        int[] extrato = { 100, -35, -15, -5, 55, -20 };

        for(int item: extrato){
            System.out.printf("%d ", item);
        }
        System.out.println();
        for(int i = extrato.length; i > 0; i--){
            System.out.printf("%d ", extrato[i-1]);
        }
        int saldoFinal = 0;
        for(int item: extrato){
            saldoFinal += item;
        }
        System.out.println();
        System.out.println("Saldo final: " + saldoFinal);
        if (saldoFinal<0)
            System.out.println("Saldo negativo!");
        else if (saldoFinal>0)
            System.out.println("Saldo positivo!");
        else
            System.out.println("Saldo zero!");
    }
}
