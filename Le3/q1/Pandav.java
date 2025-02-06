abstract class Pandav extends Bharatvanshi implements Kindness {
    String name;
    int kindLevel;
    
    public Pandav(String name, int kindLevel) {
        this.name = name;
        this.kindLevel = kindLevel;
    }

    @Override
    public void obey() {
        System.out.print("Obedience, ");
    }

    @Override
    public void showKindness() {
        if (kindLevel > 5) {
            System.out.print("Kind, ");
        } else {
            System.out.print("Not kind, ");
        }
    }
}
