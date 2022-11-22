public class Main {
    int[][] tabliczka(int n){
        int[][] tab = new int[n][n];
        int x = 1, y = 1;
        for(int w = 0; w < n; w++){
            for(int k = 0; k < n; k++){
                tab[w][k] = x * y;
                y+= 1;
            }
            y = 1;
            x += 1;
        }
        return tab;
    }
    void wypisz(int[][] tab ){
        for(int w = 0; w < tab.length; w++){
            System.out.println(" ");
            for(int k = 0; k < tab[w].length; k++){
                System.out.print(tab[w][k] + ", ");
            }
        }
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.wypisz(obj.tabliczka(3));
    }
}