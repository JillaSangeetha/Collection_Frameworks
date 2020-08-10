/*

                          ENUMERATION INTERFACE
-->The Enumeration interface isn't itself a data structure, but it is very important within the context of other data structures.
-->The Enumeration interface defines a means to retrieve successive elements from a data structure.

--> For example,
Enumeration defines a method called nextElement()  that is used to get the next element in a data structure
   that contains multiple elements.
 */

/*
--> it defines the methods by which you can enumerate (obtain one at a time) the elements in a collection of objects.
-->This legacy (difficult to replace because of its wide use)interface has been superceded by Iterator.
-->Although not deprecated, Enumeration is considered obsolete(out of date) for new code.
--> However, it is used by several methods defined by the legacy classes
 such as Vector and Properties, is used by several other API classes, and is currently in widespread use in application code.
*/
/*

only 2 methhods

1>.boolean hasMoreElements( )
-->When implemented, it must return
true while there are still more elements to extract,
 and false when all the elements have been enumerated.

2>.Object nextElement()
-->This returns the next object in the enumeration as a generic Object reference.
*/
import java.util.Vector;
import java.util.Enumeration;

public class Enumeration_Interface {
public static void main(String[] args){
    Enumeration e;
    Vector dayNames= new Vector();
    dayNames.addElement("Sunday");
    dayNames.add("Monday");
    dayNames.add("Tuesday");
    dayNames.add("Wednesday");
    dayNames.add("Thursday");
    dayNames.add("Friday");
    dayNames.add("Saturday");
    e = dayNames.elements();
    while (e.hasMoreElements()) {
        System.out.println(e.nextElement());
    }
}
}
