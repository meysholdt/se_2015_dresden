package org.xtext.example.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnorderedgroupsLexer extends Lexer {
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

    public InternalUnorderedgroupsLexer() {;} 
    public InternalUnorderedgroupsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalUnorderedgroupsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:11:7: ( 'firstName' )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:11:9: 'firstName'
            {
            match("firstName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:12:7: ( 'age' )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:12:9: 'age'
            {
            match("age"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:13:7: ( 'lastName' )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:13:9: 'lastName'
            {
            match("lastName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:14:7: ( 'yearOfBirth' )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:14:9: 'yearOfBirth'
            {
            match("yearOfBirth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:565:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:565:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:565:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:565:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:565:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:567:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:567:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:567:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:567:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:569:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:569:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:569:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:569:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:569:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:569:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:569:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:569:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:569:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:569:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:569:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:571:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:571:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:571:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:571:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:573:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:573:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:573:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:573:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:573:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:573:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:573:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:573:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:575:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:575:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:575:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:577:16: ( . )
            // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:577:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:1:8: ( T__11 | T__12 | T__13 | T__14 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=11;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:1:34: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:1:42: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:1:51: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:1:63: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:1:79: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:1:95: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.unorderedgroups.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalUnorderedgroups.g:1:103: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\4\16\1\14\2\uffff\3\14\2\uffff\1\16\1\uffff\3\16\5\uffff"+
        "\1\16\1\34\3\16\1\uffff\14\16\1\54\1\16\1\56\1\uffff\1\16\1\uffff"+
        "\1\16\1\61\1\uffff";
    static final String DFA12_eofS =
        "\62\uffff";
    static final String DFA12_minS =
        "\1\0\1\151\1\147\1\141\1\145\1\101\2\uffff\2\0\1\52\2\uffff\1\162"+
        "\1\uffff\1\145\1\163\1\141\5\uffff\1\163\1\60\1\164\1\162\1\164"+
        "\1\uffff\1\116\1\117\1\116\1\141\1\146\1\141\1\155\1\102\1\155\1"+
        "\145\1\151\1\145\1\60\1\162\1\60\1\uffff\1\164\1\uffff\1\150\1\60"+
        "\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\151\1\147\1\141\1\145\1\172\2\uffff\2\uffff\1\57\2\uffff"+
        "\1\162\1\uffff\1\145\1\163\1\141\5\uffff\1\163\1\172\1\164\1\162"+
        "\1\164\1\uffff\1\116\1\117\1\116\1\141\1\146\1\141\1\155\1\102\1"+
        "\155\1\145\1\151\1\145\1\172\1\162\1\172\1\uffff\1\164\1\uffff\1"+
        "\150\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\6\uffff\1\5\1\6\3\uffff\1\12\1\13\1\uffff\1\5\3\uffff\1\6\1\7"+
        "\1\10\1\11\1\12\5\uffff\1\2\17\uffff\1\3\1\uffff\1\1\2\uffff\1\4";
    static final String DFA12_specialS =
        "\1\1\7\uffff\1\0\1\2\50\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\14\2\13\2\14\1\13\22\14\1\13\1\14\1\10\4\14\1\11\7\14\1"+
            "\12\12\7\7\14\32\6\3\14\1\5\1\6\1\14\1\2\4\6\1\1\5\6\1\3\14"+
            "\6\1\4\1\6\uff85\14",
            "\1\15",
            "\1\17",
            "\1\20",
            "\1\21",
            "\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "",
            "\0\23",
            "\0\23",
            "\1\24\4\uffff\1\25",
            "",
            "",
            "\1\27",
            "",
            "\1\30",
            "\1\31",
            "\1\32",
            "",
            "",
            "",
            "",
            "",
            "\1\33",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\55",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\57",
            "",
            "\1\60",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_8 = input.LA(1);

                        s = -1;
                        if ( ((LA12_8>='\u0000' && LA12_8<='\uFFFF')) ) {s = 19;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='f') ) {s = 1;}

                        else if ( (LA12_0=='a') ) {s = 2;}

                        else if ( (LA12_0=='l') ) {s = 3;}

                        else if ( (LA12_0=='y') ) {s = 4;}

                        else if ( (LA12_0=='^') ) {s = 5;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='x')||LA12_0=='z') ) {s = 6;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 7;}

                        else if ( (LA12_0=='\"') ) {s = 8;}

                        else if ( (LA12_0=='\'') ) {s = 9;}

                        else if ( (LA12_0=='/') ) {s = 10;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 11;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_9 = input.LA(1);

                        s = -1;
                        if ( ((LA12_9>='\u0000' && LA12_9<='\uFFFF')) ) {s = 19;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}