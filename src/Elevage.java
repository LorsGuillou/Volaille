import java.util.ArrayList;

/**
 * The type Elevage.
 */
public class Elevage {


    /**
     * Methode main ou on initialise la liste elevage qui contiendra les objets Volaille, ou on initialise le prix et le poids d abbatage des sous-classes Poulet et Canard et ou se situe l interface
     *
     * @param args the input arguments
     */
    public static void main (String[] args) {

        ArrayList<Volaille> elevage = new ArrayList<Volaille>();

        Poulet.setPrixKg(1);
        Poulet.setPoidsAbbatage(4);
        Canard.setPrixKg(2);
        Canard.setPoidsAbbatage(6);

        Terminal.ecrireStringln("Prix du jour :");
        Terminal.ecrireStringln("Poulets -> Au kilo :  " + Poulet.getPrixKg() + " | A l'unite : " + Poulet.calculPrixPiece() + " | Poids d abbatage : " + Poulet.getPoidsAbbatage());
        Terminal.ecrireStringln("Canards -> Au kilo: " + Canard.getPrixKg() + " | A l'unite : " + Canard.calculPrixPiece() + " | Poids d abbatage : " + Canard.getPoidsAbbatage());
        Terminal.sautDeLigne();

        enregistrer(elevage);
        Terminal.ecrireStringln("Elevage apres enregistrement : ");
        System.out.println(elevage);
        Terminal.sautDeLigne();
        Terminal.ecrireStringln("Abbatage des volailles ayant atteints le poids adequat...");
        abbatage(elevage);
        Terminal.sautDeLigne();
        Terminal.ecrireStringln("Elevage apres abbatage : ");
        System.out.println(elevage);

    }

    /**
     * Methode permettant de generer des Poulets et des Canards a partir d inputs, et de les ajouter a la liste elevage
     *
     * @param v ArrayList<Volaille>
     */
    public static void enregistrer (ArrayList<Volaille> v) {
        String type;
        char cont;
        double x;
        boolean check = false;
        do {
            Terminal.ecrireString("Choisissez le type de volaille : ");
            type = Terminal.lireString().toUpperCase();
            Terminal.ecrireString("Saisissez son poids d arrivage : ");
            x = Terminal.lireDouble();
            if (type.equals("POULET")) {
                Poulet p = new Poulet(x);
                v.add(p);
            } else if (type.equals("CANARD")) {
                Canard c = new Canard(x);
                v.add(c);
            }
            Terminal.ecrireStringln("Continuer ? (Y/N)");
            cont = Terminal.lireChar();
            if (cont == 'N') {
                check = true;
            }
        } while(!check);
    }

    /**
     * Methode parcourant la liste elevage, et retirant les volailles ayant atteint le poids d abbatage de leurs especes respectives
     *
     * @param v the v
     */
    public static void abbatage (ArrayList<Volaille> v) {
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).getClass().getName().equals("Poulet")) {
                if (v.get(i).getPoids() >= Poulet.getPoidsAbbatage()) {
                    v.remove(i);
                }
            } else if (v.get(i).getClass().getName().equals("Canard")) {
                if (v.get(i).getPoids() >= Canard.getPoidsAbbatage()) {
                    v.remove(i);
                }
            }
        }
    }
}
