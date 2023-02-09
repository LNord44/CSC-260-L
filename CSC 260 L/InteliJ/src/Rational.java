public class Rational {
    private int numerator, denominator;

    public Rational( int numerator, int denominator) {
        if (denominator < 0) {
            this.denominator = Math.abs(denominator);
            this.numerator = numerator * -1;
        }
        else if (denominator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        }
        else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        reduce();
    }

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return this.numerator + " / " + this.denominator;
    }

    public int compareTo(Rational other) {
        int n1 = numerator * other.denominator;
        int n2 = other.numerator * denominator;
        if (n1 < n2) {
            return -1;
        }
        else if (n1 > n2) {
            return 1;
        }
        else { //else they equal
            return 0;
        }
    }

    public Rational add(Rational other) {
        int n = (numerator * other.denominator) + (other.numerator * denominator);
        int d = denominator * other.denominator;
        return new Rational(n, d);
    }

    public Rational subtract(Rational other) {
        int n = (numerator * other.denominator) - (other.numerator * denominator);
        int d = denominator * other.denominator;
        return new Rational(n, d);
    }

    public Rational multiply(Rational other) {
        int n = numerator * other.numerator;
        int d = denominator * other.denominator;
        return new Rational(n, d);
    }

    public Rational division(Rational other) {
        int n = numerator * other.denominator;
        int d = denominator * other.numerator;
        return new Rational(n, d);
    }

    private void reduce() {
        if (numerator == 0){
            denominator = 1;
        }
        else {
            int divisor = 2;
            while (divisor <= Math.abs(numerator) && divisor <= denominator) {
                if (numerator % divisor == 0 && denominator % divisor == 0) {
                    numerator = numerator / divisor;
                    denominator = denominator / divisor;
                }
                else {
                    divisor++;
                }
            }
        }
    }
    //Where do I call reduce?
}
