package lesson5.labs.prob1.rulesets;

import java.awt.Component;
import java.util.regex.Pattern;

import lesson5.labs.prob1.gui.CDWindow;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private CDWindow cd;
	private final String pricePattern = "[0-9]*.[0-9]{2}";
	@Override
	public void applyRules(Component ob) throws RuleException {
		cd = (CDWindow) ob;	

		String value = cd.getArtistValue();
		String price = cd.getPriceValue();
		String title = cd.getTitle();
		
		Pattern pattern2 = Pattern.compile(pricePattern);
		
		if(value == null || price == null || title == null || value.isEmpty() || price.isEmpty() || title.isEmpty()) {
			throw new RuleException("* None of the fields can be empty!");
		}
		else if(Double.parseDouble(price) < 0.5){
			throw new RuleException("Price must be greater than 0.49");
		}
		else if(!pattern2.matcher(price).matches()) {
			throw new RuleException("Price must be a floating point number with two decimal places");
		}	
		
	}
	
}
