package composition;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public  Monitor(String model, String manufacturer,int size, Resolution nativeResolution){
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;

    }

    public void drwPixelAt(int x, int y,String  color){
        System.out.println("Drawing pixel at " + x + "," + "  in color"  + color);
    }
}
