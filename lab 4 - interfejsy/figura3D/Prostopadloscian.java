public class Prostopadloscian implements Figura3D{
    int a,b,c;
    Prostopadloscian(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double pole(){
        return 2*(a*b+a*c+b*c);
    }
    public double objetosc(){
        return a * b * c;
    }
    public double obwod() {
        return 0;
    }
}
