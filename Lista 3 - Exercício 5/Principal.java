public class Principal {

        public static void main(String[] args) {
            String palavra = "ciências da computação";
            String palavraOrdenada = Sorter.sort(palavra);
            System.out.println("String ordenada: " + palavraOrdenada);

            for (char c : palavraOrdenada.toCharArray()) {
                System.out.print(c + " ");
            }
        }
}

