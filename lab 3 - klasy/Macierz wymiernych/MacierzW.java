import java.util.Random;

public class MacierzW {
    LW[][] tab;
    MacierzW(int w, int k) {
        this.tab = new LW[w][k];
        this.generuj(w, k);
    }

    MacierzW(int w) {
        this(w, w);
    }

    void generuj(int w, int k) {
        Random rng = new Random();
        for(int i=0; i<w; i++) {
            for(int j=0; j<k; j++) {
                tab[i][j] = new LW(rng.nextInt(5) + 1, rng.nextInt(3) + 1);
            }
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < tab.length; i++) {
            temp += "|";
            for (int j = 0; j < tab[0].length; j++) {
                temp += " " + tab[i][j] + ",";
            }
            temp += " |\n";
        }
        return temp;
    }

    MacierzW wytnijWiersz(int w) {
        MacierzW wynik = new MacierzW(tab.length - 1, tab[0].length);
        for(int i=0; i<w; i++) {
            for(int j=0; j<wynik.tab[i].length; j++) {
                wynik.tab[i][j] = tab[i][j];
            }
        }
        for(int i=w; i<wynik.tab.length; i++) {
            for(int j=0; j<wynik.tab[i].length; j++) {
                wynik.tab[i][j] = tab[i+1][j];
            }
        }
        return wynik;
    }

    MacierzW wytnijKolumne(int k) {
        MacierzW wynik = new MacierzW(tab.length, tab[0].length-1);
        for(int w=0; w<wynik.tab.length; w++) {
            for (int j = 0; j < k; j++) {
                wynik.tab[w][j] = tab[w][j];
            }
            for (int j = k; j < wynik.tab[w].length; j++) {
                wynik.tab[w][j] = tab[w][j + 1];
            }
        }
        return wynik;
    }

    MacierzW wytnijWierszKolumne(int w, int k) {
        return wytnijWiersz(w).wytnijKolumne(k);
    }

    LW det() {
        if(tab.length==1) {
            return tab[0][0];
        }
        LW wynik = new LW(0,1);
        for(int k=0; k<tab[0].length; k++) {
            if(k % 2 == 0) {
                wynik =  wynik.suma(tab[0][k].iloczyn(wytnijWierszKolumne(0, k).det()));
            }
            else{
                wynik = wynik.roznica(tab[0][k].iloczyn(wytnijWierszKolumne(0, k).det()));
            }
        }
        return wynik;
    }

    boolean odw(){
        return true;
    }

    public static void main(String[] args){
        
    }
}
