import java.util.Scanner;
//评委打分
public class Test3 {
    public static void main(String[] args) {
        int[] scoreArr = getscore();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        // 求出数组的最大值
        int max = getMax(scoreArr);
        // 求出数组的最小值
        int min = getMin(scoreArr);
        // 求出数组中6个分数的总数
        int sum = getsum(scoreArr);
        // 求平均分
        int avg = (sum - max - min)/(scoreArr.length - 2);
        // 打印结果
        System.out.println("这位选手的最终得分为： " + avg + "分");

    }
    public static int getMax(int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i] > max){
                max = scoreArr[i];
            }
        }
        return max;
    }
    public static int getsum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    public static int getMin(int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i] < min){
                min = scoreArr[i];
            }
        }
        return min;
    }
    public static int[] getscore() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入评委的评分");
            int score = sc.nextInt();
            if(score >= 0 && score <= 100){
            scores[i] = score;
            i++;
            }else {
                System.out.println("成绩超过了范围，继续录入，当前的i为：" + i);
            }
        }
        return scores;
    }
}