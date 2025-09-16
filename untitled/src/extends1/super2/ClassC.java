package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        //super(); 생성자가 있는 경우엔 사용 x
        super(10,20);
        System.out.println("ClassC 생성자");
    }
}
