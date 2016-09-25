package ua.epam.Adapter;

public class Main {

    public static void main(String[] args) {
        //Method #1 (Inheritence)
        VectorAdapterFromRaster adapter = new VectorAdapterFromRaster();
        adapter.drawline();
        adapter.drawSquare();

        //Method #2(Composition)
        VectorAdapterFromRasterII adapterII = new VectorAdapterFromRasterII();
        adapterII.drawLine();
        adapterII.drawSquare();


    }
}

