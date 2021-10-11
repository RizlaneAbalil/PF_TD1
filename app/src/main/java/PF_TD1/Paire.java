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


    A fst()
    {
        return this.paire1;
    }

    B snd()
    {
        return this.paire2;
    }

    <C> changeFst<C,B>(C valeur)
    {
        return new Paire<C,B>(valeur, this.paire2);
    }

    <C> changeSnd<A,C>(C valeur)
    {
        return new Paire<A,C>(this.paire1, valeur);
    }

}