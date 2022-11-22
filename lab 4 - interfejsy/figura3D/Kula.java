public class Kula implements Figura3D{
    int r;
    Kula(int r){
        this.r = r;
    }
    public double pole(){
        return 4 * 3.14 * Math.pow(r,2);
    }
    public double objetosc(){
        return (4 * 3.14 * Math.pow(r,3))/3;
    }
    public double obwod(){
        return 2 * 3.14 * r;
    }
}
