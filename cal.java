import java.util.Scanner;
public class cal {

    public static void main (String args[])
    {
        System.out.println("Calculator");
        Scanner sc=new Scanner(System.in);
        int ch, add,sub,mul,div;
        System.out.println("enter your choice \n 1:Addition \t 2:Subtraction \t 3:Multiplication \t 4:Divide");
        ch= sc.nextInt();
        switch (ch)
        {
            case 1:
                int num1,num2;
                System.out.println("enter your number:");
                num1=sc.nextInt();
                num2=sc.nextInt();
                add=num1+num2;
                System.out.println(+add);
                break;

            case 2:
                int num,num3;
                System.out.println("enter your number:");
                num=sc.nextInt();
                num3=sc.nextInt();
                sub=num-num3;
                System.out.println(+sub);
                break;

            case 3:
                int a,b;
                System.out.println("Enter your number:");
                a=sc.nextInt();
                b=sc.nextInt();
                div=a/b;
                System.out.println(+div);
                break;

            case 4:
                int ab,bd;
                System.out.println("Enter your number:");
                ab=sc.nextInt();
                bd=sc.nextInt();
                mul=ab*bd;
                System.out.println(+mul);

                break;






        }
    }
}
