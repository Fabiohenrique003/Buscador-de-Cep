import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um número para consulta:");
        var cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJason(novoEndereco);
        }catch (RuntimeException | IOException e) {
            System.out.println("Finalizando a aplicação");
        }


    }
}
