import java.time.LocalDate;
import java.time.Period;
public class Main {
    public static void main(String[] args) {

        // Criando os endereços
        Endereco enderecoComercial = new Endereco("Quadra 100 Rua 40", "Mingone 2", "72801040", "Luziania", TipoEndereco.COMERCIAL);
        Endereco enderecoResidencial = new Endereco("Avenida Aeroporto", "Setor Aeroporto", "72855100", "Luziania", TipoEndereco.RESIDENCIAL);

        LocalDate dataNascimento = LocalDate.of(2002, 4, 13);

        Cliente cliente = new Cliente("Daniel Apoliano", dataNascimento, enderecoComercial, enderecoResidencial);

        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println();

        System.out.println("Tipo de Endereço: " + cliente.getEnderecoComercial().getTipoEndereco());
        System.out.println("Logradouro: " + cliente.getEnderecoComercial().getLogradouro());
        System.out.println("Bairro: " + cliente.getEnderecoComercial().getBairro());
        System.out.println("CEP: " + cliente.getEnderecoComercial().getCep());
        System.out.println("Cidade: " + cliente.getEnderecoComercial().getCidade());
        System.out.println();

        System.out.println("Tipo de Endereço: " + cliente.getEnderecoResidencial().getTipoEndereco());
        System.out.println("Logradouro: " + cliente.getEnderecoResidencial().getLogradouro());
        System.out.println("Bairro: " + cliente.getEnderecoResidencial().getBairro());
        System.out.println("CEP: " + cliente.getEnderecoResidencial().getCep());
        System.out.println("Cidade: " + cliente.getEnderecoResidencial().getCidade());
    }
}
