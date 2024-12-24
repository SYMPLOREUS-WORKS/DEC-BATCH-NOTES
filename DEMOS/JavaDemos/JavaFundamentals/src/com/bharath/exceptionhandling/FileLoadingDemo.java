package com.bharath.exceptionhandling;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileLoadingDemo {
	private int a;
	
	{
	}
	static {
	}

	public static void main(String[] args) {
		// G:\MyWorks\ONLINE_CONTENT\Dec-Us-fullstack-training\DEC-BATCH-NOTES\NOTES\ExceptionHandling.docx
		// io fileinputstream

		String fileName = "G:\\MyWorks\\ONLINE_CONTENT\\Dec-Us-fullstack-training\\DEC-BATCH-NOTES\\NOTES\\ExceptionHandling1.docx";
		readFile(fileName);

	}

	private static void readFile(String fileName) {
		File file = new File(fileName);
		FileLoadingDemo fd = new FileLoadingDemo();
		try (

				FileInputStream fis = new FileInputStream(file);)

		{
			byte[] bytes = fis.readAllBytes();
			for (byte b : bytes)
				System.out.println(b);

		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	// @Override
	public void close() throws IOException {
		System.out.println("custom close called");

	}

//	private static void readFile(String fileName) {
//
//		File file = new File(fileName);
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream(file);
//
//			byte[] bytes = fis.readAllBytes();
//			for (byte b : bytes)
//				System.out.println(b);
//			
//			
//			
//		} catch (FileNotFoundException e) {
//
//
//			e.printStackTrace();
//		} catch (IOException e) {
//
//
//			e.printStackTrace();
//		} finally {
//			if (fis != null) {
//				try {
//					fis.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//
//		}
//
//	}

}
