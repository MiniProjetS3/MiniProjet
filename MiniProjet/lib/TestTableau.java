import static org.junit.Assert.*;

import org.junit.Test;


import junit.framework.TestCase;

public class TestTableau extends TestCase {
   private Tableau tab = null;

   public TestTableau(String arg0) {
         super(arg0);
   }

   public static void main(String[] args) {
         junit.swingui.TestRunner.run(Tableau.class);
   }

   protected void setUp() throws Exception {
         super.setUp();
         tab = new Tableau(5);
         this.tab.GenerateurTableAleatoire();
         this.tab.setTable(1,1);
   }

   protected void tearDown() throws Exception {
         super.tearDown();
         tab = null;
   }

   public void testRechercheValide() {
	   	
         assertTrue(tab.RechercheTable(1) != -1 );           
   }
}