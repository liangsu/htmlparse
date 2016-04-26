package com.ls;

import org.htmlparser.Parser;
import org.htmlparser.beans.StringBean;
import org.htmlparser.util.ParserException;
import org.htmlparser.visitors.TextExtractingVisitor;

public class StringDemo {

	public static void main(String[] args) throws ParserException {
		//test1();
		test2();
	}
	
	public static void test1() throws ParserException{
		Parser parser =  new Parser("http://star.news.sohu.com/s2016/editorial-63/");
		TextExtractingVisitor visitor = new TextExtractingVisitor();
		parser.visitAllNodesWith(visitor);
		System.out.println(visitor.getExtractedText());
	}
	
	public static void test2(){
		StringBean sb = new StringBean();
		sb.setLinks (false);
		sb.setReplaceNonBreakingSpaces(true);
		sb.setCollapse(true);
		sb.setURL("http://star.news.sohu.com/s2016/editorial-63/");
		System.out.println(sb.getStrings());
	}
}
