import java.util.Arrays;
import java.util.List;

public class Exercicio7 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");
        System.out.println("Percorrendo com for com índices:");
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        System.out.println("Percorrendo com foreach");
        for(String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("Percorrendo com while");
        int j=0;
        while(j<nomes.size()){
            System.out.println(nomes.get(j));
            j++;
        }
    }
}
