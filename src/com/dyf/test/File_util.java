package com.dyf.test;
/**
 * 该类用于对文件进行操作
 * 该类维持了一个ArrayList<String> 的使用，它将保存一个文件夹路径下的所有子文件夹和文件的路径
 */
import java.io.File;
import java.util.ArrayList;

public class File_util {
	private ArrayList<String> paths;
	
	public File_util(ArrayList<String> paths){
		this.paths = paths;
	}
	/**
	 * 该方法 递归的遍历srcFile路径下所有的文件和子文件夹的地址
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
