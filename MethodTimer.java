public class MethodTimer{
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
       //someMethodWhichYouWantToProfile();
       long endTime = System.currentTimeMillis();
       System.out.println("Total execution time: " + (endTime-startTime) + "ms"); 
    }
 }