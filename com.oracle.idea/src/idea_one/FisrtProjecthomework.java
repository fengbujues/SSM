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
			case 1: 	;
					break;
			case 2:		;
					break;
			default:
					System.out.println("�������!");
		}
	}
	public static void Goods(){
		
	}
}
