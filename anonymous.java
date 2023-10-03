//absract class my 
abstract class my {
    abstract public  void show();
}
class Outer {
    public void display(){
        // anonymous class is created here 
        my m = new my() { public void show(){
                System.out.println("Hello dinesh");
            }
        };
        m.show();   
    }}
public class anonymous {
    public static void main(String[] args) {
        // calling outer class
        Outer o = new Outer();
        o.display();
    }    
}
