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

            Thread t1 = new MyThread("A");
            Thread t2 = new MyThread("B");
            Thread t3 = new MyThread("C");
            Thread t4 = new MyThread("D");

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
