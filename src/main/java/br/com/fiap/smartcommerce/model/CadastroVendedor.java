package br.com.fiap.smartcommerce.model;

import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "cadastroVendedor")
public class CadastroVendedor {

	@Id
	@SequenceGenerator(name="cadastroVendedor",sequenceName="sql_tbl_cadastroVendedor",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="vendedor")
	@Column(name = "id_vendedor")
	private Integer id;
	
	@Column(name = "nome_vendedor", length = 25)
	private String nome_vendedor;
	
	@Column(name = "cpf", length = 11)
	private int cpf;
	
	@Column(name = "cnpj", length = 14)
	private int cnpj;
	
	@Column(name = "endereco", length = 25)
	private String endereco;
	
	@Column(name = "telefone", length = 12)
	private int telefone;
	
	@Column(name = "cep", length = 25)
	private int cep;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dh_criacao")
    private Calendar dataCriacao;
	
	
	public Integer getId() {
    return id;
    }

    public void setId(Integer id) {
    this.id = id;
    }
    
    public String getNomeVendedor() {
    return nome_vendedor;
    }


    public void setNomeVendedor(String nome_vendedor) {
    this.nome_vendedor = nome_vendedor;
    }
    
    public int getCpf() {
    return cpf;
    }


    public void setCpf(int cpf) {
    this.cpf = cpf;
   	}
   
    public int getCnpj() {
    return cnpj;
    }
    
    public void setCnpj(int cnpj) {
    this.cnpj = cnpj;
   	}
    
    public int getTelefone() {
    return telefone;
    }
    
    public void setTelefone(int telefone) {
    this.telefone = telefone;
   	}
       
    public Calendar getDataCriacao() {
       return dataCriacao;
    }
    
    public String getEndereco() {
    return endereco;
    }
    
    public int getCep() {
    return cep;
    }
    
    public void setCep(int cep) {
    this.cep = cep;
   	}


    public void setEndereco(String endereco) {
    this.endereco = endereco;
    }

    public void setDataCriacao(Calendar dataCriacao) {
       this.dataCriacao = dataCriacao;
    }
    
    
}
