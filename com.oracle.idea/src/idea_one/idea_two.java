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
//		System.out.println("��������ֵ:23");
//		int n = sc.nextInt();
//		System.out.println(n);
		
		
		//����֮��
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
		
		//�жϻ���
/*		Scanner sc = new Scanner(System.in);
		System.out.print("��������ֵ:");
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
					System.out.println("������ȷ!");
					break;
				}
				
			}
			if(y == 0){
				System.out.print("���ǻ���,��������:");
				n = sc.nextInt();
				s = String.valueOf(n);
			}
		}*/
		
		
		//һ��ѭ����ӡ����
		Scanner sm =new Scanner(System.in);
		System.out.print("����������:");
		int m = sm.nextInt();  //Ŀ������
		boolean f = true;
		int i=0;	//ѭ������
		int n=1;	//��ǰ����
		int flag = 0;
		int x=0;	//��ǰ�пհ׸���
		int y=0;	//��ǰ�з��Ÿ���
		int sum=0;	//��¼��ǰ��֮ǰ��ѭ������
		int flag2 = 1; //�жϵ�ǰ�д�����һ���� 1Ϊ�ϰ벿 0Ϊ�°벿
		
		while(f){
			//�жϵ�ǰ���� ������x��y
			if(i == (m+n-1+sum)){
				sum+=m+n-1;
				if(flag2 == 1)
					n++;
				else 
					n--;
				x=y=0;
			}
			//��������
			if(n == 0){
				f = false;
				break;  //ע������������break������  ���Բ���������ֵĽṹ  �����ø���
			}
			//��Ϊ�����ж�flag �������һ��Ҫ���⴦��
			if(m == n){
				flag=1;
				flag2=0;
			}
			//�ж�flag
			if(flag == 0){
				System.out.print(" ");
				x++;
			}
			else {
				System.out.print("*");
				y++;
			}
			//�հ׸�������ת��flag
			if(x == (m-n)){
				flag = 1;
			}
			//���Ŵ����� ����x��y ��ӡ���з�
			if(y == (2*n -1)){
				flag=0;
				x=y=0;
				System.out.println("");
			}
			i++;
		}
		System.out.println("������");
		
		
		
	}
}
