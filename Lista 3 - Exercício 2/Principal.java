import java.util.ArrayList;
import java.util.List;

public class Principal {

        public static void main(String[] args) {
            List<String> nomes = new ArrayList<>();
            nomes.add("Guilherme");
            nomes.add("Valeska");
            nomes.add("Nathalia");
            nomes.add("Marcio");
            nomes.add("Daniel");
    
            Ordenador.insertionSort(nomes);
    
            System.out.println("\nNomes ordenados:");
            for (String nome : nomes) {
                System.out.println(nome);
            }
        }
    
}
