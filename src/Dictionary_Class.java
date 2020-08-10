/*                                             DICTIONARY CLASS

--> Dictionary class is an abstract class.and extends the Object class and also is present in the java.util package.
--> It defines a data structure for mapping keys to values.

--->This is useful in cases where you want to be able to access data via a particular key rather than an integer index.

-->Since the Dictionary class is abstract, it provides only the framework
 for a key-mapped data structure rather than a specific implementation.
 */


/*
-->Dictionary is an abstract class that represents a key/value storage repository and operates much like Map.
--> The Dictionary class is an abstract parent of any class, such as the Hashtable.
-->Given a key and value, you can store the value in a Dictionary object. Once the value is stored, you can retrieve it by using its key.
 Thus, like a map, a dictionary can be thought of as a list of key/value pairs.
*/


import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

class Dicitionary_Class {
    public static void main(String[] args){
        Dictionary d=new Hashtable();//java.util.Dictionary is abstract; cannot be instantiated


         d.put("1","jilla");
         d.put("2","sangeetha");
         d.put("3","sai krishna");
        System.out.println("\t"+ d);
         System.out.println("size of dictionary"+ d.size());

        System.out.println("the dicitonary is empty?:" +d.isEmpty());

         Enumeration e1=d.elements();//Returns an enumeration of the values contained in the dictionary.
        while(e1.hasMoreElements())
            System.out.println("values  in dictionary:-"+e1.nextElement());

        System.out.println();

        Enumeration e2=d.keys();
        while(e2.hasMoreElements())
            System.out.print("keys  in dictionary:-"+e2.nextElement() + "\n");

        System.out.println();

        System.out.println("\ngetting the value of key 2:-"+d.get("2")); //if key is not there return null
        System.out.println("\n removing the value of key 1:-"+d.remove("1")); //if key is not there return null
        System.out.println("\ngetting the value of key 1:-"+d.get("1"));

        }
    }

