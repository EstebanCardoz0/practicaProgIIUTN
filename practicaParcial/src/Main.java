public class Main {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        invertir(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }


    }

    public static void invertir(int[] arr,
                                int inicio,
                                int fin) {
        if (inicio < fin) {
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            invertir(arr, inicio + 1, fin - 1);
        }
    }
}