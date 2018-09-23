package com.dyf.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) throws IOException {
		/*
		ArrayList<String> paths = new ArrayList<String>(); 
		File_util fu = new File_util(paths);
		fu.getPath(new File("E:/www/dir_1"));
		for(int i=0;i<paths.size();i++){
			String line = paths.get(i);
			if(line.endsWith(".txt")){
				FileInfo info = new FileInfo();
				Count cou = new Count(info);
				cou.getFileInfo(line);
				System.out.println(line);
				System.out.println(info);
			}
				
		}*/
		
		
		IO_util iou = new IO_util();
		FileInfo info = new FileInfo();
		Count cou = new Count(info);
		cou.getFileInfo("E:/www/dir_1/code1.txt");
		System.out.println(info);
		iou.writeLine(info, "E:/www/dir_1");
		
		
		
        
		 
		
		
	}

}
