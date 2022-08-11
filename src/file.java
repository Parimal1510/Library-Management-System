import java.io.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class file  {
    SimpleDateFormat D = new SimpleDateFormat("dd/MM/yyyy");
    Books b = new Books();
    Scanner S;
    String[] R =new String[20];


    void Creat_File()throws IOException
    {
        FileWriter  A= new FileWriter(Main.name+".txt");
    }

    void record()throws IOException,NullPointerException
    {
        b.set_biography();
        b.set_comedy();
        b.set_fiction();
        b.set_sport();
        FileWriter F = new FileWriter(Main.name+".txt");

        BufferedWriter B = new BufferedWriter(F);
        B.write("                                   RESERVED BOOKS                                         ");
        B.newLine();
        B.write("==========================================================================================");
        B.newLine();

        for (int j = 0; j < 4; j++)
        {
            if (Issue.A1[j] == 1) {
                B.write("BOOK : " + b.B1[j] + "    NO-" + b.b1[j]);
                B.newLine();

            }
            if (Issue.A2[j] == 1) {
                B.write("BOOK : " + b.B2[j] + "    NO-" + b.b2[j]);
                B.newLine();

            }
            if (Issue.A3[j] == 1) {
                B.write("BOOK : " + b.B3[j] + "    NO-" + b.b3[j]);
                B.newLine();
            }
            if (Issue.A4[j] == 1) {
                B.write("BOOK : " + b.B4[j] + "    NO-" + b.b4[j]);
                B.newLine();

            }
        }
        B.newLine();

        B.write("                                   ISSUED BOOKS                                         ");
        B.newLine();
        B.write("==========================================================================================");
        B.newLine();
        System.out.println();

        for (int j = 0; j < 4; j++)
        {
            if (Issue.A1[j] == 2) {
                B.write("BOOK : " + b.B1[j] + "    NO-" + b.b1[j] + "    Date : " + D.format(Issue.i_date1[j]));
                B.newLine();

            }
            if (Issue.A2[j] == 2) {
                B.write("BOOK : " + b.B2[j] + "    NO-" + b.b2[j] + "    Date : " + D.format(Issue.i_date2[j]));
                B.newLine();

            }
            if (Issue.A3[j] == 2) {
                B.write("BOOK : " + b.B3[j] + "    NO-" + b.b3[j] + "    Date : " + D.format(Issue.i_date3[j]));
                B.newLine();
            }
            if (Issue.A4[j] == 2) {
                B.write("BOOK : " + b.B4[j] + "    NO-" + b.b4[j] + "    Date : " + D.format(Issue.i_date4[j]));
                B.newLine();

            }
        }
        B.close();

    }

    void show_record() throws IOException
    {

        S= new Scanner(new File(Main.name+".txt"));


        int i=0;
        do
        {
            R[i] = S.nextLine();
            System.out.println(R[i]);
            i++;
        }while (S.hasNext());
    }
    void modify_data()throws IOException,ParseException
    {

        b.set_biography();
        b.set_comedy();
        b.set_fiction();
        b.set_sport();
        S= new Scanner(new File(Main.name+".txt"));



        int X=0,a,c=0;
        do
        {
            R[X] = S.nextLine();
            X++;
        }while (S.hasNext());
        int x=0;
        for (int i=0;R[i]!=null;i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (R[i].contains("ISSUED BOOKS")) {
                    x = 1;
                }
                if (x == 0) {
                    if (R[i].contains(b.B1[j])) {
                        Issue.A1[j] = 1;
                    }
                    if (R[i].contains(b.B2[j])) {
                        Issue.A2[j] = 1;
                    }
                    if (R[i].contains(b.B3[j])) {
                        Issue.A3[j] = 1;
                    }
                    if (R[i].contains(b.B4[j])) {
                        Issue.A4[j] = 1;
                    }
                } else
                    {
                    if (R[i].contains(b.B1[j])) {
                        Issue.A1[j] = 2;
                        String temp="";
                        String rev="";
                        a=R[i].length();
                        c=0;
                        for (int y=a-1;c<10;y--)
                        {
                             temp=temp + R[i].charAt(y);
                             c++;
                        }
                        for (int y=temp.length()-1;y>=0;y--)
                        rev=rev + temp.charAt(y);

                        Issue.i_date1[j]= new SimpleDateFormat("dd/MM/yyyy").parse(rev);

                    }
                    if (R[i].contains(b.B2[j])) {
                        Issue.A2[j] = 2;
                        a=R[i].length();
                        c=0;
                        String temp="";
                        String rev="";
                        for (int y=a-1;c<10;y--)
                        {
                            temp=temp + R[i].charAt(y);
                            c++;
                        }
                        for (int y=temp.length()-1;y>=0;y--)
                            rev=rev + temp.charAt(y);

                        Issue.i_date1[j]= new SimpleDateFormat("dd/MM/yyyy").parse(rev);

                    }
                    if (R[i].contains(b.B3[j])) {
                        Issue.A3[j] = 2;
                        a=R[i].length();
                        c=0;
                        String temp="";
                        String rev="";
                        for (int y=a-1;c<10;y--)
                        {
                            temp=temp + R[i].charAt(y);
                            c++;
                        }
                        for (int y=temp.length()-1;y>=0;y--)
                            rev=rev + temp.charAt(y);
                        Issue.i_date1[j]= new SimpleDateFormat("dd/MM/yyyy").parse(rev);

                    }
                    if (R[i].contains(b.B4[j])) {
                        Issue.A4[j] = 2;
                        a=R[i].length();
                        c=0;
                        String temp="";
                        String rev="";
                        for (int y=a-1;c<10;y--)
                        {
                            temp=temp + R[i].charAt(y);
                            c++;
                        }
                        for (int y=temp.length()-1;y>=0;y--)
                            rev=rev + temp.charAt(y);
                        Issue.i_date1[j]= new SimpleDateFormat("dd/MM/yyyy").parse(rev);

                    }
                }
            }
        }
    }

}
