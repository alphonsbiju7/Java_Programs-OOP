//tut-8 (2)
class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}
class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow flies shorter distances");
    }
}
class Eagle extends Bird {
    void fly() {
        System.out.println("Eagle Eagle soars high in the sky.");
    }
}
public class BirdOverride {
    public static void main(String[] args) {
        Bird [] birds = new Bird[3];
        birds[0] = new Bird();
        birds[1] = new Sparrow();
        birds[2] = new Eagle();
        for (int i = 0; i < birds.length; i++) {
    birds[i].fly();
}

    }
}
