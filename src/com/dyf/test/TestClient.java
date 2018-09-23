package com.dyf.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) throws IOException {
		
	
		boolean switchflag = true;
		
	while(switchflag)
	{
		System.out.println("-----COUNTWORD-----");
		System.out.println("-------------------");
		System.out.println("输入 -c 获得当前文件字符数");
		System.out.println("输入 -w 获得当前文件单词数");
		System.out.println("输入 -l 获得当前文件行数");
		System.out.println("输入 -e 获得当前文件所有信息(上述信息加上代码行、注释行和空行)");
		System.out.println("输入 -s 遍历当前文件夹下所有文件的信息");
		System.out.println("输入 -x:end结束程序");
		System.out.println("输入实例  -e E:/www/exple.java");
		System.out.println("-------------------");
		System.out.println("请输入操作符:\n");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int pointins  = str.indexOf("-");
		int pointpath = str.indexOf(":");
		String ins = null;
		String path = null;
		try{
		   ins =str.substring(pointins, pointins+2);
		   path = str.substring(pointpath-1).trim();
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("你的输入有问题，请检查并重新输入:\n");
			continue;
		}
		
		
		switch(ins){
			case "-e":
				FileInfo info = new FileInfo();
				Count cou = new Count(info);
				cou.getFileInfo(path);
				System.out.println("-----------");
				System.out.println(info);
				break;
			case "-s":
				ArrayList<String> paths = new ArrayList<String>(); 
				File_util fu = new File_util(paths);
				fu.getPath(new File(path));
				for(int i=0;i<paths.size();i++){
					String line = paths.get(i);
					if(line.endsWith(".txt")){
						FileInfo info1 = new FileInfo();
						Count cou1 = new Count(info1);
						cou1.getFileInfo(line);
						System.out.println("---------");
						System.out.println(line);
						System.out.println(info1);
						System.out.println("\n");
						
					}
				}
				break;
				
			case "-c":
				FileInfo info2 = new FileInfo();
				Count cou2 = new Count(info2);
				cou2.getFileInfo(path);
				System.out.println("CharNum:"+info2.getCharsNum());
				System.out.println("\n");
				break;
				
			case "-w":
				FileInfo info3 = new FileInfo();
				Count cou3 = new Count(info3);
				cou3.getFileInfo(path);
				System.out.println("WordsNum:"+info3.getWordsNum());
				System.out.println("\n");
				break;
				
			case "-l":
				FileInfo info4 = new FileInfo();
				Count cou4 = new Count(info4);
				cou4.getFileInfo(path);
				System.out.println("LinesNum:"+info4.getLinesNum());
				System.out.println("\n");
				break;
			case "-x":
				switchflag =false;
				break;
				
			default:
				System.out.println("输入了无效的操作符\n");
				System.out.println("\n");
				break;
			
			}
		
		}
		System.out.println("程序结束");
	}

}
