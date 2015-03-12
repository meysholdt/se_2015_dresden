package org.xtext.example.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.services.UnorderedgroupsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnorderedgroupsParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g"; }


     
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




    // $ANTLR start "entryRuleEmployee"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:60:1: entryRuleEmployee : ruleEmployee EOF ;
    public final void entryRuleEmployee() throws RecognitionException {
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:61:1: ( ruleEmployee EOF )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:62:1: ruleEmployee EOF
            {
             before(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_ruleEmployee_in_entryRuleEmployee61);
            ruleEmployee();

            state._fsp--;

             after(grammarAccess.getEmployeeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmployee68); 

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
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:69:1: ruleEmployee : ( ( rule__Employee__UnorderedGroup ) ) ;
    public final void ruleEmployee() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:73:2: ( ( ( rule__Employee__UnorderedGroup ) ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:74:1: ( ( rule__Employee__UnorderedGroup ) )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:74:1: ( ( rule__Employee__UnorderedGroup ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:75:1: ( rule__Employee__UnorderedGroup )
            {
             before(grammarAccess.getEmployeeAccess().getUnorderedGroup()); 
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:76:1: ( rule__Employee__UnorderedGroup )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:76:2: rule__Employee__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__Employee__UnorderedGroup_in_ruleEmployee94);
            rule__Employee__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getUnorderedGroup()); 

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
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "rule__Employee__Group_0__0"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:90:1: rule__Employee__Group_0__0 : rule__Employee__Group_0__0__Impl rule__Employee__Group_0__1 ;
    public final void rule__Employee__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:94:1: ( rule__Employee__Group_0__0__Impl rule__Employee__Group_0__1 )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:95:2: rule__Employee__Group_0__0__Impl rule__Employee__Group_0__1
            {
            pushFollow(FOLLOW_rule__Employee__Group_0__0__Impl_in_rule__Employee__Group_0__0128);
            rule__Employee__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Employee__Group_0__1_in_rule__Employee__Group_0__0131);
            rule__Employee__Group_0__1();

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
    // $ANTLR end "rule__Employee__Group_0__0"


    // $ANTLR start "rule__Employee__Group_0__0__Impl"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:102:1: rule__Employee__Group_0__0__Impl : ( 'firstName' ) ;
    public final void rule__Employee__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:106:1: ( ( 'firstName' ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:107:1: ( 'firstName' )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:107:1: ( 'firstName' )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:108:1: 'firstName'
            {
             before(grammarAccess.getEmployeeAccess().getFirstNameKeyword_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Employee__Group_0__0__Impl159); 
             after(grammarAccess.getEmployeeAccess().getFirstNameKeyword_0_0()); 

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
    // $ANTLR end "rule__Employee__Group_0__0__Impl"


    // $ANTLR start "rule__Employee__Group_0__1"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:121:1: rule__Employee__Group_0__1 : rule__Employee__Group_0__1__Impl ;
    public final void rule__Employee__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:125:1: ( rule__Employee__Group_0__1__Impl )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:126:2: rule__Employee__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Employee__Group_0__1__Impl_in_rule__Employee__Group_0__1190);
            rule__Employee__Group_0__1__Impl();

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
    // $ANTLR end "rule__Employee__Group_0__1"


    // $ANTLR start "rule__Employee__Group_0__1__Impl"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:132:1: rule__Employee__Group_0__1__Impl : ( ( rule__Employee__FirstNameAssignment_0_1 ) ) ;
    public final void rule__Employee__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:136:1: ( ( ( rule__Employee__FirstNameAssignment_0_1 ) ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:137:1: ( ( rule__Employee__FirstNameAssignment_0_1 ) )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:137:1: ( ( rule__Employee__FirstNameAssignment_0_1 ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:138:1: ( rule__Employee__FirstNameAssignment_0_1 )
            {
             before(grammarAccess.getEmployeeAccess().getFirstNameAssignment_0_1()); 
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:139:1: ( rule__Employee__FirstNameAssignment_0_1 )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:139:2: rule__Employee__FirstNameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Employee__FirstNameAssignment_0_1_in_rule__Employee__Group_0__1__Impl217);
            rule__Employee__FirstNameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getFirstNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Employee__Group_0__1__Impl"


    // $ANTLR start "rule__Employee__Group_1__0"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:153:1: rule__Employee__Group_1__0 : rule__Employee__Group_1__0__Impl rule__Employee__Group_1__1 ;
    public final void rule__Employee__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:157:1: ( rule__Employee__Group_1__0__Impl rule__Employee__Group_1__1 )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:158:2: rule__Employee__Group_1__0__Impl rule__Employee__Group_1__1
            {
            pushFollow(FOLLOW_rule__Employee__Group_1__0__Impl_in_rule__Employee__Group_1__0251);
            rule__Employee__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Employee__Group_1__1_in_rule__Employee__Group_1__0254);
            rule__Employee__Group_1__1();

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
    // $ANTLR end "rule__Employee__Group_1__0"


    // $ANTLR start "rule__Employee__Group_1__0__Impl"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:165:1: rule__Employee__Group_1__0__Impl : ( 'age' ) ;
    public final void rule__Employee__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:169:1: ( ( 'age' ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:170:1: ( 'age' )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:170:1: ( 'age' )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:171:1: 'age'
            {
             before(grammarAccess.getEmployeeAccess().getAgeKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Employee__Group_1__0__Impl282); 
             after(grammarAccess.getEmployeeAccess().getAgeKeyword_1_0()); 

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
    // $ANTLR end "rule__Employee__Group_1__0__Impl"


    // $ANTLR start "rule__Employee__Group_1__1"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:184:1: rule__Employee__Group_1__1 : rule__Employee__Group_1__1__Impl ;
    public final void rule__Employee__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:188:1: ( rule__Employee__Group_1__1__Impl )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:189:2: rule__Employee__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Employee__Group_1__1__Impl_in_rule__Employee__Group_1__1313);
            rule__Employee__Group_1__1__Impl();

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
    // $ANTLR end "rule__Employee__Group_1__1"


    // $ANTLR start "rule__Employee__Group_1__1__Impl"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:195:1: rule__Employee__Group_1__1__Impl : ( ( rule__Employee__AgeAssignment_1_1 ) ) ;
    public final void rule__Employee__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:199:1: ( ( ( rule__Employee__AgeAssignment_1_1 ) ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:200:1: ( ( rule__Employee__AgeAssignment_1_1 ) )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:200:1: ( ( rule__Employee__AgeAssignment_1_1 ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:201:1: ( rule__Employee__AgeAssignment_1_1 )
            {
             before(grammarAccess.getEmployeeAccess().getAgeAssignment_1_1()); 
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:202:1: ( rule__Employee__AgeAssignment_1_1 )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:202:2: rule__Employee__AgeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Employee__AgeAssignment_1_1_in_rule__Employee__Group_1__1__Impl340);
            rule__Employee__AgeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getAgeAssignment_1_1()); 

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
    // $ANTLR end "rule__Employee__Group_1__1__Impl"


    // $ANTLR start "rule__Employee__Group_2__0"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:216:1: rule__Employee__Group_2__0 : rule__Employee__Group_2__0__Impl rule__Employee__Group_2__1 ;
    public final void rule__Employee__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:220:1: ( rule__Employee__Group_2__0__Impl rule__Employee__Group_2__1 )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:221:2: rule__Employee__Group_2__0__Impl rule__Employee__Group_2__1
            {
            pushFollow(FOLLOW_rule__Employee__Group_2__0__Impl_in_rule__Employee__Group_2__0374);
            rule__Employee__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Employee__Group_2__1_in_rule__Employee__Group_2__0377);
            rule__Employee__Group_2__1();

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
    // $ANTLR end "rule__Employee__Group_2__0"


    // $ANTLR start "rule__Employee__Group_2__0__Impl"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:228:1: rule__Employee__Group_2__0__Impl : ( 'lastName' ) ;
    public final void rule__Employee__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:232:1: ( ( 'lastName' ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:233:1: ( 'lastName' )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:233:1: ( 'lastName' )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:234:1: 'lastName'
            {
             before(grammarAccess.getEmployeeAccess().getLastNameKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__Employee__Group_2__0__Impl405); 
             after(grammarAccess.getEmployeeAccess().getLastNameKeyword_2_0()); 

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
    // $ANTLR end "rule__Employee__Group_2__0__Impl"


    // $ANTLR start "rule__Employee__Group_2__1"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:247:1: rule__Employee__Group_2__1 : rule__Employee__Group_2__1__Impl ;
    public final void rule__Employee__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:251:1: ( rule__Employee__Group_2__1__Impl )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:252:2: rule__Employee__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Employee__Group_2__1__Impl_in_rule__Employee__Group_2__1436);
            rule__Employee__Group_2__1__Impl();

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
    // $ANTLR end "rule__Employee__Group_2__1"


    // $ANTLR start "rule__Employee__Group_2__1__Impl"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:258:1: rule__Employee__Group_2__1__Impl : ( ( rule__Employee__LastNameAssignment_2_1 ) ) ;
    public final void rule__Employee__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:262:1: ( ( ( rule__Employee__LastNameAssignment_2_1 ) ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:263:1: ( ( rule__Employee__LastNameAssignment_2_1 ) )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:263:1: ( ( rule__Employee__LastNameAssignment_2_1 ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:264:1: ( rule__Employee__LastNameAssignment_2_1 )
            {
             before(grammarAccess.getEmployeeAccess().getLastNameAssignment_2_1()); 
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:265:1: ( rule__Employee__LastNameAssignment_2_1 )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:265:2: rule__Employee__LastNameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Employee__LastNameAssignment_2_1_in_rule__Employee__Group_2__1__Impl463);
            rule__Employee__LastNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getLastNameAssignment_2_1()); 

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
    // $ANTLR end "rule__Employee__Group_2__1__Impl"


    // $ANTLR start "rule__Employee__Group_3__0"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:279:1: rule__Employee__Group_3__0 : rule__Employee__Group_3__0__Impl rule__Employee__Group_3__1 ;
    public final void rule__Employee__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:283:1: ( rule__Employee__Group_3__0__Impl rule__Employee__Group_3__1 )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:284:2: rule__Employee__Group_3__0__Impl rule__Employee__Group_3__1
            {
            pushFollow(FOLLOW_rule__Employee__Group_3__0__Impl_in_rule__Employee__Group_3__0497);
            rule__Employee__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Employee__Group_3__1_in_rule__Employee__Group_3__0500);
            rule__Employee__Group_3__1();

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
    // $ANTLR end "rule__Employee__Group_3__0"


    // $ANTLR start "rule__Employee__Group_3__0__Impl"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:291:1: rule__Employee__Group_3__0__Impl : ( 'yearOfBirth' ) ;
    public final void rule__Employee__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:295:1: ( ( 'yearOfBirth' ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:296:1: ( 'yearOfBirth' )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:296:1: ( 'yearOfBirth' )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:297:1: 'yearOfBirth'
            {
             before(grammarAccess.getEmployeeAccess().getYearOfBirthKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__Employee__Group_3__0__Impl528); 
             after(grammarAccess.getEmployeeAccess().getYearOfBirthKeyword_3_0()); 

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
    // $ANTLR end "rule__Employee__Group_3__0__Impl"


    // $ANTLR start "rule__Employee__Group_3__1"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:310:1: rule__Employee__Group_3__1 : rule__Employee__Group_3__1__Impl ;
    public final void rule__Employee__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:314:1: ( rule__Employee__Group_3__1__Impl )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:315:2: rule__Employee__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Employee__Group_3__1__Impl_in_rule__Employee__Group_3__1559);
            rule__Employee__Group_3__1__Impl();

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
    // $ANTLR end "rule__Employee__Group_3__1"


    // $ANTLR start "rule__Employee__Group_3__1__Impl"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:321:1: rule__Employee__Group_3__1__Impl : ( ( rule__Employee__YearOfBirthAssignment_3_1 ) ) ;
    public final void rule__Employee__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:325:1: ( ( ( rule__Employee__YearOfBirthAssignment_3_1 ) ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:326:1: ( ( rule__Employee__YearOfBirthAssignment_3_1 ) )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:326:1: ( ( rule__Employee__YearOfBirthAssignment_3_1 ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:327:1: ( rule__Employee__YearOfBirthAssignment_3_1 )
            {
             before(grammarAccess.getEmployeeAccess().getYearOfBirthAssignment_3_1()); 
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:328:1: ( rule__Employee__YearOfBirthAssignment_3_1 )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:328:2: rule__Employee__YearOfBirthAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Employee__YearOfBirthAssignment_3_1_in_rule__Employee__Group_3__1__Impl586);
            rule__Employee__YearOfBirthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getYearOfBirthAssignment_3_1()); 

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
    // $ANTLR end "rule__Employee__Group_3__1__Impl"


    // $ANTLR start "rule__Employee__UnorderedGroup"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:343:1: rule__Employee__UnorderedGroup : rule__Employee__UnorderedGroup__0 {...}?;
    public final void rule__Employee__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEmployeeAccess().getUnorderedGroup());
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:348:1: ( rule__Employee__UnorderedGroup__0 {...}?)
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:349:2: rule__Employee__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Employee__UnorderedGroup__0_in_rule__Employee__UnorderedGroup621);
            rule__Employee__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEmployeeAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Employee__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getEmployeeAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEmployeeAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__UnorderedGroup"


    // $ANTLR start "rule__Employee__UnorderedGroup__Impl"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:360:1: rule__Employee__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Employee__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Employee__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Employee__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Employee__Group_3__0 ) ) ) ) ) ;
    public final void rule__Employee__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:365:1: ( ( ({...}? => ( ( ( rule__Employee__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Employee__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Employee__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Employee__Group_3__0 ) ) ) ) ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:366:3: ( ({...}? => ( ( ( rule__Employee__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Employee__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Employee__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Employee__Group_3__0 ) ) ) ) )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:366:3: ( ({...}? => ( ( ( rule__Employee__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Employee__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Employee__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Employee__Group_3__0 ) ) ) ) )
            int alt1=4;
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
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:368:4: ({...}? => ( ( ( rule__Employee__Group_0__0 ) ) ) )
                    {
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:368:4: ({...}? => ( ( ( rule__Employee__Group_0__0 ) ) ) )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:369:5: {...}? => ( ( ( rule__Employee__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Employee__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 0)");
                    }
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:369:103: ( ( ( rule__Employee__Group_0__0 ) ) )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:370:6: ( ( rule__Employee__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:376:6: ( ( rule__Employee__Group_0__0 ) )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:378:7: ( rule__Employee__Group_0__0 )
                    {
                     before(grammarAccess.getEmployeeAccess().getGroup_0()); 
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:379:7: ( rule__Employee__Group_0__0 )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:379:8: rule__Employee__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Employee__Group_0__0_in_rule__Employee__UnorderedGroup__Impl710);
                    rule__Employee__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEmployeeAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:385:4: ({...}? => ( ( ( rule__Employee__Group_1__0 ) ) ) )
                    {
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:385:4: ({...}? => ( ( ( rule__Employee__Group_1__0 ) ) ) )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:386:5: {...}? => ( ( ( rule__Employee__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Employee__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 1)");
                    }
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:386:103: ( ( ( rule__Employee__Group_1__0 ) ) )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:387:6: ( ( rule__Employee__Group_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:393:6: ( ( rule__Employee__Group_1__0 ) )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:395:7: ( rule__Employee__Group_1__0 )
                    {
                     before(grammarAccess.getEmployeeAccess().getGroup_1()); 
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:396:7: ( rule__Employee__Group_1__0 )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:396:8: rule__Employee__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Employee__Group_1__0_in_rule__Employee__UnorderedGroup__Impl801);
                    rule__Employee__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEmployeeAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:402:4: ({...}? => ( ( ( rule__Employee__Group_2__0 ) ) ) )
                    {
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:402:4: ({...}? => ( ( ( rule__Employee__Group_2__0 ) ) ) )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:403:5: {...}? => ( ( ( rule__Employee__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Employee__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 2)");
                    }
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:403:103: ( ( ( rule__Employee__Group_2__0 ) ) )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:404:6: ( ( rule__Employee__Group_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:410:6: ( ( rule__Employee__Group_2__0 ) )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:412:7: ( rule__Employee__Group_2__0 )
                    {
                     before(grammarAccess.getEmployeeAccess().getGroup_2()); 
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:413:7: ( rule__Employee__Group_2__0 )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:413:8: rule__Employee__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Employee__Group_2__0_in_rule__Employee__UnorderedGroup__Impl892);
                    rule__Employee__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEmployeeAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:419:4: ({...}? => ( ( ( rule__Employee__Group_3__0 ) ) ) )
                    {
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:419:4: ({...}? => ( ( ( rule__Employee__Group_3__0 ) ) ) )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:420:5: {...}? => ( ( ( rule__Employee__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Employee__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 3)");
                    }
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:420:103: ( ( ( rule__Employee__Group_3__0 ) ) )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:421:6: ( ( rule__Employee__Group_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:427:6: ( ( rule__Employee__Group_3__0 ) )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:429:7: ( rule__Employee__Group_3__0 )
                    {
                     before(grammarAccess.getEmployeeAccess().getGroup_3()); 
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:430:7: ( rule__Employee__Group_3__0 )
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:430:8: rule__Employee__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Employee__Group_3__0_in_rule__Employee__UnorderedGroup__Impl983);
                    rule__Employee__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEmployeeAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEmployeeAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__UnorderedGroup__Impl"


    // $ANTLR start "rule__Employee__UnorderedGroup__0"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:445:1: rule__Employee__UnorderedGroup__0 : rule__Employee__UnorderedGroup__Impl ( rule__Employee__UnorderedGroup__1 )? ;
    public final void rule__Employee__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:449:1: ( rule__Employee__UnorderedGroup__Impl ( rule__Employee__UnorderedGroup__1 )? )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:450:2: rule__Employee__UnorderedGroup__Impl ( rule__Employee__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Employee__UnorderedGroup__Impl_in_rule__Employee__UnorderedGroup__01042);
            rule__Employee__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:451:2: ( rule__Employee__UnorderedGroup__1 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( LA2_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 0) ) {
                alt2=1;
            }
            else if ( LA2_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 1) ) {
                alt2=1;
            }
            else if ( LA2_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 2) ) {
                alt2=1;
            }
            else if ( LA2_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 3) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:451:2: rule__Employee__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Employee__UnorderedGroup__1_in_rule__Employee__UnorderedGroup__01045);
                    rule__Employee__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Employee__UnorderedGroup__0"


    // $ANTLR start "rule__Employee__UnorderedGroup__1"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:458:1: rule__Employee__UnorderedGroup__1 : rule__Employee__UnorderedGroup__Impl ( rule__Employee__UnorderedGroup__2 )? ;
    public final void rule__Employee__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:462:1: ( rule__Employee__UnorderedGroup__Impl ( rule__Employee__UnorderedGroup__2 )? )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:463:2: rule__Employee__UnorderedGroup__Impl ( rule__Employee__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_rule__Employee__UnorderedGroup__Impl_in_rule__Employee__UnorderedGroup__11070);
            rule__Employee__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:464:2: ( rule__Employee__UnorderedGroup__2 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( LA3_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 0) ) {
                alt3=1;
            }
            else if ( LA3_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 1) ) {
                alt3=1;
            }
            else if ( LA3_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 2) ) {
                alt3=1;
            }
            else if ( LA3_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 3) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:464:2: rule__Employee__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_rule__Employee__UnorderedGroup__2_in_rule__Employee__UnorderedGroup__11073);
                    rule__Employee__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Employee__UnorderedGroup__1"


    // $ANTLR start "rule__Employee__UnorderedGroup__2"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:471:1: rule__Employee__UnorderedGroup__2 : rule__Employee__UnorderedGroup__Impl ( rule__Employee__UnorderedGroup__3 )? ;
    public final void rule__Employee__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:475:1: ( rule__Employee__UnorderedGroup__Impl ( rule__Employee__UnorderedGroup__3 )? )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:476:2: rule__Employee__UnorderedGroup__Impl ( rule__Employee__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_rule__Employee__UnorderedGroup__Impl_in_rule__Employee__UnorderedGroup__21098);
            rule__Employee__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:477:2: ( rule__Employee__UnorderedGroup__3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( LA4_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 0) ) {
                alt4=1;
            }
            else if ( LA4_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 1) ) {
                alt4=1;
            }
            else if ( LA4_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 2) ) {
                alt4=1;
            }
            else if ( LA4_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getEmployeeAccess().getUnorderedGroup(), 3) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:477:2: rule__Employee__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_rule__Employee__UnorderedGroup__3_in_rule__Employee__UnorderedGroup__21101);
                    rule__Employee__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Employee__UnorderedGroup__2"


    // $ANTLR start "rule__Employee__UnorderedGroup__3"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:484:1: rule__Employee__UnorderedGroup__3 : rule__Employee__UnorderedGroup__Impl ;
    public final void rule__Employee__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:488:1: ( rule__Employee__UnorderedGroup__Impl )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:489:2: rule__Employee__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Employee__UnorderedGroup__Impl_in_rule__Employee__UnorderedGroup__31126);
            rule__Employee__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__Employee__UnorderedGroup__3"


    // $ANTLR start "rule__Employee__FirstNameAssignment_0_1"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:504:1: rule__Employee__FirstNameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Employee__FirstNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:508:1: ( ( RULE_ID ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:509:1: ( RULE_ID )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:509:1: ( RULE_ID )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:510:1: RULE_ID
            {
             before(grammarAccess.getEmployeeAccess().getFirstNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Employee__FirstNameAssignment_0_11162); 
             after(grammarAccess.getEmployeeAccess().getFirstNameIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Employee__FirstNameAssignment_0_1"


    // $ANTLR start "rule__Employee__AgeAssignment_1_1"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:519:1: rule__Employee__AgeAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Employee__AgeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:523:1: ( ( RULE_INT ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:524:1: ( RULE_INT )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:524:1: ( RULE_INT )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:525:1: RULE_INT
            {
             before(grammarAccess.getEmployeeAccess().getAgeINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Employee__AgeAssignment_1_11193); 
             after(grammarAccess.getEmployeeAccess().getAgeINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Employee__AgeAssignment_1_1"


    // $ANTLR start "rule__Employee__LastNameAssignment_2_1"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:534:1: rule__Employee__LastNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Employee__LastNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:538:1: ( ( RULE_ID ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:539:1: ( RULE_ID )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:539:1: ( RULE_ID )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:540:1: RULE_ID
            {
             before(grammarAccess.getEmployeeAccess().getLastNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Employee__LastNameAssignment_2_11224); 
             after(grammarAccess.getEmployeeAccess().getLastNameIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Employee__LastNameAssignment_2_1"


    // $ANTLR start "rule__Employee__YearOfBirthAssignment_3_1"
    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:549:1: rule__Employee__YearOfBirthAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Employee__YearOfBirthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:553:1: ( ( RULE_INT ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:554:1: ( RULE_INT )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:554:1: ( RULE_INT )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:555:1: RULE_INT
            {
             before(grammarAccess.getEmployeeAccess().getYearOfBirthINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Employee__YearOfBirthAssignment_3_11255); 
             after(grammarAccess.getEmployeeAccess().getYearOfBirthINTTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Employee__YearOfBirthAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleEmployee_in_entryRuleEmployee61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmployee68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__UnorderedGroup_in_ruleEmployee94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__Group_0__0__Impl_in_rule__Employee__Group_0__0128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Employee__Group_0__1_in_rule__Employee__Group_0__0131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Employee__Group_0__0__Impl159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__Group_0__1__Impl_in_rule__Employee__Group_0__1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__FirstNameAssignment_0_1_in_rule__Employee__Group_0__1__Impl217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__Group_1__0__Impl_in_rule__Employee__Group_1__0251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Employee__Group_1__1_in_rule__Employee__Group_1__0254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Employee__Group_1__0__Impl282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__Group_1__1__Impl_in_rule__Employee__Group_1__1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__AgeAssignment_1_1_in_rule__Employee__Group_1__1__Impl340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__Group_2__0__Impl_in_rule__Employee__Group_2__0374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Employee__Group_2__1_in_rule__Employee__Group_2__0377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Employee__Group_2__0__Impl405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__Group_2__1__Impl_in_rule__Employee__Group_2__1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__LastNameAssignment_2_1_in_rule__Employee__Group_2__1__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__Group_3__0__Impl_in_rule__Employee__Group_3__0497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Employee__Group_3__1_in_rule__Employee__Group_3__0500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Employee__Group_3__0__Impl528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__Group_3__1__Impl_in_rule__Employee__Group_3__1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__YearOfBirthAssignment_3_1_in_rule__Employee__Group_3__1__Impl586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__UnorderedGroup__0_in_rule__Employee__UnorderedGroup621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__Group_0__0_in_rule__Employee__UnorderedGroup__Impl710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__Group_1__0_in_rule__Employee__UnorderedGroup__Impl801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__Group_2__0_in_rule__Employee__UnorderedGroup__Impl892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__Group_3__0_in_rule__Employee__UnorderedGroup__Impl983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__UnorderedGroup__Impl_in_rule__Employee__UnorderedGroup__01042 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_rule__Employee__UnorderedGroup__1_in_rule__Employee__UnorderedGroup__01045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__UnorderedGroup__Impl_in_rule__Employee__UnorderedGroup__11070 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_rule__Employee__UnorderedGroup__2_in_rule__Employee__UnorderedGroup__11073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__UnorderedGroup__Impl_in_rule__Employee__UnorderedGroup__21098 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_rule__Employee__UnorderedGroup__3_in_rule__Employee__UnorderedGroup__21101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Employee__UnorderedGroup__Impl_in_rule__Employee__UnorderedGroup__31126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Employee__FirstNameAssignment_0_11162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Employee__AgeAssignment_1_11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Employee__LastNameAssignment_2_11224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Employee__YearOfBirthAssignment_3_11255 = new BitSet(new long[]{0x0000000000000002L});

}
