package ua.talab.Adapter;

/**
 * Created by Shkolik on 24.09.2016.
 */
public class VectorAdapterFromRaster extends RasterGraphics{
    void drawline(){
        drawRasterLine();
    }

    void drawSquare(){
        drawRasterSquare();
    }
}
