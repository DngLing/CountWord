package com.dyf.test;

import java.util.ArrayList;

/**
 * �÷������ڶԶ����ַ������ַ���ArrayList��һϵ�в���
 * @author ASUS
 *
 */
public class Parser {
	//��õ�ǰ�ַ������ַ���
	public int getCharsNum(String str){
		char[] c = str.toCharArray();
		return c.length;	
	}

	//��ǰ�ַ����ĵ�����
	public int getWordsNum(String str){
		boolean flag = false;
		int num =0;
		char[] chrs = str.toCharArray();
		for(int i=0;i<chrs.length;i++){
			if(((chrs[i]>=65&&chrs[i]<=90)||(chrs[i]>=97&&chrs[i]<=122))&&flag==false){
				num++;
				flag = true;
			}else if((chrs[i]>=65&&chrs[i]<=90)||(chrs[i]>=97&&chrs[i]<=122)){
				continue;
			}else
			{
				flag = false;
			}
			
		}
		return num;
	}
	
	public int getLinesNum(String str){
		char[] chrs = str.toCharArray();
		int num = 0;
		for(int i=0;i<chrs.length;i++){
			if(chrs[i] == '\n')
				num++;
		}
		return num+1;
	}

	public int getCommtLineNum(ArrayList<String> str){
		int num =0;
		for(int i=0;i<str.size();i++){
			String temp = str.get(i).trim();
			if(temp.startsWith("//")||temp.startsWith("/*")||temp.startsWith("*")||temp.endsWith("*/")){
				num++;
			}
		}
		return num;
	}

	public boolean isCommtLine(String str){
		boolean flag =false;
		String temp = str.trim();
		if(temp.startsWith("//")||temp.startsWith("/*")||temp.startsWith("*")||temp.endsWith("*/")||temp.startsWith("}//")){
			flag = true;
		}
		return flag;
	}
	
	public boolean isEmptyLine(String str){
		boolean flag = false;
		if(this.getWordsNum(str)==0&&!this.isCommtLine(str)){
			flag = true;
		}
		return flag;
				
	}
}
