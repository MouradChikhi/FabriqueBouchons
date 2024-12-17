package Model;

public abstract class FabriqueBouchons {

    public abstract Bouchon fabriquerBouchon();
    public Bouchon commanderBouchon(){
        Bouchon bouchon = fabriquerBouchon();
        return bouchon;
    }

}
