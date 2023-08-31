import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Loja {
  
  String unidade;
  int capacidadeDeVeiculos;
  int numerodeClientes;
  List<Veiculo> veiculos = new ArrayList<Veiculo>();
  HashSet<Veiculo> modelos = new HashSet<Veiculo>();
  
  
  public Loja(String unidade, int capacidadeDeVeiculos, int numerodeClientes) {
    this.unidade = unidade;
    this.capacidadeDeVeiculos = capacidadeDeVeiculos;
    this.numerodeClientes = numerodeClientes;
  }

  void adicionarVeiculo(Veiculo veiculo) {
    this.veiculos.add(veiculo);
  }
}
