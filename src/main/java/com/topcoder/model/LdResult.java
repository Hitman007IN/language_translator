package com.topcoder.model;

import java.util.List;

public class LdResult {

	private List<String> srclangs;
	private List<String> srclangsConfidences;
	private List<String> extendedSrclangs;
	
	public List<String> getSrclangs() {
		return srclangs;
	}
	public void setSrclangs(List<String> srclangs) {
		this.srclangs = srclangs;
	}
	public List<String> getSrclangsConfidences() {
		return srclangsConfidences;
	}
	public void setSrclangsConfidences(List<String> srclangsConfidences) {
		this.srclangsConfidences = srclangsConfidences;
	}
	public List<String> getExtendedSrclangs() {
		return extendedSrclangs;
	}
	public void setExtendedSrclangs(List<String> extendedSrclangs) {
		this.extendedSrclangs = extendedSrclangs;
	}
	
}
