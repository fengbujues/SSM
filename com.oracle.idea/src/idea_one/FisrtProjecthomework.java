package idea_one;

import java.util.Scanner;

public class FisrtProjecthomework {
	static String[] Goodname = new String[20];
	static String[] Goodprice = new String[20];
	static String[] Goodnum = new String[20];
	static String[] Goodproduce = new String[20];
	public static void main(String[] args) {
		Goodname[0]="����";
		Goodprice[0]="5";
		Goodnum[0]="20";
		Goodproduce[0]="����";
		Goodname[1]="����";
		Goodprice[1]="12";
		Goodnum[1]="50";
		Goodproduce[1]="����";
		Login();
		System.out.println("�ɹ��˳�!!!");
	}
	public static void Login(){
		String name = "liuyang";
		String code = "123";
		int flag=0;
		Scanner sc = new Scanner(System.in);
		String newname;
		String newcode;
		System.out.println("���ȵ�½!");
		for (int i = 0; i < 3; i++) {
			System.out.print("�û���:");
			newname = sc.next();
			System.out.print("����:");
			newcode = sc.next();
			if(newname.equals(name) && newcode.equals(code)){
				flag=1;
				break;
			}
			else{
				if((3-i-1)>0)
					System.out.println("�㻹��"+(3-i-1)+"�λ���!");
			}
		}
		if(flag == 1){
			System.out.println("��½�ɹ�!");
			Menu();
		}
		else{
			System.out.println("�����������,�Զ��˳�!");
		}
	}
	public static void Menu(){
		System.out.println("1.��Ʒ����	2.�û�����");
		System.out.print("���������ѡ��:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch(x){
			case 1: Goods();
					break;
			case 2:		;
					break;
			default:
					System.out.println("�������!");
		}
	}
	public static void Goods(){
		int flag=1;
		while(flag==1) {
			System.out.println("1.�����Ʒ	2.ɾ����Ʒ	3.�޸���Ʒ	4.�鿴��Ʒ	5.������һ��		6.�˳�");
			System.out.print("���������ѡ��:");
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
		System.out.println("��������Ʒ����:");
		String goodname=sc.next();
		System.out.println("��������Ʒ�۸�:");
		String goodprice=sc.next();
		System.out.println("��������Ʒ���:");
		String goodnum=sc.next();
		System.out.println("��������Ʒ��������:");
		String goodproduce=sc.next();
		int i = add(Goodname);
		Goodname[i]=goodname;
		Goodprice[i]=goodprice;
		Goodnum[i]=goodnum;
		Goodproduce[i]=goodproduce;
		System.out.println("��ӳɹ�!!!");
	}
	public static int add(String[] good) {
		int i = 0;
		for (i = 0; i < good.length; i++) {
			if(good[i] == null)break;
		}
		return i;
	}
	public static void Deletegood() {
		System.out.println("������Ҫɾ������Ʒ������:");
		Scanner sc = new Scanner(System.in);
		String d_good = sc.next();
		while(true) {
			if(delete(d_good,Goodname)<20) {
				int i = delete(d_good,Goodname);
				Goodname[i]=null;
				Goodprice[i]=null;
				Goodnum[i]=null;
				Goodproduce[i]=null;
				System.out.println("ɾ���ɹ�!!!");	
				break;
			}
			else {
				System.out.println("û�������Ʒ,����������:");
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
		System.out.println("������Ҫ�޸���Ʒ������:");
		Scanner sc = new Scanner(System.in);
		String a_good = sc.next();
		while(true) {
			if(delete(a_good,Goodname)<20) {
				int i = delete(a_good,Goodname);
				System.out.println("1.��Ʒ����\t2.��Ʒ�۸�\t3.��Ʒ����\t4.��Ʒ����\t5.�޸�ȫ��");
				System.out.println("��������Ҫ�޸ĵ���Ŀ:");
				int x=sc.nextInt();
				switch(x) {
				case 1:{
					System.out.println("�������޸ĺ����Ʒ����:");
					String goodname = sc.next();
					Goodname[i]=goodname;
					break;
				}
				case 2:{
					System.out.println("�������޸ĺ����Ʒ�۸�:");
					String goodname = sc.next();
					Goodprice[i]=goodname;
					break;
				}
				case 3:{
					System.out.println("�������޸ĺ����Ʒ����:");
					String goodname = sc.next();
					Goodnum[i]=goodname;
					break;
				}
				case 4:{
					System.out.println("�������޸ĺ����Ʒ����:");
					String goodname = sc.next();
					Goodproduce[i]=goodname;
					break;
				}
				case 5:{
					System.out.println("��������Ʒ����:");
					String goodname=sc.next();
					System.out.println("��������Ʒ�۸�:");
					String goodprice=sc.next();
					System.out.println("��������Ʒ���:");
					String goodnum=sc.next();
					System.out.println("��������Ʒ��������:");
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
				System.out.println("û�������Ʒ,����������:");
				a_good = sc.next();
			}
		}
	}
	public static void Showgood() {
		System.out.println("����\t�۸�\t����\t����");
		for (int i = 0; i < Goodname.length; i++) {
			if(Goodname[i]!=null)
				System.out.println(Goodname[i]+"\t"+Goodprice[i]+"\t"+Goodnum[i]+"\t"+Goodproduce[i]);
		}
	}
}
