package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ea_termmeta database table.
 * 
 */
@Entity
@Table(name="ea_termmeta")
@NamedQuery(name="EaTermmeta.findAll", query="SELECT e FROM EaTermmeta e")
public class EaTermmeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="meta_id")
	private Long metaId;

	@Column(name="meta_key")
	private String metaKey;

	@Column(name="meta_value")
	private String metaValue;

	//bi-directional many-to-one association to EaTerm
	@ManyToOne
	@JoinColumn(name="termmeta_term_id")
	private EaTerm eaTerm;

	public EaTermmeta() {
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

	public EaTerm getEaTerm() {
		return this.eaTerm;
	}

	public void setEaTerm(EaTerm eaTerm) {
		this.eaTerm = eaTerm;
	}

}