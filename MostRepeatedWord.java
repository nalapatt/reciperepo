import java.io.BufferedReader;  
	import java.io.FileReader;  
	import java.util.ArrayList;  
	import java.util.Arrays;
  	 
	public class MostRepeatedWord {  
	
     	 
    	public static void main(String[] args) throws Exception {  
        	String line, word = "";  
        	int count = 0, maxCount = 0;  
		System.out.println("Inside main ");
        	ArrayList<String> words = new ArrayList<String>();  
    	ArrayList<String> articles = new ArrayList<String>(Arrays.asList("the", "a", "an"));
         	 System.out.println("after initialize");
        	//Opens file in read mode  
        	FileReader file = new FileReader(args[0]);  
        	BufferedReader br = new BufferedReader(file);  
         	 System.out.println("after initialize 1");
        	//Reads each line  
        	while((line = br.readLine()) != null) {  
            	String string[] = line.toLowerCase().split("([,.\\s]+)");  
			System.out.println("after reading");
            	//Adding all words generated in previous step into words  
            	for(String s : string){  
   	 	if (articles.contains(s))
   		 continue;
   	 	else
               		 words.add(s);  
            	}  
        	}
         	 
        	//Determine the most repeated word in a file  
        	for(int i = 0; i < words.size(); i++){  
            	count = 1;  
            	//Count each word in the file and store it in variable count  
            	for(int j = i+1; j < words.size(); j++){  
                	if(words.get(i).equals(words.get(j))){  
                    	count++;  
                	}   
            	}  
            	//If maxCount is less than count then store value of count in maxCount   
            	//and corresponding word to variable word  
            	if(count > maxCount){  
                	maxCount = count;  
                	word = words.get(i);  
            	}  
        	}  
         	 
        	System.out.println("Most repeated word: " + word);  
        	br.close();  
    	}  
	}
