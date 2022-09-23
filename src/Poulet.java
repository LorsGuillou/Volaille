public class Poulet extends Volaille {
    private static double PrixKg;
    private static double PoidsAbbatage;

    public Poulet(double poids) {
        super(poids);
    }

    public static double getPrixKg() {
        return PrixKg;
    }

    public static void setPrixKg(double prixKg) {
        PrixKg = prixKg;
    }

    public static double getPoidsAbbatage() {
        return PoidsAbbatage;
    }

    public static void setPoidsAbbatage(double poidsAbbatage) {
        PoidsAbbatage = poidsAbbatage;
    }

    public static double calculPrixPiece() {
        return PrixKg * PoidsAbbatage;
    }

    @Override
    public String toString() {
        return "Poulet{" +
                "poids=" + getPoids() +
                ", id=" + getId() +
                '}';
    }
}
