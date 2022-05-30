package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        heartMonitor hb1=heartMonitor.getInstance();
        heartMonitor hb2=heartMonitor.getInstance();
        System.out.println(hb1);
        // hb1.setI(80);
        hb1.s=(hb1.s).toUpperCase();
        System.out.println("1 st instance:::: "+ hb1.s);
        System.out.println("2nd Instance :::: "+ hb2.s);

        hb2.s=(hb2.s).toLowerCase();

        System.out.println("1 st instance Lower :::: "+ hb1.s);
        System.out.println("2nd Instance Lower :::: "+ hb2.s);
        System.out.println(hb1.getI()+" heartbeat");
        //System.out.println(hb2.getI());
        //System.out.println(hb1.hashCode()+" 1 st instance");
        //System.out.println(hb2.hashCode()+ " 2nd instance");
        /*try {
            // Serialize to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
            out.writeObject(hb1);
            out.close();
            //hb1.setI(100);
            // Serialize to a file
            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            //heartMonitor hb1=heartMonitor.getInstance();
            //heartMonitor hb2=heartMonitor.getInstance();
            heartMonitor instanceTwo = (heartMonitor) in.readObject();
            in.close();
            System.out.println(hb1.getI());
            System.out.println(instanceTwo.getI());
            System.out.println(hb1.hashCode()+" 1 st instance");
            System.out.println(hb2.hashCode()+ " 2nd instance");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}
