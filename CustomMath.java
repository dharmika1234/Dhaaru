import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;
/** 
   *@author CustomMath
 */
public class CustomMath {
 private static final Logger log=Logger.getLogger(CustomMath.class.getName());
 private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/**
   *@param args
 */
     public static void main(String[] args) throws IOException
      {
	CustomMath f=new CustomMath();
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
        String str1=br.readLine();
        int number1=Integer.parseInt(str1);
	String str2=br.readLine();
        int number2=Integer.parseInt(str2);
	int Addition=add(number1,number2); 
	int Multiplication=mul(number1,number2); 
        int Subtraction=sub(number1,number2);
        log.info(String.valueOf(Addition));
	log.info(String.valueOf(Multiplication));
        log.info(String.valueOf(Subtraction));
      }
     static int add(int number1,int number2)
      {
	int addition=number1+number2;
        return addition;
      }
     static int mul(int number1,int number2)
      {
	int multiplication=number1*number2;
        return multiplication;
      }
     static int sub(int number1,int number2)
      {
        int subtraction=number1-number2;
         return subtraction;
      }

  }
          