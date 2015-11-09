import java.util.Scanner;

public class Menu {

public void affichage(Tableau tab){
	Scanner sc=new Scanner(System.in);
	System.out.println("Que voulez-vous faire? Créer un tableau manuellement(m) ou aleatoirement(a)?");
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
			Tableau tab=new Tableau(50);
			m.affichage(tab);
			
			tab.GenerateurTableAleatoire(); 
			tab.triTable();
			System.out.println(tab.toString());
	}

}
