import java.util.Scanner;

public class Menu {

public void affichage(Tableau tab){
	System.out.println("Que voulez-vous faire? Créer un tableau manuellement(m) ou aleatoirement(a)?");
	Scanner sc=new Scanner(System.in);
	String choix=sc.nextLine();
		
	if(choix.equals("m")){
		tab.GenerateurTableManuel();
		System.out.println("\n Tableau crée");
	}
	else if(choix.equals("a")){
		tab.GenerateurTableAleatoire();
		System.out.println("\n Tableau crée");
	}
}
	public static void main(String[] args) {
			Menu m=new Menu();
			System.out.println("Saisir la taille du tableau désiré");
			Scanner ct=new Scanner(System.in);
			int choixTaille=ct.nextInt();
			
			Tableau tab=new Tableau(choixTaille);
			m.affichage(tab);
			tab.triTable();
			System.out.println(tab.toString());
	}

}
