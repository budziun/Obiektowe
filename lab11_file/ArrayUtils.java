public class ArrayUtils {

    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Wykroczono poza obszar tablicy");
        }
        else {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }
}