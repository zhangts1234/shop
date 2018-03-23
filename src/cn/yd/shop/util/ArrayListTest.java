package cn.yd.shop.util;

import java.util.ArrayList;
import java.util.Date;

class Father{
	public Father() {
		System.out.println(this);
	}
}

class Son extends Father{
	public Son(){
		super();
	}
}

/*
 *  数组：限大小,限类型
 *  集合: 不限大小,不限类型
 *  泛型集合: 不限大小,限类型
 * 
 * */
public class ArrayListTest {
    // alt + 方向键  则是移动     ctrl + alt + 方向键 则复制
	public static void main(String[] args) {
		Son son = new Son();
		Father f = new Father();
		System.out.println(son);
	}
}
