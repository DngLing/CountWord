package com.dyf.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class IO_util {
	
	
	public ArrayList<String> ReadLine(String srcPath) throws IOException{
		ArrayList<String> strs = new ArrayList<String>();
		File srcFile = new File(srcPath);
		BufferedReader bReader = null;
		
		try {
			bReader = new BufferedReader(new FileReader(srcFile));
			String line;
			while(null!=(line =bReader.readLine())){
				strs.add(line);
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}finally{
			bReader.close();
		}
		return strs;
	}
	
	
	public void writeLine(FileInfo info,String destPath){
		BufferedWriter bWriter = null;
		File file = new File(destPath+"/info.txt");
		
		try {
			bWriter = new BufferedWriter(new FileWriter(file));
			bWriter.write("CharsNum:"+info.getCharsNum()+'\n');
			bWriter.newLine();
			bWriter.write("LinesNum:"+info.getLinesNum()+"\n");
			bWriter.newLine();
			bWriter.write("WordsNum:"+info.getWordsNum()+'\n');
			bWriter.newLine();
			bWriter.write("CodeLine:"+info.getCodeLine()+'\n');
			bWriter.newLine();
			bWriter.write("CommtLine:"+info.getCommtLine()+'\n');
			bWriter.newLine();
			bWriter.write("EmptyLine:"+info.getEmptyLine()+'\n');
			bWriter.flush();
			
		} catch (IOException e) {
			System.out.println("Ð´³öÎÄ¼þÊ§°Ü");
		}finally{
			if(bWriter!=null){
				try {
					bWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
