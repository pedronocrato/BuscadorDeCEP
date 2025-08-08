import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Consulta consulta = new Consulta();

        System.out.println("Digite um númeor de CEP para consulta: ");
        var cep = leitura.nextLine();
        try {
            Endereco novoEndereco = consulta.buscaEndereco(cep);
            System.out.println(novoEndereco);
            Arquivo gerador = new Arquivo();
            gerador.salvar(novoEndereco);
        } catch (RuntimeException | IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}