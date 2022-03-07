package Fraction;

public class Fraction
{
    private int numerateur;
    private int denominateur;
    
    public Fraction(final int numerateur, final int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    
    public int getLeNumerateur() {
        return this.numerateur;
    }
    
    public int getLeDenominateur() {
        return this.denominateur;
    }
    
    public Fraction Addition(final Fraction fraction) {
        this.numerateur = this.numerateur * fraction.denominateur + this.denominateur * fraction.numerateur;
        this.denominateur *= fraction.denominateur;
        return new Fraction(this.numerateur, this.denominateur);
    }
    
    public Fraction Multiplication(final Fraction fraction) {
        this.numerateur *= fraction.numerateur;
        this.denominateur *= fraction.denominateur;
        return new Fraction(this.numerateur, this.denominateur);
    }
    
    public void SimplifierFraction() {
        final int pgcd = this.PGCD(this.numerateur, this.denominateur);
        this.numerateur /= pgcd;
        this.denominateur /= pgcd;
        if (this.denominateur < 0) {
            this.numerateur = -this.numerateur;
            this.denominateur = -this.denominateur;
        }
    }
    
    private int PGCD(int n, int i) {
        while (i != 0) {
            final int n2 = n % i;
            n = i;
            i = n2;
        }
        return n;
    }
    
    public String Affichage() {
        return invokedynamic(makeConcatWithConstants:(IIIII)Ljava/lang/String;, this.numerateur, this.denominateur, this.numerateur, this.denominateur, this.PGCD(this.numerateur, this.denominateur));
    }
}
