package com.topcoder.model;

import java.util.List;

public class TranslatedOutput {

	private List<Sentences> sentences;
	private String src;
	private String confidence;
	private Spell spell;
	private LdResult ld_result;
	
	public List<Sentences> getSentences() {
		return sentences;
	}
	public void setSentences(List<Sentences> sentences) {
		this.sentences = sentences;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getConfidence() {
		return confidence;
	}
	public void setConfidence(String confidence) {
		this.confidence = confidence;
	}
	public Spell getSpell() {
		return spell;
	}
	public void setSpell(Spell spell) {
		this.spell = spell;
	}
	public LdResult getLd_result() {
		return ld_result;
	}
	public void setLd_result(LdResult ld_result) {
		this.ld_result = ld_result;
	}
}
