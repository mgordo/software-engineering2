/*
* generated by Xtext
*/
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package animationParser.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleSequence
entryRuleSequence 
:
{ before(grammarAccess.getSequenceRule()); }
	 ruleSequence
{ after(grammarAccess.getSequenceRule()); } 
	 EOF 
;

// Rule Sequence
ruleSequence
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSequenceAccess().getGroup()); }
(rule__Sequence__Group__0)*
{ after(grammarAccess.getSequenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAnimation
entryRuleAnimation 
:
{ before(grammarAccess.getAnimationRule()); }
	 ruleAnimation
{ after(grammarAccess.getAnimationRule()); } 
	 EOF 
;

// Rule Animation
ruleAnimation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAnimationAccess().getAlternatives()); }
(rule__Animation__Alternatives)
{ after(grammarAccess.getAnimationAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAppear
entryRuleAppear 
:
{ before(grammarAccess.getAppearRule()); }
	 ruleAppear
{ after(grammarAccess.getAppearRule()); } 
	 EOF 
;

// Rule Appear
ruleAppear
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAppearAccess().getGroup()); }
(rule__Appear__Group__0)
{ after(grammarAccess.getAppearAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTrigger
entryRuleTrigger 
:
{ before(grammarAccess.getTriggerRule()); }
	 ruleTrigger
{ after(grammarAccess.getTriggerRule()); } 
	 EOF 
;

// Rule Trigger
ruleTrigger
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTriggerAccess().getGroup()); }
(rule__Trigger__Group__0)
{ after(grammarAccess.getTriggerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMove
entryRuleMove 
:
{ before(grammarAccess.getMoveRule()); }
	 ruleMove
{ after(grammarAccess.getMoveRule()); } 
	 EOF 
;

// Rule Move
ruleMove
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMoveAccess().getGroup()); }
(rule__Move__Group__0)
{ after(grammarAccess.getMoveAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Animation__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); }
	ruleMove
{ after(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAnimationAccess().getTriggerParserRuleCall_1()); }
	ruleTrigger
{ after(grammarAccess.getAnimationAccess().getTriggerParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getAnimationAccess().getAppearParserRuleCall_2()); }
	ruleAppear
{ after(grammarAccess.getAnimationAccess().getAppearParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Sequence__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group__0__Impl
	rule__Sequence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getContainsAssignment_0()); }
(rule__Sequence__ContainsAssignment_0)
{ after(grammarAccess.getSequenceAccess().getContainsAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sequence__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getSemicolonKeyword_1()); }

	';' 

{ after(grammarAccess.getSequenceAccess().getSemicolonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Appear__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Appear__Group__0__Impl
	rule__Appear__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getAppearKeyword_0()); }

	'appear' 

{ after(grammarAccess.getAppearAccess().getAppearKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Appear__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Appear__Group__1__Impl
	rule__Appear__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getAppearAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Appear__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Appear__Group__2__Impl
	rule__Appear__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getTimeAssignment_2()); }
(rule__Appear__TimeAssignment_2)
{ after(grammarAccess.getAppearAccess().getTimeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Appear__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Appear__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getAppearAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Trigger__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Trigger__Group__0__Impl
	rule__Trigger__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Trigger__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTriggerAccess().getTriggerAction_0()); }
(

)
{ after(grammarAccess.getTriggerAccess().getTriggerAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Trigger__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Trigger__Group__1__Impl
	rule__Trigger__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Trigger__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTriggerAccess().getTriggerKeyword_1()); }

	'trigger' 

{ after(grammarAccess.getTriggerAccess().getTriggerKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Trigger__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Trigger__Group__2__Impl
	rule__Trigger__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Trigger__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTriggerAccess().getLeftParenthesisKeyword_2()); }

	'(' 

{ after(grammarAccess.getTriggerAccess().getLeftParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Trigger__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Trigger__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Trigger__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTriggerAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getTriggerAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Move__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Move__Group__0__Impl
	rule__Move__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoveAccess().getMoveKeyword_0()); }

	'move' 

{ after(grammarAccess.getMoveAccess().getMoveKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Move__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Move__Group__1__Impl
	rule__Move__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Move__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Move__Group__2__Impl
	rule__Move__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoveAccess().getSpeedAssignment_2()); }
(rule__Move__SpeedAssignment_2)
{ after(grammarAccess.getMoveAccess().getSpeedAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Move__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Move__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getMoveAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__Sequence__ContainsAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getContainsAnimationParserRuleCall_0_0()); }
	ruleAnimation{ after(grammarAccess.getSequenceAccess().getContainsAnimationParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__TimeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getTimeINTTerminalRuleCall_2_0()); }
	RULE_INT{ after(grammarAccess.getAppearAccess().getTimeINTTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Move__SpeedAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoveAccess().getSpeedINTTerminalRuleCall_2_0()); }
	RULE_INT{ after(grammarAccess.getMoveAccess().getSpeedINTTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


