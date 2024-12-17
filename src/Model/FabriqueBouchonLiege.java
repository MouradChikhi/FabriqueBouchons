package Model;

public class FabriqueBouchonLiege extends FabriqueBouchons{
    @Override
    public Bouchon fabriquerBouchon() {
        return new BouchonLiege();
    }
}
