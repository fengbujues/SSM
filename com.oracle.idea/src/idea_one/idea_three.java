package idea_one;

//import java.util.Math;

public class idea_three {
	public static void main(String[] args) {
		int[] ar = new int[30];
		int x;
		for (int i = 0; i < 30; i++) {
			while(true){
				x=(int)(Math.random()*100);
				if(!isTrue(ar,x)){
					ar[i]=x;
//					System.out.println(ar[i]);
					break;
				}
			}
		}
		ar = Method(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	public static boolean isTrue(int[] ar,int x){
		boolean flag = false;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] == x){
				flag=true;
				break;
			}
		}
		return flag;
	}
	public static int[] Method(int[] ar){
		int x;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if(ar[i]>ar[j]){
					x=ar[i];
					ar[i]=ar[j];
					ar[j]=x;
				}
			}
		}
		return ar;
	}
}
