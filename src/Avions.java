import java.util.*;

public class Avions {
    public static void main(String[] args) {
    	String Respond = "";
    	CharSequence RespondIN = "0";
    	String action = "";
        Scanner scan = new Scanner(System.in);
        String[][] Piece = {
                {"Aile","Structure","50000"},
                {"Escalator","Mécanique","3000"},
                {"Siège","Confort","250"}
        };
        // faire un arraylist pour la tableau Plane
        // avec hashmap et list
        String[][] Plane = {
        {"[18]","[Marshal]","[A320]","[phase 2]","[Type 2]"},
        {"[42]","[Eleonor]","[A400M]","[phase 3]","[Type 1]"},
        {"[73]","[Icarus]","[A380]","[phase 1]","[Type 3]"},
        };
        
        if (Respond.contains("6")) {
        	System.out.println("c'est tout bon alors!");
    	} else while (Respond != "6") {
    		System.out.println("------------------------------------------------------------------------\n1 : Afficher tous les avions.\n2 : Afficher tous les avions contenant le mot clé dans le programme.\n3 : Ajouter ou supprimer une pièce pour un avion donné.\n4 : Afficher un avion avec les infos détaillées de chaque pièces.\n5 : Afficher le menu\n6 : Quitter l'application.\n------------------------------------------------------------------------");
            Respond = scan.next();
            if (Respond.contains("1")){
                for (int l = 0; l < Plane.length; l++) {
                    for (int j = 0; j < 4; j++) {
                    System.out.print(Plane[l][j] + " ");  
                    }
                    System.out.println("\n");
                }
            } 
            
            if (Respond.contains("2")) {
                System.out.println("le quel?");
                RespondIN = scan.next();
                
                for (String[] PlaneS : Plane) {
                    if (PlaneS[0].contains(RespondIN)) {
                        for (String info : PlaneS) {
                            System.out.print(info + " " + "\n");
                        }   
                    }
                }
            }

            if (Respond.contains("3")) {
                System.out.println("Que souhaitez-vous faire ? (ajouter pièce ou supprimer pièce)");
                action = scan.next();

                if (action.equalsIgnoreCase("ajouter")) {
                    System.out.println("Entrez les informations de la pièce (séparées par des espaces) : ");
                    //ajouter la pièce
                    System.out.println("Pièce ajouté avec succès! \n");
                    //montrer l'avions dont les pièces ont été ajouter
                } else if (action.equalsIgnoreCase("supprimer")){
                	//supprimer la pièce
                	System.out.println("Pièce supprimer avec succès! \n");
                }
            }
                if (Respond.contains("4")){
                	System.out.println("Quel est la pièce de l'avions souhaiter?");
                	RespondIN = scan.next();
                	}
                if (Respond.contains("5")) {
                	//le menu ^^
                }
            } scan.close();
    	} 
	}