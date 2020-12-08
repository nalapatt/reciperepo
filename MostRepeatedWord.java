import java.io.BufferedReader;  
	import java.io.FileReader;  
	import java.util.ArrayList;  
	import java.util.Arrays;
  	 
	public class MostRepeatedWord {  
	
     	 
    	public static void main(String[] args) throws Exception { 
		
        	String line, word = "";  
        	int i = 0, count = 0, maxCount = 0;  
		System.out.println("Inside main ");
        	ArrayList<String> words = new ArrayList<String>();  
    	
		ArrayList<String> articles = new ArrayList<String>(Arrays.asList("the", "a", "an"));
         	 System.out.println("after initialize");
        	
		//Opens file in read mode and prints out each character 
    
          FileReader fr=new FileReader("/home/ubuntu/recipe.txt"); 
	  BufferedReader br = new BufferedReader("/home/ubuntu/recipe.txt");  
	while((line=br.read())!=null) 
	  {
	
               System.out.print(line);
		 System.out.println("string");
		
          }
	  while((i=fr.read())!=-1) 
	  {
	
               System.out.print((char)i);
		   System.out.println("integer");
          }
		
	  fr.close();    
}    
	
	}
