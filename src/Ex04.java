import java.util.Arrays;

public class Ex04 {

    public static void main(String[] args) {
        String[] array = {"soccer", "badminton", "basketball", "surfing", "sailing", "swimming", "dats", "golfing"};

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length - i; i1++) {
                String i2 = array[i1];
                String i3 = array[i1 + 1];

                if (i2.compareTo(i3) > 0) {
                    array[i1] = i3;
                    array[i1 + 1] = i2;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

}
