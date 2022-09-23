public class Volaille {
    public double Poids;
    public int Id;
    public static double PrixKg;
    public static double PoidsAbbatage;

    public Volaille(double poids, int id, double prix) {
        this.Poids = poids;
        this.Id = id;
        this.PrixKg = prix;
    }

    public double getPoids() {
        return Poids;
    }

    public void setPoids(double poids) {
        Poids = poids;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
}
