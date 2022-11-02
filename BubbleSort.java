import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

    public static void countSwaps(List<Integer> a) {
        Integer[] array = a.toArray(new Integer[0]);
        int numSwaps = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    numSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in "+numSwaps+" swaps.");
        System.out.println("First Element: "+ array[0]);
        System.out.println("Last Element: "+ array[a.size()-1]);

    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0;i < n; i++){
            a.add(scanner.nextInt());
        }
        countSwaps(a);
    }


}
