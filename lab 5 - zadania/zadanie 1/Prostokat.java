class Prostokat
{
    Punkt A;
    Punkt B;
    Prostokat(Punkt A,Punkt B) {
        this.A = A;
        this.B = B;
    }
    Prostokat(double Ax,double Ay,double Bx,double By) {
        this.A = new Punkt(Ax,Ay);
        this.B = new Punkt(Bx,By);
    }
    double bok_1() {
        return new Odcinek(A.x,A.y,B.x,A.y).dlugosc(); }
    double bok_2() {
        return new Odcinek(B.x,B.y,A.x,B.y).dlugosc(); }
    double pole() {
        return bok_1() * bok_2(); }
    double obwod() {
        return 2 * (bok_1() + bok_2());}
    double przekatna() {
        return new Odcinek(A,B).dlugosc(); }
    public String toString(){
        return "Prostokat : " + A + ", " + B;
    }
    public static void main(String[] args){
       
    }
}

