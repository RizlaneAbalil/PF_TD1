/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package PF_TD1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public int taille_Arbres_Entier
    {
	Arbre<Entier> v = new Feuille<>(new Entier(4));
	assertEquals(v.taille(), 1); 
    }
    @Test public int taille_Arbres_Chaine
    {
	Arbre<Chaine> v = new Feuille<>(new Chaine("quatre"));
	asserEquals(v.taille(), 1); 
    }
}
