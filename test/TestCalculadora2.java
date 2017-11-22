/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora2.Calculadora2;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vesperon
 */
public class TestCalculadora2 {             //Primero before, luego tests i luego after
    static Calculadora2 calc;
    Date date1;
    Date date2;
    
    @BeforeClass                            //El beforeClass salta antes que el before. Es mas optimo crear los objetos aqui i en before limpiarlos, ya que before salta antes de cada @Test
    public static void beforeClass(){
        System.out.println("beforeClass");
        calc=new Calculadora2();
    }
    @Before
    public void before(){
        System.out.println("before");
        //calc=new Calculadora2();
        calc.clear();
        date1=new Date();
        date2=new Date();
    }
    @After
    public void after(){
        System.out.println("after");
        calc.clear();
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }
    
    @Test
    public void TestSum() {
        System.out.println("sum");
        int resul=calc.add(3,2);
        int esperado=5;
        assertEquals(esperado, resul);
    }
    @Test
    public void ansSum() {
        System.out.println("ansSum");
        calc.add(3,2);
        int resul=calc.ans();
        int esperado=5;
        assertEquals(esperado, resul);
    }
    @Test
    public void daraFalse(){
        System.out.println("daraFalse");    
        assertFalse(false);
}
    @Test    
    public void daraTrue(){                 //Tambien existe con assertNull
        System.out.println("daraTrue");    
        assertTrue(true);
}
    @Test
   public void sameStrings(){                 
        System.out.println("sameStrings");
        String s1="hola";
        String s2="hola";
        assertEquals(s1,s2);
}
   /*@Test
   public void sameDate(){                 
        System.out.println("sameDate");
        assertSame(date1,date2);
}*/
   @Test
   public void TestDiv() {
        calc.dividir(5,2);
    }
   @Test(expected = ArithmeticException.class)      //Se espera que salti excepcio, si salta tot correcte
   public void TestDivEntre0() {
        calc.dividir(5,0);
    }
   /*@Test(timeout = 1000)        //Si pasen mes de 1000ms peta y test failed
   public void TestOperacionOptima() throws InterruptedException {
        calc.operacionOptima();
    }*/

}
