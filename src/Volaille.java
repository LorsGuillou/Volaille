/**
 * The type Volaille.
 */
public abstract class Volaille {
    /**
     * The Poids.
     */
    public double Poids;
    /**
     * The Id.
     */
    public int Id;
    /**
     * The constant IdPlus.
     */
    public static int IdPlus = 1;

    /**
     * Instantiates a new Volaille.
     *
     * @param poids the poids
     */
    public Volaille(double poids) {
        this.Poids = poids;
        this.Id = IdPlus++;
    }

    /**
     * Gets poids.
     *
     * @return the poids
     */
    public double getPoids() {
        return Poids;
    }

    /**
     * Sets poids.
     *
     * @param poids the poids
     */
    public void setPoids(double poids) {
        Poids = poids;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return Id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        Id = id;
    }
}
