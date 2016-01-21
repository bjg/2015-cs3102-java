package ie.tcd.cs3102;

/**
 * Created by brian on 19/01/2016.
 */
public class EXIF {
    private String manufacturer;
    private double exposureTime;
    private int ISO;
    private int xResolution;
    private int yResolution;

    public EXIF() {
        this(200);
    }

    public EXIF(int ISO) {
        this.ISO = ISO;
    }

    public EXIF(int ISO, int xResolution, int yResolution) {
        this(ISO);
        this.xResolution = xResolution;
        this.yResolution = yResolution;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getISO() {
        return ISO;
    }

    public int getxResolution() {
        return xResolution;
    }

    public int getyResolution() {
        return yResolution;
    }

    // Accessor method - getter
    public int getSizeInPixels() {
        return xResolution * yResolution;
    }

    // Mutator method - setter
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
