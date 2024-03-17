public class Sorter {

    public static String sort(String palavra) {
        char[] chars = palavra.toCharArray();
        sort(chars, '\0', (char) (chars.length - 1));
        return new String(chars);
    }

    private static void sort(char[] arr, char inicio, char fim) {
        if (inicio < fim) {
            char indiceParticao = partition(arr, inicio, fim);
            sort(arr, inicio, (char) (indiceParticao - 1));
            sort(arr, (char) (indiceParticao + 1), fim);
        }
    }

    private static char partition(char[] arr, char inicio, char fim) {
        char pivot = arr[fim];
        char indiceMenor = (char) (inicio - 1);
        for (char j = inicio; j < fim; j++) {
            if (arr[j] <= pivot) {
                indiceMenor++;
                char temp = arr[indiceMenor];
                arr[indiceMenor] = arr[j];
                arr[j] = temp;
            }
        }
        char temp = arr[indiceMenor + 1];
        arr[indiceMenor + 1] = arr[fim];
        arr[fim] = temp;
        return (char) (indiceMenor + 1);
    }
    
}
