package interfaces.ej1;

public class ImagenJPG extends Imagen{
    
    public ImagenJPG(int width, int height) {
        super(width, height);
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }
    
    @Override
    public boolean isValid() {
        return getHeight() < 5000000 && getWidth() < 5000000;
    }
}
