import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class FileProcessor extends Exception{

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList = new ArrayList<String>();
	private Scanner input;
	private int MIN = 5;
	
	public FileProcessor(String fileName, int stringLength) {
		this.setFileName(fileName+".txt");
		this.setStringLength(stringLength);
		System.out.println(this.fileName);
		System.out.println(this.getStringLength());
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		return stringList.size();
	}//end getArrayListSize
	
	public void processFile()  {
		
		try { 
			Scanner s = new Scanner(new File(fileName));
			String line;
			while (s.hasNextLine()) {
				line = s.nextLine();
				int sl;
				if(line.length()<stringLength) {
					sl=1;
				}//end if
				else {
					sl=0;
				}
				switch(sl) {
				case 1 :
					stringList.add(line);
					break;
				default:
					throw new StringTooLongException("Line " + (stringList.size()+1) + "  too long, file processing stopped.");
				}
					
			}//end while
			s.close();
		}//end catch
		catch (IOException e) {
			System.out.print(e.getMessage());
		}//end filenotfound exception catch
		catch (StringTooLongException e) {
			System.out.print(e.getMessage());
		}//end stringtoolong exception
	}//end processFile

	public void setStringLength(int stringLength) {
		if (stringLength >= MIN) {
		this.stringLength = stringLength;}
		else {
			this.stringLength=5;}
	}//end setStringLength

	public String getFileName() {
		return fileName;
	}//end getFileName

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}//end setFileName

	public int getStringLength() {
		return stringLength;
	}//end getStringLength

	@Override
	public String toString() {
		return "\nFileProcessor File Name=" + fileName + "\nString Length=" + stringLength + "\nString List=" + stringList;
	}
	
	
	
	
	
}//end class
