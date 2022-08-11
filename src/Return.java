import java.util.Scanner;
import java.util.*;
class Return {
    Books b=new Books();
    Date r_date=new Date();
    void return_book()
    {
        System.out.println();
        b.set_sport();
        b.set_fiction();
        b.set_comedy();
        b.set_biography();
        Scanner sc=new Scanner(System.in);
        String S;
        int C=0;
        long d,l;
        System.out.print("Enter Book Number That You Want To Return:");
        S=sc.nextLine();
        System.out.println();
        for (int i=0;i<4;i++)
        {
            if (S.equals(b.b1[i]))
            {
                Issue.A1[i]=0;
                C++;
                l=(r_date.getTime()-Issue.i_date1[i].getTime())/86400000;
                if (l>7)
                {
                    d = l - 7;
                    System.out.println("You Returned Book "+d+" Days Late So You Will Have To Pay Us Rs "+(d*10));
                }
                else
                    System.out.println("You Returned Book Successfully!!!");
            }
            if (S.equals(b.b2[i]))
            {
                Issue.A2[i]=0;
                C++;
                l=(r_date.getTime()-Issue.i_date2[i].getTime())/86400000;
                if (l>7)
                {
                    d = l - 7;
                    System.out.println("You Returned Book "+d+" Days Late So You Will Have To Pay Us Rs "+(d*10));
                }
                else
                    System.out.println("You Returned Book Successfully!!!");
            }
            if (S.equals(b.b3[i]))
            {
                Issue.A3[i]=0;
                C++;
                l=(r_date.getTime()-Issue.i_date3[i].getTime())/86400000;
                if (l>7)
                {
                    d = l - 7;
                    System.out.println("You Returned Book "+d+" Days Late So You Will Have To Pay Us Rs "+(d*10));
                }
                else
                    System.out.println("You Returned Book Successfully!!!");
            }
            if (S.equals(b.b4[i]))
            {
                Issue.A4[i]=0;
                C++;
                l=(r_date.getTime()-Issue.i_date4[i].getTime())/86400000;
                if (l>7)
                {
                    d = l - 7;
                    System.out.println("You Returned Book "+d+" Days Late So You Will Have To Pay Us Rs "+(d*10));
                }
                else
                    System.out.println("You Returned Book Successfully!!!");
            }
        }
        if (C==0)
        {
            System.out.println("Invalid Book Number!!!");
        }

    }
}
