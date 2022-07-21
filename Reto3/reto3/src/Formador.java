public class Formador extends UsuarioMoodle{
    public String escalafon;

    //Constructor
    public Formador(String escalafon, String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.escalafon = escalafon;
    }

    //Métodos
    public void calificar(Tripulante tripulanteACalificar, int k){
        for (int i = 0; i < tripulanteACalificar.getCalificaciones().length; i++) {
            if(tripulanteACalificar.getEntregas()[k] == true) {
                tripulanteACalificar.getCalificaciones()[k] = 5;
            }
        }
    }

    //Getters and Setters
    public String getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }
}
