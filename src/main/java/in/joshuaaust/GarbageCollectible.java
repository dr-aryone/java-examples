package in.joshuaaust;

public class GarbageCollectible {

    private int tag;

    public GarbageCollectible(int tag) {
        this.tag = tag;
        System.out.println("All your heap are belong to us!");
    }

    protected void finalize() {
        System.out.println("Goodbye, cruel VM! Sincerely, #" + this.tag);
    }

    public static void doShenanigans() {
        GarbageCollectible collectible = new GarbageCollectible(1);
        GarbageCollectible collectible2 = new GarbageCollectible(2);
        collectible = collectible2; // The original reference to collectible is now eligible for collection
    }

}
