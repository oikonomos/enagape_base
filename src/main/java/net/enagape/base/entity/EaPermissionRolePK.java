package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ea_permission_role database table.
 * 
 */
@Embeddable
public class EaPermissionRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="permission_id")
	private String permissionId;

	@Column(name="role_id")
	private Long roleId;

	public EaPermissionRolePK() {
	}
	public String getPermissionId() {
		return this.permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}
	public Long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EaPermissionRolePK)) {
			return false;
		}
		EaPermissionRolePK castOther = (EaPermissionRolePK)other;
		return 
			this.permissionId.equals(castOther.permissionId)
			&& this.roleId.equals(castOther.roleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.permissionId.hashCode();
		hash = hash * prime + this.roleId.hashCode();
		
		return hash;
	}
}