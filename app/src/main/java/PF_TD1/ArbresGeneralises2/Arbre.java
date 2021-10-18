public interface Arbre<T>
{
    int taille(); // nombre de valeurs
    //Avant on passait des integers mais maintenant le type peut être générique (voitures, int, string ...)
    boolean contient(final T  val); // vrai si val est contenue dans l'arbre,
    faux sinon
    Set<T> valeurs(); // ensemble des valeurs différentes dans l'arbre
    //Integer somme(); // somme des valeurs
    // Integer min(); // valeur minimale
    //Integer max(); // valeur maximale
    //boolean estTrie(); // vrai si l'arbre est trié, faux sinon
}
