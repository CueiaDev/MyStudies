import Carro;
import java.awt.Color;
public class Estacionamento{
  private Carro[] carros;
  
  public Carro criarCarro(String placa){
    return new Carro(Color.black, placa, 120);
  }
}
