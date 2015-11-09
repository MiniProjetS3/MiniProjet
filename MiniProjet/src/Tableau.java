import java.util.Scanner;


public class Tableau {
	
	private float[] tab;
	private int taille;
	private boolean estTrie;
	
	public Tableau(int t) {
		tab= new float[t];
		taille=t;
		estTrie=false;
		
	}
	
	public float getTab(int i) {
		return this.tab[i];
	}
	
	public int getTaille() {
		return this.taille;
	}
	
	public boolean getEstTrie() {
		return this.estTrie;
	}
	
	public float[] RemplirAlea() {
		for(int i=0;i<this.taille;i++) {
			this.tab[i]= (float)( Math.random()*(22000000)-11000000);
		}
		return this.tab;
	}
	
	public float[] RemplirMain() {
		Scanner sc =new Scanner(System.in);
		float val=0;
		for(int i=0;i<this.taille;i++) {
			System.out.println("Entrez une valeur pour la case : "+i);
			val=sc.nextFloat();
			this.tab[i]=val;

		}
		return this.tab;
	}
	
	public int RechercheDicho(int val) {
		
		  boolean trouve; 
		  int id; 
		  int ifin;  
		  int im; 
		  

		  trouve = false;  
		  id = 0;  
		  ifin = taille;  
		  
		
		  while(!trouve && ((ifin - id) > 1)){

		    im = (id + ifin)/2;  
		    
		    trouve = (tab[im] == val);  
		    if(tab[im] > val) 
		    	ifin = im;  
		    else 
		    	id = im;  
		  }
		  

		  if(tab[id] == val)
			  return(id);  
		  else 
			  return(-1);  
		  
		}
	
	 public float[] tribulles() {
		 
             for (int i=0 ;i<=this.taille;i++) {
                     for (int j=i+1;j<this.taille;j++) {
                             if (this.tab[i] > this.tab[j]) {
                                     float x=this.tab[j];
                                     this.tab[j]=this.tab[i];
                                     this.tab[i]=x;
                             }
                     }
             }
             this.estTrie=true;
             return this.tab;
     } 


	}


