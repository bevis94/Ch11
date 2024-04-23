interface Data{      
    public void best();// 判斷那一科成績較高   
    public void failed();  // 判斷那一科成績低於60分
}
interface Test extends Data{   
    public void showData();// 顯示學生的資料及平均成績   
    public double average();// 計算數學和英文的平均成績
}
class Stu implements Test{   
    protected String name;  // 姓名    
    protected int math;     // 數學成績   
    protected int english;  // 英文成績   
    // 請完成這個部分的程式
    public Stu(){}
    public Stu(String n, int m, int e){
        name = n;
        math = m;
        english = e;
    }
    public void showData(){
        System.out.println("姓名:" + name + "\n數學成績:" + math + "\n英文成績:" + english + "\n平均成績:" + average());
    }
    public double average(){
        return (math + english) / 2.0;
    }
    public void best(){
        if(math > english){
            System.out.println(name + "數學比英文好");
        }
        else if(english > math){
            System.out.println(name + "英文比數學好");
        }
        else{
            System.out.println(name + "英文和數學一樣好");
        }
    }
    public void failed(){
        if(math < 60 && english < 60){
            System.out.println(name+"數學和英文都當掉");
        }
        else if(math < 60){
            System.out.println(name+"數學當掉");
        }
        else if(english < 60){
            System.out.println(name+"英文當掉");
        }
    }
    public void show(){
        showData();
        best();
        failed();
    }
}

public class Ch11_10 {
    public static void main(String[] args) {
        Stu s=new Stu("Judy",58,91);                
        s.show();
    }
}
