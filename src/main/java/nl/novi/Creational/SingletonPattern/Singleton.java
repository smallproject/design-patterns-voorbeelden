package nl.novi.Creational.SingletonPattern;


public class Singleton {
    // In deze variabele wordt de enige instance van de Singleton class opgeslagen.
    // Deze variabele is static en private.
    private static Singleton INSTANCE;
    // deze counter is niet perse deel van een singleton, maar dient ter illustratie dat de constructor maar 1 keer wordt aangeroepen.
    // In de constructor zie je namelijk dat de counter bij elke aanroep met 1 verhoogd wordt.
    // Een singleton klasse kan allerlei andere methodes en variabelen hebben, naast de essentie uit dit voorbeeld.
    public int counter = 0;

    // De constructor is private, zodat dat niemand buiten deze klasse de constructor kan aanroepen met het "new" keyword.
    // In de constructor kun je dingen initialiseren, zoals een connectie met een database of het openen van een bestand.
    private Singleton(){
        counter++;
    }

    // Deze static methode geeft de gebruiker toegang tot de instance.
    public static Singleton getInstance() {
        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
