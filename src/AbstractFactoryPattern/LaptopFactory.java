package AbstractFactoryPattern;

public  class LaptopFactory extends AbstractDeviceFactory {
    @Override
    Device getGadget(DeviceType deviceType){
        switch (deviceType){
            case HP:
                return new hp("8gb","intel i 7","AMD RADEON");
            case DELL:
                return new Dell("16gb","intel i 9","Nvidea");
        }
        return null;
    }
}
