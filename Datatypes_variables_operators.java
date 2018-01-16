/* syntax objects in java are:

    keywords
    identifiers
    blocks
    operators
    expressions
    statements
    comments

    Reserved keywords:
    abstract continue for         new         switch
    assert   default  goto        package     synchronized
    boolean  do       if          private     this
    break    double   implements  protected   throw
    byte     else     import      public      throws
    case     enum     instanceof  return      transient
    catch    extends  int         short       try
    char     final    interface   static      void
    class    finally  long        strictfp    volatile
    const    float    native      super       while

     Identifiers -names of objects.
        variables
        classes
        objects
        methods and more....  */
         e.g. :
        public class Identifier{

        }

    //Blocks - logical group of more statements:

       public class Identifier{
         public static void main (String[] args){
           statement1;
           statement2;
           {
             statement3;
             statement4;
           }
         }
       }
   /**Operators : applies action on operands. The operators will return
   result after execution
   e.g.
   3+5
   a/b
   12>7
   k++
   true||false
   5>>2
          */


   /** Expressions - they content identifiers and operators
    the can be normalized to a value e.g. :
    a+(b/100)
    c% 10+4
    282
    true || false
    5>>2 */

    /** Statements : the lowest building unit of every program
        the statement are terminated with ";"
        They are executed on the row that they are written.
        */

    public class Identifier{
      public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Hello Luke, I am your father!");
      }
    }

    /** Comments - they are allowing to enter text which is non-code
    and are used to describe fragments of code.
    The comments are helping for better readability,documentation,maintenance

    There are /*... */ //multiline Comments
    //  "//"-those comments are valid till the end of the throw
    //  javadoc style of comment is /** ..... */
