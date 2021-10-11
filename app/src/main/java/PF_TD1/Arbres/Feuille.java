public class Feuille implements Arbre
{
    private int valeur;

    public Feuille(int valeur)
    {
        this.valeur = valeur;
    }

    int taille()
    {
        return 1;
    }

    boolean contient(final Integer val)
    {
        //Etrange car type différent ?
        if(this.valeur == val)
        {
            return true;
        }
        return false;
    }
}