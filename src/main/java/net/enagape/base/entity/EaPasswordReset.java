package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ea_password_reset database table.
 * 
 */
@Entity
@Table(name="ea_password_reset")
@NamedQuery(name="EaPasswordReset.findAll", query="SELECT e FROM EaPasswordReset e")
public class EaPasswordReset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Id
	private String email;

	private String token;

	public EaPasswordReset() {
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}