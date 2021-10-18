package td1.arbres;

import java.util.Set;

public class Feuille<T> implements Arbre<T> {

    private final T  valeur;

    public Feuille(final T valeur) {
        this.valeur = valeur;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(final T  val) {
        return val.equals(valeur);
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(valeur);
    }

    /*@Override
    public Integer somme() {
        return valeur;
    }

    @Override
    public Integer min() {
        return valeur;
    }

    @Override
    public Integer max() {
        return valeur;
    }

    /**
     * une feuille est toujours triée.
     *//*
    @Override
    public boolean estTrie() {
        return true;
    }*/
    
}
