

import java.util.Scanner;

public class Main {
    public static void Polling() {

    }
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int marcelcount = 0;
        int katonsicount = 0;
        int guggisbergcount = 0;
        int gyapongcount = 0;
        int okoboyecount = 0;
        int mikecount = 0;

        do {

            System.out.println("Select User");
            System.out.println("1. Voter");
            System.out.println("2. Administrator");
            int user = userInput.nextInt();



            if (user == 1) {


                System.out.println("Welcome to Electoral Commission");
                System.out.println("This is La-Dadekotopon Constituency");
                System.out.println("Choose category");
                System.out.println("1. Presidential");
                System.out.println("2. Parliamentary");
                int category = userInput.nextInt();


                System.out.println("These are the presidential Candidates");
                System.out.println("1. Dr. Marcel (M.Y.M)");
                System.out.println("2. Prof. Guggisberg (T.A.G)");
                System.out.println("3. Dr. Katonsi (K.A.A)");
                System.out.println("4. Prof. Gyapong (G.S.P)");
                int presidential = userInput.nextInt();

                switch (presidential) {
                    case 1:

                        System.out.println("You have voted for Dr. Marcel (M.Y.M)");
                        marcelcount += 1;

                        break;


                    case 2:
                        System.out.println("You have voted for Prof. Guggisberg (T.A.G)");
                        guggisbergcount += 1;
                        break;

                    case 3:
                        System.out.println("You have voted for Prof. Katonsi (K.A.A)");
                        katonsicount += 1;
                        break;

                    case 4:
                        System.out.println("You have voted for Prof. Gyapong (G.S.P)");
                        gyapongcount += 1;
                        break;
                }
                System.out.println("");
                System.out.println("These are the Parliamentary Candidates");
                System.out.println("1. Dr. Oko Boye (NPP)");
                System.out.println("2. Mike Ayeku (NDC)");

                int parliamentary = userInput.nextInt();
                switch (parliamentary) {
                    case 1:
                        System.out.println("You have voted for Dr. Oko Boye (NPP)");
                        okoboyecount += 1;

                    case 2:
                        System.out.println("You have voted for Mike Ayeku (NDC)");
                        mikecount += 1;

                }


                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
                // to see how IntelliJ IDEA suggests fixing it.
            } else if (user == 2) {
                System.out.println("1. Collate all vote");
                int collate = userInput.nextInt();
                System.out.println("Presidential");
                System.out.println("Marcel had " + marcelcount + " votes");
                System.out.println("Dr. Katonsi had " + katonsicount + " votes");
                System.out.println("Prof. Guggisberg had " + guggisbergcount + " votes");
                System.out.println("Prof. Gyapong had " + gyapongcount + " votes");

                System.out.println("");
                System.out.println("Parliamentary");
                System.out.println("Dr. Oko Boye had " + okoboyecount + " votes");
                System.out.println("Mike Ayeku had " + mikecount + " votes");


            }


        } while (true);
    }
}