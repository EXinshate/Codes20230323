import java.util.Random;
/* 随机生成一个5位验证码
验证码格式：
长度为5；
前四位是大写字母或者小写字母
最后一位是数字
 */
public class Test {
    public static void main(String[] args){
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            }else {
                chs[i] = (char) (65 + i - 26);
            }
        }
        String result = "";

        Random r = new Random();
        for (int i = 0; i < 4 ; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }
        int number = r.nextInt(10);

        result =   result + number;

        System.out.println(result);
    }
}
