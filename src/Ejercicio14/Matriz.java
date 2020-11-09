
package Ejercicio14;

public class Matriz {
    
    private int dato;
    private int dato2;
    private int producto;

    public Matriz(int dato, int dato2) {
        this.dato = dato;
        this.dato2 = dato2;
    }

    public Matriz(int producto) {
        this.producto = producto;
    }
    

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getDato2() {
        return dato2;
    }

    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    
    
    
}
