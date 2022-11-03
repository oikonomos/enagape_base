package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ea_permission_user database table.
 * 
 */
@Embeddable
public class EaPermissionUserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private Long userId;

	@Column(name="permission_id")
	private Long permissionId;

	@Column(name="user_type")
	private String userType;

	public EaPermissionUserPK() {
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getPermissionId() {
		return this.permissionId;
	}
	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
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
		if (!(other instanceof EaPermissionUserPK)) {
			return false;
		}
		EaPermissionUserPK castOther = (EaPermissionUserPK)other;
		return 
			this.userId.equals(castOther.userId)
			&& this.permissionId.equals(castOther.permissionId)
			&& this.userType.equals(castOther.userType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.permissionId.hashCode();
		hash = hash * prime + this.userType.hashCode();
		
		return hash;
	}
}