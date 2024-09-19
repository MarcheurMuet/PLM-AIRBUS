import java.util.Scanner;

public class Avions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Voulez vous afficher un avion spécifique?");
        int i = 0;
        String[][] Piece = {
                {"Aile","Structure","50000"},
                {"Escalator","Mécanique","3000"},
                {"Siège","Confort","250"}
        };
        
        String[][] Plane = {
                {"[Marshal]","[A320]","[phase 2]","[Type 2]" + Piece[i]},
                {"[Eleonor]","[A400M]","[phase 3]","[Type 1]"},
                {"[Icarus]","[A380]","[phase 1]","[Type 3]"}
        };
        
        String Respond = scan.nextLine();
        if (Respond.contains("non tous")){
            for (int l = 0; l < Plane.length; l++) {
                for (int j = 0; j < 4; j++) {
                System.out.print(" " + Plane[l][j] + " ");  
                }
            }
        } else if (Respond.contains("oui")) {
            //afficher une seul avion en fonction de son nom
            System.out.println("le quel?");
            String PlaneResearch = scan.nextLine();

            boolean PlaneFind = false;
            for (String[] PlaneS : Plane) {
                if (PlaneS[1].contains(PlaneResearch)) {
                    for (String info : PlaneS) {
                        System.out.print(info + " " + "\n");
                    }
                    
                    for (String[] PieceS : Piece) {
                    	for (String info : PieceS) {
                    System.out.println(info);
                    }
                    PlaneFind = true;
                    break;
                    }
                }
            }
            
            if (!PlaneFind) {
                System.out.println("Aucun avion trouvé avec ces données.");    
            }

        System.out.println("\nVoulez vous apportez une modification?");
        Respond = scan.nextLine();

        if (Respond.contains("oui")) {
            System.out.println("Que souhaitez-vous faire ? (ajouter pièce ou supprimer pièce)");
            String action = scan.nextLine();

            if (action.equalsIgnoreCase("ajouter")) {
                System.out.println("Entrez les informations de la pièce (séparées par des espaces) : ");
                String[] NewsPiece = scan.nextLine().split(" ");
                String[][] NewPiece = new String[Piece.length + 1][Piece[0].length];
                System.arraycopy(Piece, 0, NewPiece, 0, Piece.length);
                NewPiece[Plane.length] = NewsPiece;
                Piece = NewPiece;
                System.out.println("pièce ajouté ! \n");
                for (int l = 0; l < Piece.length; l++) {
                    for (int j = 0; j < 3; j++) {
                    System.out.print("["+Piece[l][j]+"]" + "\n");  
                    }
                    System.out.println("--------------------\n");
                }
                
            } else if (action.equalsIgnoreCase("modifier")){
            	
            } else if (action.equalsIgnoreCase("supprimer une pièce")){
            	
            } else {
            	
            }
            } else {
            System.out.println("c'est tout bon alors!");
        }
        scan.close();
        }
    }
}