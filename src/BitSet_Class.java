/*                          BITSET CLASS
-->The BitSet class implements a group of bits or flags that can be set and cleared individually.

-->This class is very useful in cases where you need to keep up with a set of
Boolean values; you just assign a bit to each value and set or clear it as appropriate.

-->The BitSet class creates a special type of array that holds bit values.
   The BitSet array can increase in size as needed. This makes it similar to a vector of bits.
   This is a legacy class but it has been completely re-engineered in Java 2, version 1.4.*/


import java.util.BitSet;
public class BitSet_Class {
    public static void main(String[] args){
        BitSet bits1=new BitSet(20);
        BitSet bits2=new BitSet(20);

        for(int i=0;i<20;i++)
        {
            if( (i%2) ==0 )  bits1.set(i);//void set(int index) :- Sets the bit specified by index.
            if( (i%5)!=0  )  bits2.set(i);
        }

        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);



        // int cardinality() returns the no.set bits in the invoking obj.
        System.out.println( " cardinality of  bits:" + bits2.cardinality());

        // void clear(int index) : Zeros the bit specified by index.
        bits2.clear(6);
        System.out.println("clearing the 5th bit from bits2 set: "+bits2);

        // void clear()int startindex,int endindex)
        bits2.clear(6,10);
        System.out.println("clearing the 6th to 9th bit from bits2 set: "+bits2);


        // void and(bitSet)
        bits2.and(bits1);
        System.out.println( " and bits:" + bits2);

        // void andNOT(bitSet)
        bits2.and(bits1);
        System.out.println("andNOT bits" +bits2);


          //Object clone()
           //Duplicates the invoking BitSet object.
        System.out.println("dulicates of  set bits1:"+bits1.clone());

         // boolean equals( Object bitSet)
        System.out.println("equal method result:"+ bits2.equals(bits1));
    }

}

