import java.util.Scanner;
public class Master{
    
    String Sentence;  //Sentence entered by the user
    String Uppercase; // Sentence converted to Upper case
    int A; //Number of words starting with A
    int i; // Used in for loop in Starting_with_A function

    public void Input(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the sentece:");
        Sentence = sc.next();
    }

    public String UpperCase(){
        Uppercase = Sentence.toUpperCase();

        return Uppercase;
    }

    public int Starting_with_a(){
         for( i = 0; i < Sentence.length(); i++ )
              {
                if(i ==0 && Sentence.charAt(i) == 'A')
                    A++;

                if((Sentence.charAt(i) == ' ') && (Sentence.charAt(i) == 'A'))
                    A++;
              }
          return A;
    }
    public void Output(){
        System.out.println("The sentece you entered: "+ Sentence);
        System.out.println("The sentece in upper case: "+ Uppercase);
        System.out.println("The number of words that start with A: "+ A);
    }
    public static void main() {
        Master master = new Master();
        master.Input();
        master.UpperCase();
        master.Starting_with_a();
        master.Output();
    }

}
