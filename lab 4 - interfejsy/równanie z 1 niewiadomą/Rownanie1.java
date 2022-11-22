public class Rownanie1 extends Rownanie{
    Rownanie1(){
        super(2,1);
    }
    public int rozwiazanie(){
        if(dane[0] == 0 & dane[1] == 0){
            return 2;
        }
        else if(dane[0] == 0){
            return 0;
        }
        else
            rozwiazania[0] = -dane[1]/dane[0];
            return 1;
    }
    public static void main(String[] args){

    }
}
