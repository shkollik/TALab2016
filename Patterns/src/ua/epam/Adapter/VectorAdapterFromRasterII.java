package ua.epam.Adapter;

/**
 * Created by Shkolik on 24.09.2016.
 */
public class VectorAdapterFromRasterII {
    RasterGraphics raster = new RasterGraphics();
    void drawLine(){
        raster.drawRasterLine();
    }

    void drawSquare(){
        raster.drawRasterSquare();
    }
}
