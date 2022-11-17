public class Trojkat implements Figura{
    double a,b,c;

    public Trojkat(double a, double b) {
        this.a = a;
        this.b = b;
        c = Math.sqrt(a*a + b*b);
    }
    public String toString(){
        return "Trojkat o bokach " + a + " " + b + " " + c;
    }

    @Override
    public double pole() {
        return a * b /2;
    }

    @Override
    public double obwod() {
        return a + b + c;
    }
    public static void main(String[] args){
        Trojkat t1 = new Trojkat(4,3);
        System.out.println(t1.pole());
    }
}
