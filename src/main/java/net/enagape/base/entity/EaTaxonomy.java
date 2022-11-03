package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ea_taxonomy database table.
 * 
 */
@Entity
@Table(name="ea_taxonomy")
@NamedQuery(name="EaTaxonomy.findAll", query="SELECT e FROM EaTaxonomy e")
public class EaTaxonomy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="taxonomy_id")
	private Long taxonomyId;

	@Column(name="taxonomy_count")
	private int taxonomyCount;

	@Column(name="taxonomy_description")
	private String taxonomyDescription;

	@Column(name="taxonomy_name")
	private String taxonomyName;

	@Column(name="taxonomy_parent")
	private Long taxonomyParent;

	@Column(name="taxonomy_term_id")
	private Long taxonomyTermId;

	//bi-directional many-to-one association to EaPost
	@OneToMany(mappedBy="eaTaxonomy")
	private List<EaPost> eaPosts;

	public EaTaxonomy() {
	}

	public Long getTaxonomyId() {
		return this.taxonomyId;
	}

	public void setTaxonomyId(Long taxonomyId) {
		this.taxonomyId = taxonomyId;
	}

	public int getTaxonomyCount() {
		return this.taxonomyCount;
	}

	public void setTaxonomyCount(int taxonomyCount) {
		this.taxonomyCount = taxonomyCount;
	}

	public String getTaxonomyDescription() {
		return this.taxonomyDescription;
	}

	public void setTaxonomyDescription(String taxonomyDescription) {
		this.taxonomyDescription = taxonomyDescription;
	}

	public String getTaxonomyName() {
		return this.taxonomyName;
	}

	public void setTaxonomyName(String taxonomyName) {
		this.taxonomyName = taxonomyName;
	}

	public Long getTaxonomyParent() {
		return this.taxonomyParent;
	}

	public void setTaxonomyParent(Long taxonomyParent) {
		this.taxonomyParent = taxonomyParent;
	}

	public Long getTaxonomyTermId() {
		return this.taxonomyTermId;
	}

	public void setTaxonomyTermId(Long taxonomyTermId) {
		this.taxonomyTermId = taxonomyTermId;
	}

	public List<EaPost> getEaPosts() {
		return this.eaPosts;
	}

	public void setEaPosts(List<EaPost> eaPosts) {
		this.eaPosts = eaPosts;
	}

	public EaPost addEaPost(EaPost eaPost) {
		getEaPosts().add(eaPost);
		eaPost.setEaTaxonomy(this);

		return eaPost;
	}

	public EaPost removeEaPost(EaPost eaPost) {
		getEaPosts().remove(eaPost);
		eaPost.setEaTaxonomy(null);

		return eaPost;
	}

}