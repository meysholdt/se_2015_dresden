package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.UnorderedgroupsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnorderedgroupsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'firstName'", "'age'", "'lastName'", "'yearOfBirth'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalUnorderedgroupsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUnorderedgroupsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return InternalUnorderedgroupsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g"; }



	private UnorderedgroupsGrammarAccess grammarAccess;

        public InternalUnorderedgroupsParser(TokenStream input, UnorderedgroupsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
		return "Employee";
	}

	@Override
	protected UnorderedgroupsGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}



    // $ANTLR start "entryRuleEmployee"
    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:67:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:68:2: (iv_ruleEmployee= ruleEmployee EOF )
            // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:69:2: iv_ruleEmployee= ruleEmployee EOF
            {
             newCompositeNode(grammarAccess.getEmployeeRule());
            pushFollow(FOLLOW_ruleEmployee_in_entryRuleEmployee75);
            iv_ruleEmployee=ruleEmployee();

            state._fsp--;

             current =iv_ruleEmployee;
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmployee85);

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:76:1: ruleEmployee returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEmployee() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_firstName_2_0=null;
        Token otherlv_3=null;
        Token lv_age_4_0=null;
        Token otherlv_5=null;
        Token lv_lastName_6_0=null;
        Token otherlv_7=null;
        Token lv_yearOfBirth_8_0=null;

         enterRule();

        try {
            // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:83:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {

		  getUnorderedGroupHelper().enter(grammarAccess.getEmployeeAccess().getUnorderedGroup());

            // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:86:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                int LA1_0 = input.LA(1);

                if ( LA1_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 3) ) {
                    alt1=4;
                }


                switch (alt1) {
		case 1 :
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) ) )
		    {
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:90:5: {...}? => ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) )
		    {
		    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 0) ) {
		        throw new FailedPredicateException(input, "ruleEmployee", "getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 0)");
		    }
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:90:103: ( ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:91:6: ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) )
		    {

							  getUnorderedGroupHelper().select(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 0);

		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:94:6: ({...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:94:7: {...}? => (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) )
		    {
		    if ( !((true)) ) {
		        throw new FailedPredicateException(input, "ruleEmployee", "true");
		    }
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:94:16: (otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:94:18: otherlv_1= 'firstName' ( (lv_firstName_2_0= RULE_ID ) )
		    {
		    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleEmployee167);

				newLeafNode(otherlv_1, grammarAccess.getEmployeeAccess().getFirstNameKeyword_0_0());

		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:98:1: ( (lv_firstName_2_0= RULE_ID ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:99:1: (lv_firstName_2_0= RULE_ID )
		    {
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:99:1: (lv_firstName_2_0= RULE_ID )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:100:3: lv_firstName_2_0= RULE_ID
		    {
		    lv_firstName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmployee184);

					newLeafNode(lv_firstName_2_0, grammarAccess.getEmployeeAccess().getFirstNameIDTerminalRuleCall_0_1_0());


			        if (current==null) {
			            current = createModelElement(grammarAccess.getEmployeeRule());
			        }
					setWithLastConsumed(
						current,
						"firstName",
					lv_firstName_2_0,
					"ID");


		    }


		    }


		    }


		    }


							  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEmployeeAccess().getUnorderedGroup());


		    }


		    }


		    }
		    break;
		case 2 :
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:123:4: ({...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) ) )
		    {
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:123:4: ({...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:124:5: {...}? => ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) )
		    {
		    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 1) ) {
		        throw new FailedPredicateException(input, "ruleEmployee", "getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 1)");
		    }
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:124:103: ( ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:125:6: ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) )
		    {

							  getUnorderedGroupHelper().select(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 1);

		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:128:6: ({...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:128:7: {...}? => (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) )
		    {
		    if ( !((true)) ) {
		        throw new FailedPredicateException(input, "ruleEmployee", "true");
		    }
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:128:16: (otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:128:18: otherlv_3= 'age' ( (lv_age_4_0= RULE_INT ) )
		    {
		    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleEmployee257);

				newLeafNode(otherlv_3, grammarAccess.getEmployeeAccess().getAgeKeyword_1_0());

		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:132:1: ( (lv_age_4_0= RULE_INT ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:133:1: (lv_age_4_0= RULE_INT )
		    {
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:133:1: (lv_age_4_0= RULE_INT )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:134:3: lv_age_4_0= RULE_INT
		    {
		    lv_age_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEmployee274);

					newLeafNode(lv_age_4_0, grammarAccess.getEmployeeAccess().getAgeINTTerminalRuleCall_1_1_0());


			        if (current==null) {
			            current = createModelElement(grammarAccess.getEmployeeRule());
			        }
					setWithLastConsumed(
						current,
						"age",
					lv_age_4_0,
					"INT");


		    }


		    }


		    }


		    }


							  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEmployeeAccess().getUnorderedGroup());


		    }


		    }


		    }
		    break;
		case 3 :
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:157:4: ({...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) ) )
		    {
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:157:4: ({...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:158:5: {...}? => ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) )
		    {
		    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 2) ) {
		        throw new FailedPredicateException(input, "ruleEmployee", "getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 2)");
		    }
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:158:103: ( ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:159:6: ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) )
		    {

							  getUnorderedGroupHelper().select(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 2);

		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:162:6: ({...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:162:7: {...}? => (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) )
		    {
		    if ( !((true)) ) {
		        throw new FailedPredicateException(input, "ruleEmployee", "true");
		    }
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:162:16: (otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:162:18: otherlv_5= 'lastName' ( (lv_lastName_6_0= RULE_ID ) )
		    {
		    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEmployee347);

				newLeafNode(otherlv_5, grammarAccess.getEmployeeAccess().getLastNameKeyword_2_0());

		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:166:1: ( (lv_lastName_6_0= RULE_ID ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:167:1: (lv_lastName_6_0= RULE_ID )
		    {
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:167:1: (lv_lastName_6_0= RULE_ID )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:168:3: lv_lastName_6_0= RULE_ID
		    {
		    lv_lastName_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmployee364);

					newLeafNode(lv_lastName_6_0, grammarAccess.getEmployeeAccess().getLastNameIDTerminalRuleCall_2_1_0());


			        if (current==null) {
			            current = createModelElement(grammarAccess.getEmployeeRule());
			        }
					setWithLastConsumed(
						current,
						"lastName",
					lv_lastName_6_0,
					"ID");


		    }


		    }


		    }


		    }


							  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEmployeeAccess().getUnorderedGroup());


		    }


		    }


		    }
		    break;
		case 4 :
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:191:4: ({...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) ) )
		    {
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:191:4: ({...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:192:5: {...}? => ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) )
		    {
		    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 3) ) {
		        throw new FailedPredicateException(input, "ruleEmployee", "getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 3)");
		    }
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:192:103: ( ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:193:6: ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) )
		    {

							  getUnorderedGroupHelper().select(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 3);

		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:196:6: ({...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:196:7: {...}? => (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) )
		    {
		    if ( !((true)) ) {
		        throw new FailedPredicateException(input, "ruleEmployee", "true");
		    }
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:196:16: (otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:196:18: otherlv_7= 'yearOfBirth' ( (lv_yearOfBirth_8_0= RULE_INT ) )
		    {
		    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleEmployee437);

				newLeafNode(otherlv_7, grammarAccess.getEmployeeAccess().getYearOfBirthKeyword_3_0());

		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:200:1: ( (lv_yearOfBirth_8_0= RULE_INT ) )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:201:1: (lv_yearOfBirth_8_0= RULE_INT )
		    {
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:201:1: (lv_yearOfBirth_8_0= RULE_INT )
		    // ../org.xtext.example.unorderedgroups/src-gen/org/xtext/example/parser/antlr/internal/InternalUnorderedgroups.g:202:3: lv_yearOfBirth_8_0= RULE_INT
		    {
		    lv_yearOfBirth_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEmployee454);

					newLeafNode(lv_yearOfBirth_8_0, grammarAccess.getEmployeeAccess().getYearOfBirthINTTerminalRuleCall_3_1_0());


			        if (current==null) {
			            current = createModelElement(grammarAccess.getEmployeeRule());
			        }
					setWithLastConsumed(
						current,
						"yearOfBirth",
					lv_yearOfBirth_8_0,
					"INT");


		    }


		    }


		    }


		    }


							  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEmployeeAccess().getUnorderedGroup());


		    }


		    }


		    }
		    break;

		default :
		    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEmployeeAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEmployee", "getUnorderedGroupHelper().canLeave(grammarAccess.getEmployeeAccess().getUnorderedGroup())");
            }

            }


            }


		  getUnorderedGroupHelper().leave(grammarAccess.getEmployeeAccess().getUnorderedGroup());


            }


            }

             leaveRule();
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployee"

    // Delegated rules




    public static final BitSet FOLLOW_ruleEmployee_in_entryRuleEmployee75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmployee85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEmployee167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmployee184 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_12_in_ruleEmployee257 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEmployee274 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_13_in_ruleEmployee347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmployee364 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_14_in_ruleEmployee437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEmployee454 = new BitSet(new long[]{0x0000000000007802L});

}
