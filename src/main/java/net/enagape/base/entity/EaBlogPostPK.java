package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ea_blog_post database table.
 * 
 */
@Embeddable
public class EaBlogPostPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="blog_post_id")
	private Long blogPostId;

	@Column(name="blog_taxonomy_id")
	private Long blogTaxonomyId;

	public EaBlogPostPK() {
	}
	public Long getBlogPostId() {
		return this.blogPostId;
	}
	public void setBlogPostId(Long blogPostId) {
		this.blogPostId = blogPostId;
	}
	public long getBlogTaxonomyId() {
		return this.blogTaxonomyId;
	}
	public void setBlogTaxonomyId(Long blogTaxonomyId) {
		this.blogTaxonomyId = blogTaxonomyId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EaBlogPostPK)) {
			return false;
		}
		EaBlogPostPK castOther = (EaBlogPostPK)other;
		return 
			this.blogPostId.equals(castOther.blogPostId)
			&& String.valueOf(this.blogTaxonomyId).equals(String.valueOf(castOther.blogTaxonomyId));
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.blogPostId.hashCode();
		hash = hash * prime + String.valueOf(this.blogTaxonomyId).hashCode();
		
		return hash;
	}
}