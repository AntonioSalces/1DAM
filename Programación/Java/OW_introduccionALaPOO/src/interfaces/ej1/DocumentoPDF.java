package interfaces.ej1;

public class DocumentoPDF extends Documento{

    public DocumentoPDF(int size) {
        super(size);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(int size) {
        super.setSize(size);
    }

    @Override
    public boolean isValid() {
        return getSize() < 1024 * 1024; 
    }
    
}
