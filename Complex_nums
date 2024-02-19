import static java.lang.Math.pow;

class Complex_nums
{
    double real;
    double im;
    public Complex_nums(double real, double im)
    {
        this.real = real;
        this.im = im;
    }
    public String toString()
    {
        if (im >= 0)
        {
            return real + "+" + im + "i";
        }
        else
        {
            return real + "-" + im + "i";
        }
    }
    public Complex_nums add (Complex_nums second)
    {
        double realpart = this.real + second.real;
        double impart = this.im+ second.im;
        return new Complex_nums(realpart, impart);
    }
    public Complex_nums subtract (Complex_nums second)
    {
        double realpart = this.real - second.real;
        double impart = this.im - second.im;
        return new Complex_nums(realpart, impart);
    }
    public Complex_nums multiply (Complex_nums second)
    {
        double realpart = this.real * second.real- this.im * second.im;
        double impart = this.real * second.im- this.im * second.real;
        return new Complex_nums(realpart, impart);
    }
    public Complex_nums divide (Complex_nums second)
    {
     double divisor = pow(second.real, 2) + pow(second.im, 2);
     if (divisor == 0)
     {
            throw new ArithmeticException("It seems like you are trying to divide by zero");
     }
     double realpart = (this.real * second.real + this.im * second.im)/divisor;
     double impart = (second.real * this.im - this.real * second.im)/divisor;
     return new Complex_nums(realpart, impart);
    }
}
