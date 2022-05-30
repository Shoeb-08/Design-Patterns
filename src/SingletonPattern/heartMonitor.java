package SingletonPattern;
import java.io.Serializable;

public class heartMonitor implements Serializable {
    private static heartMonitor monitor=null;
    public String s;
    private heartMonitor(){
        //hinder other classes
        s="Current heart beat is normal";
    }
    public static heartMonitor getInstance(){
        if(monitor==null){
            monitor=new heartMonitor();
        }
        return monitor;
    }
    private int i = 80;
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }


}
