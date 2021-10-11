class Noeud implements Arbre
{
    private List<Arbre> fils;

    public Noeud(List<Arbre> fils)
    {
        this.fils = fils;
    }

    int taille()
    {
        //C'est la somme des tailles des fils
        int res = 0;
        for(Arbre a : fils)
        {
            res += a.taille();
        }
        return res;
    }

    boolean contient(final Integer val)
    {
        //Pour chaque fils vérifie si il contient la valeur recherchée
        for(Arbre a : fils)
        {
            if(a.contient(val))
            {
                return true;
            }
        }
        return false;
    }

    Set<Integer> valeurs()
    {
        //TO DO
    }

    Integer somme()
    {
        if(fils == null || fils.size() == 0)
        {
            return null;
        }
        int res = 0 ;

        for(Arbre a : fils)
        {
            res += a.somme();
        }
        return res;
    }

    Integer min()
    {

    }
}