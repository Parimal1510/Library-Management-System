import java.util.Scanner;
class Reserve {
    Books ob = new Books();
    static int[] A1 = new int[4];
    static int[] A2 = new int[4];
    static int[] A3 = new int[4];
    static int[] A4 = new int[4];
    int c1 = 0, c2 = 0, c3 = 0, c4 = 0;

    Scanner sc = new Scanner(System.in);
    String No;

    void reserve() {
        int C1 = 0, C2 = 0, C3 = 0, C4 = 0;
        ob.set_biography();
        ob.set_comedy();
        ob.set_fiction();
        ob.set_sport();
        System.out.println("Which Type Of Book You Want To Reserve");
        System.out.println();
        System.out.println("-->1.Bio Graphy");
        System.out.println("-->2.Sport");
        System.out.println("-->3.Comedy");
        System.out.println("-->4.Science Fiction");
        System.out.println();
        System.out.print("Enter your Choise:");
        int choice;
        choice = sc.nextInt();
        System.out.println();
        if (choice == 1) {
            for (int i=0;i<4;i++)
            {
              if (Issue.A2[i]!=0)
              {
                c2++;
              }
              if (Issue.A3[i]!=0)
              {
                  c3++;
              }
              if (Issue.A4[i]!=0)
              {
                    c4++;
              }
            }
            if ((c2 != 0 && c3 != 0) || (c2 != 0 && c4 != 0) || (c4 != 0 && c3 != 0)) {
                System.out.println("You can Not Reserve More Than 2 types of Books");
                return;
            }
        } else if (choice == 2) {
            for (int i=0;i<4;i++)
            {
                if (Issue.A1[i]!=0)
                {
                    c1++;
                }
                if (Issue.A3[i]!=0)
                {
                    c3++;
                }
                if (Issue.A4[i]!=0)
                {
                    c4++;
                }
            }
            if ((c1 != 0 && c3 != 0) || (c1 != 0 && c4 != 0) || (c4 != 0 && c3 != 0)) {
                System.out.println("You can Not Reserve More Than 2 types of Books");
                return;
            }
        } else if (choice == 3) {
            for (int i=0;i<4;i++)
            {
                if (Issue.A2[i]!=0)
                {
                    c2++;
                }
                if (Issue.A1[i]!=0)
                {
                    c1++;
                }
                if (Issue.A4[i]!=0)
                {
                    c4++;
                }
            }
            if ((c1 != 0 && c2 != 0) || (c1 != 0 && c4 != 0) || (c4 != 0 && c2 != 0)) {
                System.out.println("You can Not Reserve More Than 2 types of Books");
                return;
            }
        } else if (choice == 4) {
            for (int i=0;i<4;i++)
            {
                if (Issue.A2[i]!=0)
                {
                    c2++;
                }
                if (Issue.A3[i]!=0)
                {
                    c3++;
                }
                if (Issue.A1[i]!=0)
                {
                    c1++;
                }
            }
            if ((c1 != 0 && c2 != 0) || (c1 != 0 && c3 != 0) || (c3 != 0 && c2 != 0)) {
                System.out.println("You can Not Reserve More Than 2 types of Books");
                return;
            }
        }

        switch (choice) {
            case 1 -> {
                for (int i = 0; i < 4; i++) {
                    System.out.println("-->"+(i+1)+"] "+ ob.B1[i] + "   NO-" + "[" + ob.b1[i] + "]");
                }
                System.out.println();
                System.out.print("Enter Book Number That You Want To Reserve:");
                sc.nextLine();
                No = sc.nextLine();
                for (int i = 0; i < 4; i++) {
                    if (No.equals(ob.b1[i])) {
                        A1[i] = 1;
                        C1++;

                    }

                }
                System.out.println();
                if (C1 == 0)
                    System.out.println("Book Not Find");
                else
                    System.out.println("Book Reserved Successfully!!!");
            }
            case 2 -> {
                for (int i = 0; i < 4; i++) {
                    System.out.println("-->"+(i+1)+"] "+ ob.B2[i] + "   NO-" + "[" + ob.b2[i] + "]");
                }
                System.out.println();
                System.out.print("Enter Book Number That You Want To Reserve:");
                sc.nextLine();
                No = sc.nextLine();
                for (int i = 0; i < 4; i++) {
                    if (No.equals(ob.b2[i])) {
                        A2[i] = 1;
                        C2++;
                    }
                }
                System.out.println();
                if (C2 == 0)
                    System.out.println("Book Not Find");
                else
                    System.out.println("Book Reserved Successfully!!!");
            }
            case 3 -> {
                for (int i = 0; i < 4; i++) {
                    System.out.println("-->"+(i+1)+"] "+ ob.B3[i] + "   NO-" + "[" + ob.b3[i] + "]");
                }
                System.out.println();
                System.out.print("Enter Book Number That You Want To Reserve:");
                sc.nextLine();
                No = sc.nextLine();
                for (int i = 0; i < 4; i++) {
                    if (No.equals(ob.b3[i])) {
                        A3[i] = 1;
                        C3++;
                    }
                }
                System.out.println();
                if (C3 == 0)
                    System.out.println("Book Not Find");
                else
                    System.out.println("Book Reserved Successfully!!!");
            }
            case 4 -> {
                for (int i = 0; i < 4; i++) {
                    System.out.println("-->"+(i+1)+"] "+ ob.B4[i] + "   NO-" + "[" + ob.b4[i] + "]");
                }
                System.out.println();
                System.out.print("Enter Book Number That You Want To Reserve:");
                sc.nextLine();
                No = sc.nextLine();
                for (int i = 0; i < 4; i++) {
                    if (No.equals(ob.b4[i])) {
                        A4[i] = 1;
                        C4++;
                    }
                }
                System.out.println();
                if (C4 == 0)
                    System.out.println("Book Not Find");
                else
                    System.out.println("Book Reserved Successfully!!!");
            }
            default -> System.out.println("Enter Valid Choise");
        }
    }
}

