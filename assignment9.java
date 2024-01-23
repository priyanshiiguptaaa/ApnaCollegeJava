//                                                  ASSIGNMENT 9 
//                                                     OOPS 
//Question 1 - craete a class named complex which performs various operations on complex numbers input by the user 
class Complex {
    int real;
    int imag;

    Complex(int r) {
        real = r;
        imag = r;
    }

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void display() {
        System.out.println(real + " + i" + imag);
    }

    static Complex add(Complex c1, Complex c2) {
        Complex c3 = new Complex(0, 0);
        c3.real = c1.real + c2.real;
        c3.imag = c1.imag + c2.imag;
        return c3;
    }

    static Complex multiply(Complex c1, Complex c2) {
        Complex c4 = new Complex(1, 1);
        c4.real = c1.real * c2.real;
        c4.imag = c1.imag * c2.imag;
        return c4;
    }

    static Complex subtract(Complex c1, Complex c2) {
        Complex c3 = new Complex(0, 0);
        c3.real = c1.real - c2.real;
        c3.imag = c1.imag - c2.imag;
        return c3;
    }
}

public class assignment9 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(3, 2);
        Complex sum = Complex.add(c1, c2);
        sum.display();
        Complex diff = Complex.subtract(c1, c2);
        diff.display();
        Complex product = Complex.multiply(c1, c2);
        product.display();
    }
}
