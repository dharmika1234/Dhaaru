import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;
/** 
   *@author Dharmika
 */
public class PrimeN {
 private static final Logger log=Logger.getLogger(PrimeN.class.getName());
 private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/**
   *@param args
 */
     public static void main(String[] args) throws IOException
      {
	PrimeN pn=new PrimeN();
	while(true)
         { 
	   log.info("select \"run\" to run the program, \"exit \" to exit the program: ");
  	   String option=pn.br.readLine();
           switch(option)
            {
              case "run" :
	        pn.userInput();
                break;
              case "exit" :
                return;  
            }
          }     
       }
      void userInput() throws IOException
      {    
           log.info("Enter Range : ");
           int num=Integer.parseInt(br.readLine());
           int i; 
	   log.info("The Numbers are");
     	   for(i=2;i<num;i++)
	    {
	      int count=0;
	      for(int j=1;j<=i;j++)
                {
          	  if(i%j==0)
                    {
 		      count++;
                    }
                }
	       if(count==2)
                {
                 log.info(String.valueOf(i));
	        }
	    }
      }
  }
          