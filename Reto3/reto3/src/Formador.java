public class Formador extends UsuarioMoodle{
    public String escalafon;

    public Formador(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, String escalafon) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.escalafon = escalafon;
    }

    public void calificar(UsuarioMoodle Tripulante, int nota){
        //
    }


    //Getters and Setters
    public String getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }
}
