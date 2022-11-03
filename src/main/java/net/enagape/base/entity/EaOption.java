package net.enagape.base.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ea_option database table.
 * 
 */
@Entity
@Table(name="ea_option")
@NamedQuery(name="EaOption.findAll", query="SELECT e FROM EaOption e")
public class EaOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="option_id")
	private Long optionId;

	@Column(name="option_name")
	private String optionName;

	@Column(name="option_value")
	private String optionValue;

	public EaOption() {
	}

	public Long getOptionId() {
		return this.optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public String getOptionName() {
		return this.optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public String getOptionValue() {
		return this.optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

}