public class Tripulante extends UsuarioMoodle{
    private double[] calificaciones;
    private boolean[] entregas;


    //Constructor
    public void Tripulante(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, double[] calificaciones, boolean[] entregas, int n) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.calificaciones = new double[n];
        this.entregas = new boolean[n];
    }

    //Métodos
    public void resolverReto(int retoAEntregar) {
        for (int i = 0; i < calificaciones.length; i++) {
            if(retoAEntregar == i) {
                entregas[i] = true;
            }
            calificaciones[i] = 0;
        }
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
