interface A{
    public void Teach();
}
interface B{
    public void Teach();
}
class Testing1 implements A{
    public void Teach(){
        System.out.println("A is teaching");
    }
}
class Testing2 implements B{
    public void Teach(){
        System.out.println("B is teaching");
    }
}
public class Main {
    public static void main(String[] args) {
        Testing1 a = new Testing1();
        a.Teach();
        Testing2 b=new Testing2();
        b.Teach();
       
    }
}