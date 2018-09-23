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
		System.out.println("���� -c ��õ�ǰ�ļ��ַ���");
		System.out.println("���� -w ��õ�ǰ�ļ�������");
		System.out.println("���� -l ��õ�ǰ�ļ�����");
		System.out.println("���� -e ��õ�ǰ�ļ�������Ϣ(������Ϣ���ϴ����С�ע���кͿ���)");
		System.out.println("���� -s ������ǰ�ļ����������ļ�����Ϣ");
		System.out.println("���� -x:end��������");
		System.out.println("����ʵ��  -e E:/www/exple.java");
		System.out.println("-------------------");
		System.out.println("�����������:\n");
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
			System.out.println("������������⣬���鲢��������:\n");
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
				System.out.println("��������Ч�Ĳ�����\n");
				System.out.println("\n");
				break;
			
			}
		
		}
		System.out.println("�������");
	}

}
