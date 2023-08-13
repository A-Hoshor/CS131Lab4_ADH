

public class FileTester {

	public static void main(String[] args) {
		
		FileProcessor file = new FileProcessor("readme", 20);
		file.processFile();
		System.out.println(file.toString());

	}//end main

}//end class
