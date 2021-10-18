package PF_TD1.ArbresGeneralises2;

import PF_TD1.ArbresGeneralises2.Sommable;

import java.util.Set;

public interface Arbre<T extends Sommable<T>>
{
    int taille(); // nombre de valeurs

    //Avant on passait des integers mais maintenant le type peut être générique (voitures, int, string ...)
    boolean contient(final T  val); // vrai si val est contenue dans l'arbre,faux sinon

    Set<T> valeurs(); // ensemble des valeurs différentes dans l'arbre

    T somme(); // somme des valeurs
    T min(); // valeur minimale
    T max(); // valeur maximale
    //boolean estTrie(); // vrai si l'arbre est trié, faux sinon
}
