import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/** 
   *@author Dharmika
 */
public class Validation {
 private static final Logger log=Logger.getLogger(Validation.class.getName());
 private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/**
   *@param args
 */
     public static void main(String[] args) throws IOException
      {
	Validation sc=new Validation();
	while(true)
         { 
	   log.info("select \"run\" to run the program, \"exit \" to exit the program: ");
  	   String option=sc.br.readLine();
           switch(option)
            {
              case "run" :
	        sc.userInput();
                break;
              case "exit" :
                return;  
            }
          }     
       }
     void userInput() throws IOException
      {     
        log.info("Enter the String : ");
        String Str=br.readLine();
        if(phone(Str))
         {
           log.info(Str+" is a Phone number");
         }
        else if(email(Str))
         {
           System.out.println(Str+" is an E-mail");
         }
        else
         {
           System.out.println("please  provide correct input");
         }
      }
     public static Boolean phone(String Str)
      { 
        Boolean flag=false;
        if(Str.length()==10)
         {
           flag=true;
	   return true;
         }
        return flag;
      }
     public static Boolean email(String Str)
      { 
        Boolean flag=false;
        if(Str.contains("@") && Str.contains("."))
         {
	   flag=true;
           return true;
         }
        return flag;
      } 
  }
          