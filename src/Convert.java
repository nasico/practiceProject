/**
 * Created by nas on 2017/6/8.
 *逆转字符串——输入一个字符串，将其逆转并输出。
 */
public class Convert {
    public static void main(String[] args) {
        Convert convert = new Convert();
        String str = "abcdef";
        System.out.println(convert.convertStr(str));
    }

    public String convertStr(String content){
        char [] array = content.toCharArray();
        char temp;
        for (int i = 0,length = content.length()-1;i < length ;i++){
            temp = array[i];
            array[i] = array[length - i];
            array[length - i] = temp;
        }
        return new String(array);
    }
}
