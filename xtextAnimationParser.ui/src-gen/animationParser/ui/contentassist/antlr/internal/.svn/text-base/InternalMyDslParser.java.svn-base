package animationParser.ui.contentassist.antlr.internal; 

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
import animationParser.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'appear'", "'('", "')'", "'trigger'", "'move'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSequence"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleSequence EOF )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence61);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence68); 

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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleSequence : ( ( rule__Sequence__Group__0 )* ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Sequence__Group__0 )* ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Sequence__Group__0 )* )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Sequence__Group__0 )* )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Sequence__Group__0 )*
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Sequence__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Sequence__Group__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0_in_ruleSequence94);
            	    rule__Sequence__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleAnimation"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleAnimation EOF )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleAnimation EOF
            {
             before(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_entryRuleAnimation122);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation129); 

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
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleAnimation : ( ( rule__Animation__Alternatives ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Animation__Alternatives ) ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Animation__Alternatives ) )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Animation__Alternatives ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Animation__Alternatives )
            {
             before(grammarAccess.getAnimationAccess().getAlternatives()); 
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Animation__Alternatives )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Animation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Alternatives_in_ruleAnimation155);
            rule__Animation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleAppear"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleAppear : ruleAppear EOF ;
    public final void entryRuleAppear() throws RecognitionException {
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleAppear EOF )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleAppear EOF
            {
             before(grammarAccess.getAppearRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAppear_in_entryRuleAppear182);
            ruleAppear();

            state._fsp--;

             after(grammarAccess.getAppearRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAppear189); 

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
    // $ANTLR end "entryRuleAppear"


    // $ANTLR start "ruleAppear"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleAppear : ( ( rule__Appear__Group__0 ) ) ;
    public final void ruleAppear() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Appear__Group__0 ) ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Appear__Group__0 ) )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Appear__Group__0 ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Appear__Group__0 )
            {
             before(grammarAccess.getAppearAccess().getGroup()); 
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Appear__Group__0 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Appear__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__0_in_ruleAppear215);
            rule__Appear__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppearAccess().getGroup()); 

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
    // $ANTLR end "ruleAppear"


    // $ANTLR start "entryRuleTrigger"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleTrigger : ruleTrigger EOF ;
    public final void entryRuleTrigger() throws RecognitionException {
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleTrigger EOF )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleTrigger EOF
            {
             before(grammarAccess.getTriggerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTrigger_in_entryRuleTrigger242);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getTriggerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTrigger249); 

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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleTrigger : ( ( rule__Trigger__Group__0 ) ) ;
    public final void ruleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Trigger__Group__0 ) ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Trigger__Group__0 ) )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Trigger__Group__0 ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Trigger__Group__0 )
            {
             before(grammarAccess.getTriggerAccess().getGroup()); 
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Trigger__Group__0 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Trigger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Trigger__Group__0_in_ruleTrigger275);
            rule__Trigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getGroup()); 

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleMove"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleMove EOF )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove302);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove309); 

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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__Move__Group__0 ) ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Move__Group__0 ) )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Move__Group__0 ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Move__Group__0 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__Move__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0_in_ruleMove335);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

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
    // $ANTLR end "ruleMove"


    // $ANTLR start "rule__Animation__Alternatives"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: rule__Animation__Alternatives : ( ( ruleMove ) | ( ruleTrigger ) | ( ruleAppear ) );
    public final void rule__Animation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:204:1: ( ( ruleMove ) | ( ruleTrigger ) | ( ruleAppear ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:205:1: ( ruleMove )
                    {
                    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:205:1: ( ruleMove )
                    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:206:1: ruleMove
                    {
                     before(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_rule__Animation__Alternatives371);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:211:6: ( ruleTrigger )
                    {
                    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:211:6: ( ruleTrigger )
                    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:212:1: ruleTrigger
                    {
                     before(grammarAccess.getAnimationAccess().getTriggerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTrigger_in_rule__Animation__Alternatives388);
                    ruleTrigger();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getTriggerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:217:6: ( ruleAppear )
                    {
                    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:217:6: ( ruleAppear )
                    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ruleAppear
                    {
                     before(grammarAccess.getAnimationAccess().getAppearParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAppear_in_rule__Animation__Alternatives405);
                    ruleAppear();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getAppearParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Animation__Alternatives"


    // $ANTLR start "rule__Sequence__Group__0"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:234:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:235:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__0435);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__0438);
            rule__Sequence__Group__1();

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
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: rule__Sequence__Group__0__Impl : ( ( rule__Sequence__ContainsAssignment_0 ) ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( ( ( rule__Sequence__ContainsAssignment_0 ) ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: ( ( rule__Sequence__ContainsAssignment_0 ) )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: ( ( rule__Sequence__ContainsAssignment_0 ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:248:1: ( rule__Sequence__ContainsAssignment_0 )
            {
             before(grammarAccess.getSequenceAccess().getContainsAssignment_0()); 
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:249:1: ( rule__Sequence__ContainsAssignment_0 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:249:2: rule__Sequence__ContainsAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__ContainsAssignment_0_in_rule__Sequence__Group__0__Impl465);
            rule__Sequence__ContainsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getContainsAssignment_0()); 

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
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:259:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:263:1: ( rule__Sequence__Group__1__Impl )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:264:2: rule__Sequence__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__1495);
            rule__Sequence__Group__1__Impl();

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
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: rule__Sequence__Group__1__Impl : ( ';' ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( ( ';' ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:275:1: ( ';' )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:275:1: ( ';' )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:276:1: ';'
            {
             before(grammarAccess.getSequenceAccess().getSemicolonKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Sequence__Group__1__Impl523); 
             after(grammarAccess.getSequenceAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Appear__Group__0"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: rule__Appear__Group__0 : rule__Appear__Group__0__Impl rule__Appear__Group__1 ;
    public final void rule__Appear__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:297:1: ( rule__Appear__Group__0__Impl rule__Appear__Group__1 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:298:2: rule__Appear__Group__0__Impl rule__Appear__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__0__Impl_in_rule__Appear__Group__0558);
            rule__Appear__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__1_in_rule__Appear__Group__0561);
            rule__Appear__Group__1();

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
    // $ANTLR end "rule__Appear__Group__0"


    // $ANTLR start "rule__Appear__Group__0__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: rule__Appear__Group__0__Impl : ( 'appear' ) ;
    public final void rule__Appear__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:309:1: ( ( 'appear' ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:310:1: ( 'appear' )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:310:1: ( 'appear' )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:311:1: 'appear'
            {
             before(grammarAccess.getAppearAccess().getAppearKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Appear__Group__0__Impl589); 
             after(grammarAccess.getAppearAccess().getAppearKeyword_0()); 

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
    // $ANTLR end "rule__Appear__Group__0__Impl"


    // $ANTLR start "rule__Appear__Group__1"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: rule__Appear__Group__1 : rule__Appear__Group__1__Impl rule__Appear__Group__2 ;
    public final void rule__Appear__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__Appear__Group__1__Impl rule__Appear__Group__2 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:329:2: rule__Appear__Group__1__Impl rule__Appear__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__1__Impl_in_rule__Appear__Group__1620);
            rule__Appear__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__2_in_rule__Appear__Group__1623);
            rule__Appear__Group__2();

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
    // $ANTLR end "rule__Appear__Group__1"


    // $ANTLR start "rule__Appear__Group__1__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:336:1: rule__Appear__Group__1__Impl : ( '(' ) ;
    public final void rule__Appear__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: ( ( '(' ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( '(' )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( '(' )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: '('
            {
             before(grammarAccess.getAppearAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Appear__Group__1__Impl651); 
             after(grammarAccess.getAppearAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Appear__Group__1__Impl"


    // $ANTLR start "rule__Appear__Group__2"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: rule__Appear__Group__2 : rule__Appear__Group__2__Impl rule__Appear__Group__3 ;
    public final void rule__Appear__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: ( rule__Appear__Group__2__Impl rule__Appear__Group__3 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:360:2: rule__Appear__Group__2__Impl rule__Appear__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__2__Impl_in_rule__Appear__Group__2682);
            rule__Appear__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__3_in_rule__Appear__Group__2685);
            rule__Appear__Group__3();

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
    // $ANTLR end "rule__Appear__Group__2"


    // $ANTLR start "rule__Appear__Group__2__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:367:1: rule__Appear__Group__2__Impl : ( ( rule__Appear__TimeAssignment_2 ) ) ;
    public final void rule__Appear__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ( ( ( rule__Appear__TimeAssignment_2 ) ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ( ( rule__Appear__TimeAssignment_2 ) )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ( ( rule__Appear__TimeAssignment_2 ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:373:1: ( rule__Appear__TimeAssignment_2 )
            {
             before(grammarAccess.getAppearAccess().getTimeAssignment_2()); 
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:374:1: ( rule__Appear__TimeAssignment_2 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:374:2: rule__Appear__TimeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__TimeAssignment_2_in_rule__Appear__Group__2__Impl712);
            rule__Appear__TimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAppearAccess().getTimeAssignment_2()); 

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
    // $ANTLR end "rule__Appear__Group__2__Impl"


    // $ANTLR start "rule__Appear__Group__3"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: rule__Appear__Group__3 : rule__Appear__Group__3__Impl ;
    public final void rule__Appear__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:388:1: ( rule__Appear__Group__3__Impl )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:389:2: rule__Appear__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__3__Impl_in_rule__Appear__Group__3742);
            rule__Appear__Group__3__Impl();

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
    // $ANTLR end "rule__Appear__Group__3"


    // $ANTLR start "rule__Appear__Group__3__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:395:1: rule__Appear__Group__3__Impl : ( ')' ) ;
    public final void rule__Appear__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: ( ( ')' ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ( ')' )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ( ')' )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: ')'
            {
             before(grammarAccess.getAppearAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Appear__Group__3__Impl770); 
             after(grammarAccess.getAppearAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Appear__Group__3__Impl"


    // $ANTLR start "rule__Trigger__Group__0"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:422:1: rule__Trigger__Group__0 : rule__Trigger__Group__0__Impl rule__Trigger__Group__1 ;
    public final void rule__Trigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ( rule__Trigger__Group__0__Impl rule__Trigger__Group__1 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:427:2: rule__Trigger__Group__0__Impl rule__Trigger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Trigger__Group__0__Impl_in_rule__Trigger__Group__0809);
            rule__Trigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Trigger__Group__1_in_rule__Trigger__Group__0812);
            rule__Trigger__Group__1();

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
    // $ANTLR end "rule__Trigger__Group__0"


    // $ANTLR start "rule__Trigger__Group__0__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: rule__Trigger__Group__0__Impl : ( () ) ;
    public final void rule__Trigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( () ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( () )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( () )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ()
            {
             before(grammarAccess.getTriggerAccess().getTriggerAction_0()); 
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ()
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:443:1: 
            {
            }

             after(grammarAccess.getTriggerAccess().getTriggerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__0__Impl"


    // $ANTLR start "rule__Trigger__Group__1"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: rule__Trigger__Group__1 : rule__Trigger__Group__1__Impl rule__Trigger__Group__2 ;
    public final void rule__Trigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ( rule__Trigger__Group__1__Impl rule__Trigger__Group__2 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:458:2: rule__Trigger__Group__1__Impl rule__Trigger__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Trigger__Group__1__Impl_in_rule__Trigger__Group__1870);
            rule__Trigger__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Trigger__Group__2_in_rule__Trigger__Group__1873);
            rule__Trigger__Group__2();

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
    // $ANTLR end "rule__Trigger__Group__1"


    // $ANTLR start "rule__Trigger__Group__1__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: rule__Trigger__Group__1__Impl : ( 'trigger' ) ;
    public final void rule__Trigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( ( 'trigger' ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( 'trigger' )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( 'trigger' )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:471:1: 'trigger'
            {
             before(grammarAccess.getTriggerAccess().getTriggerKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Trigger__Group__1__Impl901); 
             after(grammarAccess.getTriggerAccess().getTriggerKeyword_1()); 

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
    // $ANTLR end "rule__Trigger__Group__1__Impl"


    // $ANTLR start "rule__Trigger__Group__2"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: rule__Trigger__Group__2 : rule__Trigger__Group__2__Impl rule__Trigger__Group__3 ;
    public final void rule__Trigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:488:1: ( rule__Trigger__Group__2__Impl rule__Trigger__Group__3 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:489:2: rule__Trigger__Group__2__Impl rule__Trigger__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Trigger__Group__2__Impl_in_rule__Trigger__Group__2932);
            rule__Trigger__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Trigger__Group__3_in_rule__Trigger__Group__2935);
            rule__Trigger__Group__3();

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
    // $ANTLR end "rule__Trigger__Group__2"


    // $ANTLR start "rule__Trigger__Group__2__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: rule__Trigger__Group__2__Impl : ( '(' ) ;
    public final void rule__Trigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:500:1: ( ( '(' ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:501:1: ( '(' )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:501:1: ( '(' )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:502:1: '('
            {
             before(grammarAccess.getTriggerAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Trigger__Group__2__Impl963); 
             after(grammarAccess.getTriggerAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Trigger__Group__2__Impl"


    // $ANTLR start "rule__Trigger__Group__3"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: rule__Trigger__Group__3 : rule__Trigger__Group__3__Impl ;
    public final void rule__Trigger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:519:1: ( rule__Trigger__Group__3__Impl )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:520:2: rule__Trigger__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Trigger__Group__3__Impl_in_rule__Trigger__Group__3994);
            rule__Trigger__Group__3__Impl();

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
    // $ANTLR end "rule__Trigger__Group__3"


    // $ANTLR start "rule__Trigger__Group__3__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: rule__Trigger__Group__3__Impl : ( ')' ) ;
    public final void rule__Trigger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:530:1: ( ( ')' ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:531:1: ( ')' )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:531:1: ( ')' )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:532:1: ')'
            {
             before(grammarAccess.getTriggerAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Trigger__Group__3__Impl1022); 
             after(grammarAccess.getTriggerAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Trigger__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:557:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:558:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01061);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01064);
            rule__Move__Group__1();

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
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: rule__Move__Group__0__Impl : ( 'move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( ( 'move' ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( 'move' )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( 'move' )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Move__Group__0__Impl1092); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_0()); 

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
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:588:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:589:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11123);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11126);
            rule__Move__Group__2();

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
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: rule__Move__Group__1__Impl : ( '(' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:600:1: ( ( '(' ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ( '(' )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ( '(' )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: '('
            {
             before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Move__Group__1__Impl1154); 
             after(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:615:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:620:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21185);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21188);
            rule__Move__Group__3();

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
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: rule__Move__Group__2__Impl : ( ( rule__Move__SpeedAssignment_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ( ( ( rule__Move__SpeedAssignment_2 ) ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( ( rule__Move__SpeedAssignment_2 ) )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( ( rule__Move__SpeedAssignment_2 ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( rule__Move__SpeedAssignment_2 )
            {
             before(grammarAccess.getMoveAccess().getSpeedAssignment_2()); 
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( rule__Move__SpeedAssignment_2 )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:634:2: rule__Move__SpeedAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__SpeedAssignment_2_in_rule__Move__Group__2__Impl1215);
            rule__Move__SpeedAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getSpeedAssignment_2()); 

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
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: rule__Move__Group__3 : rule__Move__Group__3__Impl ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( rule__Move__Group__3__Impl )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:649:2: rule__Move__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31245);
            rule__Move__Group__3__Impl();

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
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:655:1: rule__Move__Group__3__Impl : ( ')' ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: ( ( ')' ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:660:1: ( ')' )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:660:1: ( ')' )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:661:1: ')'
            {
             before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Move__Group__3__Impl1273); 
             after(grammarAccess.getMoveAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Sequence__ContainsAssignment_0"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:683:1: rule__Sequence__ContainsAssignment_0 : ( ruleAnimation ) ;
    public final void rule__Sequence__ContainsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( ( ruleAnimation ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( ruleAnimation )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( ruleAnimation )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: ruleAnimation
            {
             before(grammarAccess.getSequenceAccess().getContainsAnimationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Sequence__ContainsAssignment_01317);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getContainsAnimationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Sequence__ContainsAssignment_0"


    // $ANTLR start "rule__Appear__TimeAssignment_2"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: rule__Appear__TimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__Appear__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ( ( RULE_INT ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: ( RULE_INT )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: ( RULE_INT )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: RULE_INT
            {
             before(grammarAccess.getAppearAccess().getTimeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Appear__TimeAssignment_21348); 
             after(grammarAccess.getAppearAccess().getTimeINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Appear__TimeAssignment_2"


    // $ANTLR start "rule__Move__SpeedAssignment_2"
    // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: rule__Move__SpeedAssignment_2 : ( RULE_INT ) ;
    public final void rule__Move__SpeedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:717:1: ( ( RULE_INT ) )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( RULE_INT )
            {
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( RULE_INT )
            // ../xtextAnimationParser.ui/src-gen/animationParser/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: RULE_INT
            {
             before(grammarAccess.getMoveAccess().getSpeedINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Move__SpeedAssignment_21379); 
             after(grammarAccess.getMoveAccess().getSpeedINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Move__SpeedAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence94 = new BitSet(new long[]{0x0000000000019002L});
        public static final BitSet FOLLOW_ruleAnimation_in_entryRuleAnimation122 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Alternatives_in_ruleAnimation155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAppear_in_entryRuleAppear182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAppear189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__0_in_ruleAppear215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTrigger249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Trigger__Group__0_in_ruleTrigger275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0_in_ruleMove335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_rule__Animation__Alternatives371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrigger_in_rule__Animation__Alternatives388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAppear_in_rule__Animation__Alternatives405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__0435 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__0438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__ContainsAssignment_0_in_rule__Sequence__Group__0__Impl465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__1495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Sequence__Group__1__Impl523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__0__Impl_in_rule__Appear__Group__0558 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Appear__Group__1_in_rule__Appear__Group__0561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Appear__Group__0__Impl589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__1__Impl_in_rule__Appear__Group__1620 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Appear__Group__2_in_rule__Appear__Group__1623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Appear__Group__1__Impl651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__2__Impl_in_rule__Appear__Group__2682 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Appear__Group__3_in_rule__Appear__Group__2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__TimeAssignment_2_in_rule__Appear__Group__2__Impl712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__3__Impl_in_rule__Appear__Group__3742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Appear__Group__3__Impl770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Trigger__Group__0__Impl_in_rule__Trigger__Group__0809 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Trigger__Group__1_in_rule__Trigger__Group__0812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Trigger__Group__1__Impl_in_rule__Trigger__Group__1870 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Trigger__Group__2_in_rule__Trigger__Group__1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Trigger__Group__1__Impl901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Trigger__Group__2__Impl_in_rule__Trigger__Group__2932 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Trigger__Group__3_in_rule__Trigger__Group__2935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Trigger__Group__2__Impl963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Trigger__Group__3__Impl_in_rule__Trigger__Group__3994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Trigger__Group__3__Impl1022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01061 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Move__Group__0__Impl1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11123 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Move__Group__1__Impl1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21185 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__SpeedAssignment_2_in_rule__Move__Group__2__Impl1215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Move__Group__3__Impl1273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Sequence__ContainsAssignment_01317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Appear__TimeAssignment_21348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Move__SpeedAssignment_21379 = new BitSet(new long[]{0x0000000000000002L});
    }


}