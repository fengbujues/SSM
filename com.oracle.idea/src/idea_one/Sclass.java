package idea_one;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * �������һ��Ӣ�Ľ��д���
 * 
 *@version 2.0
 * 
 *@author ����
 * 
 *@since 2018��9��20��
 * 
 *@see java.util.Map
 */
public class Sclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = "";
        System.out.print("������:");
        src = sc.nextLine();
        System.out.println(src);
        System.out.println("���Ӣ�ĵĳ���Ϊ:"+src.length());
        System.out.println("������Ϊ:"+count(src));
        A(src);
        B(src);
        System.out.println("\n�������:");
        D(src);
    }
    /**
     *������ӳ���
     *@param src �����Ӣ���ַ���
     *@return ��ĸ������
     */
    public static int count(String src){
        String ar[] = {".",","," ","?","!"};
        for (int i = 0; i < ar.length; i++) {
            src=src.replace(ar[i],",");
        }
        String textAr[]=src.split(",");
        //System.out.println(textAr.toString());
        return textAr.length;
    }
    /**
     *������ĸ���ֵĴ���
     *@param src һ��Ӣ��
     */
    public static void A(String src)
    {
        src = src.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();
        String ar[] = {".",","," ","?","!"};
        for (int i = 0; i < ar.length; i++) {
            src=src.replace(ar[i],"");
        }
        for (int i = 0; i < src.length(); i++) {
            char k = src.charAt(i);
            if(map.isEmpty()||map.containsKey(k)==false)
            {
                map.put(k,1);
            }
            else{
                int num;
                num = map.get(k)+1;
                map.put(k,num);
            }
        }
        System.out.println("������ĸ���ֵ�Ƶ��Ϊ:");
        for(Map.Entry<Character,Integer> enter:map.entrySet()){
            System.out.print("��ĸ:"+enter.getKey()+"\t"+"����:"+enter.getValue()+"\t");
        }
    }
    /**
     * 
     *@param src һ��Ӣ��
     */
    public static void B(String src)
    {
        src=src.toLowerCase();
        String ar[] = {".",","," ","?","!"};
        for (int i = 0; i < ar.length; i++) {
            src=src.replace(ar[i],",");
        }
        String textAr[]=src.split(",");
        for (int i = 0; i < textAr.length; i++) {
            System.out.print(C(textAr[i]+" "));
        }
    }
    /**
     *ת����Сд
     *@param src һ��Ӣ��
     *@return ����ת���õ���ĸ
     */
    public static String C(String src)
    {
        char[] cs = src.toCharArray();
        cs[0]-=32;
        return String.valueOf(cs);
    }
    /**
     *�������
     *@param src һ��Ӣ��
     *@throws NullPointerException ��ָ���쳣
     */
    public static void D(String src)
            throws NullPointerException
    {
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char)(65+i),(char)(90-i));
            map.put((char)(97+i),(char)(122-i));
        }
//        for(Map.Entry<Character,Character> entry:map.entrySet())
//        {
//            System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
//        }
        String s = "";
        for (int i = 0; i < src.length(); i++) {
            char x = src.charAt(i);
            char y=x;
            if((x>='a'&&x<='z')||(x>='A'&&x<='Z'))
            {
                y=map.get(x);
            }
            s+=y;
        }
        System.out.println(s);
    }
}
