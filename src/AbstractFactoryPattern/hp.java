package AbstractFactoryPattern;

public class hp extends Device{
    private String ram;
    private String processor;
    private String gpu;
    public hp(String ramSize, String processorType,String gpuType){
        this.ram=ramSize;
        this.processor=processorType;
        this.gpu=gpuType;
    }
    @Override
    public String getDetails(){
        return "hp config is ram size:" + this.ram+ "and processor type is "+ this.processor+" and the gpu is"+ this.gpu;
    }
    @Override
    public String toString() {
        return "hp{ " + "Ram " + ram + " processor" + processor + " }";
    }
}
