abstract class Caaa{   
    protected int num;   // 請在此處撰寫類別Caaa的建構子   
    public abstract void show();
}
class Cbbb extends Caaa{   
    // 請在此處撰寫類別Cbbb的建構子   
    // 請在此處撰寫show() method
    public Cbbb(){
            
    }
    public Cbbb(int n){
        num = n;
    }
    public void show(){
        System.out.println(num);
    }
}

public class Ch11_1 {
    public static void main(String[] args) {
        Cbbb bb=new Cbbb(2);
        bb.show();
    }
}