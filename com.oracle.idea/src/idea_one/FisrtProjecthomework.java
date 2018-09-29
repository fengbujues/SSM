package idea_one;

import java.util.Scanner;

public class FisrtProjecthomework {
	public static void main(String[] args) {
		Login();
	}
	public static void Login(){
		String name = "liuyang";
		String code = "123";
		int flag=0;
		Scanner sc = new Scanner(System.in);
		String newname;
		String newcode;
		System.out.println("请先登陆!");
		for (int i = 0; i < 3; i++) {
			System.out.print("用户名:");
			newname = sc.next();
			System.out.print("密码:");
			newcode = sc.next();
			if(newname.equals(name) && newcode.equals(code)){
				flag=1;
				break;
			}
			else{
				if((3-i-1)>0)
					System.out.println("你还有"+(3-i-1)+"次机会!");
			}
		}
		if(flag == 1){
			System.out.println("登陆成功!");
			Menu();
		}
		else{
			System.out.println("输入错误三次,自动退出!");
		}
	}
	public static void Menu(){
		System.out.println("1.商品管理	2.用户管理");
		System.out.print("请输入你的选择:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch(x){
			case 1: 	;
					break;
			case 2:		;
					break;
			default:
					System.out.println("输入错误!");
		}
	}
	public static void Goods(){
		
	}
}
