package co.com.ps;
//Mi objeto es un Casco
public class EjercicioEnClase2 {

    public EjercicioEnClase2() {

    }

    private String tipo;
    private String talla;
    private String visera;
    private String marca;

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTalla(){
        return this.talla;
    }
    public void setTalla(String talla){
        this.talla = talla;
    }
    public String getVisera(){
        return this.visera;
    }
    public void setVisera(String visera){
        this.visera = visera;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void ponerCasco(){
        System.out.println("Se ha puesto el casco");
    }
    public void levantarVicera(){
        System.out.println("Se ha abierto la Visera");
    }
    public void abrocharCasco(){
        System.out.println("Se ha abrochado la correa");
    }
    public void quitarCasco(){
        System.out.println("Se ha quitado el casco");
    }

}
