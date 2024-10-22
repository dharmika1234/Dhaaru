import java.util.logging.Logger;
/** 
   *@author dharmika
  */
public class CommandArgs {
   private static final Logger log=Logger.getLogger(CommandArgs.class.getName());
/**
   *@param args
  */
   public static void main(String[] args)
    {
         if(args.length==0)
            {System.out.println("NO arguments");}
         else
          {
	     StringBuilder name=new StringBuilder();
	    for(int i=0;i<args.length;i++)
	    {
		  name.append(args[i]).append(" ");
	    } 
            log.info("The Command line Arguments are : "+ name.toString()); 
	  }
     }
}