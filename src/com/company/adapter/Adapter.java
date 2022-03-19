package com.company.adapter;

public class Adapter {
    public static void main(String[] args) {
        //наследование
        VectorGraphics vectorAdapterFromRaster = new VectorAdapterFromRaster();
        vectorAdapterFromRaster.drawLine();
        vectorAdapterFromRaster.drawSquare();
        //композиция
        VectorGraphics vectorGraphics = new VectorAdapterFromRasterV2();
        vectorGraphics.drawLine();
        vectorGraphics.drawSquare();


    }
}
interface VectorGraphics{
    void drawLine();
    void drawSquare();
}
class RasterGraphics{
    void drawRasterLine(){
        System.out.println("Рисуем линии");
    }
    void drawRasterSquare(){
        System.out.println("Рисуем квадрат");
    }
}
class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphics{
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
class VectorAdapterFromRasterV2 implements VectorGraphics{
    RasterGraphics rasterGraphics = new RasterGraphics();
    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}