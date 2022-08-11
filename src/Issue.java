import java.util.*;
class Issue extends Reserve{
    static Date[] i_date1=new Date[8];
    static Date[] i_date2=new Date[8];
    static Date[] i_date3=new Date[8];
    static Date[] i_date4=new Date[8];
    Books b=new Books();
    Calendar C=Calendar.getInstance();
    void show_reserve()
    {
        b.set_sport();
        b.set_fiction();
        b.set_comedy();
        b.set_biography();
        System.out.println();
        System.out.println("You Have Reserved Following Books");
        System.out.println();
        for (int i = 0; i < 4; i++) {
            if (A1[i] == 1) {
                System.out.println("--> BOOK:" + b.B1[i] + "  NO-[" + b.b1[i]+"]");
            } if (A2[i] == 1) {
                System.out.println("--> BOOK:" + b.B2[i] + "  NO-[" + b.b2[i]+"]");
            } if (A3[i] == 1) {
                System.out.println("--> BOOK:" + b.B3[i] + "  NO-[" + b.b3[i]+"]");
            } if (A4[i] == 1) {
                System.out.println("--> BOOK:" + b.B4[i] + "  NO-[" + b.b4[i]+"]");
            }
        }

    }
    void issue_book()
    {
        show_reserve();
        String  N;
        int X=0,dd,mm,yyyy;
        sc.nextLine();
        System.out.println();
        System.out.print("Enter Book Number That You Want To Issue:");
        N=sc.nextLine();
        for (int i=0;i<4;i++)
        {
            if (N.equals(b.b1[i]) || N.equals(b.b2[i]) || N.equals(b.b3[i]) || N.equals(b.b4[i]))
            {
                X++;
                if (X!=0){
                    break;}
            }
        }
        if (X!=1)
        {
            System.out.println("Invalid Book Number!!!");
            return;
        }
        System.out.print("Enter Year:");
        yyyy=sc.nextInt();
        if(yyyy<0)
        {
            System.out.println("Invalid Year Please Enter Valid Year");
            yyyy=sc.nextInt();
        }

        System.out.print("Enter Month:");
        mm=sc.nextInt();
        if(mm<1 || mm>12)
        {
            System.out.println("Invalid Month Please Enter Valid Month");
            mm=sc.nextInt();
        }
        System.out.print("Enter Date:");
        dd=sc.nextInt();
        if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12)
        {
            if(dd<1 || dd>31)
            {System.out.println("Invalid Date Please Enter Valid Date");
                dd=sc.nextInt();}
        }
        else if(mm==4 || mm==6 || mm==9 || mm==11)
        {
            if(dd<1 || dd>30)
            {System.out.println("Invalid Date Please Enter Valid Date");
                dd=sc.nextInt(); }
        }

        else if(mm==2)
        {
            if (yyyy % 4 == 0)
            {
                if (dd < 1 || dd > 29) {
                    System.out.println("Invalid Date Please Enter Valid Date");
                    dd = sc.nextInt();
                }
            }
            else
            {
                if (dd < 1 || dd > 28)
                {
                    System.out.println("Invalid Date Please Enter Valid Date");
                    dd = sc.nextInt();
                }
            }
        }

        mm--;
        for (int i=0;i<4;i++)
        {
            if (N.equals(b.b1[i]))
            {
                A1[i] = 2;
                C.set(yyyy,mm,dd);
                i_date1[i]=new Date();
                i_date1[i]=C.getTime();
            }
            if (N.equals(b.b2[i]))
            {
                A2[i] = 2;
                C.set(yyyy,mm,dd);
                i_date2[i]=new Date();
                i_date2[i]=C.getTime();

            }
            if (N.equals(b.b3[i]))
            {
                A3[i] = 2;
                C.set(yyyy,mm,dd);
                i_date3[i]=new Date();
                i_date3[i]=C.getTime();
            }
            if (N.equals(b.b4[i]))
            {
                A4[i] = 2;
                C.set(yyyy,mm,dd);
                i_date4[i]=new Date();
                i_date4[i]=C.getTime();
            }
        }
        System.out.println();
        System.out.println("You Issued Book Successfully!!!");
    }
}
