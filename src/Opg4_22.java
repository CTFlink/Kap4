import java.util.Scanner;

//(Check substring) Write a program that prompts the user to enter two strings and reports whether the second string is
// a substring of the first string.

public class Opg4_22 {
    public static void main(String[] args) {


        String a ="";
        String b ="";
        Scanner input=new Scanner(System.in);

        System.out.println("indtast en string 'a' og en string 'b'");
        a = input.nextLine();
        b = input.nextLine();


        int hej = a.indexOf(b);

        if (hej >=0){
            System.out.println("String b er en substring af string a");
        }
        else {
            System.out.println("String b er ikke en substring af string a");
    }
}}