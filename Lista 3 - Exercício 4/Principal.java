public class Principal {

    public static void main(String[] args) {
        String[] nomes = {"Anna", "Aparecida", "Guilherme", "Maria", "Carlos"};
        
        // Ordenar os nomes pelo tamanho
        OrdenarNomes.selectionSort(nomes);
        
        // Mostrar os nomes ordenados
        System.out.println("Nomes ordenados pelo tamanho:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
