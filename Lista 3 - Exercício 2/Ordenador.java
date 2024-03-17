import java.util.List;

public class Ordenador {

    public static void insertionSort(List<String> lista) {
        for (int i = 1; i < lista.size(); i++) {
            String chave = lista.get(i);
            int j = i - 1;

            while (j >= 0 && lista.get(j).compareTo(chave) > 0) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, chave);
        }
    }
    
}
