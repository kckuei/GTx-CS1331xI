public abstract class Canine implements Groomable {
    // if Canine implements Groomable, by inheritance, all subclasses Wolf, Dog, Poodle, etc. will also inherit implements Groomable
    protected double size;

    public Canine(double size) {
        this.size = size;
    }

    public void bark() {
        System.out.println("Woof Woof");
    }

    public static void main(String[] args) {
        // we cannot instantiate 'abstract objects'
        // but abstract objects are still useful for sharing common code amongst subclasses
        // Canine canine = new Canine();
    }
}