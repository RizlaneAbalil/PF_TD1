package PF_TD1.ArbresGeneralises2;

class Entier implements Sommable<Entier>
{
	private int valeur; 

	public Entier(int valeur)
	{
		this.valeur = valeur;
	}

	//getteur
	public int valeurs()
	{
		return this.valeur;
	}

	@Override
	public Entier sommer(Entier valeur) {
		return new Entier(this.valeurs() + valeur.valeurs());
	}
}
