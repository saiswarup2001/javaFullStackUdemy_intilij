package org.shop;

public class Door {
    private Lock lock;

    public Lock getLock() {
        return lock;
    }

    public Door(){
        lock = new Lock(true);
    }

    public void statusOfShop(){
        if(lock.isLock()){
            System.out.println("Sorry shop is Closed, Come Tomorrow...!!");
        }else{
            System.out.println("Namaste, Welcome to our Shop...!!!");
        }
    }

    public class Lock {
        private boolean lock;

        public Lock(boolean lock) {
            this.lock = lock;
        }

        public boolean isLock() {
            return lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }
}
