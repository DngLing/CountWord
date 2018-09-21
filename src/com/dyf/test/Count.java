package com.dyf.test;

import java.io.IOException;
import java.util.ArrayList;

public class Count {
	private IO_util iou = null;
	private Parser par= null;
	private FileInfo info = null;
	
	public Count(FileInfo info){
		this.info = info;
		par = new Parser();
		iou = new IO_util();
	}
	
	public void getFileInfo(String srcPath) throws IOException{
		ArrayList<String> list = null;
		
		
		list = iou.ReadLine(srcPath);
		info.setLinesNum(list.size());
		
		for(int i = 0;i<list.size();i++){
			info.setWordsNum(info.getWordsNum()+par.getWordsNum(list.get(i)));
			info.setCharsNum(info.getCharsNum()+par.getCharsNum(list.get(i)));
			if(par.isEmptyLine(list.get(i))){
				info.setEmptyLine(info.getEmptyLine()+1);
			}else if(par.isCommtLine(list.get(i))){
				info.setCommtLine(info.getCommtLine()+1);
			}else{
				info.setCodeLine(info.getCodeLine()+1);
			}
		}
		
	}
	
}
