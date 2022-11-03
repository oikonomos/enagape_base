package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ea_permission_role database table.
 * 
 */
@Entity
@Table(name="ea_permission_role")
@NamedQuery(name="EaPermissionRole.findAll", query="SELECT e FROM EaPermissionRole e")
public class EaPermissionRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EaPermissionRolePK id;

	public EaPermissionRole() {
	}

	public EaPermissionRolePK getId() {
		return this.id;
	}

	public void setId(EaPermissionRolePK id) {
		this.id = id;
	}

}