package net.enagape.base.security;

public enum Role {
	ADMIN("ROLE_ADMIN"),
	AUTHOR("ROLE_AUTHOR"),
	GUEST("ROLE_GUEST");
	
	private String value;
	
	private Role(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}	
}
