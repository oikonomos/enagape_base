package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ea_permission_user database table.
 * 
 */
@Entity
@Table(name="ea_permission_user")
@NamedQuery(name="EaPermissionUser.findAll", query="SELECT e FROM EaPermissionUser e")
public class EaPermissionUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EaPermissionUserPK id;

	public EaPermissionUser() {
	}

	public EaPermissionUserPK getId() {
		return this.id;
	}

	public void setId(EaPermissionUserPK id) {
		this.id = id;
	}

}