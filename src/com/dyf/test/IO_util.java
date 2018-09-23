package com.dyf.test;
/**
 * @author ASUS
 * 类有两个方法
 * 1.public ArrayList<String> ReadLine(String srcPath);
 * 2.public void writeLine(FileInfo info,String destPath);
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class IO_util {
	
	/**
	 * 该返回一个String的ArrayList 该arraylist保存了文件的每一行
	 * @param srcPath 文件的绝对地址
	 * @return str:ArrayList<String>
	 * @throws IOException
	 */
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
	
	/**
	 * 该方法用于将一个FileInfo对象的所有字段写到 destPath这个文件路径下
	 * @param info:FileInfo
	 * @param destPath : 目标路径
	 */
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
			System.out.println("写出文件失败");
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
