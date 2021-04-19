package TA_7;

public class TestTimeBTree {
    BTree bt;
    public TestTimeBTree(BTree bt){
        this.bt = bt;
    }

    public long testInsert(int key){
        long end;
        long start = System.nanoTime();
        bt.insert(key);
        end = System.nanoTime();
        return end-start;
    }

    public long testFind(int key){
        long end;
        long start = System.nanoTime();
        bt.search(key);
        end = System.nanoTime();
        return end-start;
    }

    public long testRemove(int key){
        long end;
        long start = System.nanoTime();
        bt.remove(key);
        end = System.nanoTime();
        return end-start;
    }
}
