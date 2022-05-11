package Modelo;
public class Producto {
    
    private int ID;
    private String Nombre;
    private String Cedula;
    private String Telefono;

    public Producto() {
    }
     // Constructor agregar 
    public Producto(String Nombre, String Cedula, String Telefono) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
    }
    // contrusctor actualizar 

    public Producto(int ID, String Nombre, String Cedula, String Telefono) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
    }
    //getter y setter 

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    

}
