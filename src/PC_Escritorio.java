public class PC_Escritorio extends PC{
    private String ram;
    private String cap_alm;
    private String tipo_alm;
    private boolean graphics_card;

    public PC_Escritorio() {
    }

    public PC_Escritorio(String ram, String cap_alm, String tipo_alm, boolean graphics_card, String ip, String mask, String hostname) {
        super(ip, mask, hostname);
        this.ram = ram;
        this.cap_alm = cap_alm;
        this.tipo_alm = tipo_alm;
        this.graphics_card = graphics_card;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCap_alm() {
        return cap_alm;
    }

    public void setCap_alm(String cap_alm) {
        this.cap_alm = cap_alm;
    }

    public String getTipo_alm() {
        return tipo_alm;
    }

    public void setTipo_alm(String tipo_alm) {
        this.tipo_alm = tipo_alm;
    }

    public boolean isGraphics_card() {
        return graphics_card;
    }

    public void setGraphics_card(boolean graphics_card) {
        this.graphics_card = graphics_card;
    }
    
    

    @Override
    public String toString() {
        String bool = "";
        if(graphics_card){
            bool = "Si";
        }else{
            bool = "No";
        }
        return super.toString() + "RAM: " + ram + "\n" +"Cap. almacenamiento: " + cap_alm + "\n" + 
                "Tipo de almacenamiento: " + tipo_alm +  "\n" +"Tarjeta grafica: " + bool + "\n";
    }
    
    
    
}
