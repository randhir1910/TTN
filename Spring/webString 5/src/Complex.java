/**
 * Created by randhir on 8/7/17.
 */
public class Complex
{
    private double real;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    private double imag;
    public String toString()
    {
        return real+"  "+imag;
    }
}
