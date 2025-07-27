package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils()
    {
        //private 인스턴스 생성을 막는다.
        //ex MathArray Utils.sum 처럼 .이 붙고 변수를 불러올 때 이렇게 막혀있으면
        //private로 쓰라는 뜻 ㅇㅇ
    }
    public static int sum(int[] values) {
        int total=0;
        for(int value:values){
            total +=value;
        }
        return total;
    }

    public static double average(int[] values) {
    return (double)sum(values)/values.length;
    }


    public static int min(int[] values) {
    int minValue=values[0];
    for(int value:values){
        if(value < minValue){
            minValue=value;
        }
    }
        return minValue;
    }

    public static int max(int[] values) {
    int maxValue=values[0];
    for(int value:values){
        if(value>maxValue){
            maxValue=value;
        }
    }
    return maxValue;
    }
}
