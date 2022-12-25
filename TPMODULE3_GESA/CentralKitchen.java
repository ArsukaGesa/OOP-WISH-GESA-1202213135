public class CentralKitchen implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while (true) {
            makefood();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getfoodNumber() {
        return foodNumber;
    }

    public void makefood() {
        synchronized(CentralKitchen.lock) {
            // check if waitingForPickup is true so call method lock.wait() to lock for thread
            // so process not to continue before waiter deliver food
            if (this.waitingForPickup) {
                try {
                    System.out.println("food Machine: Waiting for the Waiter to deliver the food");
                    CentralKitchen.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            // to inform another thread that another food is ready to deliver
            waitingForPickup = true;
            System.out.println("food Machine:  Making food Number " + foodNumber++);
            CentralKitchen.lock.notifyAll();
            System.out.println("food Machine: Telling the waiter to get the food\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}

