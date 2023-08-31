

public class SUV extends Veiculo {
  boolean automatico;
  boolean isDiesel;
  int numeroPassageiros;
  
  public String toString() {
    return this.nome + "tem a diária de: " + this.valorDiaria; 
  }

  @Override
  Double calcularPrecoTotal() {
    Double seguro = 700.00;
    Double taxaEmissao = 200.00;
    return this.valorDiaria + seguro + taxaEmissao;
  }
}
