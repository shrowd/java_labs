public class Kolo {
    int r;

    public Kolo(int r) {
        this.r = r;
    }
    @Override
    public double pole(){
        return Math.pow(r,2) * 3.14;
    }
    @Override
    public double obwod(){
        return 2 * 3.14 * r;
    }
    @Override
    public String toString(){
        return "Kolo o promieniu: " + r;
    }
}
