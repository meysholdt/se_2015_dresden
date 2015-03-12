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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExampleQuickfixParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:61:1: ( ruleModel EOF )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:69:1: ruleModel : ( ( rule__Model__CitiesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:73:2: ( ( ( rule__Model__CitiesAssignment )* ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:74:1: ( ( rule__Model__CitiesAssignment )* )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:74:1: ( ( rule__Model__CitiesAssignment )* )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:75:1: ( rule__Model__CitiesAssignment )*
            {
             before(grammarAccess.getModelAccess().getCitiesAssignment()); 
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:76:1: ( rule__Model__CitiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:76:2: rule__Model__CitiesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__CitiesAssignment_in_ruleModel94);
            	    rule__Model__CitiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCitiesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCity"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:88:1: entryRuleCity : ruleCity EOF ;
    public final void entryRuleCity() throws RecognitionException {
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:89:1: ( ruleCity EOF )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:90:1: ruleCity EOF
            {
             before(grammarAccess.getCityRule()); 
            pushFollow(FOLLOW_ruleCity_in_entryRuleCity122);
            ruleCity();

            state._fsp--;

             after(grammarAccess.getCityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCity129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCity"


    // $ANTLR start "ruleCity"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:97:1: ruleCity : ( ( rule__City__Group__0 ) ) ;
    public final void ruleCity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:101:2: ( ( ( rule__City__Group__0 ) ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:102:1: ( ( rule__City__Group__0 ) )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:102:1: ( ( rule__City__Group__0 ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:103:1: ( rule__City__Group__0 )
            {
             before(grammarAccess.getCityAccess().getGroup()); 
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:104:1: ( rule__City__Group__0 )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:104:2: rule__City__Group__0
            {
            pushFollow(FOLLOW_rule__City__Group__0_in_ruleCity155);
            rule__City__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCity"


    // $ANTLR start "entryRuleSight"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:116:1: entryRuleSight : ruleSight EOF ;
    public final void entryRuleSight() throws RecognitionException {
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:117:1: ( ruleSight EOF )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:118:1: ruleSight EOF
            {
             before(grammarAccess.getSightRule()); 
            pushFollow(FOLLOW_ruleSight_in_entryRuleSight182);
            ruleSight();

            state._fsp--;

             after(grammarAccess.getSightRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSight189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSight"


    // $ANTLR start "ruleSight"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:125:1: ruleSight : ( ( rule__Sight__Group__0 ) ) ;
    public final void ruleSight() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:129:2: ( ( ( rule__Sight__Group__0 ) ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:130:1: ( ( rule__Sight__Group__0 ) )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:130:1: ( ( rule__Sight__Group__0 ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:131:1: ( rule__Sight__Group__0 )
            {
             before(grammarAccess.getSightAccess().getGroup()); 
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:132:1: ( rule__Sight__Group__0 )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:132:2: rule__Sight__Group__0
            {
            pushFollow(FOLLOW_rule__Sight__Group__0_in_ruleSight215);
            rule__Sight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSight"


    // $ANTLR start "rule__City__Group__0"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:146:1: rule__City__Group__0 : rule__City__Group__0__Impl rule__City__Group__1 ;
    public final void rule__City__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:150:1: ( rule__City__Group__0__Impl rule__City__Group__1 )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:151:2: rule__City__Group__0__Impl rule__City__Group__1
            {
            pushFollow(FOLLOW_rule__City__Group__0__Impl_in_rule__City__Group__0249);
            rule__City__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__1_in_rule__City__Group__0252);
            rule__City__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__0"


    // $ANTLR start "rule__City__Group__0__Impl"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:158:1: rule__City__Group__0__Impl : ( 'city' ) ;
    public final void rule__City__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:162:1: ( ( 'city' ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:163:1: ( 'city' )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:163:1: ( 'city' )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:164:1: 'city'
            {
             before(grammarAccess.getCityAccess().getCityKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__City__Group__0__Impl280); 
             after(grammarAccess.getCityAccess().getCityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__0__Impl"


    // $ANTLR start "rule__City__Group__1"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:177:1: rule__City__Group__1 : rule__City__Group__1__Impl rule__City__Group__2 ;
    public final void rule__City__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:181:1: ( rule__City__Group__1__Impl rule__City__Group__2 )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:182:2: rule__City__Group__1__Impl rule__City__Group__2
            {
            pushFollow(FOLLOW_rule__City__Group__1__Impl_in_rule__City__Group__1311);
            rule__City__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__2_in_rule__City__Group__1314);
            rule__City__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__1"


    // $ANTLR start "rule__City__Group__1__Impl"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:189:1: rule__City__Group__1__Impl : ( ( rule__City__NameAssignment_1 ) ) ;
    public final void rule__City__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:193:1: ( ( ( rule__City__NameAssignment_1 ) ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:194:1: ( ( rule__City__NameAssignment_1 ) )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:194:1: ( ( rule__City__NameAssignment_1 ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:195:1: ( rule__City__NameAssignment_1 )
            {
             before(grammarAccess.getCityAccess().getNameAssignment_1()); 
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:196:1: ( rule__City__NameAssignment_1 )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:196:2: rule__City__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__City__NameAssignment_1_in_rule__City__Group__1__Impl341);
            rule__City__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__1__Impl"


    // $ANTLR start "rule__City__Group__2"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:206:1: rule__City__Group__2 : rule__City__Group__2__Impl rule__City__Group__3 ;
    public final void rule__City__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:210:1: ( rule__City__Group__2__Impl rule__City__Group__3 )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:211:2: rule__City__Group__2__Impl rule__City__Group__3
            {
            pushFollow(FOLLOW_rule__City__Group__2__Impl_in_rule__City__Group__2371);
            rule__City__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__3_in_rule__City__Group__2374);
            rule__City__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__2"


    // $ANTLR start "rule__City__Group__2__Impl"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:218:1: rule__City__Group__2__Impl : ( '{' ) ;
    public final void rule__City__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:222:1: ( ( '{' ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:223:1: ( '{' )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:223:1: ( '{' )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:224:1: '{'
            {
             before(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__City__Group__2__Impl402); 
             after(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__2__Impl"


    // $ANTLR start "rule__City__Group__3"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:237:1: rule__City__Group__3 : rule__City__Group__3__Impl rule__City__Group__4 ;
    public final void rule__City__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:241:1: ( rule__City__Group__3__Impl rule__City__Group__4 )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:242:2: rule__City__Group__3__Impl rule__City__Group__4
            {
            pushFollow(FOLLOW_rule__City__Group__3__Impl_in_rule__City__Group__3433);
            rule__City__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__4_in_rule__City__Group__3436);
            rule__City__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__3"


    // $ANTLR start "rule__City__Group__3__Impl"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:249:1: rule__City__Group__3__Impl : ( ( rule__City__SightsAssignment_3 )* ) ;
    public final void rule__City__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:253:1: ( ( ( rule__City__SightsAssignment_3 )* ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:254:1: ( ( rule__City__SightsAssignment_3 )* )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:254:1: ( ( rule__City__SightsAssignment_3 )* )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:255:1: ( rule__City__SightsAssignment_3 )*
            {
             before(grammarAccess.getCityAccess().getSightsAssignment_3()); 
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:256:1: ( rule__City__SightsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:256:2: rule__City__SightsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__City__SightsAssignment_3_in_rule__City__Group__3__Impl463);
            	    rule__City__SightsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCityAccess().getSightsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__3__Impl"


    // $ANTLR start "rule__City__Group__4"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:266:1: rule__City__Group__4 : rule__City__Group__4__Impl ;
    public final void rule__City__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:270:1: ( rule__City__Group__4__Impl )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:271:2: rule__City__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__City__Group__4__Impl_in_rule__City__Group__4494);
            rule__City__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__4"


    // $ANTLR start "rule__City__Group__4__Impl"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:277:1: rule__City__Group__4__Impl : ( '}' ) ;
    public final void rule__City__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:281:1: ( ( '}' ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:282:1: ( '}' )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:282:1: ( '}' )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:283:1: '}'
            {
             before(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__City__Group__4__Impl522); 
             after(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__4__Impl"


    // $ANTLR start "rule__Sight__Group__0"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:306:1: rule__Sight__Group__0 : rule__Sight__Group__0__Impl rule__Sight__Group__1 ;
    public final void rule__Sight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:310:1: ( rule__Sight__Group__0__Impl rule__Sight__Group__1 )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:311:2: rule__Sight__Group__0__Impl rule__Sight__Group__1
            {
            pushFollow(FOLLOW_rule__Sight__Group__0__Impl_in_rule__Sight__Group__0563);
            rule__Sight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sight__Group__1_in_rule__Sight__Group__0566);
            rule__Sight__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sight__Group__0"


    // $ANTLR start "rule__Sight__Group__0__Impl"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:318:1: rule__Sight__Group__0__Impl : ( 'sight' ) ;
    public final void rule__Sight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:322:1: ( ( 'sight' ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:323:1: ( 'sight' )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:323:1: ( 'sight' )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:324:1: 'sight'
            {
             before(grammarAccess.getSightAccess().getSightKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Sight__Group__0__Impl594); 
             after(grammarAccess.getSightAccess().getSightKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sight__Group__0__Impl"


    // $ANTLR start "rule__Sight__Group__1"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:337:1: rule__Sight__Group__1 : rule__Sight__Group__1__Impl rule__Sight__Group__2 ;
    public final void rule__Sight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:341:1: ( rule__Sight__Group__1__Impl rule__Sight__Group__2 )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:342:2: rule__Sight__Group__1__Impl rule__Sight__Group__2
            {
            pushFollow(FOLLOW_rule__Sight__Group__1__Impl_in_rule__Sight__Group__1625);
            rule__Sight__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sight__Group__2_in_rule__Sight__Group__1628);
            rule__Sight__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sight__Group__1"


    // $ANTLR start "rule__Sight__Group__1__Impl"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:349:1: rule__Sight__Group__1__Impl : ( ( rule__Sight__NameAssignment_1 ) ) ;
    public final void rule__Sight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:353:1: ( ( ( rule__Sight__NameAssignment_1 ) ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:354:1: ( ( rule__Sight__NameAssignment_1 ) )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:354:1: ( ( rule__Sight__NameAssignment_1 ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:355:1: ( rule__Sight__NameAssignment_1 )
            {
             before(grammarAccess.getSightAccess().getNameAssignment_1()); 
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:356:1: ( rule__Sight__NameAssignment_1 )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:356:2: rule__Sight__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sight__NameAssignment_1_in_rule__Sight__Group__1__Impl655);
            rule__Sight__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSightAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sight__Group__1__Impl"


    // $ANTLR start "rule__Sight__Group__2"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:366:1: rule__Sight__Group__2 : rule__Sight__Group__2__Impl ;
    public final void rule__Sight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:370:1: ( rule__Sight__Group__2__Impl )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:371:2: rule__Sight__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Sight__Group__2__Impl_in_rule__Sight__Group__2685);
            rule__Sight__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sight__Group__2"


    // $ANTLR start "rule__Sight__Group__2__Impl"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:377:1: rule__Sight__Group__2__Impl : ( ( rule__Sight__DescriptionAssignment_2 ) ) ;
    public final void rule__Sight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:381:1: ( ( ( rule__Sight__DescriptionAssignment_2 ) ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:382:1: ( ( rule__Sight__DescriptionAssignment_2 ) )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:382:1: ( ( rule__Sight__DescriptionAssignment_2 ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:383:1: ( rule__Sight__DescriptionAssignment_2 )
            {
             before(grammarAccess.getSightAccess().getDescriptionAssignment_2()); 
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:384:1: ( rule__Sight__DescriptionAssignment_2 )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:384:2: rule__Sight__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Sight__DescriptionAssignment_2_in_rule__Sight__Group__2__Impl712);
            rule__Sight__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSightAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sight__Group__2__Impl"


    // $ANTLR start "rule__Model__CitiesAssignment"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:401:1: rule__Model__CitiesAssignment : ( ruleCity ) ;
    public final void rule__Model__CitiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:405:1: ( ( ruleCity ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:406:1: ( ruleCity )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:406:1: ( ruleCity )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:407:1: ruleCity
            {
             before(grammarAccess.getModelAccess().getCitiesCityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCity_in_rule__Model__CitiesAssignment753);
            ruleCity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCitiesCityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CitiesAssignment"


    // $ANTLR start "rule__City__NameAssignment_1"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:416:1: rule__City__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__City__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:420:1: ( ( RULE_STRING ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:421:1: ( RULE_STRING )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:421:1: ( RULE_STRING )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:422:1: RULE_STRING
            {
             before(grammarAccess.getCityAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__City__NameAssignment_1784); 
             after(grammarAccess.getCityAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__NameAssignment_1"


    // $ANTLR start "rule__City__SightsAssignment_3"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:431:1: rule__City__SightsAssignment_3 : ( ruleSight ) ;
    public final void rule__City__SightsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:435:1: ( ( ruleSight ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:436:1: ( ruleSight )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:436:1: ( ruleSight )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:437:1: ruleSight
            {
             before(grammarAccess.getCityAccess().getSightsSightParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSight_in_rule__City__SightsAssignment_3815);
            ruleSight();

            state._fsp--;

             after(grammarAccess.getCityAccess().getSightsSightParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__SightsAssignment_3"


    // $ANTLR start "rule__Sight__NameAssignment_1"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:446:1: rule__Sight__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Sight__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:450:1: ( ( RULE_STRING ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:451:1: ( RULE_STRING )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:451:1: ( RULE_STRING )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:452:1: RULE_STRING
            {
             before(grammarAccess.getSightAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sight__NameAssignment_1846); 
             after(grammarAccess.getSightAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sight__NameAssignment_1"


    // $ANTLR start "rule__Sight__DescriptionAssignment_2"
    // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:461:1: rule__Sight__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Sight__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:465:1: ( ( RULE_STRING ) )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:466:1: ( RULE_STRING )
            {
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:466:1: ( RULE_STRING )
            // ../org.xtext.quickfix.ui/src-gen/org/xtext/quickfix/ui/contentassist/antlr/internal/InternalExampleQuickfix.g:467:1: RULE_STRING
            {
             before(grammarAccess.getSightAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sight__DescriptionAssignment_2877); 
             after(grammarAccess.getSightAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sight__DescriptionAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CitiesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleCity_in_entryRuleCity122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCity129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__0_in_ruleCity155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSight_in_entryRuleSight182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSight189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sight__Group__0_in_ruleSight215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__0__Impl_in_rule__City__Group__0249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__City__Group__1_in_rule__City__Group__0252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__City__Group__0__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__1__Impl_in_rule__City__Group__1311 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__City__Group__2_in_rule__City__Group__1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__NameAssignment_1_in_rule__City__Group__1__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__2__Impl_in_rule__City__Group__2371 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__City__Group__3_in_rule__City__Group__2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__City__Group__2__Impl402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__3__Impl_in_rule__City__Group__3433 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__City__Group__4_in_rule__City__Group__3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__SightsAssignment_3_in_rule__City__Group__3__Impl463 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__City__Group__4__Impl_in_rule__City__Group__4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__City__Group__4__Impl522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sight__Group__0__Impl_in_rule__Sight__Group__0563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sight__Group__1_in_rule__Sight__Group__0566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Sight__Group__0__Impl594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sight__Group__1__Impl_in_rule__Sight__Group__1625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sight__Group__2_in_rule__Sight__Group__1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sight__NameAssignment_1_in_rule__Sight__Group__1__Impl655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sight__Group__2__Impl_in_rule__Sight__Group__2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sight__DescriptionAssignment_2_in_rule__Sight__Group__2__Impl712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCity_in_rule__Model__CitiesAssignment753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__City__NameAssignment_1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSight_in_rule__City__SightsAssignment_3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sight__NameAssignment_1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sight__DescriptionAssignment_2877 = new BitSet(new long[]{0x0000000000000002L});

}