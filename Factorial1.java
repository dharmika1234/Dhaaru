import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;
/** 
   *@author Makeup
 */
public class Factorial1 {
 private static final Logger log=Logger.getLogger(Factorial1.class.getName());
 private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/**
   *@param args
 */
     public static void main(String[] args) throws IOException
      {
	Factorial1 f=new Factorial1();
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
        log.info("Enter the number :");
        int num=Integer.parseInt(br.readLine());
 	int k=0;
        int[] arr=new int[num];
        for(int i=2;i<=num;i++)
         {
           if(num%i==0)
             {
	      arr[k++]=i;
 	     }
         }
        for(int i:arr)
         {
           if(i!=0)
             {  
            log.info(i+" ");
             }
         }
      }
  }
          