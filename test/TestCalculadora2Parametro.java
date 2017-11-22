/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora2.Calculadora2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author vesperon
 */
@RunWith(value=Parameterized.class)         //Notacion obligatoria para usar parameters
public class TestCalculadora2Parametro {
    
    @Parameters         //Los parameters que usaremos
    public static Iterable<Object[]> getData(){             //Array de arrays con los parametros
        return Arrays.asList(new Object[][]{{3,1,4},{6,6,12},{-1,2,1}   //Parametros a,b,expected
});
}
    static Calculadora2 calc;       //Variables
    private int a;
    private int b;
    private int expected;
    
    public TestCalculadora2Parametro(int a, int b, int expected)    //Constructor
    {
        this.a=a;
        this.b=b;
        this.expected=expected;
    }
    @BeforeClass
    public static void setUpClass() {
        calc=new Calculadora2();    //Creamos el objeto calc solo 1 vez
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calc.clear();       //Reiniciamos cal despues de cada test para que este limpia
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAdd()
    {
        int result= calc.add(a, b);         //El test, le entran a y b como parametros
        assertEquals(expected, result);     //expected es un parametro
    }
}
