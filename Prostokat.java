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
    @Override
    public String toString() {
        return "Prostokat: " + a + " x " + b;
    }
    public static void main(String[] args){
        Prostokat p1 = new Prostokat(1,2);
        System.out.println(p1.obwod());
        System.out.println(p1.pole());
    }
}