package com.dyf.test;
/**
 * �������ڶ��ļ����в���
 * ����ά����һ��ArrayList<String> ��ʹ�ã���������һ���ļ���·���µ��������ļ��к��ļ���·��
 */
import java.io.File;
import java.util.ArrayList;

public class File_util {
	private ArrayList<String> paths;
	
	public File_util(ArrayList<String> paths){
		this.paths = paths;
	}
	/**
	 * �÷��� �ݹ�ı���srcFile·�������е��ļ������ļ��еĵ�ַ
	 * @param srcFile
	 */
	public void getPath(File srcFile){
		if(null == srcFile||!srcFile.exists()){
			return;
		}
		paths.add(srcFile.getAbsolutePath());
		
		if(srcFile.isDirectory()){
			for(File file:srcFile.listFiles())
				getPath(file);
		}
		
		
		
	}
	 
	
}
