package Model;

public class FabriqueCapsule extends FabriqueBouchons{
    @Override
    public Bouchon fabriquerBouchon() {
        return new Capsule();
    }
}
