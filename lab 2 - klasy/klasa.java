public class prostokat {
    private int wysokosc, szerokosc;

    public prostokat(int wysokosc, int szerokosc) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
    }
    public prostokat(){
        this(1,1);
    }
    public prostokat(int wysokosc){
        this(wysokosc,3);
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public int pole(){
        return wysokosc * szerokosc;
    }
    public String toString(){
        return "wysokosc: " + wysokosc + " szerokosc: " + szerokosc + " pole: " + pole();
    }
    static {
        System.out.println("Prostokat");
    }

    public static void main(String[] argv){
        prostokat tab[] = new prostokat[3];
        tab[0] = new prostokat(3,5);
        tab[1] = new prostokat();
        tab[2] = new prostokat(4);

       for(prostokat p:tab){
           System.out.println(p);
       }

    }

}