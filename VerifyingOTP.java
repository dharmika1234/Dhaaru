import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/** 
   *@author OTP verification
 */
public class VerifyingOTP {
 private static final Logger log=Logger.getLogger(VerifyingOTP.class.getName());
 private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/**
   *@param args
 */
     public static void main(String[] args) throws IOException
      {
	VerifyingOTP vo=new VerifyingOTP();
	while(true)
         { 
	   log.info("select \"run\" to run the program, \"exit \" to exit the program: ");
  	   String option=vo.br.readLine();
           switch(option)
            {
              case "run" :
	        vo.userInput();

                break;
              case "exit" :
                return;  
            }
          }     
       }
     void userInput() throws IOException
      {    
	 boolean isPasswordCorrect=false;
         log.info("Enter the number :");
 	 String str = br.readLine();
         if (str != null && str.length() == 6) 
  	  {
            for (char ch : str.toCharArray())
	     {
               if (Character.isDigit(ch))
		 {
                   log.info(str + " is an OTP");
                   isPasswordCorrect = true;
                   break;
                 }
             }
            if (!isPasswordCorrect) 
             {
               log.info(str + " is not an OTP");
             }
          } 
	 else 
          {
            log.info(str + " is not an OTP");
          }
      }
  }
          