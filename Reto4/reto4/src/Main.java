import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Corredor> carrera = new ArrayList<>();
        carrera.add(new Corredor("Tulio", "123", 1.60, 26, 20));
        carrera.add(new Corredor("Juancho", "456", 1.50, 25, 25));

        Object retorno[] = Solution.reporte(carrera);
        System.out.println(Arrays.toString(retorno));
    }
}
