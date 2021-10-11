//réaliser un Type générique de paire de valeurs
//Une classe avec 2 attributs ?

public class Paire<A,B> implements PaireInterface<A,B>
{
    private A paire1 ;
    private B paire2 ;

    public Paire(A paire1, B paire2)
    {
        this.paire1 = paire1;
        this.paire2 = paire2;
    }

    public A fst()
    {
        return this.paire1;
    }

    public B snd()
    {
        return this.paire2;
    }

    public T changeFst(A valeur)
    {
        this.paire1 = valeur ;
        return new Paire<A>(this.paire1, this.paire2);
    }

    public T changeSnd(T valeur)
    {
        this.paire2 = valeur ;
    }

}