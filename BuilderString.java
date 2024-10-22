import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;
/** 
   *@author BuilderString
 */
public class BuilderString {
 private static final Logger log=Logger.getLogger(BuilderString.class.getName());
 private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/**
   *@param args
 */
     public static void main(String[] args) throws IOException
      {
	BuilderString f=new BuilderString();
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
         StringBuilder string=new StringBuilder();
       	 string.append("Java");
	 string.append(" ");
	 string.append("is");
	 string.append(" ");
	 string.append("an");
	 string.append(" ");
	 string.append("object");
	 string.append(" ");
	 string.append("oriented");
	 string.append(" ");
	 string.append("programming");
	 string.append(" ");
	 string.append("language.");
         log.info(string.toString());
       }
  }
          