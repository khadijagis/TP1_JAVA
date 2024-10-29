public class CalculatriceAddition {
    
        public static void main(String[] args) {
            // Vérifiez que deux arguments ont été fournis
            if (args.length < 2) {
                System.out.println("Veuillez fournir deux nombres.");
                return;
            }
    
            // Convertir les arguments de String à int
            int nombre1 = Integer.parseInt(args[0]);
            int nombre2 = Integer.parseInt(args[1]);
    
            // Calculer la somme
            int somme = nombre1 + nombre2;
    
            // Afficher le résultat
            System.out.println("La somme est : " + somme);
        }
    }
    
    

