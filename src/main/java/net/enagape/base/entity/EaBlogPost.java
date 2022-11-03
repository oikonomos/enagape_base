package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ea_blog_post database table.
 * 
 */
@Entity
@Table(name="ea_blog_post")
@NamedQuery(name="EaBlogPost.findAll", query="SELECT e FROM EaBlogPost e")
public class EaBlogPost implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EaBlogPostPK id;

	@Column(name="blog_post_order")
	private int blogPostOrder;

	public EaBlogPost() {
	}

	public EaBlogPostPK getId() {
		return this.id;
	}

	public void setId(EaBlogPostPK id) {
		this.id = id;
	}

	public int getBlogPostOrder() {
		return this.blogPostOrder;
	}

	public void setBlogPostOrder(int blogPostOrder) {
		this.blogPostOrder = blogPostOrder;
	}

}