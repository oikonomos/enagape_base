package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ea_role_user database table.
 * 
 */
@Entity
@Table(name="ea_role_user")
@NamedQuery(name="EaRoleUser.findAll", query="SELECT e FROM EaRoleUser e")
public class EaRoleUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EaRoleUserPK id;

	public EaRoleUser() {
	}

	public EaRoleUserPK getId() {
		return this.id;
	}

	public void setId(EaRoleUserPK id) {
		this.id = id;
	}

}