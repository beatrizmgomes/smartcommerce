package br.com.fiap.smartcommerce.model;

import java.util.Calendar;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tbl_login")
public class UserLogin {

	@Id
	@SequenceGenerator(name="userlogin",sequenceName="sql_tbl_userlogin",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="aluno")
	@Column(name = "id_userlogin")
	private Integer id;
	
	@Column(name = "usuario", length = 25)
	private String usuario;
	
	@Column(name = "password", length = 10)
	private String password;
	
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
    public String getUsuario() {
    return usuario;
    }


    public void setUsuario(String usuario) {
    this.usuario = usuario;
    }
    
    public String getPassword() {
    return password;
   }


   public void setPassword(String password) {
    this.password = password;
   }
   
   public Calendar getDataCriacao() {
       return dataCriacao;
  }

  public void setDataCriacao(Calendar dataCriacao) {
       this.dataCriacao = dataCriacao;
  }
   
}
