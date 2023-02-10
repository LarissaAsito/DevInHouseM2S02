public class Exercicio5 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] arr = {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47};
//        int[] arr = {1};
//        int[] arr = {1, -1};
//        int[] arr = null;
//        int[] arr = {-2,-2,-2,-2};
//        int[] arr = {20,10, 30};
        if(arr==null || arr.length == 0){
            System.out.println("Não é possível calcular");
        } else {
            for (int item : arr) {
                if (item > max)
                    max = item;
                if (item < min)
                    min = item;
            }
            System.out.println("Valor mínimo: " + min);
            System.out.println("Valor máximo: " + max);
        }
    }
}
