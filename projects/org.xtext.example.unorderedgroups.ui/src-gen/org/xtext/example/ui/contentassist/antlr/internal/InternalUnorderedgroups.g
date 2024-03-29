/*
 * generated by Xtext
 */
grammar InternalUnorderedgroups;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.ui.contentassist.antlr.internal; 

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
import org.xtext.example.services.UnorderedgroupsGrammarAccess;

}

@parser::members {
 
 	private UnorderedgroupsGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(UnorderedgroupsGrammarAccess grammarAccess) {
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




// Entry rule entryRuleEmployee
entryRuleEmployee 
:
{ before(grammarAccess.getEmployeeRule()); }
	 ruleEmployee
{ after(grammarAccess.getEmployeeRule()); } 
	 EOF 
;

// Rule Employee
ruleEmployee
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEmployeeAccess().getUnorderedGroup()); }
(rule__Employee__UnorderedGroup)
{ after(grammarAccess.getEmployeeAccess().getUnorderedGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Employee__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Employee__Group_0__0__Impl
	rule__Employee__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Employee__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEmployeeAccess().getFirstNameKeyword_0_0()); }

	'firstName' 

{ after(grammarAccess.getEmployeeAccess().getFirstNameKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Employee__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Employee__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Employee__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEmployeeAccess().getFirstNameAssignment_0_1()); }
(rule__Employee__FirstNameAssignment_0_1)
{ after(grammarAccess.getEmployeeAccess().getFirstNameAssignment_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Employee__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Employee__Group_1__0__Impl
	rule__Employee__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Employee__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEmployeeAccess().getAgeKeyword_1_0()); }

	'age' 

{ after(grammarAccess.getEmployeeAccess().getAgeKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Employee__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Employee__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Employee__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEmployeeAccess().getAgeAssignment_1_1()); }
(rule__Employee__AgeAssignment_1_1)
{ after(grammarAccess.getEmployeeAccess().getAgeAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Employee__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Employee__Group_2__0__Impl
	rule__Employee__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Employee__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEmployeeAccess().getLastNameKeyword_2_0()); }

	'lastName' 

{ after(grammarAccess.getEmployeeAccess().getLastNameKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Employee__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Employee__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Employee__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEmployeeAccess().getLastNameAssignment_2_1()); }
(rule__Employee__LastNameAssignment_2_1)
{ after(grammarAccess.getEmployeeAccess().getLastNameAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Employee__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Employee__Group_3__0__Impl
	rule__Employee__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Employee__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEmployeeAccess().getYearOfBirthKeyword_3_0()); }

	'yearOfBirth' 

{ after(grammarAccess.getEmployeeAccess().getYearOfBirthKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Employee__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Employee__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Employee__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEmployeeAccess().getYearOfBirthAssignment_3_1()); }
(rule__Employee__YearOfBirthAssignment_3_1)
{ after(grammarAccess.getEmployeeAccess().getYearOfBirthAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Employee__UnorderedGroup
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getEmployeeAccess().getUnorderedGroup());
    }
:
	rule__Employee__UnorderedGroup__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getEmployeeAccess().getUnorderedGroup())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getEmployeeAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}


rule__Employee__UnorderedGroup__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getEmployeeAccess().getGroup_0()); }
						(rule__Employee__Group_0__0)
						{ after(grammarAccess.getEmployeeAccess().getGroup_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getEmployeeAccess().getGroup_1()); }
						(rule__Employee__Group_1__0)
						{ after(grammarAccess.getEmployeeAccess().getGroup_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getEmployeeAccess().getGroup_2()); }
						(rule__Employee__Group_2__0)
						{ after(grammarAccess.getEmployeeAccess().getGroup_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getEmployeeAccess().getGroup_3()); }
						(rule__Employee__Group_3__0)
						{ after(grammarAccess.getEmployeeAccess().getGroup_3()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEmployeeAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}


rule__Employee__UnorderedGroup__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Employee__UnorderedGroup__Impl
	rule__Employee__UnorderedGroup__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__Employee__UnorderedGroup__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Employee__UnorderedGroup__Impl
	rule__Employee__UnorderedGroup__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__Employee__UnorderedGroup__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Employee__UnorderedGroup__Impl
	rule__Employee__UnorderedGroup__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__Employee__UnorderedGroup__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Employee__UnorderedGroup__Impl
;
finally {
	restoreStackSize(stackSize);
}










rule__Employee__FirstNameAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEmployeeAccess().getFirstNameIDTerminalRuleCall_0_1_0()); }
	RULE_ID{ after(grammarAccess.getEmployeeAccess().getFirstNameIDTerminalRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Employee__AgeAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEmployeeAccess().getAgeINTTerminalRuleCall_1_1_0()); }
	RULE_INT{ after(grammarAccess.getEmployeeAccess().getAgeINTTerminalRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Employee__LastNameAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEmployeeAccess().getLastNameIDTerminalRuleCall_2_1_0()); }
	RULE_ID{ after(grammarAccess.getEmployeeAccess().getLastNameIDTerminalRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Employee__YearOfBirthAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEmployeeAccess().getYearOfBirthINTTerminalRuleCall_3_1_0()); }
	RULE_INT{ after(grammarAccess.getEmployeeAccess().getYearOfBirthINTTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


