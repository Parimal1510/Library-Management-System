import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

class Main {
    static String name;
    public static void main(String []args) throws IOException, ParseException {

        Issue i = new Issue();

        Return R = new Return();
        file f=new file();
        Scanner S=new Scanner(System.in);
        int a;

        System.out.println();
        System.out.println("               WELCOME TO NU BOOK STORE.....");
        System.out.println();
        System.out.print("If You Are A New Customer Press 1 Else Press Any Digit:");
        a=S.nextInt();
        System.out.println();
        System.out.print("Enter Your Name:");
        S.nextLine();
        name=S.nextLine();

        if (a==1)
        {
            f.Creat_File();
        }
        else
        {
            f.modify_data();
            f.record();
        }


        int C;
        boolean todo=true;

        while (todo)
        {
            System.out.println("=================================");
            System.out.println("               MENU              ");
            System.out.println("=================================");
            System.out.println();
            System.out.println("       --> 1.Reserve Book");
            System.out.println("       --> 2.Issue Book");
            System.out.println("       --> 3.Return Book");
            System.out.println("       --> 4.Customer Record");
            System.out.println("       --> 5.Exit");
            System.out.println();
            System.out.print("Enter Your Choice:");
            C=S.nextInt();
            System.out.println();

            switch (C)
            {
                case 1:i.reserve();
                       f.record();
                       break;
                case 2:i.issue_book();
                       f.record();
                       break;
                case 3:
                       R.return_book();
                       f.record();
                       break;
                case 4:f.show_record();
                       break;
                case 5:todo=false;
            }
        }
        System.out.println("Thank You.....");
    }
}


