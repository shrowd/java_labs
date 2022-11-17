public class Kolo {
    int r;

    public Kolo(int r) {
        this.r = r;
    }
    public String toString(){
        return "Kolo o promieniu: " + r;
    }
    public double pole(){
        return Math.pow(r,2) * 3.14;
    }
    public double obwod(){
        return 2 * 3.14 * r;
    }
    public static void main(String[] args){
        Kolo k1 = new Kolo(3);
        System.out.println(k1.obwod());
        System.out.println(k1.pole());
    }
}