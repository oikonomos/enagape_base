package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ea_post database table.
 * 
 */
@Entity
@Table(name="ea_post")
@NamedQuery(name="EaPost.findAll", query="SELECT e FROM EaPost e")
public class EaPost implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="po_id")
	private Long poId;

	@Column(name="comment_count")
	private int commentCount;

	@Column(name="comment_status")
	private String commentStatus;

	private String guid;

	@Column(name="post_content")
	private String postContent;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="post_date")
	private Date postDate;

	@Column(name="post_excerpt")
	private String postExcerpt;

	@Column(name="post_hit_count")
	private int postHitCount;

	@Column(name="post_mime_type")
	private String postMimeType;

	@Column(name="post_name")
	private String postName;

	@Column(name="post_parent")
	private Long postParent;

	@Column(name="post_password")
	private String postPassword;

	@Column(name="post_status")
	private String postStatus;

	@Column(name="post_tags")
	private String postTags;

	@Column(name="post_title")
	private String postTitle;

	@Column(name="post_type")
	private String postType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="post_updated_date")
	private Date postUpdatedDate;

	//bi-directional many-to-one association to EaComment
	@OneToMany(mappedBy="eaPost")
	private List<EaComment> eaComments;

	//bi-directional many-to-one association to EaTaxonomy
	@ManyToOne
	@JoinColumn(name="post_taxonomy_id")
	private EaTaxonomy eaTaxonomy;

	//bi-directional many-to-one association to EaPostmeta
	@OneToMany(mappedBy="eaPost")
	private List<EaPostmeta> eaPostmetas;

	public EaPost() {
	}

	public Long getPoId() {
		return this.poId;
	}

	public void setPoId(Long poId) {
		this.poId = poId;
	}

	public int getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public String getCommentStatus() {
		return this.commentStatus;
	}

	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getPostContent() {
		return this.postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public Date getPostDate() {
		return this.postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public String getPostExcerpt() {
		return this.postExcerpt;
	}

	public void setPostExcerpt(String postExcerpt) {
		this.postExcerpt = postExcerpt;
	}

	public int getPostHitCount() {
		return this.postHitCount;
	}

	public void setPostHitCount(int postHitCount) {
		this.postHitCount = postHitCount;
	}

	public String getPostMimeType() {
		return this.postMimeType;
	}

	public void setPostMimeType(String postMimeType) {
		this.postMimeType = postMimeType;
	}

	public String getPostName() {
		return this.postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public Long getPostParent() {
		return this.postParent;
	}

	public void setPostParent(Long postParent) {
		this.postParent = postParent;
	}

	public String getPostPassword() {
		return this.postPassword;
	}

	public void setPostPassword(String postPassword) {
		this.postPassword = postPassword;
	}

	public String getPostStatus() {
		return this.postStatus;
	}

	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus;
	}

	public String getPostTags() {
		return this.postTags;
	}

	public void setPostTags(String postTags) {
		this.postTags = postTags;
	}

	public String getPostTitle() {
		return this.postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostType() {
		return this.postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public Date getPostUpdatedDate() {
		return this.postUpdatedDate;
	}

	public void setPostUpdatedDate(Date postUpdatedDate) {
		this.postUpdatedDate = postUpdatedDate;
	}

	public List<EaComment> getEaComments() {
		return this.eaComments;
	}

	public void setEaComments(List<EaComment> eaComments) {
		this.eaComments = eaComments;
	}

	public EaComment addEaComment(EaComment eaComment) {
		getEaComments().add(eaComment);
		eaComment.setEaPost(this);

		return eaComment;
	}

	public EaComment removeEaComment(EaComment eaComment) {
		getEaComments().remove(eaComment);
		eaComment.setEaPost(null);

		return eaComment;
	}

	public EaTaxonomy getEaTaxonomy() {
		return this.eaTaxonomy;
	}

	public void setEaTaxonomy(EaTaxonomy eaTaxonomy) {
		this.eaTaxonomy = eaTaxonomy;
	}

	public List<EaPostmeta> getEaPostmetas() {
		return this.eaPostmetas;
	}

	public void setEaPostmetas(List<EaPostmeta> eaPostmetas) {
		this.eaPostmetas = eaPostmetas;
	}

	public EaPostmeta addEaPostmeta(EaPostmeta eaPostmeta) {
		getEaPostmetas().add(eaPostmeta);
		eaPostmeta.setEaPost(this);

		return eaPostmeta;
	}

	public EaPostmeta removeEaPostmeta(EaPostmeta eaPostmeta) {
		getEaPostmetas().remove(eaPostmeta);
		eaPostmeta.setEaPost(null);

		return eaPostmeta;
	}

}