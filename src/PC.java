public class PC {
    protected String ip;
    protected String mask;
    protected String hostname;

    public PC() {
    }

    public PC(String ip, String mask, String hostname) {
        this.ip = ip;
        this.mask = mask;
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String masc) {
        this.mask = masc;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return "Host: " + "\n" + hostname + "\n" +"IP: " + ip + "\n" + "Mask: "+  mask;
    }

    
    
    
}
