package animationParser.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import animationParser.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Sequence";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSequence"
    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleSequence= ruleSequence EOF )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence75);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence85); 

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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:76:1: ruleSequence returns [EObject current=null] : ( ( (lv_contains_0_0= ruleAnimation ) ) otherlv_1= ';' )* ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_contains_0_0 = null;


         enterRule(); 
            
        try {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( ( (lv_contains_0_0= ruleAnimation ) ) otherlv_1= ';' )* )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:80:1: ( ( (lv_contains_0_0= ruleAnimation ) ) otherlv_1= ';' )*
            {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:80:1: ( ( (lv_contains_0_0= ruleAnimation ) ) otherlv_1= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:80:2: ( (lv_contains_0_0= ruleAnimation ) ) otherlv_1= ';'
            	    {
            	    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:80:2: ( (lv_contains_0_0= ruleAnimation ) )
            	    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_contains_0_0= ruleAnimation )
            	    {
            	    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_contains_0_0= ruleAnimation )
            	    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:82:3: lv_contains_0_0= ruleAnimation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequenceAccess().getContainsAnimationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_ruleSequence131);
            	    lv_contains_0_0=ruleAnimation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contains",
            	            		lv_contains_0_0, 
            	            		"Animation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSequence143); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getSemicolonKeyword_1());
            	        

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
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleAnimation"
    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:110:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:111:2: (iv_ruleAnimation= ruleAnimation EOF )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:112:2: iv_ruleAnimation= ruleAnimation EOF
            {
             newCompositeNode(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_entryRuleAnimation180);
            iv_ruleAnimation=ruleAnimation();

            state._fsp--;

             current =iv_ruleAnimation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation190); 

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
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:119:1: ruleAnimation returns [EObject current=null] : (this_Move_0= ruleMove | this_Trigger_1= ruleTrigger | this_Appear_2= ruleAppear ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;

        EObject this_Trigger_1 = null;

        EObject this_Appear_2 = null;


         enterRule(); 
            
        try {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:122:28: ( (this_Move_0= ruleMove | this_Trigger_1= ruleTrigger | this_Appear_2= ruleAppear ) )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:123:1: (this_Move_0= ruleMove | this_Trigger_1= ruleTrigger | this_Appear_2= ruleAppear )
            {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:123:1: (this_Move_0= ruleMove | this_Trigger_1= ruleTrigger | this_Appear_2= ruleAppear )
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
                    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:124:5: this_Move_0= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_ruleAnimation237);
                    this_Move_0=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:134:5: this_Trigger_1= ruleTrigger
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getTriggerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTrigger_in_ruleAnimation264);
                    this_Trigger_1=ruleTrigger();

                    state._fsp--;

                     
                            current = this_Trigger_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:144:5: this_Appear_2= ruleAppear
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getAppearParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAppear_in_ruleAnimation291);
                    this_Appear_2=ruleAppear();

                    state._fsp--;

                     
                            current = this_Appear_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleAppear"
    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:160:1: entryRuleAppear returns [EObject current=null] : iv_ruleAppear= ruleAppear EOF ;
    public final EObject entryRuleAppear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppear = null;


        try {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:161:2: (iv_ruleAppear= ruleAppear EOF )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:162:2: iv_ruleAppear= ruleAppear EOF
            {
             newCompositeNode(grammarAccess.getAppearRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAppear_in_entryRuleAppear326);
            iv_ruleAppear=ruleAppear();

            state._fsp--;

             current =iv_ruleAppear; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAppear336); 

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
    // $ANTLR end "entryRuleAppear"


    // $ANTLR start "ruleAppear"
    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:169:1: ruleAppear returns [EObject current=null] : (otherlv_0= 'appear' otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleAppear() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_time_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:172:28: ( (otherlv_0= 'appear' otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:173:1: (otherlv_0= 'appear' otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:173:1: (otherlv_0= 'appear' otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:173:3: otherlv_0= 'appear' otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAppear373); 

                	newLeafNode(otherlv_0, grammarAccess.getAppearAccess().getAppearKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAppear385); 

                	newLeafNode(otherlv_1, grammarAccess.getAppearAccess().getLeftParenthesisKeyword_1());
                
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:181:1: ( (lv_time_2_0= RULE_INT ) )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:182:1: (lv_time_2_0= RULE_INT )
            {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:182:1: (lv_time_2_0= RULE_INT )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:183:3: lv_time_2_0= RULE_INT
            {
            lv_time_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAppear402); 

            			newLeafNode(lv_time_2_0, grammarAccess.getAppearAccess().getTimeINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAppearRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"time",
                    		lv_time_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAppear419); 

                	newLeafNode(otherlv_3, grammarAccess.getAppearAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleAppear"


    // $ANTLR start "entryRuleTrigger"
    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:211:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:212:2: (iv_ruleTrigger= ruleTrigger EOF )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:213:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTrigger_in_entryRuleTrigger455);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTrigger465); 

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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:220:1: ruleTrigger returns [EObject current=null] : ( () otherlv_1= 'trigger' otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:223:28: ( ( () otherlv_1= 'trigger' otherlv_2= '(' otherlv_3= ')' ) )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:224:1: ( () otherlv_1= 'trigger' otherlv_2= '(' otherlv_3= ')' )
            {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:224:1: ( () otherlv_1= 'trigger' otherlv_2= '(' otherlv_3= ')' )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:224:2: () otherlv_1= 'trigger' otherlv_2= '(' otherlv_3= ')'
            {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:224:2: ()
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:225:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTriggerAccess().getTriggerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTrigger511); 

                	newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getTriggerKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTrigger523); 

                	newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getLeftParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTrigger535); 

                	newLeafNode(otherlv_3, grammarAccess.getTriggerAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleMove"
    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:250:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:251:2: (iv_ruleMove= ruleMove EOF )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:252:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove571);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove581); 

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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:259:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' otherlv_1= '(' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_speed_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:262:28: ( (otherlv_0= 'move' otherlv_1= '(' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:263:1: (otherlv_0= 'move' otherlv_1= '(' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:263:1: (otherlv_0= 'move' otherlv_1= '(' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:263:3: otherlv_0= 'move' otherlv_1= '(' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMove618); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMove630); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1());
                
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:271:1: ( (lv_speed_2_0= RULE_INT ) )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:272:1: (lv_speed_2_0= RULE_INT )
            {
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:272:1: (lv_speed_2_0= RULE_INT )
            // ../xtextAnimationParser/src-gen/animationParser/parser/antlr/internal/InternalMyDsl.g:273:3: lv_speed_2_0= RULE_INT
            {
            lv_speed_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMove647); 

            			newLeafNode(lv_speed_2_0, grammarAccess.getMoveAccess().getSpeedINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"speed",
                    		lv_speed_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMove664); 

                	newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleMove"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_ruleSequence131 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleSequence143 = new BitSet(new long[]{0x0000000000019002L});
        public static final BitSet FOLLOW_ruleAnimation_in_entryRuleAnimation180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_ruleAnimation237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrigger_in_ruleAnimation264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAppear_in_ruleAnimation291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAppear_in_entryRuleAppear326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAppear336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleAppear373 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAppear385 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAppear402 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAppear419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger455 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTrigger465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleTrigger511 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTrigger523 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTrigger535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleMove618 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMove630 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMove647 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMove664 = new BitSet(new long[]{0x0000000000000002L});
    }


}