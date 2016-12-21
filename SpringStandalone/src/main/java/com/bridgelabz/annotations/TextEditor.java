package com.bridgelabz.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	//adding autowired on properties
	@Autowired
	private SpellChecker spellChecker;
	
	/*----------------------OR @Autowired on getter method--------------------------*/
	/*@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}*/
	
	/*----------------------OR @Autowired on getter method--------------------------*/	
	/*@Autowired
	public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside TextEditor constructor." );
		this.spellChecker = spellChecker;
	}*/

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}