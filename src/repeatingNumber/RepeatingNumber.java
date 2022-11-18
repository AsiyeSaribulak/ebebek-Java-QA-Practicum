package repeatingNumber;

public class RepeatingNumber {


    public static void main(String[] args) {

        int[] list = {5, 8, 4, 5, 2, 9, 10, 28, 1, 23, 5, 1, 11, 23};//dizi oluştur
        int[] listCopy = new int[list.length];//yukardaki list dizisi uzunluğunda bir dizi oluştur
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            if ((list[i] % 2 == 0)) {
                if (!isFind(listCopy, list[i])) {
                    listCopy[startIndex++] = list[i];
                }
            }
        }
        for (int value : listCopy) {
            if (value != 0) {
                System.out.println(value);
            }
        }

    }
    public static boolean isFind(int[] arr, int value) {//elemanın dizide olup olmadığını kontrol etmek için oluşturulan fonk.
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}

