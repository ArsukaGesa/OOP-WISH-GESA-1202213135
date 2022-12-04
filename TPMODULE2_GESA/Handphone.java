public class Handphone extends Perangkat{

    protected boolean fingerprint;

    public Handphone(String drive, int ram, double processor, boolean fingerprint){
        super(drive, ram, processor);
    }

    public void callNumber(int phone_num){
        System.out.println("Successfully called " + phone_num);
    }

    public void sendTextMessage(int phone_num){
        System.out.println("Successfully sent text to " + phone_num);
    }

    public void sendTextMessage(int phone_num1, int phone_num2){
        System.out.println("Successfully sent text to " + phone_num1 +" and to " + phone_num2);
    }

    public void information(){
        if(fingerprint){
            System.out.println("This phone has the "+ drive + " drive type with a ram size of "+ ram + " GB and a "+ processor +" Ghz processor. This phone also has fingerprint feature");
        } else {
            System.out.println("This phone has the "+ drive + " drive type with a ram size of "+ ram + " GB and a "+ processor +" Ghz processor. This phone also DOES NOT have fingerprint feature");
    }
    }
}