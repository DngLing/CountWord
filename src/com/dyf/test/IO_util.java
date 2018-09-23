package com.dyf.test;
/**
 * @author ASUS
 * ������������
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
	 * �÷���һ��String��ArrayList ��arraylist�������ļ���ÿһ��
	 * @param srcPath �ļ��ľ��Ե�ַ
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
	 * �÷������ڽ�һ��FileInfo����������ֶ�д�� destPath����ļ�·����
	 * @param info:FileInfo
	 * @param destPath : Ŀ��·��
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
			System.out.println("д���ļ�ʧ��");
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
