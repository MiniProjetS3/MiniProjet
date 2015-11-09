
public class Menu {

	public static void main(String[] args) {
			Tableau tab=new Tableau(50);
			tab.GenerateurTableAleatoire(); 
			tab.triTable();
			System.out.println(tab.toString());
	}

}
