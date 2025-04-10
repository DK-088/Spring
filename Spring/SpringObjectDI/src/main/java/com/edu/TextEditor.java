package com.edu;

public class TextEditor {
	
	private SpellCheck spellCheck;

	public TextEditor(SpellCheck spellCheck) {
		super();
		this.spellCheck = spellCheck;
	}
	
	public void opentexteditor() {
		if(spellCheck!=null) {
			spellCheck.checkSpelling();
			
		}
	}

}
