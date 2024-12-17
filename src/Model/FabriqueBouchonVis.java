package Model;

public class FabriqueBouchonVis extends FabriqueBouchons{
    @Override
    public Bouchon fabriquerBouchon() {
        return new BouchonVis();
    }
}
