package clase;

public class Rectangulo extends FGeometrica implements interAreas{

    @Override
    public void CalcularAreas(){
        area = ladoA*ladoB;
    }// Fin del metodo
}
