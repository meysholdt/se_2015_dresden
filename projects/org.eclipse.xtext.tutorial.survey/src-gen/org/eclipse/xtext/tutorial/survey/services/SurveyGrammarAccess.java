/*
 * generated by Xtext
 */
package org.eclipse.xtext.tutorial.survey.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SurveyGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SurveyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Survey");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSurveyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTitleAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTitleSTRINGTerminalRuleCall_2_0 = (RuleCall)cTitleAssignment_2.eContents().get(0);
		private final Assignment cPagesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPagesPageParserRuleCall_3_0 = (RuleCall)cPagesAssignment_3.eContents().get(0);
		
		//Survey:
		//	"survey" name=ID title=STRING pages+=Page*;
		@Override public ParserRule getRule() { return rule; }

		//"survey" name=ID title=STRING pages+=Page*
		public Group getGroup() { return cGroup; }

		//"survey"
		public Keyword getSurveyKeyword_0() { return cSurveyKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//title=STRING
		public Assignment getTitleAssignment_2() { return cTitleAssignment_2; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_2_0() { return cTitleSTRINGTerminalRuleCall_2_0; }

		//pages+=Page*
		public Assignment getPagesAssignment_3() { return cPagesAssignment_3; }

		//Page
		public RuleCall getPagesPageParserRuleCall_3_0() { return cPagesPageParserRuleCall_3_0; }
	}

	public class PageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Page");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cQuestionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cQuestionsQuestionParserRuleCall_3_0 = (RuleCall)cQuestionsAssignment_3.eContents().get(0);
		private final Assignment cFollowUpsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFollowUpsFollowUpParserRuleCall_4_0 = (RuleCall)cFollowUpsAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Page:
		//	"page" name=ID "(" questions+=Question* followUps+=FollowUp* ")";
		@Override public ParserRule getRule() { return rule; }

		//"page" name=ID "(" questions+=Question* followUps+=FollowUp* ")"
		public Group getGroup() { return cGroup; }

		//"page"
		public Keyword getPageKeyword_0() { return cPageKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//questions+=Question*
		public Assignment getQuestionsAssignment_3() { return cQuestionsAssignment_3; }

		//Question
		public RuleCall getQuestionsQuestionParserRuleCall_3_0() { return cQuestionsQuestionParserRuleCall_3_0; }

		//followUps+=FollowUp*
		public Assignment getFollowUpsAssignment_4() { return cFollowUpsAssignment_4; }

		//FollowUp
		public RuleCall getFollowUpsFollowUpParserRuleCall_4_0() { return cFollowUpsFollowUpParserRuleCall_4_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class FollowUpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FollowUp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cGuardAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cGuardGuardParserRuleCall_0_0 = (RuleCall)cGuardAssignment_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNextAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cNextPageCrossReference_2_0 = (CrossReference)cNextAssignment_2.eContents().get(0);
		private final RuleCall cNextPageIDTerminalRuleCall_2_0_1 = (RuleCall)cNextPageCrossReference_2_0.eContents().get(1);
		
		//FollowUp:
		//	guard=Guard? "->" next=[Page];
		@Override public ParserRule getRule() { return rule; }

		//guard=Guard? "->" next=[Page]
		public Group getGroup() { return cGroup; }

		//guard=Guard?
		public Assignment getGuardAssignment_0() { return cGuardAssignment_0; }

		//Guard
		public RuleCall getGuardGuardParserRuleCall_0_0() { return cGuardGuardParserRuleCall_0_0; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }

		//next=[Page]
		public Assignment getNextAssignment_2() { return cNextAssignment_2; }

		//[Page]
		public CrossReference getNextPageCrossReference_2_0() { return cNextPageCrossReference_2_0; }

		//ID
		public RuleCall getNextPageIDTerminalRuleCall_2_0_1() { return cNextPageIDTerminalRuleCall_2_0_1; }
	}

	public class GuardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Guard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQuestionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cQuestionChoiceQuestionCrossReference_1_0 = (CrossReference)cQuestionAssignment_1.eContents().get(0);
		private final RuleCall cQuestionChoiceQuestionQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cQuestionChoiceQuestionCrossReference_1_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAnswerAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cAnswerChoiceCrossReference_3_0 = (CrossReference)cAnswerAssignment_3.eContents().get(0);
		private final RuleCall cAnswerChoiceIDTerminalRuleCall_3_0_1 = (RuleCall)cAnswerChoiceCrossReference_3_0.eContents().get(1);
		
		//Guard:
		//	"if" question=[ChoiceQuestion|QualifiedName] "=" answer=[Choice];
		@Override public ParserRule getRule() { return rule; }

		//"if" question=[ChoiceQuestion|QualifiedName] "=" answer=[Choice]
		public Group getGroup() { return cGroup; }

		//"if"
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }

		//question=[ChoiceQuestion|QualifiedName]
		public Assignment getQuestionAssignment_1() { return cQuestionAssignment_1; }

		//[ChoiceQuestion|QualifiedName]
		public CrossReference getQuestionChoiceQuestionCrossReference_1_0() { return cQuestionChoiceQuestionCrossReference_1_0; }

		//QualifiedName
		public RuleCall getQuestionChoiceQuestionQualifiedNameParserRuleCall_1_0_1() { return cQuestionChoiceQuestionQualifiedNameParserRuleCall_1_0_1; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//answer=[Choice]
		public Assignment getAnswerAssignment_3() { return cAnswerAssignment_3; }

		//[Choice]
		public CrossReference getAnswerChoiceCrossReference_3_0() { return cAnswerChoiceCrossReference_3_0; }

		//ID
		public RuleCall getAnswerChoiceIDTerminalRuleCall_3_0_1() { return cAnswerChoiceIDTerminalRuleCall_3_0_1; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		@Override public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Question");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFreeTextQuestionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cChoiceQuestionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Question:
		//	FreeTextQuestion | ChoiceQuestion;
		@Override public ParserRule getRule() { return rule; }

		//FreeTextQuestion | ChoiceQuestion
		public Alternatives getAlternatives() { return cAlternatives; }

		//FreeTextQuestion
		public RuleCall getFreeTextQuestionParserRuleCall_0() { return cFreeTextQuestionParserRuleCall_0; }

		//ChoiceQuestion
		public RuleCall getChoiceQuestionParserRuleCall_1() { return cChoiceQuestionParserRuleCall_1; }
	}

	public class FreeTextQuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FreeTextQuestion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTextAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTextSTRINGTerminalRuleCall_2_0 = (RuleCall)cTextAssignment_2.eContents().get(0);
		
		//FreeTextQuestion:
		//	"text" name=ID text=STRING;
		@Override public ParserRule getRule() { return rule; }

		//"text" name=ID text=STRING
		public Group getGroup() { return cGroup; }

		//"text"
		public Keyword getTextKeyword_0() { return cTextKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//text=STRING
		public Assignment getTextAssignment_2() { return cTextAssignment_2; }

		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_2_0() { return cTextSTRINGTerminalRuleCall_2_0; }
	}

	public class ChoiceQuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ChoiceQuestion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSingleAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cSingleSingleKeyword_0_0 = (Keyword)cSingleAssignment_0.eContents().get(0);
		private final Keyword cChoiceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cTextAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTextSTRINGTerminalRuleCall_3_0 = (RuleCall)cTextAssignment_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cChoicesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cChoicesChoiceParserRuleCall_5_0 = (RuleCall)cChoicesAssignment_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ChoiceQuestion:
		//	single?="single"? "choice" name=ID text=STRING "(" choices+=Choice+ ")";
		@Override public ParserRule getRule() { return rule; }

		//single?="single"? "choice" name=ID text=STRING "(" choices+=Choice+ ")"
		public Group getGroup() { return cGroup; }

		//single?="single"?
		public Assignment getSingleAssignment_0() { return cSingleAssignment_0; }

		//"single"
		public Keyword getSingleSingleKeyword_0_0() { return cSingleSingleKeyword_0_0; }

		//"choice"
		public Keyword getChoiceKeyword_1() { return cChoiceKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//text=STRING
		public Assignment getTextAssignment_3() { return cTextAssignment_3; }

		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_3_0() { return cTextSTRINGTerminalRuleCall_3_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }

		//choices+=Choice+
		public Assignment getChoicesAssignment_5() { return cChoicesAssignment_5; }

		//Choice
		public RuleCall getChoicesChoiceParserRuleCall_5_0() { return cChoicesChoiceParserRuleCall_5_0; }

		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
	}

	public class ChoiceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Choice");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFreetextAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cFreetextTextKeyword_0_0 = (Keyword)cFreetextAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTextAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTextSTRINGTerminalRuleCall_2_0 = (RuleCall)cTextAssignment_2.eContents().get(0);
		
		//Choice:
		//	freetext?="text"? name=ID? text=STRING;
		@Override public ParserRule getRule() { return rule; }

		//freetext?="text"? name=ID? text=STRING
		public Group getGroup() { return cGroup; }

		//freetext?="text"?
		public Assignment getFreetextAssignment_0() { return cFreetextAssignment_0; }

		//"text"
		public Keyword getFreetextTextKeyword_0_0() { return cFreetextTextKeyword_0_0; }

		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//text=STRING
		public Assignment getTextAssignment_2() { return cTextAssignment_2; }

		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_2_0() { return cTextSTRINGTerminalRuleCall_2_0; }
	}
	
	
	private final SurveyElements pSurvey;
	private final PageElements pPage;
	private final FollowUpElements pFollowUp;
	private final GuardElements pGuard;
	private final QualifiedNameElements pQualifiedName;
	private final QuestionElements pQuestion;
	private final FreeTextQuestionElements pFreeTextQuestion;
	private final ChoiceQuestionElements pChoiceQuestion;
	private final ChoiceElements pChoice;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SurveyGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSurvey = new SurveyElements();
		this.pPage = new PageElements();
		this.pFollowUp = new FollowUpElements();
		this.pGuard = new GuardElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pQuestion = new QuestionElements();
		this.pFreeTextQuestion = new FreeTextQuestionElements();
		this.pChoiceQuestion = new ChoiceQuestionElements();
		this.pChoice = new ChoiceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.tutorial.survey.Survey".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Survey:
	//	"survey" name=ID title=STRING pages+=Page*;
	public SurveyElements getSurveyAccess() {
		return pSurvey;
	}
	
	public ParserRule getSurveyRule() {
		return getSurveyAccess().getRule();
	}

	//Page:
	//	"page" name=ID "(" questions+=Question* followUps+=FollowUp* ")";
	public PageElements getPageAccess() {
		return pPage;
	}
	
	public ParserRule getPageRule() {
		return getPageAccess().getRule();
	}

	//FollowUp:
	//	guard=Guard? "->" next=[Page];
	public FollowUpElements getFollowUpAccess() {
		return pFollowUp;
	}
	
	public ParserRule getFollowUpRule() {
		return getFollowUpAccess().getRule();
	}

	//Guard:
	//	"if" question=[ChoiceQuestion|QualifiedName] "=" answer=[Choice];
	public GuardElements getGuardAccess() {
		return pGuard;
	}
	
	public ParserRule getGuardRule() {
		return getGuardAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//Question:
	//	FreeTextQuestion | ChoiceQuestion;
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}

	//FreeTextQuestion:
	//	"text" name=ID text=STRING;
	public FreeTextQuestionElements getFreeTextQuestionAccess() {
		return pFreeTextQuestion;
	}
	
	public ParserRule getFreeTextQuestionRule() {
		return getFreeTextQuestionAccess().getRule();
	}

	//ChoiceQuestion:
	//	single?="single"? "choice" name=ID text=STRING "(" choices+=Choice+ ")";
	public ChoiceQuestionElements getChoiceQuestionAccess() {
		return pChoiceQuestion;
	}
	
	public ParserRule getChoiceQuestionRule() {
		return getChoiceQuestionAccess().getRule();
	}

	//Choice:
	//	freetext?="text"? name=ID? text=STRING;
	public ChoiceElements getChoiceAccess() {
		return pChoice;
	}
	
	public ParserRule getChoiceRule() {
		return getChoiceAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
