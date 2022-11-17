public class Trojkat implements Figura{
    double a,b,c;

    public Trojkat(double a, double b) {
        this.a = a;
        this.b = b;
        c = Math.sqrt(a*a + b*b);
    }
    @Override
    public double pole() {
        return a * b /2;
    }
    @Override
    public double obwod() {
        return a + b + c;
    }
    @Override
    public String toString(){
        return "Trojkat o bokach " + a + " " + b + " " + c;
    }
}
