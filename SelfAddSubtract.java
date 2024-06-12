package com.demo;
/**
 * 自增和自减
 * @author zhengziniu
 *
 */
public class SelfAddSubstract {
	public static void main(String[] args) {
		int i = 10;
		//++放在后面的时候先调用它的值再自增
		System.out.println(i++);
		int j = 10;
		//++放在前面的时候先自增再调用自增后的值
		System.out.println(++j);
		
		
	}
}
