/*


                 Hashtable	                                                                         Dictionary
Hashtable is included in the System.Collections namespace.               	Dictionary is included in the System.Collections.Generic namespace.
Hashtable is a loosely typed (non-generic) collection, this means            Dictionary is a generic collection.
it stores key-value pairs of any data types.	                             So it can store key-value pairs of specific data types.

Hashtable is thread safe.                                                	Only public static members are thread safe in Dictionary.
Hashtable returns null if we try to find a key which does not exist.	    Dictionary throws an exception if we try to find a key which does not exist.
Data retrieval is slower than dictionary because of boxing-unboxing.	    Data retrieval is faster than Hashtable.
 */
/*
                                             Difference between Hashtable and Dictionary. ...
***Hashtable is a loosely typed (non-generic) collection, this means it stores key-value pairs of any data types.
***Dictionary is a generic collection. So it can store key-value pairs of specific data types.
 */