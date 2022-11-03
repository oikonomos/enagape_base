package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ea_link database table.
 * 
 */
@Entity
@Table(name="ea_link")
@NamedQuery(name="EaLink.findAll", query="SELECT e FROM EaLink e")
public class EaLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="link_id")
	private Long linkId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="link_date")
	private Date linkDate;

	@Column(name="link_description")
	private String linkDescription;

	@Column(name="link_name")
	private BigInteger linkName;

	@Column(name="link_rel")
	private String linkRel;

	@Column(name="link_target")
	private String linkTarget;

	@Column(name="link_type")
	private String linkType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="link_updated_date")
	private Date linkUpdatedDate;

	@Column(name="link_url")
	private String linkUrl;

	@Column(name="link_visible")
	private String linkVisible;

	private String notes;

	//bi-directional many-to-one association to EaUser
	@ManyToOne
	@JoinColumn(name="link_owner_id")
	private EaUser eaUser;

	public EaLink() {
	}

	public Long getLinkId() {
		return this.linkId;
	}

	public void setLinkId(Long linkId) {
		this.linkId = linkId;
	}

	public Date getLinkDate() {
		return this.linkDate;
	}

	public void setLinkDate(Date linkDate) {
		this.linkDate = linkDate;
	}

	public String getLinkDescription() {
		return this.linkDescription;
	}

	public void setLinkDescription(String linkDescription) {
		this.linkDescription = linkDescription;
	}

	public BigInteger getLinkName() {
		return this.linkName;
	}

	public void setLinkName(BigInteger linkName) {
		this.linkName = linkName;
	}

	public String getLinkRel() {
		return this.linkRel;
	}

	public void setLinkRel(String linkRel) {
		this.linkRel = linkRel;
	}

	public String getLinkTarget() {
		return this.linkTarget;
	}

	public void setLinkTarget(String linkTarget) {
		this.linkTarget = linkTarget;
	}

	public String getLinkType() {
		return this.linkType;
	}

	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	public Date getLinkUpdatedDate() {
		return this.linkUpdatedDate;
	}

	public void setLinkUpdatedDate(Date linkUpdatedDate) {
		this.linkUpdatedDate = linkUpdatedDate;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getLinkVisible() {
		return this.linkVisible;
	}

	public void setLinkVisible(String linkVisible) {
		this.linkVisible = linkVisible;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public EaUser getEaUser() {
		return this.eaUser;
	}

	public void setEaUser(EaUser eaUser) {
		this.eaUser = eaUser;
	}

}