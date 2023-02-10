import java.util.Arrays;
import java.util.List;

public class Exercicio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);
        for(Integer num: numeros){
            if(num>50){
                System.out.println("Primeira ocorrência de um número maior que 50: " + num);
                break;
            }
        }
    }
}
