public class Solution {
    public int [] participantes;

    public Solution(int[] participantes) {
        this.participantes = participantes;
    }

    public static int [] reporte(int [] participantes) {
        int longitud = participantes.length;

        int numeroMayor = participantes[0];
        int numeroMenor = participantes[0];

        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i] > numeroMayor) {
                numeroMayor = participantes[i];
            }
        }

        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i] < numeroMenor) {
                numeroMenor = participantes[i];
            }
        }

        return new int[]{longitud, numeroMenor, numeroMayor};
    }
}
