interface iShape{
    public void show(); 
    public int area();         // 計算面積  
}

class Color{
    String color;
    public Color(){

    }
    public Color(String s){
        color = s;
    }
}

class Win extends Color implements iShape{
    int width;
    int height;
    public Win(){

    }
    public Win(int w, int h, String s){
        width = w;
        height = h;
        color = s;
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

public class Ch11_6 {
    public static void main(String[] args) {
        Win w=new Win(5,7,"Red");
        w.show();
    }
}
