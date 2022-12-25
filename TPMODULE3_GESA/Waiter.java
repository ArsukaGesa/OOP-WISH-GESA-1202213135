public class Waiter implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiter(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run() {
        // call getfood method and pending it to 5000 ms
        while (true) {
            getfood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Number of food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * foodPrice);
        System.out.println("==========================================================");
    }
    // create synchronized method getfood

    public void getfood() {
        synchronized(CentralKitchen.getLock()) {

            System.out.println("Waiter: food is ready to deliver");
            CentralKitchen CentralKitchen = new CentralKitchen();
            CentralKitchen.setWaitingForPickup(false);

            // check if value of getfoodNumber form CentralKitchen class is equal to orderQty
            // if same, call method orderInfo() to print order info and exit the program
            if (CentralKitchen.getfoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            CentralKitchen.getLock().notifyAll();
            System.out.println("Waiter: Tell the food machine to make another food\n");

        }
    }
}