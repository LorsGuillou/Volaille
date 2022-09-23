/**
 * The type Canard.
 */
public class Canard extends Volaille {
    private static double PrixKg;
    private static double PoidsAbbatage;

    /**
     * Instantiates a new Canard.
     *
     * @param poids the poids
     */
    public Canard(double poids) {
        super(poids);
    }

    /**
     * Gets prix kg.
     *
     * @return the prix kg
     */
    public static double getPrixKg() {
        return PrixKg;
    }

    /**
     * Sets prix kg.
     *
     * @param prixKg the prix kg
     */
    public static void setPrixKg(double prixKg) {
        PrixKg = prixKg;
    }

    /**
     * Gets poids abbatage.
     *
     * @return the poids abbatage
     */
    public static double getPoidsAbbatage() {
        return PoidsAbbatage;
    }

    /**
     * Sets poids abbatage.
     *
     * @param poidsAbbatage the poids abbatage
     */
    public static void setPoidsAbbatage(double poidsAbbatage) {
        PoidsAbbatage = poidsAbbatage;
    }

    /**
     * Calcul prix piece double.
     *
     * @return the double
     */
    public static double calculPrixPiece() {
        return PrixKg * PoidsAbbatage;
    }

    @Override
    public String toString() {
        return "Canard{" +
                "poids=" + getPoids() +
                ", id=" + getId() +
                '}';
    }
}
