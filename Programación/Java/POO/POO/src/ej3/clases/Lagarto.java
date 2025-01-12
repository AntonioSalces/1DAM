package ej3.clases;

public class Lagarto extends Animal{
    private boolean mimetizado;

    public boolean getMimetizado(){
        return mimetizado;
    }

    public void setMimetizado(boolean mimetizado){
        this.mimetizado = mimetizado;
    }

    public String estaMimetizado(){
        if (this.mimetizado){
            return "Estoy mimetizado";
        }else{
            return "No estoy mimetizado";
        }
    }
}
