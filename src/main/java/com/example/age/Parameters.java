package com.example.age;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Parameters implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.List<java.lang.String> classification;
	private java.util.List<java.math.BigDecimal> min;
	private java.util.List<java.math.BigDecimal> max;

	public Parameters() {
	}

	public java.util.List<java.lang.String> getClassification() {
		return this.classification;
	}

	public void setClassification(
			java.util.List<java.lang.String> classification) {
		this.classification = classification;
	}

	public java.util.List<java.math.BigDecimal> getMin() {
		return this.min;
	}

	public void setMin(java.util.List<java.math.BigDecimal> min) {
		this.min = min;
	}

	public java.util.List<java.math.BigDecimal> getMax() {
		return this.max;
	}

	public void setMax(java.util.List<java.math.BigDecimal> max) {
		this.max = max;
	}

	public Parameters(java.util.List<java.lang.String> classification,
			java.util.List<java.math.BigDecimal> min,
			java.util.List<java.math.BigDecimal> max) {
		this.classification = classification;
		this.min = min;
		this.max = max;
	}

}
