package AbstractFactoryPattern;

public class oneplus extends Device{
    private String ram;
    private String processor;
    public oneplus(String ramSize, String processorType){
        this.ram=ramSize;
        this.processor=processorType;
    }
    @Override
    public String getDetails(){
        return "oneplus config is ram size:" + this.ram+ "and processor type is "+ this.processor;
    }
    @Override
    public String toString() {
        return "oneplus{ " + "Ram " + ram + " processor" + processor + " }";
    }
}
