package surabhi;

import java.io.*;
import java.util.Random;
public class randompassword
{
    public static void main(String[]args)throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("enter length \n");
        int l=Integer.parseInt(in.readLine());
        String result=makepassword(l);
        System.out.println(result);
    }
    public static String makepassword(int length)
    {
        String password="",mid="",st="",lt="";
        st=randomcharacter("abcdefghijklmnopqrstuvwxyz");
        String randomdigit=randomcharacter("0123456789");
        mid=insertatrandom(mid,randomdigit);
        String randomsymbol=randomcharacter("+-*?/!@#$%&");
        mid=insertatrandom(mid,randomsymbol);
        String randomsmall=randomcharacter("abcdefghijklmnopqrstuvwxyz");
        mid=insertatrandom(mid,randomsmall);
        String randomcapital=randomcharacter("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        mid=insertatrandom(mid,randomcapital);
        for(int i=0;i<length-6;i++)
        {
        String randomchar=randomcharacter("0123456789+-*?/!@#$%&abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        mid=insertatrandom(mid,randomchar);
    }
        lt=randomcharacter("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        password=st+mid+lt;
        return password;
    }
    public static String randomcharacter(String characters)
    {
        int n=characters.length();
        int r=pseudorandom(n);
        return characters.substring(r,r+1);
        
    }
    public static String insertatrandom(String str,String toinsert)
    {
        int n=str.length();
        int r=pseudorandom(n+1);
        return str.substring(0,r)+toinsert+str.substring(r);
    }
    public static int pseudorandom(int len)
    {
        Random dice=new Random();
        int ch=0;
        ch=dice.nextInt(len);
        return ch;
   }
}