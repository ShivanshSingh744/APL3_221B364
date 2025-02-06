class Kaurav extends Bharatvanshi {
    String name;

    public Kaurav(String name) {
        this.name = name;
    }

    @Override
    public void obey() {
        System.out.print("Disobedience, ");
    }

    @Override
    public void fight() {
        super.fight();
    }
}
