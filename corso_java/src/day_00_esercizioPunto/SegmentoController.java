package day_00_esercizioPunto;

public class SegmentoController {
	
	public static double lunghezza(Segmento s) {
        double dx = s.getP2().getX() - s.getP1().getX();
        double dy = s.getP2().getY() - s.getP1().getY();
        double dz = s.getP2().getZ() - s.getP1().getZ();
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

}
