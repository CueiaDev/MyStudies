import java.awt.Color;
public  class Carro{
  private Color cor;
  private String placa;
  private int VelocidadeMax;
  
  public Color GetCor() { return cor; }
  public String GetPlaca() { return placa; }
  public int GetVelocidadeMax() { return VelocidadeMax; }
  
  private void SetColor(Color cor_) { cor = cor_; }
  private void SetPlaca(String placa_) { placa = placa_; }
  private void SetVelocidadeMax(int VelocidadeMax_) { VelocidadeMax = VelocidadeMax_; }
  
  public Carro(Color cor_, String placa_, int VelocidadeMax_){
    SetColor(cor_);
    SetPlaca(placa_);
    SetVelocidadeMax(VelocidadeMax_);
  }
}
