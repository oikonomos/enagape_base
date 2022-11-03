package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ea_postmeta database table.
 * 
 */
@Entity
@Table(name="ea_postmeta")
@NamedQuery(name="EaPostmeta.findAll", query="SELECT e FROM EaPostmeta e")
public class EaPostmeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="meta_id")
	private Long metaId;

	@Column(name="meta_key")
	private String metaKey;

	@Column(name="meta_value")
	private String metaValue;

	//bi-directional many-to-one association to EaPost
	@ManyToOne
	@JoinColumn(name="post_id")
	private EaPost eaPost;

	public EaPostmeta() {
	}

	public Long getMetaId() {
		return this.metaId;
	}

	public void setMetaId(Long metaId) {
		this.metaId = metaId;
	}

	public String getMetaKey() {
		return this.metaKey;
	}

	public void setMetaKey(String metaKey) {
		this.metaKey = metaKey;
	}

	public String getMetaValue() {
		return this.metaValue;
	}

	public void setMetaValue(String metaValue) {
		this.metaValue = metaValue;
	}

	public EaPost getEaPost() {
		return this.eaPost;
	}

	public void setEaPost(EaPost eaPost) {
		this.eaPost = eaPost;
	}

}