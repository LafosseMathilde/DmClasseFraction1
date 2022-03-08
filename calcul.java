import Fraction.*;
class calcul {
    private int numerateur;
    private int denominateur;
    
    public Calcul(final int numerateur, final int denominateur){
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
	//affichage PGCD
    public String Affichage() {
        return this.numerateur+ this.denominateur+ this.numerateur+ this.denominateur+ this.PGCD(this.numerateur, this.denominateur);
    }
        public static void main (String args[]) {
            Calcul Calc1 = new Calcul(2,7);
            Calcul Calc2 = new Calcul(5,13);
            System.out.println("\nLes Calculs  : ");
            System.out.println("Calcul N1 : " + Calc1.Affichage());
            System.out.println("Calcul N2 : " + Calc2.Affichage());
        }
	
}
