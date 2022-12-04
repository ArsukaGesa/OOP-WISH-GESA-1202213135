public class MainApp {
    public static void main(String[] args){

        Perangkat dvc = new Perangkat(null, 0, 0);
        dvc.drive = "Seagate";
        dvc.ram = 8;
        dvc.processor = 2.0;

        Handphone hp = new Handphone(null, 0, 0, true);
        hp.drive = "Sandisk";
        hp.ram = 6;
        hp.processor = 2.40;
        hp.fingerprint = false;

       
        Laptop lp = new Laptop(null, 0, 0, true);
        lp.drive = "Adata";
        lp.ram = 16;
        lp.processor = 3.2;
        lp.webcam = true;

       
        dvc.information();

       
        System.out.println();

    
        lp.information();
        lp.openGame("Minecraft 2");
        lp.sendEmail("NoobMaster69@gmail.com");
        lp.sendEmail("gesaarsuka19@gmail.com","gesaarsuka@student.telkomuniversity.ac.id");

      
        System.out.println();

        hp.information();
        hp.callNumber(628212139);
        hp.sendTextMessage(689799988);
        hp.sendTextMessage(628193440, 628338978);
    }
}