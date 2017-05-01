package com.yishao.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTest {

	public static void main(String[] args) throws Exception{
		
		File scrFile = new File("o:\\src.txt");
		File dirFile = new File("o:\\dir.txt");
		
		
//		InputStream is = null;
//		OutputStream os = null;
//		FileInputStream fis =  new FileInputStream(new File("o:\\src.txt"));
//		FileOutputStream fos = new FileOutputStream("o:\\src.txt");
//		BufferedInputStream bis = null;
//		BufferedOutputStream bos = null;
		
//		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
//		byte[] b = new byte[10];
//		for (int i = 0; i < b.length; i++) {
//			b[i] =(byte) i; 
//		}
//		
//		fileOutputStream.write(b);
//		fileOutputStream.flush();
		
		
		FileWriter fw = new FileWriter(dirFile);
		FileReader fr = new FileReader(scrFile);
		
		int num = 0 ;
		char[] cbuf = new char[1024];
		
		while (-1!=(num = fr.read(cbuf))){
			fw.write(cbuf, 0, num);
		}
		
		fw.close();
		fr.close();
		
		
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		
		
//		bis = new BufferedInputStream(new FileInputStream("o:\\src.txt"));
		
		
//		bos = new BufferedOutputStream(new FileOutputStream("o:\\dir.txt"));
		
		
		
		
		
		
		
		
			
		
		
	}
}
