
import java.util.Arrays;
import java.util.Random;


public class Hw1 {

    public static void main(String[] args) {
       
        // Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(0,2000);
        System.out.println(String.format("Случайно число = %s", i));

     
        // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int task2 = i;
        int n = 0;
        for (int j = 0; task2 > 0; j++){
            task2 >>= 1;
            n = j;
        }
        System.out.println(String.format("Номер сташего бита = %s",n));


        // Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int c = 0;
        for (int j = i; j<Short.MAX_VALUE;j++) {
            if (j % n == 0) c++;

        }
        int [] m1 = new int[c];
        c=0;
        for (int j = i; j<Short.MAX_VALUE;j++) {
            if (j % n == 0) m1[c++] = j;
        }
        
      
        //  Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int d = 0;
        for (int j =Short.MIN_VALUE; j>i;j++) {
            if (j % n != 0) d++;

        }
        int [] m2 = new int[d];
        d=0;
        for (int j =Short.MIN_VALUE; j>i;j++) {
            if (j % n != 0) m2[d++] = j;
        }
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));
    
    }

}      