

public class Intermediario extends Veiculo {
  boolean kitMultmidia;
  boolean isFlex;
  String rendimento;
  
  public String toString() {
    
    return this.nome + "tem a diária de: " + this.valorDiaria;
    
  }

  @Override
  Double calcularPrecoTotal() {
    Double demaisTaxas = 300.00;
    return this.valorDiaria + demaisTaxas;
  }
}
