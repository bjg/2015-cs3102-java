package ie.tcd.cs3102;

public class Main {

    public static void main(String[] args) {

        EXIF exif = new EXIF(800, 1024, 768);

        exif.setManufacturer("Canon");

        String m = exif.getManufacturer();
        System.out.println("Manu: " + m + " ISO " + exif.getISO());

        EXIF other = new EXIF();

        System.out.println(EXIF.getCount());
    }
}
