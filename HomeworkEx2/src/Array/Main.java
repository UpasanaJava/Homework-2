package Array;
import java.util.*;
import java.io.*;

public class Main {
	//QUESTION 1
//    static void sort(int[] array1) {
//        Arrays.sort(array1);
//        //array gets converted into hsh values here
//        //change it into strings
//        Arrays.sort(array1);
//        StringJoiner joiner = new StringJoiner("*");
//        for (int value : array1) {
//            joiner.add(String.valueOf(value));
//        }
//        System.out.println(joiner.toString());
//    }
	
	
	
//	
//	//QUESTION 3 
//	static void readingfile(String filename, String content) throws IOException {
//		File fileobj = new File(filename);
//		try {
//			if (fileobj.createNewFile()) {
//				System.out.println("New File created");
//			}
//			else {
//				System.out.println("Alredy Exists");
//			}
//		}catch (FileNotFoundException ex) {
//			ex.printStackTrace();
//		}
//		FileWriter fileObj = new FileWriter(filename);
//		BufferedWriter bw = new BufferedWriter(fileObj);
//		bw.write(content);
//		bw.close();
//		//DISPLAY USING BUFFERREADER
//		FileReader fileObj2 = new FileReader(filename);
//		BufferedReader br = new BufferedReader(fileObj2);
//		Scanner myReader = new Scanner(br);
//		while (myReader.hasNextLine()) {
//			String data = myReader.nextLine();
//			System.out.println(data);
//		}
//		myReader.close();
//	}

//	
	
//	//QUESTION 3 WITHOUT BUFFERED
//		
////	static void readingfile(String filename, String content) throws IOException {
////		File fileobj = new File(filename);
////		try {
////			if (fileobj.createNewFile()) {
////				System.out.println("New File created");
////			}
////			else {
////				System.out.println("Already Exists");
////			}
////		}catch (FileNotFoundException ex) {
////			ex.printStackTrace();
////		}
//		
//	// enter the good
//		FileWriter fWrite = new FileWriter(filename);
//		fWrite.append(content);
//		fWrite.close();
//		System.out.println("Content added to the file");
//	}
//	
	
	
//	
//	//QUESTION 4
//	static void isreadable(String filename, int offset) throws IOException {
//		File fileObj = new File(filename);
//		String data = "";
//		try {
//			if (fileObj.canRead()) {
//				System.out.println("File can be Read");
//				FileReader fileread = new FileReader(fileObj);
//				BufferedReader br = new BufferedReader(fileread);
//				char[] charArray = new char[100];
//				br.read(charArray, 0, 100);
//				System.out.println(new String(charArray));
//				br.close();
//		
//				
//			}else {
//				System.out.println("Cannot be read");
//			}
//	    } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//
//	}
	
	
	

	
	
    public static void main(String[] args) throws IOException {
    	//QUESTION 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int size = scanner.nextInt();
//
//        int[] array = new int[size];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        scanner.close();
    	
    	
    	
////    	//QUESTION 3
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Enter the filename with location");
//      String filename = scanner.next();
//      System.out.println("Enter the content");
//      String content = scanner.next();
//      readingfile(filename, content);
    	
    	
    	
    	
//    	//QUESTION4 
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Enter the filename with location");
//      String filename = scanner.next();
//	  System.out.println("Offset : ");
//	  int offset = scanner.nextInt();
//      isreadable(filename, offset);
    	
      
    	
    	//QUESTION 5
		int d = 42;
		int a = 0;
		
		try {
			int c = d/a;
			System.out.println("The value of c :" + c);
		}catch(ArithmeticException e) {
			System.out.println("Division by zero error");
		}
	
    }
}