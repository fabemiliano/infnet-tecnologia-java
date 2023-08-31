

public class Run {
  public static void main(String[] args)  {
    
    var compass = new SUV();
    var argo = new Intermediario();
    var mobi = new Economico();
    var lojaCentro = new Loja("Centro", 20, 100);
    
    lojaCentro.adicionarVeiculo(compass);
    lojaCentro.adicionarVeiculo(argo);
    lojaCentro.adicionarVeiculo(mobi);
     
  }
}
