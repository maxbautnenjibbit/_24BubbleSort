import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args) {
        int[] array = {8, 12, 34, 173, 890, 128, 19, 2048, 0, 11};

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length - i; i1++) {
                int i2 = array[i1];
                int i3 = array[i1 + 1];

                if (i2 < i3) {
                    array[i1] = i3;
                    array[i1 + 1] = i2;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

}
