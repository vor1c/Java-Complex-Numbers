package FSST.Nachhilfe;

public class Cmplx {
    private int re;

    public int getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }

    private int im;

    public int getIm() {
        return im;
    }

    public void setIm(int im) {
        this.im = im;
    }

    public Cmplx(int r,int i){
        re=r;
        im=i;
    }
    public Cmplx(int r){
        re=r;
        im=0;
    }
    public Cmplx(){
        re=0;
        im=0;
    }

    public String toString(){
        return re+"+j"+im;
    }
    public  Cmplx add(Cmplx x){

       int a = x.re + this.re;
       int b = x.im + this.im;

        return new Cmplx(a , b);
    }

    public static Cmplx mult(Cmplx c1, Cmplx c2){
        int r = c1.re*c2.re - c1.im*c2.im ;
        int i = c1.re*c2.im + c1.im*c2.re ;
        return new Cmplx(r, i);
    }

}
