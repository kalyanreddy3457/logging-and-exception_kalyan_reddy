import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.io.IOException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 
class InterestRate
{
   

    public float simpleInterest(float rate,float amount,float time) 
   
    {
        
      return amount*rate*time;
    
    }
    
    public double compoundInterest(double rate,double amount,double time,double n)
    
    {
        
     return ((amount*Math.pow((1+(rate/n)),n*time))-amount);
    
    }

}

class FindInterest

{
	
  public static void main (String[] args) throws java.lang.Exception
	
  {
	LogManager lgmngr = LogManager.getLogManager(); 
	Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME); 
	log.log(Level.INFO, "What Type Of Amount Do You Want To Calculate ?        \n1.Simple Interest\n2.Compound Interest");
//    System.out.println("What Type Of Amount Do You Want To Calculate ?        \n1.Simple Interest\n2.Compound Interest");
	 Scanner in=new Scanner(System.in);
	try
	{
    int t;
		
   
		
    t=in.nextInt();
	
   
		
    InterestRate Obj=new InterestRate();
		
    if(t==1)
		
    {
	log.log(Level.INFO,"Enter the rate and amount values:");	    
    // System.out.println("Enter the rate and amount values:");

     float rate=in.nextFloat();
		       
     float amount=in.nextFloat();

     rate=rate/100;
     log.log(Level.INFO,"Select the time in\n1.Years\n2.Months");
     //System.out.println("Select the time in\n1.Years\n2.Months");
     int s=in.nextInt();
     int time;
     if(s==1)   		    
     time=in.nextInt();

     else{
     time=in.nextInt();
     time=time/12; 
     } 		   
     float value=Obj.simpleInterest(rate,amount,time);
     log.log(Level.INFO,"The simple interest for given values="+value);
		            // System.out.println("The simple interest for given values="+value);
		    }
		
    else if(t==2)
		
    {
	log.log(Level.INFO,"Enter the rate,amount and n values:");	   
    // System.out.println("Enter the rate,amount and n values:");
		       double rate=in.nextDouble();
	   	   
     double amount=in.nextDouble();
     double n=in.nextDouble();

     rate=rate/100;
     log.log(Level.INFO,"Select the time in\n1.Years\n2.Months");
     //System.out.println("Select the time in\n1.Years\n2.Months");
     int s=in.nextInt();
     double time1;
     if(s==1)   		    
     time1=in.nextDouble();

     else{
     time1=in.nextDouble();
     time1=time1/12; 
     } 			   	       		   
     double value=Obj.compoundInterest(rate,amount,time1,n);
     log.log(Level.INFO,"The compound interest for given values="+value);
		       //System.out.println("The compound interest for given values="+value);
	    }
		
	}
		 catch(Exception e)
	{return;}
  }

}