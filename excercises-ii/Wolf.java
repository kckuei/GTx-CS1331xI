import java.util.Arrays;

public class Wolf extends Canine implements Groomable, Comparable<Wolf> {
    protected int rank;
    
    public Wolf(double size, int rank) {
      super(size);
      this.rank = rank;
    }

    public void bark() {
      for (int i = 1; i <=3; i++)
        super.bark();
    }

    public void bark(int barkMultiple) {
      for (int i = 1; i <= barkMultiple; i++)
        super.bark();
    }

    public void groom() {
        System.out.println("lick");
    }

    public int compareTo(Wolf anotherWolf) {
        // return -(rank - ((Wolf)anotherWolf).rank); // by declaring <Wolf> we no longer need to cast before invoking method b/c garunteed a wolf obj
        return -(rank - (anotherWolf).rank);
    }

    public String toString() {
        return ("Rank " + rank + ", Size " + size);
    }

    public static void main(String[] args) {
        Wolf alpha = new Wolf(17.1, 1);
        Wolf beta  = new Wolf(3, 10);
        System.out.println(alpha.compareTo(beta));
        System.out.println(beta.compareTo(alpha));
        // System.out.println(beta.compareTo("A string! Not a wolf class!"));

        Wolf[] pack = {
            new Wolf(17.1, 2),
            new Wolf(3, 10),
            new Wolf(9.2, 7),
            new Wolf(9.1, 8),
            new Wolf(17.01, 3),
            new Wolf(16.2, 1),
            new Wolf(16, 4),
            new Wolf(16, 5),
            new Wolf(10, 6),
            new Wolf(10, 6),
            new Wolf(5, 9)
        };
        // System.out.println("Unsorted Pack: " + Arrays.toString(pack));
        // Arrays.sort(pack);
        // System.out.println("Unsorted Pack: " + Arrays.toString(pack));
        for (Wolf w: pack)
            System.out.println(w.toString());
        Arrays.sort(pack);
        System.out.println("-----------------------------");
        for (Wolf w: pack)
            System.out.println(w.toString());

    }
}