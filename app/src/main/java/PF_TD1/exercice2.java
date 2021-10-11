//réaliser un Type générique de paire de valeurs
//Une classe avec 2 attributs ?

public class Paire<T>
{
    private T paire1 ;
    private T paire2 ;

    public T fst()
    {
        return this.paire1;
    }

}