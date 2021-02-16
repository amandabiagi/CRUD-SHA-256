package crudsha256.crud.completo.dominius;
import javax.persistence.*;

@Entity
public class Endereco {

    //Atributos
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column (unique = true, nullable = false)
    private Integer id;

    @Column (nullable = false)
    private Integer cep;

    @Column (nullable = false)
    private String estado;

    @Column (nullable = false)
    private String cidade;

    @Column (nullable = false)
    private String rua;

    //Construtor
    public Endereco(Integer id, Integer cep, String estado, String cidade, String rua) {
        this.id = id;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
    }

    public Endereco() {
    }

    //ToString
    @Override
    public String toString() {
        return "Endereco" +
                "ID: " + id +
                "CEP: " + cep +
                "Estado: " + estado +
                "Cidade: " + cidade +
                "Rua: " + rua;
    }

    //Getter e Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
