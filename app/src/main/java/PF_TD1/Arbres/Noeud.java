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
        Set<Integer> res = new HashSet<>();
        for(Arbre a : fils)
        {
            res.addAll(a.valeurs());
        }
        return res;
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

    boolean estTrie()
    {
        //Pour tout a appartient à fils, on a trie(a)
        boolean res = true;
        for(int i=0; i<fils.size()-1; i++)
        {
            Arbre f = fils.get(i);
            if(! f.estTrie())
            {
                return false;
            }
        }

        //Pour tout ai, aj on a le max de fils > min de fils+1
        for(int i=0; i<fils.size()-1; i++)
        {
            Arbre f = fils.get(i);
            Arbre f1 = fils.get(i+1);
            if(f.max() > f1.min())
            {
                return false;
            }
        }
        return res;
    }
}