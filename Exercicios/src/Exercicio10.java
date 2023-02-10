public class Exercicio10 {
    public static void main(String[] args) {
        String stringArray = "ana";
        String[] caracteres = stringArray.split("");
        boolean ehPalindromo = true;
        for(int i = 0; i < caracteres.length/2; i++){
            if(caracteres[i].equals(caracteres[caracteres.length-(i+1)]))
                continue;
            ehPalindromo = false;
            break;
        }
        if (ehPalindromo)
            System.out.println("É palíndromo!");
        else
            System.out.println("Não é palíndromo!");
    }
}
