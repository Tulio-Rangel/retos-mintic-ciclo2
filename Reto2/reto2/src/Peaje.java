public class Peaje {
    //Atributos
    private String[] filaCoches;
    private String[] cochesFlyPass;
    private boolean estadoPeaje = true;
    private int cantidadCochesAtendidos = 1;
    private int cocheEnAtencion = 0;

    //Constructor
    public Peaje(String[] filaCoches) {
        this.filaCoches = filaCoches;
        this.cochesFlyPass = new String[filaCoches.length];
        for (int i = 0; i <= filaCoches.length-1; i++) {
            this.cochesFlyPass[i] = " ";
        }
    }

    //Métodos
    public void proximoCoche() {
        if (estadoPeaje) {
            cocheEnAtencion++;
            cantidadCochesAtendidos++;
        }
    }

    public void agregarCocheFlyPass(){
        String cocheABuscar = filaCoches[cocheEnAtencion];
        for(String coche:cochesFlyPass){
            if(coche.equals(cocheABuscar)){
                break;
            }
            if(" ".equals(coche)){
                coche = cocheABuscar;
            }
        }
    }

    public void cambiarEstadoPeaje() {
        if (estadoPeaje) {
            setEstadoPeaje(false);
        } else {
            setEstadoPeaje(true);
        }
    }

    //Getters y Setters
    public String[] getFilaCoches() {
        return filaCoches;
    }

    public void setFilaCoches(String[] filaCoches) {
        this.filaCoches = filaCoches;
    }

    public String[] getCochesFlyPass() {
        return cochesFlyPass;
    }

    public void setCochesFlyPass(String[] cochesFlyPass) {
        this.cochesFlyPass = cochesFlyPass;
    }

    public boolean isEstadoPeaje() {
        return estadoPeaje;
    }

    public void setEstadoPeaje(boolean estadoPeaje) {
        this.estadoPeaje = estadoPeaje;
    }

    public int getCantidadCochesAtendidos() {
        return cantidadCochesAtendidos;
    }

    public void setCantidadCochesAtendidos(int cantidadCochesAtendidos) {
        this.cantidadCochesAtendidos = cantidadCochesAtendidos;
    }

    public int getCocheEnAtencion() {
        return cocheEnAtencion;
    }

    public void setCocheEnAtencion(int cocheEnAtencion) {
        this.cocheEnAtencion = cocheEnAtencion;
    }
}
