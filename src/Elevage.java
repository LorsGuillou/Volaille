import java.util.ArrayList;

public class Elevage {


    public static void main (String[] args) {

        ArrayList<Volaille> elevage = new ArrayList<Volaille>();

        Poulet.setPrixKg(1);
        Poulet.setPoidsAbbatage(4);
        Canard.setPrixKg(2);
        Canard.setPoidsAbbatage(6);

        Terminal.ecrireStringln("Prix du jour :");
        Terminal.ecrireStringln("Poulets -> Au kilo :  " + Poulet.getPrixKg() + " | A l'unité : " + Poulet.calculPrixPiece() + " | Poids d'abbatage : " + Poulet.getPoidsAbbatage());
        Terminal.ecrireStringln("Canards -> Au kilo: " + Canard.getPrixKg() + " | A l'unité : " + Canard.calculPrixPiece() + " | Poids d'abbatage : " + Canard.getPoidsAbbatage());
        Terminal.sautDeLigne();

        enregistrer(elevage);
        Terminal.ecrireStringln("Elevage après enregistrement : ");
        System.out.println(elevage);
        Terminal.sautDeLigne();
        Terminal.ecrireStringln("Abbatage des volailles ayant atteints le poids adéquat...");
        abbatage(elevage);
        Terminal.sautDeLigne();
        Terminal.ecrireStringln("Elevage après abbatage : ");
        System.out.println(elevage);

    }

    public static void enregistrer (ArrayList<Volaille> v) {
        String type;
        char cont;
        double x;
        boolean check = false;
        do {
            Terminal.ecrireString("Choisissez le type de volaille : ");
            type = Terminal.lireString().toUpperCase();
            Terminal.ecrireString("Saisissez son poids d'arrivage : ");
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
