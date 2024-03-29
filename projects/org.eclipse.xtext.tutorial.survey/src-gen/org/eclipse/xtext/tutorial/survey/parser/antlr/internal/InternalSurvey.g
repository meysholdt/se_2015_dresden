/*
 * generated by Xtext
 */
grammar InternalSurvey;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipse.xtext.tutorial.survey.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.tutorial.survey.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.tutorial.survey.services.SurveyGrammarAccess;

}

@parser::members {

 	private SurveyGrammarAccess grammarAccess;
 	
    public InternalSurveyParser(TokenStream input, SurveyGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Survey";	
   	}
   	
   	@Override
   	protected SurveyGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSurvey
entryRuleSurvey returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSurveyRule()); }
	 iv_ruleSurvey=ruleSurvey 
	 { $current=$iv_ruleSurvey.current; } 
	 EOF 
;

// Rule Survey
ruleSurvey returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='survey' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getSurveyKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSurveyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_title_2_0=RULE_STRING
		{
			newLeafNode(lv_title_2_0, grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSurveyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"title",
        		lv_title_2_0, 
        		"STRING");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_3_0()); 
	    }
		lv_pages_3_0=rulePage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSurveyRule());
	        }
       		add(
       			$current, 
       			"pages",
        		lv_pages_3_0, 
        		"Page");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRulePage
entryRulePage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPageRule()); }
	 iv_rulePage=rulePage 
	 { $current=$iv_rulePage.current; } 
	 EOF 
;

// Rule Page
rulePage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='page' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
	    }
		lv_questions_3_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_3_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getFollowUpsFollowUpParserRuleCall_4_0()); 
	    }
		lv_followUps_4_0=ruleFollowUp		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		add(
       			$current, 
       			"followUps",
        		lv_followUps_4_0, 
        		"FollowUp");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getPageAccess().getRightParenthesisKeyword_5());
    }
)
;





// Entry rule entryRuleFollowUp
entryRuleFollowUp returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFollowUpRule()); }
	 iv_ruleFollowUp=ruleFollowUp 
	 { $current=$iv_ruleFollowUp.current; } 
	 EOF 
;

// Rule FollowUp
ruleFollowUp returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getFollowUpAccess().getGuardGuardParserRuleCall_0_0()); 
	    }
		lv_guard_0_0=ruleGuard		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFollowUpRule());
	        }
       		set(
       			$current, 
       			"guard",
        		lv_guard_0_0, 
        		"Guard");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_1='->' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFollowUpAccess().getHyphenMinusGreaterThanSignKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFollowUpRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getFollowUpAccess().getNextPageCrossReference_2_0()); 
	}

)
))
;





// Entry rule entryRuleGuard
entryRuleGuard returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGuardRule()); }
	 iv_ruleGuard=ruleGuard 
	 { $current=$iv_ruleGuard.current; } 
	 EOF 
;

// Rule Guard
ruleGuard returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getIfKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getGuardRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getGuardAccess().getQuestionChoiceQuestionCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getGuardAccess().getEqualsSignKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getGuardRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getGuardAccess().getAnswerChoiceCrossReference_3_0()); 
	}

)
))
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	 iv_ruleQuestion=ruleQuestion 
	 { $current=$iv_ruleQuestion.current; } 
	 EOF 
;

// Rule Question
ruleQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getFreeTextQuestionParserRuleCall_0()); 
    }
    this_FreeTextQuestion_0=ruleFreeTextQuestion
    { 
        $current = $this_FreeTextQuestion_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getChoiceQuestionParserRuleCall_1()); 
    }
    this_ChoiceQuestion_1=ruleChoiceQuestion
    { 
        $current = $this_ChoiceQuestion_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleFreeTextQuestion
entryRuleFreeTextQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFreeTextQuestionRule()); }
	 iv_ruleFreeTextQuestion=ruleFreeTextQuestion 
	 { $current=$iv_ruleFreeTextQuestion.current; } 
	 EOF 
;

// Rule FreeTextQuestion
ruleFreeTextQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='text' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFreeTextQuestionAccess().getTextKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFreeTextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFreeTextQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_text_2_0=RULE_STRING
		{
			newLeafNode(lv_text_2_0, grammarAccess.getFreeTextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFreeTextQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleChoiceQuestion
entryRuleChoiceQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getChoiceQuestionRule()); }
	 iv_ruleChoiceQuestion=ruleChoiceQuestion 
	 { $current=$iv_ruleChoiceQuestion.current; } 
	 EOF 
;

// Rule ChoiceQuestion
ruleChoiceQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_single_0_0=	'single' 
    {
        newLeafNode(lv_single_0_0, grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceQuestionRule());
	        }
       		setWithLastConsumed($current, "single", true, "single");
	    }

)
)?	otherlv_1='choice' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getChoiceQuestionAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)(
(
		lv_text_3_0=RULE_STRING
		{
			newLeafNode(lv_text_3_0, grammarAccess.getChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_3_0, 
        		"STRING");
	    }

)
)	otherlv_4='(' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); 
	    }
		lv_choices_5_0=ruleChoice		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
	        }
       		add(
       			$current, 
       			"choices",
        		lv_choices_5_0, 
        		"Choice");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getChoiceQuestionAccess().getRightParenthesisKeyword_6());
    }
)
;





// Entry rule entryRuleChoice
entryRuleChoice returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getChoiceRule()); }
	 iv_ruleChoice=ruleChoice 
	 { $current=$iv_ruleChoice.current; } 
	 EOF 
;

// Rule Choice
ruleChoice returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_freetext_0_0=	'text' 
    {
        newLeafNode(lv_freetext_0_0, grammarAccess.getChoiceAccess().getFreetextTextKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceRule());
	        }
       		setWithLastConsumed($current, "freetext", true, "text");
	    }

)
)?(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)?(
(
		lv_text_2_0=RULE_STRING
		{
			newLeafNode(lv_text_2_0, grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_2_0, 
        		"STRING");
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


