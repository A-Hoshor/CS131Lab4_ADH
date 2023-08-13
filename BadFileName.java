//IO TestClass for bad file names
public class BadFileName{
  
  public static void main(String[] args){
    
    FileProcessor fp = new FileProcessor("String1",10);
    	fp.setStringLength(10);
    	System.out.println(fp.getStringLength());
		//fp.processFile();
  }//end main
  
}//end class