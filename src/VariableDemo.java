public class VariableDemo {
// zum ausführen brauche ich die main
    public static void main(String[] args) {

        // deklaration
        //deklarieren=Datentyp +Name

        int a;
        boolean wahr;

        char c;

        int x,y,z;

        //initializieren = Wertzuweisung

        a=3;
        wahr =true;
        c= 'C';

        //Deklarieren und initializieren in einem Zug

        int b=5;
        char d='d';

        String word="Hallo Welt!";
        //variable ausgehen

        System.out.println(a);

        System.out.println(c);

        System.out.println("word = " + word+"is it true ?  "+wahr);


        // wert abändern

        a=5;

        System.out.println("a = "+a);
        a= 5+4;
        System.out.println("a = "+a);

        a= a+1;
        System.out.println("a after a+1 = "+a);

        long l =8;
        l=a;
        //a=l; -> geht niht , da long in int nicht platz findet

        String number= "4";
        number=number+4; // String concatenation

        System.out.println("number = " +number);

        String s="Hallo";

        s=4+s+"Welt"+4+5;

        System.out.println(s);








    }
}
