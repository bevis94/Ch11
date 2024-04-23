interface Data{      
    public void showData();   
}
interface Test{   
    public void showScore();   
    public double calcu();
}
class Stu implements Data, Test{   
    protected String id;    // 學號   
    protected String name;  // 姓名    
    protected int mid;      // 期中考成績   
    protected int finl;     // 期末考成績   
    protected int common;   // 平時成績
    public Stu(){}
    public Stu(String s1, String s2, int m, int f, int c){
        id = s1;
        name = s2;
        mid = m;
        finl = f;
        common = c;
    } 
    public void showData(){
        System.out.println("ID=" + id + "\nname=" + name);
    }
    public double calcu(){
        return (mid + finl) * 0.3 + common * 0.4;
    }
    public void showScore(){
        System.err.println("mid=" + mid + "\nfinl=" + finl + "\ncommon=" + common + "\ncalcu=" + calcu());
    }
    public void show(){
        showData();
        showScore();
    }
}

public class Ch11_8 {
    public static void main(String[] args) {
        Stu stu=new Stu("940001","Fiona",90,92,85);      
        stu.show();
    }
}
