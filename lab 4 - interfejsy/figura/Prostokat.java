public class Prostokat implements Figura {
    int a,b;
    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double pole(){
        return a*b;
    }
    public double obwod(){
        return 2*a + 2*b;
    }
}