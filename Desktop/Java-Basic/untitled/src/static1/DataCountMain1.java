package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1=new Data1("A");
        System.out.println("A count="+ data1.count);

        Data1 data2=new Data1("B");
        System.out.println("B count="+ data2.count);
        Data1 data3=new Data1("C");
        System.out.println("C count="+ data3.count);
 /*
 결과값 당연히 1 , 1, 1
 이유는 객체를 생성할 때 마다 Data1 인스턴스는 새로 만들어지고 인스터를
 포함된 count 변수도 새로 만들어지기 때문이다.

  */
    }
}