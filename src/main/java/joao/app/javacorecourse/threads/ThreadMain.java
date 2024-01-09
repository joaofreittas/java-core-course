package joao.app.javacorecourse.threads;

public class ThreadMain {

    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());

//        Thread t1 = new MyThread("A");
//        Thread t2 = new MyThread("B");
//        Thread t3 = new MyThread("C");
//        Thread t4 = new MyThread("D");
//
//        t1.run();
//        t2.run();
//        t3.run();
//        t4.run();

//        Thread t1 = new MyThread("A");
//        Thread t2 = new MyThread("B");
//        Thread t3 = new MyThread("C");
//        Thread t4 = new MyThread("D");
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

        Thread t1 = new Thread(new MyThreadRunnable("A"));
        Thread t2 = new Thread(new MyThreadRunnable("B"));
        Thread t3 = new Thread(new MyThreadRunnable("C"));
        Thread t4 = new Thread(new MyThreadRunnable("D"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}

class MyThread extends Thread {

    private final String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println();
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 100; i++) {
            System.out.print(name);
        }


    }

}

class MyThreadRunnable implements Runnable {

    private final String name;

    public MyThreadRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println();
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 100; i++) {
            System.out.print(name);
        }
    }

}
