import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> sayilar = Arrays.asList(8, 3, 9, 7, 2);
        int s =0;
        for(int i=0; i<sayilar.size(); i++){
            s = s + sayilar.get(i);
        }

    }
}