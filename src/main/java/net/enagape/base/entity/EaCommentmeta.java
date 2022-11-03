package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ea_commentmeta database table.
 * 
 */
@Entity
@Table(name="ea_commentmeta")
@NamedQuery(name="EaCommentmeta.findAll", query="SELECT e FROM EaCommentmeta e")
public class EaCommentmeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="meta_id")
	private Long metaId;

	@Column(name="meta_key")
	private String metaKey;

	@Column(name="meta_value")
	private String metaValue;

	//bi-directional many-to-one association to EaComment
	@ManyToOne
	@JoinColumn(name="comment_id")
	private EaComment eaComment;

	public EaCommentmeta() {
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

	public EaComment getEaComment() {
		return this.eaComment;
	}

	public void setEaComment(EaComment eaComment) {
		this.eaComment = eaComment;
	}

}