import java.util.Scanner;
abstract class Rownanie
{
    protected double[] dane;
    protected double[] rozwiazania;
    protected int iloscRozwiazan;
    Rownanie(int ilosc_wej,int ilosc_wyj) {
        this.dane = new double[ilosc_wej];
        this.rozwiazania = new double[ilosc_wyj];
    }
    private void wprowadzDane() {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj dane: ");
        for(int i = 0; i < dane.length; i++){
            dane[i] = s.nextInt();
        }
    }
    private void wypiszWynik() {
        if(iloscRozwiazan == 0)
            System.out.println("Brak");
        else if (iloscRozwiazan == 2) {
            System.out.println("nieskonczenie wiele");
        }
        else
            System.out.println("wynik= " + rozwiazania[0]);
    }
    abstract protected int rozwiazanie();
    final void rozwiaz()
    {
        wprowadzDane();
        iloscRozwiazan = rozwiazanie();
        wypiszWynik();
    }
}