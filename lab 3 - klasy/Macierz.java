import java.util.Random;
import java.lang.Math.*;
public class Macierz {
    int[][] tab;
    Macierz(int w, int k){
        this.tab = new int[w][k];
    }
    Macierz(int w){
        this(w,w);
    }
    void generuj(){
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab.length; j++){
                Random rng = new Random();
                tab[i][j] = rng.nextInt(5);
            }
        }
    }
    public String toString() {
        String temp = "";
        for (int i = 0; i < tab.length; i++) {
            temp += "|";
            for (int j = 0; j < tab[0].length; j++) {
                temp += " " + tab[i][j];
            }
            temp += " |\n";
        }
        return temp;
    }
    Macierz wytnijwiersz(int w){
        Macierz wynik = new Macierz(tab.length - 1, tab[0].length);
        for(int i = 0; i < w; i++){
            for(int k = 0; k < wynik.tab[i].length; k++){
                wynik.tab[i][k] = tab[i][k];
            }
        }
        for(int i = w; i < wynik.tab.length; i++){
            for(int k = 0; k < wynik.tab[i].length; k++){
                wynik.tab[i][k] = tab[i + 1][k];
            }
        }
        return wynik;
    }
    Macierz wytnijkolumne(int k){
        Macierz wynik = new Macierz(tab.length , tab[0].length - 1);
        for(int w = 0; w < wynik.tab.length; w++) {
            for (int i = 0; i < k; i++) {
                wynik.tab[w][i] = tab[w][i];
            }
            for (int i = k; i < wynik.tab[w].length; i++) {
                wynik.tab[w][i] = tab[w][i + 1];
            }
        }
        return wynik;
    }
    Macierz wytnijwierszkolumne(int w, int k){
        return wytnijwiersz(w).wytnijkolumne(k);
    }
    int det(){
        int wynik = 0;
        if(tab.length == 1){
            return tab[0][0];
        }
        else{
            for(int k = 0; k < tab[0].length; k++){
                wynik += ((int)Math.pow(-1,k)) * tab[0][k] * wytnijwierszkolumne(0,k).det();
            }
        }
        return wynik;
    }

    public static void main(String[] args){
        Macierz m1 = new Macierz(3);
        m1.generuj();
        System.out.println(m1);
        System.out.println(m1.det());

    }
}