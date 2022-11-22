public class Trojkat implements Figura {
    double a, b, c;

    public Trojkat(double a, double b) {
        this.a = a;
        this.b = b;
        c = Math.sqrt(a * a + b * b);
    }
	public double pole() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public double obwod() {
        return a + b + c;
    }
}
