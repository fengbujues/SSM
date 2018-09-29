package idea_one;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * 对输入的一段英文进行处理
 * 
 *@version 2.0
 * 
 *@author 刘洋
 * 
 *@since 2018年9月20日
 * 
 *@see java.util.Map
 */
public class Sclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = "";
        System.out.print("请输入:");
        src = sc.nextLine();
        System.out.println(src);
        System.out.println("这段英文的长度为:"+src.length());
        System.out.println("单词数为:"+count(src));
        A(src);
        B(src);
        System.out.println("\n倒序加密:");
        D(src);
    }
    /**
     *计算句子长度
     *@param src 输入的英文字符串
     *@return 字母的数量
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
     *计算字母出现的次数
     *@param src 一段英文
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
        System.out.println("各个字母出现的频率为:");
        for(Map.Entry<Character,Integer> enter:map.entrySet()){
            System.out.print("字母:"+enter.getKey()+"\t"+"次数:"+enter.getValue()+"\t");
        }
    }
    /**
     * 
     *@param src 一段英文
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
     *转换大小写
     *@param src 一段英文
     *@return 返回转换好的字母
     */
    public static String C(String src)
    {
        char[] cs = src.toCharArray();
        cs[0]-=32;
        return String.valueOf(cs);
    }
    /**
     *倒序加密
     *@param src 一段英文
     *@throws NullPointerException 空指针异常
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
