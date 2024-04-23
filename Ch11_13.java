interface iVolume{   
    
}
abstract class Sphere implements iVolume{      
    final double PI=3.14;   
    protected int x;   
    protected int y;
    public abstract void showData();    // 顯示球體的資料   
    public abstract double vol();       // 計算球體積
}
class Circle extends Sphere{       // 請完成這個部分的程式碼
    int r;
    public Circle(){}
    public Circle(int n, int m, int k){
        x = n;
        y = m;
        r = k;
    }
    public double vol(){
        return 4 / 3.0 * PI * Math.pow(r, 3);
    }
    public void showData(){
        System.err.println("球心:(" + x + ',' + y + ')');
        System.out.println("半徑:" + r);
        System.out.printf("球體機:%.2f" ,vol());
    }
}

public class Ch11_13 {
    public static void main(String[] args) {
        Circle c1=new Circle(8,6,2);
        c1.showData();
    }
}
