package composition;

public class Resolution {

    private  int width;
    private int height;

    public  Resolution(int width,int height){
        this.width=width;
        this.height=height;
    }

    public  int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }
}
