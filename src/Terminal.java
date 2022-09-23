import java.io.*;
import java.util.*;
public class Terminal{

    private static BufferedReader in =
        new BufferedReader(new InputStreamReader(System.in));

    public static String[] lireFichierTexte(String nomFichier)
    {
        try{
            File fichier = new File(nomFichier);
            FileInputStream fis = new FileInputStream(new File(nomFichier));
            
            byte[] buffer = new byte[(int)fichier.length()];
            fis.read(buffer);
            fis.close();
            String str = new String(buffer);

            String texte = str.replaceAll(""+(char)(13),"");

            String[] mots = texte.split("\n");

            return(mots);
        }
        catch(Exception ex)
            {
                exceptionHandler(ex);
            }
        return null;
    }

    public static void ecrireFichier(String nomFichier,
                                     StringBuffer strbuf)
    {
        try{
            File fichier = new File(nomFichier);
            FileOutputStream fos = new FileOutputStream(new File(nomFichier));
            
            byte[] buffer = strbuf.toString().getBytes();
            fos.write(buffer);
            fos.close();
        }
        catch(Exception ex)
            {
                exceptionHandler(ex);
            }
    }

    public static String lireString()
    {
        String tmp="";
        char C='\0';
        try {
            tmp = in.readLine();
        }
        catch (IOException e)
            {
                exceptionHandler(e);
            }
        return tmp;
    }

    public static int lireInt()
    {
        int x=0;
        try {
            x=Integer.parseInt(lireString());
        }
        catch (NumberFormatException e) {
            exceptionHandler(e);
        }	
        return x ;
    }

    public static boolean lireBoolean()
    {
        boolean b = true;
        try {
            b = Boolean.valueOf(lireString()).booleanValue();
        }
        catch (NumberFormatException e) {
            exceptionHandler(e);
        }	
        return b;
    }

    public  static double lireDouble()
    {
        double x=0.0;
        try {
            x=Double.valueOf(lireString()).doubleValue();
        }
        catch (NumberFormatException e) {
            exceptionHandler(e);
        }	
        return x ;
    }

    public  static char lireChar()
    {
        String tmp=lireString();
        if (tmp.length()==0)
            return '\n';
        else 
            {
                return tmp.charAt(0);
            }
    }

    public static void ecrireString(String s){ // Afficher un String
        System.out.print(s);
    }
    public static void ecrireStringln(String s)
    {
        ecrireString(s);
        sautDeLigne();
    }

    public static void ecrireInt(int i)
    {
        ecrireString(""+i);
    }

    public static void ecrireIntln(int i)
    {
        ecrireString(""+i);
        sautDeLigne();
    }

    public static void ecrireBoolean(boolean b){
        ecrireString(""+b);
    }

    public static void ecrireBooleanln(boolean b){
        ecrireString(""+b);
        sautDeLigne();
    }

    public  static void ecrireDouble(double d)
    {
        ecrireString(""+d);
    }

    public  static void ecrireDoubleln(double d)
    {
        ecrireDouble(d);
        sautDeLigne();
    }

    public  static void ecrireChar(char c)
    {
        ecrireString(""+c);
    }  

    public  static void ecrireCharln(char c)
    {
        ecrireChar(c);
        sautDeLigne();
    }

    public static void sautDeLigne(){
        try{
            System.out.println();
        }catch(Exception ex){
            exceptionHandler(ex);
        }
    }

    protected static void exceptionHandler(Exception ex){
        TerminalException err = new TerminalException(ex);
        throw err;
    }


    public static void ecrireException(Throwable ex){
        ecrireString(ex.toString());
        ex.printStackTrace(System.out);
    }
}  

class TerminalException extends RuntimeException{
    Exception ex;
    TerminalException(Exception e){
        ex = e;
    }
}


