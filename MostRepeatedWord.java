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
	  String data = fr.read();
	 while(data != null) 
	{
        System.out.print(data);
        data = fr.read();
    	}
	  fr.close();    
}    
	
	}
