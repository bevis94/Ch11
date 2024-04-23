interface iShape{      
    public void show();     
    public int area(); 
}
interface iColor{   
    public void showColor();
}
class Win implements iShape, iColor{
    int width;
    int height;
    String color;
    public Win(){

    }
    public Win(int w, int h, String s){
        width = w;
        height = h;
        color = s;
    }
    public void showColor(){
        System.out.println("color="+color);
    }
    public int area(){
        return width * height;
    }
    public void show(){
        System.out.println("width=" + width);
        System.out.println("height=" + height);
        System.out.println("cplor=" + color);
        System.out.println("area=" + area());
    }
}

public class Ch11_9 {
    public static void main(String[] args) {
        Win w=new Win(5,7,"Green");
        w.show();
    }
}
