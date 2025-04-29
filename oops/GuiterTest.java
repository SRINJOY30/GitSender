// Define the interface
interface Playable {
    void play();
}

// Define the abstract class
abstract class Instrument implements Playable {
    void tune() {
        System.out.println("Instrument is being tuned.");
    }
    @SuppressWarnings("unused")
    abstract void repair();
}

// Define the final class
final class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing music.");
    }
    @Override
    void repair() {
        System.out.println("Repairing the Guitar.");
    }
}

// Main class
public class GuiterTest {
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar();
        myGuitar.tune();
        myGuitar.play();
        myGuitar.repair();
    }
}
