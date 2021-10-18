package td1.arbres;

import PF_TD1.ArbresGeneralises2.Arbre;
import PF_TD1.ArbresGeneralises2.Sommable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Sommable<T> & Comparable> implements Arbre<T> {

    private final List<Arbre<T>> fils;

    public Noeud(final List<Arbre<T>> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for (final Arbre<T> a : fils) {
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(final T  val) {
        boolean rtr = false;
        for (final Arbre<T> a : fils) {
            if (a.contient(val)) return true;
        }
        return rtr;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final Arbre<T> a : fils) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }

    public T somme()
    {
        T v = fils.get(0).somme();
        for(int i=1; i<fils.size(); i++)
        {
            v = v.sommer(fils.get(i).somme());
        }
        return v;
    }

    /*
    @Override
    public Integer somme() {
        if (fils == null || fils.size() == 0)
            return null; // should it be 0 ? no because nothing to sum
        // alternative without 0 initialization
        // int rtr = fils.get(0).somme();
        // for (int i = 1; i<fils.size(); i++) {
        //     rtr += fils.get(i).somme();
        // }
        int rtr = 0;
        for (Arbre a : fils) {
            rtr += a.somme();
        }
        return rtr;
    }*/

    @Override
    public T min() {
        if (fils == null || fils.size() == 0)
            return null;
        T rtr = fils.get(0).min();
        for (int i = 1; i < fils.size(); i++) {
            T min = fils.get(i).min();
            //Comparer 2 objets
            if (min.compareTo(rtr) < 0) {
                rtr = min;
            }
        }
        return rtr;
    }

    @Override
    public T max() {
        if (fils == null || fils.size() == 0)
            return null;
        T rtr = fils.get(0).max();
        for (int i = 1; i < fils.size(); i++) {
            T max = fils.get(i).max();
            if (max.compareTo(rtr) > 0) {
                rtr = max;
            }
        }
        return rtr;
    }
    /*

    /**
     * un noeud de fils f1 ... fi ... fn est trié ssi
     * <ol>
     * <li>&forall; i &in; 1..n, fi est trié</li>
     * <li>&forall; i &in; 1..n-1, max(fi)<= min(fi+1)</li>
     * </ol>
     *//*
    @Override
    public boolean estTrie() {
        return conditionTrie1() && conditionTrie2();
    }

    private boolean conditionTrie1() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            if (!fi.estTrie())
                return false;
        }
        return rtr;
    }

    private boolean conditionTrie2() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            final Arbre fj = fils.get(i+1);
                if (fi.max() > fj.min())
                    return false;
        }
        return rtr;
	}*/
    
}
