package AbstractFactoryPattern;

public class MobileFactory extends AbstractDeviceFactory{
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType) {
            case NOKIA:
                return new nokia("8gb", " lollipop");
            case ONEPLUS:
                return new oneplus("12gb", " oxygen os");

        }
        return null;
    }

}
