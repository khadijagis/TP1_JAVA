public class VerificationMajorite {
    public static void main(String[] args) {
        // Vérifiez qu'un argument a été fourni
        if (args.length < 1) {
            System.out.println("Veuillez fournir votre âge en argument.");
            return;
        }

        // Convertir l'argument de String à int
        int age = Integer.parseInt(args[0]);

        // Vérifier la majorité
        if (age >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }
    }
    
}
