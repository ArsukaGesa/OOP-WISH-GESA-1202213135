public class Perangkat {
    protected String drive;
    protected int ram;
    protected double processor;

    public Perangkat(String drive, int ram, double processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    };

    public Perangkat(String drive2, int ram2, double processor2, boolean webcam) {
    };

    public void information(){
        System.out.println("Unknown Device has a drive type of "+drive+" with a ram size of "+ram+" GB and a "+processor+" Ghz processor.");
    };
    
}
