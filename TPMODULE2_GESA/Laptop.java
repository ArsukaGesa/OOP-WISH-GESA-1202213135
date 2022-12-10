<<<<<<< HEAD
public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop (String drive, int ram, double processor, boolean webcam ){
        super(drive, ram, processor);
    }

    public void information(){
        if (webcam){
            System.out.println("This laptop has a "+ drive + " drive with a ram size of " + ram +" GB, and a " + processor + " Ghz processor. " + "Also this laptop is EQUIPPED with a webcam.");
    }
        else{
            System.out.println("This laptop has a "+ drive + " drive with a ram size of " + ram +" GB, and a " + processor + " Ghz processor. " + "Also this laptop is NOT EQUIPPED with a webcam.");
        }
    }

    public void openGame(String gameName){
        System.out.println("Sucessfully opened : " + gameName);
    }

    public void sendEmail(String email){
        System.out.println("Email successfully sent to " + email);
    }

    public void sendEmail(String email1, String email2){
        System.out.println("Email successfully sent to " + email1 + " and " + email2);
    }


}
=======
public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop (String drive, int ram, double processor, boolean webcam ){
        super(drive, ram, processor);
    }

    public void information(){
        if (webcam){
            System.out.println("This laptop has a "+ drive + " drive with a ram size of " + ram +" GB, and a " + processor + " Ghz processor. " + "Also this laptop is EQUIPPED with a webcam.");
    }
        else{
            System.out.println("This laptop has a "+ drive + " drive with a ram size of " + ram +" GB, and a " + processor + " Ghz processor. " + "Also this laptop is NOT EQUIPPED with a webcam.");
        }
    }

    public void openGame(String gameName){
        System.out.println("Sucessfully opened : " + gameName);
    }

    public void sendEmail(String email){
        System.out.println("Email successfully sent to " + email);
    }

    public void sendEmail(String email1, String email2){
        System.out.println("Email successfully sent to " + email1 + " and " + email2);
    }


}
>>>>>>> dbb98521f6ebce3ca1868002ebf6ff5c5a2e8e38
