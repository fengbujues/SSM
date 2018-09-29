package idea_one;
import java.util.Scanner;

public class idea_two {
	public static void main(String[] args){
	/*	boolean is = false;
		int a = 23;
		if((is=true)&a > 10)
		{
			System.out.println("ss");
		}
		System.out.println(is?"nan":"nv");*/
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入数值:23");
//		int n = sc.nextInt();
//		System.out.println(n);
		
		
		//质数之和
/*		int sum = 1;
		for (int i = 2; i < 10000; i++) {
			int flag = 0;
			for (int j = 2; j < i; j++) {
				if(i%j == 0){
					flag =1;
					break;
				}
			}
			if(flag == 0){
//				System.out.println(i);
				sum +=i;
			}
		}
		System.out.println(sum);*/
		
		//判断回文
/*		Scanner sc = new Scanner(System.in);
		System.out.print("请输入数值:");
		int n = sc.nextInt();
		String s = String.valueOf(n);
//		System.out.println(s.length());
//		System.out.println(s.charAt(s.length()-1));
		int x = s.length() /2;
//		System.out.println(x);
		int y = 0;
		while(y == 0)
		{
			for (int i = 0; i < x; i++) {
				if(s.charAt(i) == s.charAt(s.length()-1-i)){
					y=1;
					System.out.println("输入正确!");
					break;
				}
				
			}
			if(y == 0){
				System.out.print("不是回文,重新输入:");
				n = sc.nextInt();
				s = String.valueOf(n);
			}
		}*/
		
		
		//一个循环打印菱形
		Scanner sm =new Scanner(System.in);
		System.out.print("请输入行数:");
		int m = sm.nextInt();  //目标行数
		boolean f = true;
		int i=0;	//循环次数
		int n=1;	//当前行数
		int flag = 0;
		int x=0;	//当前行空白个数
		int y=0;	//当前行符号个数
		int sum=0;	//记录当前行之前的循环次数
		int flag2 = 1; //判断当前行处于哪一部分 1为上半部 0为下半部
		
		while(f){
			//判断当前行数 并重置x，y
			if(i == (m+n-1+sum)){
				sum+=m+n-1;
				if(flag2 == 1)
					n++;
				else 
					n--;
				x=y=0;
			}
			//结束条件
			if(n == 0){
				f = false;
				break;  //注意我这里是用break结束的  所以才有这种奇怪的结构  我懒得改了
			}
			//因为是先判断flag 所以最后一行要特殊处理
			if(m == n){
				flag=1;
				flag2=0;
			}
			//判断flag
			if(flag == 0){
				System.out.print(" ");
				x++;
			}
			else {
				System.out.print("*");
				y++;
			}
			//空白个数到了转换flag
			if(x == (m-n)){
				flag = 1;
			}
			//符号打完了 重置x，y 打印换行符
			if(y == (2*n -1)){
				flag=0;
				x=y=0;
				System.out.println("");
			}
			i++;
		}
		System.out.println("结束了");
		
		
		
	}
}
