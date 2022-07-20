public class Tripulante extends UsuarioMoodle{
    private double[] calificaciones;
    private boolean[] entregas;

    public void Tripulante(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, double[] calificaciones, boolean[] entregas) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.calificaciones = calificaciones;
        this.entregas = entregas;
    }

    public void resolverReto(int reto) {
        //
    }


    //Getters and Setters
    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public boolean[] getEntregas() {
        return entregas;
    }

    public void setEntregas(boolean[] entregas) {
        this.entregas = entregas;
    }
}
