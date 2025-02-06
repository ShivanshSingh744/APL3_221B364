public class Main {
    public static void main(String[] args) {

        Arjun arjun = new Arjun();
        System.out.print(arjun.name + " is Bharatvanshi, Pandav, ");
        arjun.fight();
        arjun.obey();
        arjun.showKindness();
        System.out.println();

        Bheem bheem = new Bheem();
        System.out.print(bheem.name + " is Bharatvanshi, Pandav, ");
        bheem.fight();
        bheem.obey();
        bheem.showKindness();
        System.out.println();

        Duryodhan duryodhan = new Duryodhan();
        System.out.print(duryodhan.name + " is Bharatvanshi, Kaurav, ");
        duryodhan.fight();
        duryodhan.obey();
        System.out.println();

        Vikarn vikarn = new Vikarn();
        System.out.print(vikarn.name + " is Bharatvanshi, Kaurav, ");
        vikarn.fight();
        vikarn.obey();
        vikarn.showKindness();
        System.out.println();
    }
}
