import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio6 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4);
        List<Integer> listaTripla = new ArrayList<>();

        for(Integer i: lista){
            listaTripla.add(i*3);
        }

        System.out.println(listaTripla);

    }
}
