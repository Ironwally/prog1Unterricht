package mandelbrotkernMenge;

public class Complex {
    
    private double re;
    private double im;

    public Complex(double r, double i) {
        re=r;
        im=i;
    }

    //void add(Complex other);
    //oder so
    static Complex add(Complex x, Complex y) {
        return new Complex(x.re+y.re,x.im+y.im);
    }
    static Complex mult(Complex x,Complex y) {
        return new Complex(x.re*y.re-x.im*y.im,x.re*y.im+x.im*y.re)
    }
    public static Complex square(Complex x) {
        return mult(x,x);
    }
    
    public static Double absoluteValue(Complex x){
        return Math.sqrt(x.re*x.re+x.im*x.im);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || getClass() != o.getClass()) return false;
        Complex oc = (Complex) o;
        return (this.re==oc.re && this.im==oc.im);
    }
}
