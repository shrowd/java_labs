import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[] tab = new int[10];
        Random rnd = new Random();
        for(int i = 0; i < tab.length; i++){
            tab[i] = rnd.nextInt(41) - 20;
            System.out.println(tab[i]+ " " + tab[i]*tab[i]);

        }

    }
}