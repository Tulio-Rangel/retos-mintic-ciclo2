import java.util.ArrayList;

public class Solution {
    public static Object [] reporte(ArrayList<Corredor> carrera) {
        double sumaTiempo = 0;
        double tiempoMenor = Double.MAX_VALUE;
        double tiempoMayor = Double.MIN_VALUE;
        String nombreCorredorMenorTiempo = "";
        String nombreCorredorMayorTiempo = "";

        for (Corredor corredor: carrera) {
            if(corredor.getTiempoMeta() < tiempoMenor) {
                tiempoMenor = corredor.getTiempoMeta();
                nombreCorredorMenorTiempo = corredor.getNombreCompleto();
            }

            if(corredor.getTiempoMeta() > tiempoMayor) {
                tiempoMayor = corredor.getTiempoMeta();
                nombreCorredorMayorTiempo = corredor.getNombreCompleto();
            }

            sumaTiempo += corredor.getTiempoMeta();
        }
            double promedio = sumaTiempo / carrera.size();

            Object[] valores = {promedio, nombreCorredorMenorTiempo, tiempoMenor, nombreCorredorMayorTiempo, tiempoMayor};

            return valores;
    }
}
