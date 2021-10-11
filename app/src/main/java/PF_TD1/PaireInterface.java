public Interface PaireInterface<A, B>
{
    A fst();

    public T snd();

    //On rajoute un paramètre de générécité à la mathéode
    <C> changeFst<C,B>(C valeur);

    <C> changeSnd<A,C>(C valeur);
}