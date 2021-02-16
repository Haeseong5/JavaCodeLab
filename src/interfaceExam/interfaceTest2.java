package interfaceExam;

interface ClickListener{
    void clicked(int i);
}
class Adapter{
    int count=0;
    ClickListener clickListener;
    Adapter(ClickListener clickListener){
        this.clickListener = clickListener;
        clickListener.clicked(count);
    }
    public void onClick(){
        clickListener.clicked(++count);

    }
}
public class interfaceTest2 {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new ClickListener() {
            @Override
            public void clicked(int i) {
                System.out.println(i);
            }
        });
//        adapter.onClick();
    }
}
