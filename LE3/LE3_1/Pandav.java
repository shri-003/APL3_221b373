abstract class Pandav extends Bharatvanshi{
    void fight() {
        System.out.println("Fights bravely.");
    }
    
    void obey() {
        System.out.println("Obeys elders and dharma.");
    }
    
    boolean kind;
    
    Pandav(boolean kind) {
        this.kind = kind;
    }
}