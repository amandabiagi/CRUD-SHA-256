package crudsha256.crud.completo.dominius;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDate;

@Entity
public class Usuario {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @CPF
    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String estadoCivil;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Integer celular;

    @Column(nullable = false)
    private Integer telefone;

    //Construtor
    public Usuario(Integer id, String nome, String sobrenome, LocalDate dataNascimento, String cpf, String estadoCivil, String email, Integer celular, Integer telefone) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
    }

    public Usuario() {
    }

    //ToString
    @Override
    public String toString() {
        return "Usuario: " +
                "ID: " + id +
                "Nome:" + nome +
                "Sobrenome: " + sobrenome +
                "Data de nascimento: " + dataNascimento +
                "CPF: " + cpf +
                "Estado civil: " + estadoCivil+
                "Email: " + email +
                "Celular: " + celular +
                "Telefone: " + telefone;
    }

    //Getter e Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
}
