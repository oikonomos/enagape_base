package net.enagape.base.security;

public enum ApplicationUserPermission {
	AUTHOR_READ("author:read"),
	AUTHOR_WHITE("author:write"),
	ARTICLE_READ("article:read"),
	ARTICLE_WHITE("article:write");
	
	private String permission;
	
	private ApplicationUserPermission(String permission) {
		this.permission = permission;
	}

	public String getPermission() {
		return permission;
	}
}
