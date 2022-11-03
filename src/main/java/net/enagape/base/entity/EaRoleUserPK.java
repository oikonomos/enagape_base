package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ea_role_user database table.
 * 
 */
@Embeddable
public class EaRoleUserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private Long userId;

	@Column(name="role_id")
	private Long roleId;

	@Column(name="user_type")
	private String userType;

	public EaRoleUserPK() {
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EaRoleUserPK)) {
			return false;
		}
		EaRoleUserPK castOther = (EaRoleUserPK)other;
		return 
			this.userId.equals(castOther.userId)
			&& this.roleId.equals(castOther.roleId)
			&& this.userType.equals(castOther.userType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.roleId.hashCode();
		hash = hash * prime + this.userType.hashCode();
		
		return hash;
	}
}