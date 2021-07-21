package practice;

import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class OtpGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String number="0123456789";
       char otp[]=new char[6];
       Random r=new Random();
       for(int i=0;i<6;i++)
       {
    	   otp[i]=number.charAt(r.nextInt(number.length()));
       }
       
       System.out.println(otp);
       String s=new String(otp);
       System.out.println("Please use the below OTP for transaction:"+ s);
       
       Date d=new Date();
       System.out.println(d);
       
    
       
	}
    
}
