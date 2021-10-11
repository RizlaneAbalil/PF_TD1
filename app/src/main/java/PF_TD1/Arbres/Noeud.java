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




}