public class LW {
    int l,m;

    public LW(int l, int m) {
        this.l = l / nwd(l,m);
        this.m = m / nwd(l,m);
    }

    @Override
    public String toString() {
        if (l%m==0) { return String.valueOf(l); }
        else if(l<m) { return l + "/" + m; }
        else {
            int x = 1, y, l2, m2;
            y = nwd(l, m);
            l2 = l/y;
            m2 = m/y;
            x = l/m;
            return x + " " + (l2-m2*x)+ "/" + m2;
        }
    }

    LW suma(LW arg){
        return new LW(l* arg.m + arg.l * m,m * arg.m);
    }

    LW roznica(LW arg){
        return new LW(l* arg.m - arg.l * m,m * arg.m);
    }

    LW iloczyn(LW arg){
        return new LW(l * arg.l, arg.m * m);
    }

    LW iloraz(LW arg){
        return new LW(l * arg.m, arg.l * m);
    }

    LW odw(){return new LW(m,l);}

    int nwd(int l,int m){
        while(l!=m){
            if(l>m)
                l-=m;
            else if (l<m)
                m-=l;}
        return l;
    }

    LW skroc(){
        int x = nwd(l,m);
        return new LW(l/x, m/x);
    }


    public static void main(String[] argv){
        LW l1 = new LW(1,2);
        LW l2 = new LW(1,2);
        LW l3 = new LW(3,4);
        LW l4 = new LW(5,6);

        System.out.println(l1.suma(l2));
    }
}
