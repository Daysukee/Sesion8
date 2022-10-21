package clase;

public class Triangulo extends FGeometrica implements interAreas{

    public void CalcularAreas(){
        double p = (ladoA+ladoB+ladoC)/2;
        area = Math.sqrt(p*(p-ladoA) * (p-ladoB) * (p-ladoC));
    }
}
