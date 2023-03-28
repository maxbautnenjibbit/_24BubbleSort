import java.util.Arrays;

public class Ex06 {

    public static void main(String[] args) {
        int[] array = {8, 12, 34, 173, 890, 128, 19, 2048, 0, 11};

        System.out.println(Arrays.toString(array));

        boolean isSorted = false;
        int lastUnsorted = array.length - 1;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < lastUnsorted; i++) {

                if (array[i] > array[i + 1]) {
                    int temp = array[i];

                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    isSorted = false;
                }
            }

            lastUnsorted--;
        }

        System.out.println(Arrays.toString(array));
    }

}
