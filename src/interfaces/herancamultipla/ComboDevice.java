package interfaces.herancamultipla;

public class ComboDevice extends Device implements Scanner, Printer{

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processing: " + doc);
    }

    @Override
    public String print(String doc) {
        return "Print " + doc;
    }

    @Override
    public String scan() {
        return "Scan: " + getSerialNumber();
    }
}
