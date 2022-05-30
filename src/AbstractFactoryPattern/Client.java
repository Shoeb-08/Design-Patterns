package AbstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        Device dell= FactoryGenerator.getFactory(FactoryType.LaptopFactory).getGadget(DeviceType.DELL);
        Device hp= FactoryGenerator.getFactory(FactoryType.LaptopFactory).getGadget(DeviceType.HP);
        System.out.println(dell.getDetails());
        AbstractDeviceFactory  mobileFactory=FactoryGenerator.getFactory(FactoryType.MobileFactory);
        Device nokia=mobileFactory.getGadget(DeviceType.NOKIA);
        Device op=mobileFactory.getGadget(DeviceType.ONEPLUS);
        System.out.println(nokia.getDetails());
        System.out.println(op.toString());


    }
}
