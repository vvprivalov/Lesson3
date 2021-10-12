public class MainClass {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6};

        System.out.println(searchMissingNumber1(array));
    }

    private static int searchMissingNumber1(int[] array) {
        if (array.length == 1) {
            return 0;
        } else if (array.length == 0) {
            return 1;
        }
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) >= array.length) {
                return -1;
            }
            if (array[i + 1] - array[i] > 1) {
                return array[i] + 1;
            }
        }
        return -1;
    }
}
