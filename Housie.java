import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Logger;
/** 
  | *@author housie
 */
public class Housie {
 private static final Logger log=Logger.getLogger(Housie.class.getName());
 private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/**
   *@param args
 */
     public static void main(String[] args) throws IOException
      {
	Housie sc=new Housie();
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
        Random r =new Random();
        int[][] arr=new int[45][45];
	int value=1;   
	for(int i=1;i<45;i++)
	 {
	   for(int j=1;j<i;j++)    
	    {
	      arr[i][j]=value;
	      value++;
	    }
	 }
	log.info("Enter the Range: ");
	int range=Integer.parseInt(br.readLine());
	int num=0;
	for(int i=0;i<45;i++)
	 {
           for(int j=0;j<i;j++)
            {
              if(num!=range)
               {
	         log.info(String.valueOf(r.nextInt(91)));
		 num++;
               }
            }
	 }
      } 
  }
          