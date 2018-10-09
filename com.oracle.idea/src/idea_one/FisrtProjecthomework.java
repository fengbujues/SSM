package idea_one;

import java.util.Scanner;

public class FisrtProjecthomework {
	static String[] Goodname = new String[20];
	static String[] Goodprice = new String[20];
	static String[] Goodnum = new String[20];
	static String[] Goodproduce = new String[20];
	public static void main(String[] args) {
		Goodname[0]="辣条";
		Goodprice[0]="5";
		Goodnum[0]="20";
		Goodproduce[0]="卫龙";
		Goodname[1]="牙膏";
		Goodprice[1]="12";
		Goodnum[1]="50";
		Goodproduce[1]="黑人";
		Login();
		System.out.println("成功退出!!!");
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
			case 1: Goods();
					break;
			case 2:		;
					break;
			default:
					System.out.println("输入错误!");
		}
	}
	public static void Goods(){
		int flag=1;
		while(flag==1) {
			System.out.println("1.添加商品	2.删除商品	3.修改商品	4.查看商品	5.返回上一级		6.退出");
			System.out.print("请输入你的选择:");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			switch(x) {
			case 1:{
				Addgood();
				break;
			}
			case 2:{
				Deletegood();
				break;
			}
			case 3:{
				Altergood();
				break;
			}
			case 4:{
				Showgood();
				break;
			}
			case 5:{
				Menu();
			}
			case 6:{
				System.exit(0);
			}
			}
		}
	}
	public static void Addgood() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入商品名字:");
		String goodname=sc.next();
		System.out.println("请输入商品价格:");
		String goodprice=sc.next();
		System.out.println("请输入商品库存:");
		String goodnum=sc.next();
		System.out.println("请输入商品生产厂家:");
		String goodproduce=sc.next();
		int i = add(Goodname);
		Goodname[i]=goodname;
		Goodprice[i]=goodprice;
		Goodnum[i]=goodnum;
		Goodproduce[i]=goodproduce;
		System.out.println("添加成功!!!");
	}
	public static int add(String[] good) {
		int i = 0;
		for (i = 0; i < good.length; i++) {
			if(good[i] == null)break;
		}
		return i;
	}
	public static void Deletegood() {
		System.out.println("请输入要删除的商品的名称:");
		Scanner sc = new Scanner(System.in);
		String d_good = sc.next();
		while(true) {
			if(delete(d_good,Goodname)<20) {
				int i = delete(d_good,Goodname);
				Goodname[i]=null;
				Goodprice[i]=null;
				Goodnum[i]=null;
				Goodproduce[i]=null;
				System.out.println("删除成功!!!");	
				break;
			}
			else {
				System.out.println("没有这个商品,请重新输入:");
				d_good = sc.next();
			}
		}
	}
	public static int delete(String d_good,String[] good) {
		int flag=0;
		int i;
		for (i = 0; i < good.length; i++) {
			if(d_good.equals(good[i])) {
				flag=1;
				break;
			}
		}
		return i;
	}
	public static void Altergood() {
		System.out.println("请输入要修改商品的名称:");
		Scanner sc = new Scanner(System.in);
		String a_good = sc.next();
		while(true) {
			if(delete(a_good,Goodname)<20) {
				int i = delete(a_good,Goodname);
				System.out.println("1.商品名称\t2.商品价格\t3.商品数量\t4.商品厂家\t5.修改全部");
				System.out.println("请输入你要修改的项目:");
				int x=sc.nextInt();
				switch(x) {
				case 1:{
					System.out.println("请输入修改后的商品名称:");
					String goodname = sc.next();
					Goodname[i]=goodname;
					break;
				}
				case 2:{
					System.out.println("请输入修改后的商品价格:");
					String goodname = sc.next();
					Goodprice[i]=goodname;
					break;
				}
				case 3:{
					System.out.println("请输入修改后的商品数量:");
					String goodname = sc.next();
					Goodnum[i]=goodname;
					break;
				}
				case 4:{
					System.out.println("请输入修改后的商品厂家:");
					String goodname = sc.next();
					Goodproduce[i]=goodname;
					break;
				}
				case 5:{
					System.out.println("请输入商品名字:");
					String goodname=sc.next();
					System.out.println("请输入商品价格:");
					String goodprice=sc.next();
					System.out.println("请输入商品库存:");
					String goodnum=sc.next();
					System.out.println("请输入商品生产厂家:");
					String goodproduce=sc.next();
					Goodname[i]=goodname;
					Goodprice[i]=goodprice;
					Goodnum[i]=goodnum;
					Goodproduce[i]=goodproduce;
					break;
				}
				}
				break;
			}
			else {
				System.out.println("没有这个商品,请重新输入:");
				a_good = sc.next();
			}
		}
	}
	public static void Showgood() {
		System.out.println("名称\t价格\t数量\t厂家");
		for (int i = 0; i < Goodname.length; i++) {
			if(Goodname[i]!=null)
				System.out.println(Goodname[i]+"\t"+Goodprice[i]+"\t"+Goodnum[i]+"\t"+Goodproduce[i]);
		}
	}
}
