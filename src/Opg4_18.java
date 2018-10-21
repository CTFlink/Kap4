import java.util.Scanner;

public class Opg4_18 {
    public static void main(String[] args) {

        //Her initialiseres et par variable og en scanner metode der benyttes senere
        Scanner input = new Scanner(System.in);
        int tal =0;
        String proffession=null;
        String grad=null;


        //While loopet kører indtil brugeren har indtastet et gyldigt input
        int i=0;
        while (i==0) {

            //Her modtages brugerens input
            System.out.println("Indtast en proffesion M: Mathematics C: Computer Science I: Information Technology " +
                    "og en grad 1,2,3,4");
            String indtastet = input.nextLine();

            //Her testes om brugerens input er gyldigt
            proffession = indtastet.substring(0, 1);
            grad = indtastet.substring(1);
            if (proffession.equalsIgnoreCase("M") || proffession.equalsIgnoreCase("C") ||
                    proffession.equalsIgnoreCase("I")) {
                if (grad.equalsIgnoreCase("1") || grad.equalsIgnoreCase("2") ||
                        grad.equalsIgnoreCase("3") || grad.equalsIgnoreCase("4")) {
                    i++;
                }
            } else System.out.println("Ugyldigt input. Prøv igen");
        }

        //Her læser programmet hvilken proffession der er indtastet
        //Det er ikke så kønt da jeg måtte lave en case for både store of små bogstaver...
        // man ku evt. convertere bogstaverne før denne switch
        switch(proffession) {
            case "M":
                proffession = "Mathematician";
                break;
            case "m":
                proffession = "Mathematician";
                break;
            case "C":
                proffession = "Computer Science";
                break;
            case "c":
                proffession = "Computer Science";
                break;
            case "I":
                proffession = "Information Technology";
                break;
            case "i":
                proffession = "Information Technology";
                break;
        }

        //Her læser programmet hvilken grad der er indtastet
        switch(grad) {
            case "1":
                grad = "freshman";
                break;
            case "2":
                grad = "sophomore";
                break;
            case "3":
                grad = "junior";
                break;
            case "4":
                grad = "senior";
                break;
        }

        //Her printes resultatet ud
        System.out.printf("%s %s", proffession, grad );

    }
}
