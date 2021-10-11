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
        if(fils == null || fils.size() == 0)
        {
            return null;
        }
        //On récupère le min du premier fils
        //On compare le min des autres fils au premier et on écrase la valeur du min
        int min = fils.get(0).min();

        for(int i=0; i<fils.size(); i++)
        {
            if(fils.get(i).min() < min)
            {
                min = fils.get(i).min();
            }
        }
        return min;
    }

    Integer max()
    {
        if(fils == null || fils.size() == 0)
        {
            return null;
        }
        //On récupère le max du premier fils
        //On compare le max des autres fils au premier et on écrase la valeur du min
        int max = fils.get(0).max();

        for(int i=0; i<fils.size(); i++)
        {
            if(fils.get(i).max() > max)
            {
                max = fils.get(i).max();
            }
        }
        return max;
    }
}