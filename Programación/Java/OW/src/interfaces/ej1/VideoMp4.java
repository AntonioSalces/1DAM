package interfaces.ej1;

public class VideoMp4 extends Video{
    
    public VideoMp4(int length) {
        super(length);
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    @Override
    public boolean isValid() {
        return getLength() < 5;
    }
}
