/*
 Variables - part of the memory which should keep a value.
 Main aim of a software program is to manipulate values.
 Variables can be :declared,kept for later use,assigned or released.

 Value types:
 Numbers (int,short,long,byte)
 Floating point numbers(float,double)
 Logical values(boolean)
 Characters(char)

 Reference types
  Arrays
  Objects


 The type of data is meant to determine the amount of memory
 assigned for given variable.

 Value types are kept in "stack"(memory stack)
 Reference types are kept in heap(memory heap)

 examples of different data types:
  */

    Numbers
       int i = 22385;
       short s = 11;
       long l = -11287829827;
       byte b = 101;

    Floating point numbers
       double d = 271.55;
       float f = -2281.11232f;

    Characters
       char c = 'p';
    Boolean
        boolean bo = true;

    /* Reference types */

    String s = 'abcde';
    String g = new String('12345');
    String k = 'Me, ' + 'Myself and' + 'Splinter';

    /* Objects - they are keeping complex data structures with
    different types of variables as well as other object.
    */

    String g = new String('abcde');
    Student paul = new Student();
    Animal pet = new Dog();

    /* Memory management:
    Stack - keeps temporary variables,has limited size,
    managed by the OS, uses Last-in-First-out(LIFO)

    Heap - no size limit,not manageable,slow performing,
    possibility of memory leaks
