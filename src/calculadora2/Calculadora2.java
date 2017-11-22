package calculadora2;

/**
 * Principalmente es una calculadora
 * @author vesperon
 * @version 23.2
 * @since creacion del universo
 */
public class Calculadora2 {
    private int ans;
    
    
    /**
     * Constructor de todo
     * @author Marc Serret
     * @version 23.2
     * @since creacion del universo
     */
    public Calculadora2(){
        ans=0;
    }
    /**
     * Metodo de suma
     * @author Marc Serret
     * @param a operand 
     * @param b operand 2
     * @return ans el resultado
     * @version 23.2
     * @since creacion del universo
     */
    public int add(int a, int b){
        ans=a+b;
        return ans;
    }
    /**
     * Metodo de resta
     * @author Marc Serret
     * @param a operand 1
     * @param b operand 2
     * @return ans el resultado
     * @version 23.2
     * @since creacion del universo
     */
    public int sub(int a, int b){
        ans=a-b;
        return ans;
    }
    /**
     * Metodo de suma acumulativa
     * @author Marc Serret
     * @param v operand 1
     * @return ans el resultado
     * @version 23.2
     * @since creacion del universo
     */
    public int addAcu(int v)
    {
        ans=+v;
        return ans;
    }
    /**
     * Metodo de resta acumulativa
     * @author Marc Serret
     * @param v operand 1
     * @return ans el resultado
     * @version 23.2
     * @since creacion del universo
     */
    public int subAcu (int v)
    {
        ans=-v;
        return ans;
    }
    /**
     * Metodo de devolver
     * @author Marc Serret
     * @version 23.2
     * @return ans el resultado
     * @since creacion del universo
     */
    public int ans (){
        return ans;
    }
    /**
     * Metodo de limpiar
     * @author Marc Serret
     * @version 23.2
     * @since creacion del universo
     */
    public void clear(){
        ans=0;
    }
    /**
     * Metodo de dividir
     * @author Marc Serret
     * @param a operand 1
     * @param b operand 2
     * @return ans el resultado
     * @version 23.2
     * @since creacion del universo
     */
    public int dividir(int a, int b){
        if (b==0) throw new ArithmeticException("No puedes dividir entre 0");
        ans=a/b;
        return ans;
    }
    /**
     * Metodo de operacionlmao
     * @author Marc Serret
     * @version 23.2
     * @throws InterruptedException
     * @since creacion del universo
     */
    public void operacionOptima() throws InterruptedException{
        Thread.sleep(2000);
        
    }
}
