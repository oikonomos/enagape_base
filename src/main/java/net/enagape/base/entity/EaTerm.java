package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ea_term database table.
 * 
 */
@Entity
@Table(name="ea_term")
@NamedQuery(name="EaTerm.findAll", query="SELECT e FROM EaTerm e")
public class EaTerm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="term_id")
	private Long termId;

	@Column(name="term_group")
	private Long termGroup;

	@Column(name="term_name")
	private String termName;

	@Column(name="term_slug")
	private String termSlug;

	//bi-directional many-to-one association to EaTermmeta
	@OneToMany(mappedBy="eaTerm")
	private List<EaTermmeta> eaTermmetas;

	public EaTerm() {
	}

	public Long getTermId() {
		return this.termId;
	}

	public void setTermId(Long termId) {
		this.termId = termId;
	}

	public Long getTermGroup() {
		return this.termGroup;
	}

	public void setTermGroup(Long termGroup) {
		this.termGroup = termGroup;
	}

	public String getTermName() {
		return this.termName;
	}

	public void setTermName(String termName) {
		this.termName = termName;
	}

	public String getTermSlug() {
		return this.termSlug;
	}

	public void setTermSlug(String termSlug) {
		this.termSlug = termSlug;
	}

	public List<EaTermmeta> getEaTermmetas() {
		return this.eaTermmetas;
	}

	public void setEaTermmetas(List<EaTermmeta> eaTermmetas) {
		this.eaTermmetas = eaTermmetas;
	}

	public EaTermmeta addEaTermmeta(EaTermmeta eaTermmeta) {
		getEaTermmetas().add(eaTermmeta);
		eaTermmeta.setEaTerm(this);

		return eaTermmeta;
	}

	public EaTermmeta removeEaTermmeta(EaTermmeta eaTermmeta) {
		getEaTermmetas().remove(eaTermmeta);
		eaTermmeta.setEaTerm(null);

		return eaTermmeta;
	}
}