class Fraction{
    
    //constructeur
    public Fraction(final int numerateur, final int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    //methode getter du numerateur
    public int getLeNumerateur() {
        return this.numerateur;
    }
    //methode getter du denominateur
    public int getLeDenominateur() {
        return this.denominateur;
    }
     //methode getter du PGCD
        public int get_PGCD() {
        int a = this.numerateur;
        int b = this.denominateur;
        while (b != 0) {
            if (a < b) {
                remplacer = a;
                a = b;
                b = remplacer;
            }
            a = a - b;
        }
        return a;
    }
     //methode setter du numerateur
    public void set_Numerateur(int numerateur){
        this.numerateur = numerateur;
    }

    //methode setter du denominateur
    public void set_Denominateur(int denominateur){
        this.denominateur = denominateur;
    }
      //methode Division
    public Fraction Division(Fraction frac){
        this.numerateur = this.numerateur * frac.denominateur;
        this.denominateur = this.denominateur * frac.numerateur;
        return new Fraction(this.numerateur, this.denominateur);
    }
    
    //methode Addition
    public Fraction Addition(final Fraction fraction) {
        this.numerateur = this.numerateur * fraction.denominateur + this.denominateur * fraction.numerateur;
        this.denominateur *= fraction.denominateur;
        return new Fraction(this.numerateur, this.denominateur);
    }
    //methode Multiplication
    public Fraction Multiplication(final Fraction fraction) {
        this.numerateur *= fraction.numerateur;
        this.denominateur *= fraction.denominateur;
        return new Fraction(this.numerateur, this.denominateur);
    }
    //methode simplification Fraction
    public void SimplifierFraction() {
        final int pgcd = this.PGCD(this.numerateur, this.denominateur);
        this.numerateur /= pgcd;
        this.denominateur /= pgcd;
        if (this.denominateur < 0) {
            this.numerateur = -this.numerateur;
            this.denominateur = -this.denominateur;
        }
    }
     // methode Affichage
    public String Affichage() {
        return ("La fraction est " + this.numerateur + "/" + this.denominateur + "." +
                "\nLe numérateur est " + this.numerateur + ", le dénominateur est " + this.denominateur
                + " et le PGCD est " + this.get_PGCD() + ".");
    }
}
