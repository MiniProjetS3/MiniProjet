package org.gradle;

import static org.junit.Assert.*;
import org.junit.Test;


import junit.framework.TestCase;

public class TestTableau extends TestCase {
   private Tableau tab = null;

   public TestTableau(String arg0) {
         super(arg0);
   }

   protected void setUp() throws Exception {
         super.setUp();
         tab = new Tableau(5);
         tab.GenerateurTableAleatoire();
         
   }

   protected void tearDown() throws Exception {
         super.tearDown();
         tab = null;
   }

   public void testRechercheValide() {
	     this.tab.setTable(1, 1);
         assertTrue(tab.RechercheTable(1) == 1  );           
   }
   
   public void testRechercheNonValide() {
	   this.tab.setTable(1, 1);
       assertTrue(tab.RechercheTable(-2) == -1  );   
  }

}
