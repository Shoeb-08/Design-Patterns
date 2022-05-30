package AbstractFactoryPattern;

public class nokia extends Device{
    private String ram;
    private String processor;
    public nokia(String ramSize, String processorType){
        this.ram=ramSize;
        this.processor=processorType;
    }
    @Override
    public String getDetails(){
        return "nokia config is ram size:" + this.ram+ "and processor type is "+ this.processor;
    }
    @Override
    public String toString() {
        return "nokia{ " + "Ram " + ram + " processor" + processor + " }";
    }
}
