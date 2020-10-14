import java.util.*;
public class Mystery {
	static void niveauBas() {
		System.out.println("Niveau facile: Le mystere est entre 0 -> 100"); 
		Random rand = new Random(); 
        int randInteger = rand.nextInt(100); 
        int downCounter = 15;
        boolean Checker = false;
        while((downCounter > 0) && (Checker == false)) {
        	downCounter--;
        	System.out.println("Donner le numbre:");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			if(number == randInteger) {
				System.out.println("Bravo! Vous avez ganger");
				Checker = true;
			} else if (number > randInteger) {
				System.out.println("C'est mois, Il rest :" + downCounter);
			}else {
				System.out.println("C'est plus, Il rest :" + downCounter);
			}
        }
	}
	static void niveauMoyen() {
		System.out.println("Niveau Moyen: Le mystere est entre 0 -> 10000"); 
		Random rand = new Random(); 
        int randInteger = rand.nextInt(10000); 
        int downCounter = 10;
        boolean Checker = false;
        while((downCounter > 0) && (Checker == false)) {
        	downCounter--;
        	System.out.println("Donner le numbre:");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			if(number == randInteger) {
				System.out.println("Bravo! Vous avez ganger");
				Checker = true;
			} else if (number > randInteger) {
				System.out.println("C'est mois, Il rest :" + downCounter);
			}else {
				System.out.println("C'est plus, Il rest :" + downCounter);
			}
        }
	}
	static void niveauhard() {
		System.out.println("Difficile: Le mystere est entre 10 -> 100 et un caractere (Maj) entre A-Z");
		Random r = new Random();
		char X = (char)(r.nextInt('Z' - 'A') + 'A');
		int randInteger = r.nextInt((100 - 10) + 1) + 10;
		int downCounter = 10;
        boolean CheckerNumber = false;
        boolean CheckerChar = false;
        while((downCounter > 0) && ((CheckerNumber == false)||(CheckerChar == false))) {
        	downCounter--;
        	System.out.println("Donner le numbre:");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
        	System.out.println("Donner le caractére:");
			char char1 = sc.next().charAt(0);
			if(number == randInteger) {
				System.out.println("Le numbre est correct");
				CheckerNumber = true;
			} else if (number > randInteger) {
				if(CheckerChar == false && CheckerNumber == false) {
					System.out.println("le numbre est mois, ");
				}else {
					System.out.println("le numbre est incorrecte, ");
				}
				
			}else {
				if(CheckerChar == false && CheckerNumber == false) {
				     System.out.println("le numbre est plus, ");
				}else {
					System.out.println("le numbre est incorrecte, ");
				}
			}
		    //int compareOneTwo = Character.compare(firstValue, secondValue);
			////----------------------------------------------------------
			if(char1 == X) {
				if(CheckerChar == false && CheckerNumber == false) {
					System.out.println("Le caratere est correct");
				}else {
					System.out.println("Le caratere est correct, Il reste :" + downCounter);
				}
				
				CheckerChar = true;
			} else if (char1 > X) {
				if(CheckerChar == false && CheckerNumber == false) {
					System.out.println("C'est avant de ce caractere, Il reste :" + downCounter);
				}else {
					System.out.println("le caractere est incorrecte, Il reste :" + downCounter);
				}
			}else {
				if(CheckerChar == false && CheckerNumber == false) {
					System.out.println("C'est apres de ce caractere, Il reste :" + downCounter);
				}else {
					System.out.println("le caractere est incorrecte, Il reste :" + downCounter);
				}
			}
        }
        if((CheckerNumber == true)&&(CheckerChar == true)) {
			System.out.println("Bravo! Vous avez ganger");
        }else {
			System.out.println("dsl! le number est: " + randInteger + "" +X);
        }			
	}
	public static void main(String[] args) {
		System.out.println("Bienvenue dans la jeu"); 
		System.out.println("Choisir le niveau"); 
		System.out.println("1) Niveau facile"); 
		System.out.println("2) Niveau moyen"); 
		System.out.println("3) Niveau difficile"); 
		System.out.println("0) Quitter"); 
		Scanner sc = new Scanner(System.in);
		int selector = sc.nextInt();
		switch (selector) {
		case 1: {
			niveauBas();
			break;
		}
		case 2: {		
			niveauMoyen();
			break;
		}
		case 3: {
			niveauhard();
			break;
		}
		default:
			System.out.println("La jeu est terminer");
		}
	}
}
