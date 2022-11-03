package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ea_user database table.
 * 
 */
@Entity
@Table(name="ea_user")
@NamedQuery(name="EaUser.findAll", query="SELECT e FROM EaUser e")
public class EaUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	/*@SequenceGenerator(
			name = "user_sequence",
			sequenceName = "user_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "user_sequence"
	)*/
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private String email;

	@Column(name="email_verified_at")
	private Timestamp emailVerifiedAt;

	private String name;

	private String password;

	@Column(name="remember_token")
	private String rememberToken;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	private String username;

	//bi-directional many-to-one association to EaLink
	@OneToMany(mappedBy="eaUser")
	private List<EaLink> eaLinks;

	public EaUser() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Timestamp getEmailVerifiedAt() {
		return this.emailVerifiedAt;
	}

	public void setEmailVerifiedAt(Timestamp emailVerifiedAt) {
		this.emailVerifiedAt = emailVerifiedAt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRememberToken() {
		return this.rememberToken;
	}

	public void setRememberToken(String rememberToken) {
		this.rememberToken = rememberToken;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<EaLink> getEaLinks() {
		return this.eaLinks;
	}

	public void setEaLinks(List<EaLink> eaLinks) {
		this.eaLinks = eaLinks;
	}

	public EaLink addEaLink(EaLink eaLink) {
		getEaLinks().add(eaLink);
		eaLink.setEaUser(this);

		return eaLink;
	}

	public EaLink removeEaLink(EaLink eaLink) {
		getEaLinks().remove(eaLink);
		eaLink.setEaUser(null);

		return eaLink;
	}

}