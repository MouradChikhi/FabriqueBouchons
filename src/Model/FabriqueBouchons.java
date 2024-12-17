package Model;

public class FabriqueBouchons {

    public Bouchon fabriquerBouchon(String typeBouchon){
        switch (typeBouchon){
            case "capsule":
                return new Capsule();
                case "bouchonVis":
                    return new BouchonVis();
                    case "bouchonLiege":
                        return new BouchonLiege();
            default:
                return null;
        }
    }
}
