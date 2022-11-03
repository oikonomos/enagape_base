package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the ea_comment database table.
 * 
 */
@Entity
@Table(name="ea_comment")
@NamedQuery(name="EaComment.findAll", query="SELECT e FROM EaComment e")
public class EaComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="comment_id")
	private Long commentId;

	@Column(name="comment_approved")
	private String commentApproved;

	@Column(name="comment_author_email")
	private String commentAuthorEmail;

	@Column(name="comment_author_id")
	private BigInteger commentAuthorId;

	@Column(name="comment_author_ip")
	private String commentAuthorIp;

	@Column(name="comment_content")
	private String commentContent;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="comment_date")
	private Date commentDate;

	@Column(name="comment_parent")
	private BigInteger commentParent;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="comment_updated_date")
	private Date commentUpdatedDate;

	//bi-directional many-to-one association to EaPost
	@ManyToOne
	@JoinColumn(name="comment_post_id")
	private EaPost eaPost;

	//bi-directional many-to-one association to EaCommentmeta
	@OneToMany(mappedBy="eaComment")
	private List<EaCommentmeta> eaCommentmetas;

	public EaComment() {
	}

	public Long getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public String getCommentApproved() {
		return this.commentApproved;
	}

	public void setCommentApproved(String commentApproved) {
		this.commentApproved = commentApproved;
	}

	public String getCommentAuthorEmail() {
		return this.commentAuthorEmail;
	}

	public void setCommentAuthorEmail(String commentAuthorEmail) {
		this.commentAuthorEmail = commentAuthorEmail;
	}

	public BigInteger getCommentAuthorId() {
		return this.commentAuthorId;
	}

	public void setCommentAuthorId(BigInteger commentAuthorId) {
		this.commentAuthorId = commentAuthorId;
	}

	public String getCommentAuthorIp() {
		return this.commentAuthorIp;
	}

	public void setCommentAuthorIp(String commentAuthorIp) {
		this.commentAuthorIp = commentAuthorIp;
	}

	public String getCommentContent() {
		return this.commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Date getCommentDate() {
		return this.commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public BigInteger getCommentParent() {
		return this.commentParent;
	}

	public void setCommentParent(BigInteger commentParent) {
		this.commentParent = commentParent;
	}

	public Date getCommentUpdatedDate() {
		return this.commentUpdatedDate;
	}

	public void setCommentUpdatedDate(Date commentUpdatedDate) {
		this.commentUpdatedDate = commentUpdatedDate;
	}

	public EaPost getEaPost() {
		return this.eaPost;
	}

	public void setEaPost(EaPost eaPost) {
		this.eaPost = eaPost;
	}

	public List<EaCommentmeta> getEaCommentmetas() {
		return this.eaCommentmetas;
	}

	public void setEaCommentmetas(List<EaCommentmeta> eaCommentmetas) {
		this.eaCommentmetas = eaCommentmetas;
	}

	public EaCommentmeta addEaCommentmeta(EaCommentmeta eaCommentmeta) {
		getEaCommentmetas().add(eaCommentmeta);
		eaCommentmeta.setEaComment(this);

		return eaCommentmeta;
	}

	public EaCommentmeta removeEaCommentmeta(EaCommentmeta eaCommentmeta) {
		getEaCommentmetas().remove(eaCommentmeta);
		eaCommentmeta.setEaComment(null);

		return eaCommentmeta;
	}

}