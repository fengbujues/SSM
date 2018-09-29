package idea_one;

public class idea_four {
	public static void main(String[] args) {
		int[] ar = new int[30];
		for (int i = 0; i < 30; i++) {
			ar[i]=i+1;
		}
		Rank(9,ar);
	}
	
	
	public static void Rank(int x,int[] ar){
		int[] aj = new int[30];
		for (int m = 0; m < x; m++) {
			for (int i = 0; i < ar.length; i++) {
				while(true){
					int j = (int)(1+Math.random()*ar.length); //这里不加一的话得不到30 会无限循环 Math.random 得到0—1之间的数
					if(!isTrue(aj,j)){
						aj[i]=j;
						System.out.print(aj[i]+"  ");
						break;
					}
				}
			}
			System.out.println();
			for (int i = 0; i < aj.length; i++) {
				aj[i]=0;
			}
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
}
