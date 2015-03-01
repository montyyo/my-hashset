import java.util.ArrayList;

public class MyHashSet
{
    private int[] numbers;

   
    public MyHashSet()
    {
       this.numbers=new int[0];
       
    }

    /**
     * add(int valor): añade el elemento al
     * conjunto si no estaba. Devuelve verdadero 
     * en caso de que el elemento no estuviera presente
     * en el conjunto y falso en caso contrario.
     */
   public boolean add(int valor)
   {
       boolean exist = false;
       int index = 0;
       
       while(index < numbers.length && !exist)
       {
           if(numbers[index] == valor)
           {
               exist = true;
               
            }
            index++;
       }
       
       if(exist==false)
       {
           int pos=0;
           int[] newnumbers = new int[numbers.length + 1];
           while(pos<numbers.length)
           {
               newnumbers[pos]=numbers[pos];
               pos++;
            }
           newnumbers [numbers.length]=valor;
           numbers=newnumbers;
       }
       return exist;
   }
}
