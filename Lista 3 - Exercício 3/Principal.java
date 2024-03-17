import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        String palavra = "faculdade";
        String palavraOrdenada = PalavraOrdenada.ordenarString(palavra);
        System.out.println("String ordenada: " + palavraOrdenada);

          // Imprimindo as palavras separadamente
          System.out.println("\nPalavras separadas:");
          for (char c : palavraOrdenada.toCharArray()) {
              System.out.println(c);
          }
    }

}
