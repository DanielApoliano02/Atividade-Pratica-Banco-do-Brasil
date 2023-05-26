import java.time.LocalDate;
import java.time.Period;
class Cliente extends Endereco {
    private String nome;
    private LocalDate dataNascimento;
    private Endereco enderecoComercial;
    private Endereco enderecoResidencial;

    public Cliente(String nome, LocalDate dataNascimento, Endereco enderecoComercial, Endereco enderecoResidencial) {
        super(enderecoComercial.getLogradouro(), enderecoComercial.getBairro(), enderecoComercial.getCep(), enderecoComercial.getCidade(), enderecoComercial.getTipoEndereco());
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.enderecoComercial = enderecoComercial;
        this.enderecoResidencial = enderecoResidencial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEnderecoComercial() {
        return enderecoComercial;
    }

    public void setEnderecoComercial(Endereco enderecoComercial) {
        this.enderecoComercial = enderecoComercial;
    }

    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(Endereco enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public int getIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }
}
