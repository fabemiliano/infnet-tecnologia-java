import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Servico {
  public void processarArquivo() throws ExceptionClass {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o arquivo de entrada: ");
    String input = scanner.nextLine();
    
    System.out.print("Digite o arquivo de entrada: ");
    String output = scanner.nextLine();


    scanner.close();

    try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String linhaProcessada = "Processado: " + linha;
                writer.write(linhaProcessada);
                writer.newLine();
            }

        }
    } catch (IOException e) {
      throw new ExceptionClass("Erro ao processar o arquivo: " + e.getMessage());
    }
  }
}
