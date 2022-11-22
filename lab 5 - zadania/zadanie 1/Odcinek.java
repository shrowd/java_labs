class Odcinek
{
    Punkt A;
    Punkt B;
    Odcinek(Punkt A,Punkt B) {
        this.A = A;
        this.B = B;
    }
    Odcinek(double Ax,double Ay,double Bx,double By) {
       this.A = new Punkt(Ax,Ay);
       this.B = new Punkt(Bx,By);
    }
    double dlugosc() {
        return Math.sqrt(Math.pow(B.x - A.x,2)+ Math.pow(B.y - A.y,2));}
    public String toString(){
        return "Odcinek: " + A + " , " + B;
    }
}
