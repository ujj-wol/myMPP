package lesson5.labs.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import lesson5.labs.prob1.gui.BookWindow;
import lesson5.labs.prob1.gui.CDWindow;

final public class RuleSetFactory {
	
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static {		
		Class<BookWindow> bookClass = BookWindow.class;
		RuleSet book = new BookRuleSet();
		
		Class<CDWindow> cdClass = CDWindow.class;
		RuleSet cd = new CDRuleSet();
		
		map.put(bookClass, book);
		map.put(cdClass, cd);		
	}	
	
	public static RuleSet getRuleSet(Component component) throws RuleException{
		Class<? extends Component> compClass = component.getClass();
		if(!map.containsKey(compClass)) {
			throw new RuleException("Ruleset not found for this component");
		}
		return map.get(compClass);
	}
	
	
	
	
}
