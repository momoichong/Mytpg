import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.util.regex.Pattern;

public class IPValidationRegex{
	
	public static void main(String [] args){
		String string = "255.245.255.215";
		
        try{
			RandomAccessFile file = new RandomAccessFile("C:\\ip_addresses.txt", "r");
			String oneLine = file.readLine();

            while (oneLine != null ){
				//System.out.println("oneLine  : " +oneLine);
				String line = oneLine;
				System.out.println("IP "+oneLine + " : "+
					Pattern.matches("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
									"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
									"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
									"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$", line));
				oneLine = file.readLine();
			}     
			System.out.println(Pattern.matches("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
											"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
											"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
											"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$", string));//true 
			String[] parts = string.split("\\.");
			
			for (int i=0;i<parts.length;i++){
				String part = parts[i];
				System.out.println("=== ip part : "+i + " : "+ part +" ===");
                try {
					Integer intConver = Integer.parseInt(part);
					
					if (part.length()>3){
						System.out.println("invalid IP length : "+i + " : "+ part);
						break;
					}else if (intConver>255){
						System.out.println("invalid IP range : "+i + " : "+ part);
						break;
					}
				}catch (Exception e){
					System.out.println("invalid IP : "+i + " : "+ part);
					break;
				}                   
			}
		}catch(Exception e){
			System.out.println("Error : "+e.getMessage());
		}
	}
}