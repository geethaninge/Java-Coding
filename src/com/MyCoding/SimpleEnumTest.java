package com.MyCoding;



public class SimpleEnumTest {
		private enum Browser{CHROME ,FIREFOX;}
		public static void main(String[] args){
			Browser browser = Browser.valueOf("FIREFOX");
			System.out.println(browser.name());
		}

}
