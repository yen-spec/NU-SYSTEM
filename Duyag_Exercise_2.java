import java.util.*;
public class Duyag_Exercise_2 {
    static String mymeth(Scanner sc){
    System.out.print("Enter your Student ID: ");
    return sc.nextLine();

    }

    static void mymethod(Scanner sc, String CorrectID, String IDNumber, String Fname, String Level, String Sec){
        int attempts = 0;
        boolean correct = false;


        while (attempts < 5 && !correct){
        
        if(IDNumber.equals(CorrectID)){

            System.out.println("Full name: " + Fname);
            System.out.println("Year level: " + Level);
            System.out.println("Section: " + Sec);
            

        correct = true;
        }

        else{

        attempts++;

        if(attempts < 5)
        {

        System.out.print("Please Try Again: ");
        IDNumber = sc.nextLine();
}

        else
        {
        System.out.println("Too many incorrect ID number.");
        System.exit(0);
        }

        }
        
        }
        
        }

        static void mythree(Scanner sc) {
            int ITC,FOP,RPH,UTS,STS,PURCOMM,PATHFIT;
            double GWA;

            System.out.println("Enter your grade for ITC: ");
            ITC = sc.nextInt();

            System.out.println("Enter your grade for FOP: ");
            FOP = sc.nextInt();

            System.out.println("Enter your grade for RPH: ");
            RPH = sc.nextInt();

            System.out.println("Enter your grade for UTS: ");
            UTS = sc.nextInt();

            System.out.println("Enter your grade for STS: ");
            STS = sc.nextInt();

            System.out.println("Enter your grade for PURCOMM: ");
            PURCOMM = sc.nextInt();

            System.out.println("Enter your grade for PATHFIT: ");
            PATHFIT = sc.nextInt();
        
            GWA= ((ITC + FOP + RPH + UTS + STS + PURCOMM + PATHFIT )/7);
            System.out.println("Your GWA is: " + GWA);
        
            if(GWA>=91 && GWA<=100){
        
            System.out.println("You are First Honors Deans List. Congratulations!");
        }
            else if(GWA>=85 && GWA<=90){
                System.out.println("You are Second Honors Deans List. Congratulations!");
            }
            else{
                System.out.println("Better Luck Next Time");
            }
            
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String IDnum = mymeth(sc);
        String CorrectID = "2025-1055762";

        mymethod(sc, CorrectID, IDnum, "Rod Angelo Duyag", "1st Year", "INF252");
        mythree(sc);
    }
    }
