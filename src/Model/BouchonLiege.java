package Model;

public class BouchonLiege implements  Bouchon{
    @Override
    public void fabriquer() {
        System.out.println("Fabrication de bouchons en liège pour bouteilles de vin");
    }
}
