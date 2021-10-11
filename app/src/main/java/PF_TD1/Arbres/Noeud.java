class Noeud implements Arbre
{
    private List<Arbre> fils;

    public Noeud(List<Arbre> fils)
    {
        this.fils = fils;
    }

    int taille()
    {
        return fils.size();
    }


}