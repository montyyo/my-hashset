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
   
   /**
    * clear(): vacía el conjunto.
    */
   public void clear()
    {
       
       int[] newnumbers = new int[numbers.length ];
        
       numbers=newnumbers;
    }
    
    /**
     * contains(int elemento): devuelve verdadero si el conjunto
     * contiene el elemento, falso en caso contrario.
     */
    public boolean contains(int elemento)
    {
        boolean find = false;
        
        int index=0;
        
        while(index < numbers.length && !find)
        {
             if(numbers[index]== elemento)
            {
                find = true;
            }
            index++;
            
        }
        
        return find;
    }
    
    
    /**
     * isEmpty(): devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty()
    {
        return (numbers.length == 0);
    }
    
    /**
     * remove(int elemento): elimina del conjunto el elemento dado. 
     * Si no existiera devuelve falso; 
     * si existía en el conjunto devuelve verdadero.
     */
    public boolean remove(int elemento)
    {
        boolean exist=false;
        int index = 0;
        int[] newnumbers = new int[numbers.length - 1];
        while(numbers.length > index && !exist)
        {
            if(numbers[index]==elemento)
            {
                exist=true;
                int pos=0;
                while(pos < numbers.length)
                {
                    if(pos < index)
                    {
                        newnumbers[pos]= numbers[pos]; 
                    }
                    else if(pos > index)
                    {
                        newnumbers[pos -1]= numbers[pos]; 
                    }
                    pos++;
                }
                
            }
            
            numbers=newnumbers;
            index++;
        }
        return exist;
    }
    
    
    /**
     * size(): devuelve el número de elementos del conjunto.
     */
    public int size()
    {
        return numbers.length;
    }
    
    /**
     * toString(): devuelve una cadena conteniendo todos los elementos
     * del conjunto separados por comas y entre corchetes.
     */
    public String toString()
    {
        String number = "[" ;
        for(int index = 0; index <numbers.length;index++)
        {
            if(index == 0)
            {
                number= number +( + numbers[index]);
            }
            else if (index>0)
            {
                number= number +(" ;" + numbers[index]);
            }
        }
        number = number + "]";
        return  number;
    }
}
