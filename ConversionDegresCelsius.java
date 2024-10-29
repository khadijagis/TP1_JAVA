public class ConversionDegresCelsius {

    public static void main(String[] args) {
        // Convertir l'argument de String à double (pour la température en degrés
        // Celsius)
        double celsius = Double.parseDouble(args[0]);

        // Calculer la température en Fahrenheit
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        // Afficher le résultat
        System.out.println(celsius + " degrés Celsius équivalent à " + fahrenheit + " degrés Fahrenheit.");
    }
}
