package com.dyf.test;

public class FileInfo {
	
	private int wordsNum;
	private int linesNum;
	private int charsNum;
	private int codeLine;
	private int emptyLine;
	private int commtLine;
	public FileInfo(){
		this.charsNum=0;
		this.codeLine =0;
		this.commtLine = 0;
		this.emptyLine = 0;
		this.linesNum = 0;
		this.wordsNum =0;
	}
	public int getWordsNum() {
		return wordsNum;
	}
	public void setWordsNum(int wordsNum) {
		this.wordsNum = wordsNum;
	}
	public int getLinesNum() {
		return linesNum;
	}
	public void setLinesNum(int linesNum) {
		this.linesNum = linesNum;
	}
	public int getCharsNum() {
		return charsNum;
	}
	public void setCharsNum(int charsNum) {
		this.charsNum = charsNum;
	}
	public int getCodeLine() {
		return codeLine;
	}
	public void setCodeLine(int codeLine) {
		this.codeLine = codeLine;
	}
	public int getEmptyLine() {
		return emptyLine;
	}
	public void setEmptyLine(int emptyLine) {
		this.emptyLine = emptyLine;
	}
	public int getCommtLine() {
		return commtLine;
	}
	public void setCommtLine(int commtLine) {
		this.commtLine = commtLine;
	}
	
	public String toString(){
		return "charsNum:"+this.charsNum+'\n'+"wordsNum:"+this.wordsNum+'\n'+"linesNum:"+this.linesNum+'\n'
				+"codeLine:"+this.codeLine+'\n'+"commtLine:"+this.commtLine+'\n'+"emptyLine"+this.emptyLine;
	}
}
