package lecture10.java;

public final class JavaPenguin extends JavaAnimal {

    private final int wingCount;

    public JavaPenguin(String species) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("펭귄이 움직입니다~ 꿱꿱");
    }

    @Override
    public int getLegCount() {
        return super.legCount + this.wingCount;
    }
}
