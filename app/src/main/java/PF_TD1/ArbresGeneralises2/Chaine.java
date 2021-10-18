package PF_TD1.ArbresGeneralises2;

class Chaine implements Sommable<Chaine>
{
	private String valeur; 

	public Chaine(String valeur)
	{
		this.valeur = valeur; 
	}

	public String valeurs()
	{
		return this.valeur;
	}

	@Override
	public Chaine sommer(Chaine valeur) {
		return new Chaine(this.valeurs()+valeur.valeurs());
	}
}
