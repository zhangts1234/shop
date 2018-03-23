package cn.yd.shop.util;


// 测试代码：java的可变参数
public class MainTest {
	
	public static void main(String[] args) {
		int result = MainTest.add(1,new int[]{1,2,3});
		int result2 = MainTest.add(1,2,3);
		System.out.println(result + "," + result2);
	}
	
	public static int add(int x,int y){
		return x+y;
	}
	
	public static int add(int x,int y,int z){
		return x+y+z;
	}
	
	// jdk1.5时推出可变参数(可变参数就是数组)
	public static int add(int y,int... num){
		int sum = 0;
		for(int x:num){
			sum +=x;
		}
		return sum;
	}
	
//	public static int add(int[] num){
//		int sum = 0;
//		for(int x:num){
//			sum +=x;
//		}
//		return sum;
//	}
}
