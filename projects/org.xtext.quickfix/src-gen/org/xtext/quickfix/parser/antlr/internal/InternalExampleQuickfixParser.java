package org.xtext.quickfix.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.quickfix.services.ExampleQuickfixGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExampleQuickfixParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'city'", "'{'", "'}'", "'sight'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalExampleQuickfixParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExampleQuickfixParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return InternalExampleQuickfixParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g"; }



	private ExampleQuickfixGrammarAccess grammarAccess;

        public InternalExampleQuickfixParser(TokenStream input, ExampleQuickfixGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
		return "Model";
	}

	@Override
	protected ExampleQuickfixGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule());
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel;
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85);

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:76:1: ruleModel returns [EObject current=null] : ( (lv_cities_0_0= ruleCity ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_cities_0_0 = null;


         enterRule();

        try {
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:79:28: ( ( (lv_cities_0_0= ruleCity ) )* )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:80:1: ( (lv_cities_0_0= ruleCity ) )*
            {
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:80:1: ( (lv_cities_0_0= ruleCity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
		case 1 :
		    // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:81:1: (lv_cities_0_0= ruleCity )
		    {
		    // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:81:1: (lv_cities_0_0= ruleCity )
		    // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:82:3: lv_cities_0_0= ruleCity
		    {

			        newCompositeNode(grammarAccess.getModelAccess().getCitiesCityParserRuleCall_0());

		    pushFollow(FOLLOW_ruleCity_in_ruleModel130);
		    lv_cities_0_0=ruleCity();

		    state._fsp--;


			        if (current==null) {
			            current = createModelElementForParent(grammarAccess.getModelRule());
			        }
					add(
						current,
						"cities",
					lv_cities_0_0,
					"City");
			        afterParserOrEnumRuleCall();


		    }


		    }
		    break;

		default :
		    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCity"
    // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:106:1: entryRuleCity returns [EObject current=null] : iv_ruleCity= ruleCity EOF ;
    public final EObject entryRuleCity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCity = null;


        try {
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:107:2: (iv_ruleCity= ruleCity EOF )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:108:2: iv_ruleCity= ruleCity EOF
            {
             newCompositeNode(grammarAccess.getCityRule());
            pushFollow(FOLLOW_ruleCity_in_entryRuleCity166);
            iv_ruleCity=ruleCity();

            state._fsp--;

             current =iv_ruleCity;
            match(input,EOF,FOLLOW_EOF_in_entryRuleCity176);

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
    // $ANTLR end "entryRuleCity"


    // $ANTLR start "ruleCity"
    // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:115:1: ruleCity returns [EObject current=null] : (otherlv_0= 'city' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_sights_3_0= ruleSight ) )* otherlv_4= '}' ) ;
    public final EObject ruleCity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sights_3_0 = null;


         enterRule();

        try {
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:118:28: ( (otherlv_0= 'city' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_sights_3_0= ruleSight ) )* otherlv_4= '}' ) )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:119:1: (otherlv_0= 'city' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_sights_3_0= ruleSight ) )* otherlv_4= '}' )
            {
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:119:1: (otherlv_0= 'city' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_sights_3_0= ruleSight ) )* otherlv_4= '}' )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:119:3: otherlv_0= 'city' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_sights_3_0= ruleSight ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCity213);

			newLeafNode(otherlv_0, grammarAccess.getCityAccess().getCityKeyword_0());

            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:123:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:124:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:124:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:125:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCity230);

				newLeafNode(lv_name_1_0, grammarAccess.getCityAccess().getNameSTRINGTerminalRuleCall_1_0());


		        if (current==null) {
		            current = createModelElement(grammarAccess.getCityRule());
		        }
				setWithLastConsumed(
					current,
					"name",
				lv_name_1_0,
				"STRING");


            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCity247);

			newLeafNode(otherlv_2, grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_2());

            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:145:1: ( (lv_sights_3_0= ruleSight ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
		case 1 :
		    // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:146:1: (lv_sights_3_0= ruleSight )
		    {
		    // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:146:1: (lv_sights_3_0= ruleSight )
		    // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:147:3: lv_sights_3_0= ruleSight
		    {

			        newCompositeNode(grammarAccess.getCityAccess().getSightsSightParserRuleCall_3_0());

		    pushFollow(FOLLOW_ruleSight_in_ruleCity268);
		    lv_sights_3_0=ruleSight();

		    state._fsp--;


			        if (current==null) {
			            current = createModelElementForParent(grammarAccess.getCityRule());
			        }
					add(
						current,
						"sights",
					lv_sights_3_0,
					"Sight");
			        afterParserOrEnumRuleCall();


		    }


		    }
		    break;

		default :
		    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleCity281);

			newLeafNode(otherlv_4, grammarAccess.getCityAccess().getRightCurlyBracketKeyword_4());


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
    // $ANTLR end "ruleCity"


    // $ANTLR start "entryRuleSight"
    // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:175:1: entryRuleSight returns [EObject current=null] : iv_ruleSight= ruleSight EOF ;
    public final EObject entryRuleSight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSight = null;


        try {
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:176:2: (iv_ruleSight= ruleSight EOF )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:177:2: iv_ruleSight= ruleSight EOF
            {
             newCompositeNode(grammarAccess.getSightRule());
            pushFollow(FOLLOW_ruleSight_in_entryRuleSight317);
            iv_ruleSight=ruleSight();

            state._fsp--;

             current =iv_ruleSight;
            match(input,EOF,FOLLOW_EOF_in_entryRuleSight327);

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
    // $ANTLR end "entryRuleSight"


    // $ANTLR start "ruleSight"
    // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:184:1: ruleSight returns [EObject current=null] : (otherlv_0= 'sight' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule();

        try {
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:187:28: ( (otherlv_0= 'sight' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:188:1: (otherlv_0= 'sight' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:188:1: (otherlv_0= 'sight' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:188:3: otherlv_0= 'sight' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_description_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSight364);

			newLeafNode(otherlv_0, grammarAccess.getSightAccess().getSightKeyword_0());

            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:192:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:193:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:193:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:194:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSight381);

				newLeafNode(lv_name_1_0, grammarAccess.getSightAccess().getNameSTRINGTerminalRuleCall_1_0());


		        if (current==null) {
		            current = createModelElement(grammarAccess.getSightRule());
		        }
				setWithLastConsumed(
					current,
					"name",
				lv_name_1_0,
				"STRING");


            }


            }

            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:210:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:211:1: (lv_description_2_0= RULE_STRING )
            {
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:211:1: (lv_description_2_0= RULE_STRING )
            // ../org.xtext.quickfix/src-gen/org/xtext/quickfix/parser/antlr/internal/InternalExampleQuickfix.g:212:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSight403);

				newLeafNode(lv_description_2_0, grammarAccess.getSightAccess().getDescriptionSTRINGTerminalRuleCall_2_0());


		        if (current==null) {
		            current = createModelElement(grammarAccess.getSightRule());
		        }
				setWithLastConsumed(
					current,
					"description",
				lv_description_2_0,
				"STRING");


            }


            }


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
    // $ANTLR end "ruleSight"

    // Delegated rules




    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCity_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleCity_in_entryRuleCity166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCity176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCity213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCity230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCity247 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleSight_in_ruleCity268 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleCity281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSight_in_entryRuleSight317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSight327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSight364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSight381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSight403 = new BitSet(new long[]{0x0000000000000002L});

}