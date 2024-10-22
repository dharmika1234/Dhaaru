import java.io.InputStreamReader;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
/** 
   *@author two arrays comparision
 */
public class ComparingArrays {
 private static final Logger log=Logger.getLogger(ComparingArrays.class.getName());
 private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/**
   *@param args
 */
     public static void main(String[] args) throws IOException
      {
	ComparingArrays f=new ComparingArrays();
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
         List<String> number1=new ArrayList<>();
	 log.info("Enter the 1st array elements ");  
         for(int i=1;i<=5;i++)
           {
             number1.add(br.readLine());
           }
         List<String> number2=new ArrayList<>();
	 log.info("Enter the 2nd array elements ");  
         for(int i=1;i<=5;i++)
           {
             number2.add(br.readLine());
           } 
         if(number1.equals(number2))
          {
             log.info("The Two arrays are equal");
             
          }
         else
          {
             log.info("The Two arrays are not equal");
          }
       }
  }
          