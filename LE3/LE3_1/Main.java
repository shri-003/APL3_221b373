public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println("Arjun:");
        arjun.fight();
        arjun.obey();
        System.out.println("Kind: " + arjun.kind);

        System.out.println("\nBheem:");
        bheem.fight();
        bheem.obey();
        System.out.println("Kind: " + bheem.kind);

        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        System.out.println("Kind: " + duryodhan.kind);

        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.obey();
        System.out.println("Kind: " + vikarn.kind);
    }
}
