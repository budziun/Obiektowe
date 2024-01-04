import java.lang.reflect.Array;
import java.util.Arrays;
public class Tablica {
    public static <T extends Comparable<T>> T maxValue(T[] array){
        if(array == null || array.length==0){
            throw new IllegalArgumentException("Tablica jest pusta");
        }
        Arrays.sort(array);
        return array[array.length-1];
    }
}
