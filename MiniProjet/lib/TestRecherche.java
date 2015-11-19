import static org.junit.Assert.*;

import org.junit.Test;
package com.moi.test.junit;

import junit.framework.TestCase;

public class TestRecherche extends TestCase {
   private MaClasse maClasse = null;

   public MaClasseTest(String arg0) {
         super(arg0);
   }

   public static void main(String[] args) {
         junit.swingui.TestRunner.run(MaClasseTest.class);
   }

   protected void setUp() throws Exception {
         super.setUp();
         maClasse = new MaClasse();
   }

   protected void tearDown() throws Exception {
         super.tearDown();
         maClasse = null;
   }

   public void testAdditioner() {
         assertTrue(maClasse.additioner(2,2) == 4);           
   }
}