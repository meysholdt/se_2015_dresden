/*
* generated by Xtext
*/
grammar InternalExampleQuickfix;

options {
	superClass=AbstractInternalContentAssistParser;

}

@lexer::header {
package org.xtext.quickfix.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.quickfix.ui.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.quickfix.services.ExampleQuickfixGrammarAccess;

}

@parser::members {

	private ExampleQuickfixGrammarAccess grammarAccess;

    public void setGrammarAccess(ExampleQuickfixGrammarAccess grammarAccess) {
	this.grammarAccess = grammarAccess;
    }

    @Override
    protected Grammar getGrammar() {
	return grammarAccess.getGrammar();
    }

    @Override
    protected String getValueForTokenName(String tokenName) {
	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); }
	 EOF
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getCitiesAssignment()); }
(rule__Model__CitiesAssignment)*
{ after(grammarAccess.getModelAccess().getCitiesAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCity
entryRuleCity
:
{ before(grammarAccess.getCityRule()); }
	 ruleCity
{ after(grammarAccess.getCityRule()); }
	 EOF
;

// Rule City
ruleCity
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCityAccess().getGroup()); }
(rule__City__Group__0)
{ after(grammarAccess.getCityAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSight
entryRuleSight
:
{ before(grammarAccess.getSightRule()); }
	 ruleSight
{ after(grammarAccess.getSightRule()); }
	 EOF
;

// Rule Sight
ruleSight
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSightAccess().getGroup()); }
(rule__Sight__Group__0)
{ after(grammarAccess.getSightAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__City__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__0__Impl
	rule__City__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getCityKeyword_0()); }

	'city'

{ after(grammarAccess.getCityAccess().getCityKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__1__Impl
	rule__City__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getNameAssignment_1()); }
(rule__City__NameAssignment_1)
{ after(grammarAccess.getCityAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__2__Impl
	rule__City__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_2()); }

	'{'

{ after(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__3__Impl
	rule__City__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getSightsAssignment_3()); }
(rule__City__SightsAssignment_3)*
{ after(grammarAccess.getCityAccess().getSightsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_4()); }

	'}'

{ after(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Sight__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sight__Group__0__Impl
	rule__Sight__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sight__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSightAccess().getSightKeyword_0()); }

	'sight'

{ after(grammarAccess.getSightAccess().getSightKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sight__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sight__Group__1__Impl
	rule__Sight__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Sight__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSightAccess().getNameAssignment_1()); }
(rule__Sight__NameAssignment_1)
{ after(grammarAccess.getSightAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sight__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sight__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sight__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSightAccess().getDescriptionAssignment_2()); }
(rule__Sight__DescriptionAssignment_2)
{ after(grammarAccess.getSightAccess().getDescriptionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Model__CitiesAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getCitiesCityParserRuleCall_0()); }
	ruleCity{ after(grammarAccess.getModelAccess().getCitiesCityParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__City__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getCityAccess().getNameSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__City__SightsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getSightsSightParserRuleCall_3_0()); }
	ruleSight{ after(grammarAccess.getCityAccess().getSightsSightParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sight__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSightAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getSightAccess().getNameSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sight__DescriptionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSightAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getSightAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
