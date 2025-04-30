import java.util.*;
public class CeasarCalipher
{
   public static void main(String z[])
   {
       Scanner sc=new Scanner(System.in);
       int i,a,c=0;
       String str;
       char ch,chr=0;
       System.out.println("Enter Your String To Be Coded");
       str=sc.nextLine();
       a=str.length();
       System.out.println("Rot 13");
       System.out.println("The Cipher Text Is");
       if(a<=3||a>=100)
       {
           System.out.println("Inavlid Length");
       }
       else
       for(i=0;i<a;i++)
       {
           ch=str.charAt(i);
           if((ch>='a'&&ch<='m')||(ch>='A'&&ch<='M'))
           c=(int)(ch+13);
           chr=(char)(c);
           if((ch>='n'&&ch<='z')||(ch>='N'&&ch<='Z'))
           c=(int)(ch-13);
           chr=(char)(c);
           System.out.print(chr);
           
       
        }
   }
}
