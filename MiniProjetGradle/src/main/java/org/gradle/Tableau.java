package org.gradle;

import java.util.Arrays;
import java.util.Scanner;

public class Tableau{
	
	private float [] tab;
	private int taille;
	private boolean estTrie;
	
	public Tableau(int t) {
		tab= new float[t];
		taille=t;
		estTrie=false;
	}
	
	public float getTable(int i) {
		return this.tab[i];
	}
	
	public int getTaille() {
		return this.taille;
	}
	
	public boolean getEstTrie() {
		return this.estTrie;
	}
	
	public float[] GenerateurTableAleatoire() {
		for(int i=0;i<this.taille;i++) {
			this.tab[i]= (float)( Math.random()*(2200)-1100);
		}
		return this.tab;
	}
	
	public void setTable(float chg,int i){
		this.tab[i]=chg;
	}

	public void GenerateurTableManuel() {
		int i;
		Scanner sc =new Scanner(System.in);
		float val=0;
		try{
			for(i=0;i<this.taille;i++) {
				System.out.println("Entrez une valeur pour la case : "+i);
				val=sc.nextFloat();
				this.tab[i]=val;
			}
		}
			catch(Exception e){
				System.out.println("Erreur format incompatible, la case a été initialisée à 0.0");
			}
	}
	

	public int RechercheTable(float val) {
		if(!estTrie)
			  this.triTable();
		  

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
	
	 public float[] triTable() {
		 
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

	public String toString() {
		return "Tableau "+Arrays.toString(tab);
	}
}