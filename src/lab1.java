public abstract class Animal {
    private String nume;

    public abstract void  mananca(String tipMancare);

    public static class Girafa extends Animal {

        public Girafa(String nume) {
            super(nume);
        }

        @Override
        public void mananca(String tipMancare) {
            System.out.println("Animal.Girafa " + getNume() + "mananca " + tipMancare);
        }
    }
}
