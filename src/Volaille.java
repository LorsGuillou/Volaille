public abstract class Volaille {
    public double Poids;
    public int Id;
    public static int IdPlus = 1;

    public Volaille(double poids) {
        this.Poids = poids;
        this.Id = IdPlus++;
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
}
