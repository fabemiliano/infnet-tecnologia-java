

public class Economico extends Veiculo {
  boolean hasKitGas;
  int capacidadePortaMala;
  Float cilindrada;
  
  public String toString() {
    
    return this.nome + "tem a diária de: " + this.valorDiaria;
    
  }

  @Override
  Double calcularPrecoTotal() {
    Double seguro = 500.00;
    Double demaisTaxas = 100.00;
    return this.valorDiaria + seguro + demaisTaxas;
  }
}
