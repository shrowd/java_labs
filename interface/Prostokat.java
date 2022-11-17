public class Prostokat implements Figura {
    int a,b;
    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double pole(){
        return a*b;
    }
    @Override
    public double obwod(){
        return 2*a + 2*b;
    }
    @Override
    public String toString() {
        return "Prostokat: " + a + " x " + b;
    }
}
