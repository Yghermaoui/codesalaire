package y;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Initialisation des variables
        int Salaire = 400;
        int prime = 250;
        int quota = 10;

        // Récupérer le nombre dentes
        System.out.print("Combien de ventes avez-vous conclues cette semaine ?");
        Scanner clavier = new Scanner(System.in);
        int nbVentes = clavier.nextInt();
        clavier.close();

        // Test : prime ou pas ?
        if (nbVentes >= quota) {

            Salaire = Salaire + prime;
        }

        // Affichage
        System.out.println("Votre salaire est de : " + Salaire + " euros");

    }
}
