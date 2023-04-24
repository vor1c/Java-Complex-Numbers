# Complex Numbers in Java
This is a Java implementation of complex numbers with addition and multiplication operations. The Cmplx class allows for the creation of complex numbers with real and imaginary parts. It includes constructors for initializing the real and imaginary parts, as well as default constructors. The add() method adds two complex numbers and returns the result, while the mult() method multiplies two complex numbers and returns the result.

## Usage
To use this class in your Java project, simply import the Cmplx class and create complex numbers using the constructors. You can then use the add() and mult() methods to perform addition and multiplication operations on the complex numbers.

```
import FSST.Nachhilfe.Cmplx;

public class Main {
    public static void main(String[] args) {
        Cmplx c1 = new Cmplx(2, 3);
        Cmplx c2 = new Cmplx(4, 5);

        Cmplx sum = c1.add(c2);
        Cmplx product = Cmplx.mult(c1, c2);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
```
