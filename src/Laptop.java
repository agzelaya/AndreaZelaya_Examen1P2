public class Laptop extends PC{
    private String marca;
    private String def_pantalla;
    private boolean rgb;

    public Laptop() {
    }

    public Laptop(String marca, String def_pantalla, boolean rgb, String ip, String mask, String hostname) {
        super(ip, mask, hostname);
        this.marca = marca;
        this.def_pantalla = def_pantalla;
        this.rgb = rgb;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDef_pantalla() {
        return def_pantalla;
    }

    public void setDef_pantalla(String def_pantalla) {
        this.def_pantalla = def_pantalla;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        String bool = "";
        if(rgb){
            bool = "Si";
        }else{
            bool = "No";
        }
        return super.toString() + "Marca: " +  marca + "\n"+"Definicion de pantalla: " + def_pantalla + "\n"+"Teclado RGB: " + rgb + "\n";
    }
    
    
}
