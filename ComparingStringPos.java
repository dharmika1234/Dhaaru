import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
/** 
   *@author ComparingStringpos
 */
public class ComparingStringPos {
 private static final Logger log=Logger.getLogger(ComparingStringPos.class.getName());
 private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/**
   *@param args
 */
     public static void main(String[] args) throws IOException
      {
	ComparingStringPos f=new ComparingStringPos();
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
         List<String> string=new ArrayList<>();  
         String str;
         while(!(str=br.readLine()).equals("exit"))
	  {
            string.add(str);
          }
         string.add("exit");
         log.info("The Strings are : ");
         Iterator<String> iterator=string.iterator();
         while(iterator.hasNext())
	   {
             log.info(iterator.next());
           }    
         log.info("The size is "+String.valueOf(string.size()));
         log.info("Enter the searching element : ");
         String element=br.readLine();
         boolean found=false;
         if(string.contains(element))
           {
             found=true;
             log.info(Boolean.toString(found)); 
             int index=string.indexOf(element);
             log.info("The Element position is : "+String.valueOf(index));
           }
         else
           {
             log.info(Boolean.toString(found)); 
           }
       }
  }
          