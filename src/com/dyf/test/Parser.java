package com.dyf.test;

import java.util.ArrayList;

/**
 * 该方法用于对对象字符串和字符串ArrayList的一系列操作
 * @author ASUS
 *
 */
public class Parser {
	//获得当前字符串的字符数
	public int getCharsNum(String str){
		char[] c = str.toCharArray();
		return c.length;	
	}

	//当前字符串的单词数
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
	/**
	 * 该方法用于返回该String 的行数
	 * @param str
	 * @return
	 */
	public int getLinesNum(String str){
		char[] chrs = str.toCharArray();
		int num = 0;
		for(int i=0;i<chrs.length;i++){
			if(chrs[i] == '\n')
				num++;
		}
		return num+1;
	}

	/**
	 * 该方法用于返回str 中代注释行的行数
	 * @param str
	 * @return
	 */
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
	/**
	 * 该方法用于返回一个boolean 判断当前行是否为注释行 
	 * @param str
	 * @return
	 */
	public boolean isCommtLine(String str){
		boolean flag =false;
		String temp = str.trim();
		if(temp.startsWith("//")||temp.startsWith("/*")||temp.startsWith("*")||temp.endsWith("*/")||temp.startsWith("}//")){
			flag = true;
		}
		return flag;
	}
	/**
	 * 该方法用于返回一个Boolean 判断当前行是否为空行
	 * @param str
	 * @return
	 */
	public boolean isEmptyLine(String str){
		boolean flag = false;
		if(this.getWordsNum(str)==0&&!this.isCommtLine(str)){
			flag = true;
		}
		return flag;
				
	}
}
