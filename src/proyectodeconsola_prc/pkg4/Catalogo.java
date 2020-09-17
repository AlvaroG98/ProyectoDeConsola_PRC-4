package proyectodeconsola_prc.pkg4;

public class Catalogo {

    private int Id;
    private String Nombre;
    private double Precio;
    private int Unidades;

    public Catalogo(int i, String n, double p, int u) {
        this.Id = i;
        this.Nombre = n;
        this.Precio = p;
        this.Unidades = u;
    }

    public Catalogo() {
        this.Id=0;
        this.Precio=0;
        this.Unidades=0;
    }

    public int Getid() {
        return this.Id;
    }

    public String GetName() {
        return this.Nombre;
    }

    public double GetPrecio() {
        return this.Precio;
    }

    public int GetUnidades() {
        return this.Unidades;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }
    
}

