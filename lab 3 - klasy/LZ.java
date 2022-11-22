import java.lang.*;
public class LZ {
    double re,im;

    public LZ(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString(){
        return "re = " + re + " " + "im = " + im;
    }

    LZ suma(LZ arg){return new LZ(re + arg.re,im + arg.im);}

    LZ roznica(LZ arg){return new LZ(re - arg.re,im - arg.im);}

    LZ iloczyn(LZ arg){return new LZ(re * arg.re - im * arg.im,re * arg.im + im * arg.re);}

    LZ iloraz(LZ arg){
        double m = arg.re * arg.re + arg.re * arg.im * (-1) + arg.re * arg.im - arg.im * arg.im * (-1);
        return new LZ((re * arg.re + im * arg.im)/m,(im * arg.re - re * arg.im)/m);}

    LZ sprzezenie(){return new LZ(re, -im);}

    double modul(){return Math.sqrt(re * re + im * im);}

    public static void main(String[] argv){
        LZ l1 = new LZ(2,4);
        LZ l2 = new LZ(2,3);
        System.out.println(l1.iloraz(l2));
    }
}
