interface Show_ans{    
    public void show(); 
}   
interface MyMath extends Show_ans{   
    public void add(int a, int b);   
    public void sub(int a, int b);   
    public void mul(int a, int b);
    public void div(int a, int b);
}
class Compute implements MyMath{   //  請完成這個部分的程式碼
    int ans = 0;
    public void add(int a, int b){
        ans = a + b;
        System.out.println(ans);
    }
    public void sub(int a, int b){
        ans = a - b;
        System.out.println(ans);
    }
    public void mul(int a, int b){
        ans = a * b;
        System.err.println(ans);
    }
    public void div(int a, int b){
        ans = a / b;
        System.out.println(ans);
    }
    public void show(){
        System.out.println("ans=" + ans);
    }
}

public class Ch11_11 {
    public static void main(String[] args) {
        Compute cp=new Compute();      
        cp.mul(3,5);      
        cp.show();
    }
}
