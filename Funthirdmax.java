import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/** 
   *@author Dharmika
 */
public class Funthirdmax {
 private static final Logger log=Logger.getLogger(Funthirdmax.class.getName());
 private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/**
   *@param args
 */
     public static void main(String[] args) throws IOException
      {
	Funthirdmax f=new Funthirdmax();
	while(true)
         { 
	   log.info("select \"run\" to run the program, \"exit \" to exit the program: ");
  	   String option=f.br.readLine();
           switch(option)
            {
              case "run" :
	        f.userInput();
                break;
              case "exit" :
                return;  
            }
          }     
       }
      void userInput() throws IOException
       {  
	 int range=10;
         int[] arr=new int[range];
          log.info("Enter the Strings: ");
	 for(int i=0;i<range;i++)
	  {
	    arr[i]=Integer.parseInt(br.readLine());
	  }
         thirdmax(arr);
       }
      void thirdmax(int[] arr) throws IOException
       {
	 int max=Integer.MIN_VALUE; 
	 int secmax=max;
	 int thirdmax=secmax;
	 for(int i=0;i<arr.length;i++)
	  {
	    if(arr[i]>max)
	     { 
	       thirdmax=secmax;
	       secmax=max;
               max=arr[i];
	     }
	    else if(arr[i]>secmax)
	     { 
	        thirdmax=secmax;
		secmax=arr[i]; 
	     }
	    else if(arr[i]>thirdmax)
	     {
		thirdmax=arr[i]; 
	     }
	   }
	 log.info(String.valueOf(thirdmax));
       }
  }
          