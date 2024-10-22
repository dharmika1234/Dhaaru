import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;
import java.lang.Math;
/** 
   *@author 
    */
public class CalHundredsMath {
 private static final Logger log=Logger.getLogger(CalHundredsMath.class.getName());
 private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/**
   *@param args
 */
     public static void main(String[] args) throws IOException
      {
	CalHundredsMath f=new CalHundredsMath();
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
         log.info("Enter the paid amount : ");
         int paidAmount=Integer.parseInt(br.readLine());
         int Hundreds=Math.floor(paidAmount/100);
         log.info("The Hundreds are "+String.valueOf(Hundreds));
       }
  }
          