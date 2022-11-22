public class Kolo {
    int r;

    public Kolo(int r) {
        this.r = r;
    }
    public double pole(){
        return Math.pow(r,2) * 3.14;
    }
    public double obwod(){
        return 2 * 3.14 * r;
    }
}