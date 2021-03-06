package TA_7;

public class Client {
    public static void main(String[] args) {
        TestTimeBTree tm = new TestTimeBTree(new BTree(1000));
        long time = 0;
        for (int i = 0; i < 1000; i++) {
            time += tm.testInsert((int) (Math.random() * 200001));
        }
        tm.bt.getRootNode().printNode();
        System.out.println("Test BTree insert => " + time / 1000 + " ns");

        time = 0;
        tm.testInsert(1);
        tm.testInsert(2000);
        tm.testInsert(1000);
        tm.testInsert(500);
        tm.testInsert(1500);

        time += tm.testFind(1);
        time += tm.testFind(2000);
        time += tm.testFind(1000);
        time += tm.testFind(500);
        time += tm.testFind(1500);
        System.out.println("Test BTree find => " + time / 5 + " ns");

        time = 0;
        time += tm.testRemove(1);
        time += tm.testRemove(2000);
        time += tm.testRemove(1000);
        time += tm.testRemove(500);
        time += tm.testRemove(1500);
        System.out.println("Test BTree remove => " + time / 5 + " ns");
        System.out.println("==========================================");

        TestTimeBTree tm1 = new TestTimeBTree(new BTree(1000));
        long time1 = 0;
        for (int i = 0; i < 1000; i++) {
            time1 += tm.testInsert(i);
        }
        tm.bt.getRootNode().printNode();
        System.out.println("Test BTree insert => " + time1 / 1000 + " ns");

        time = 0;
        tm1.testInsert(1);
        tm1.testInsert(2000);
        tm1.testInsert(1000);
        tm1.testInsert(500);
        tm1.testInsert(1500);

        time += tm1.testFind(1);
        time += tm1.testFind(2000);
        time += tm1.testFind(1000);
        time += tm1.testFind(500);
        time += tm1.testFind(1500);
        System.out.println("Test BTree find => " + time / 5 + " ns");

        time = 0;
        time += tm1.testRemove(1);
        time += tm1.testRemove(2000);
        time += tm1.testRemove(1000);
        time += tm1.testRemove(500);
        time += tm1.testRemove(1500);
        System.out.println("Test BTree remove => " + time / 5 + " ns");
        System.out.println("==========================================");

    }
}
