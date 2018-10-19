package lesson5.labs.prob1.rulesets;

import java.awt.Component;
import java.util.regex.Pattern;

import lesson5.labs.prob1.gui.BookWindow;



/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	
	private final String isbnPattern = "([0-1][0-9]{9}|(978|979)[0-9]{10})";
	private final String pricePattern = "[0-9]*.[0-9]{2}";
	BookWindow book;
	
	
	
	@Override
	public void applyRules(Component ob) throws RuleException {
		book = (BookWindow) ob;
		
		String isbn = book.getIsbnValue();
		String price = book.getPriceValue();
		String title = book.getTitle();
		
		
		Pattern pattern1 = Pattern.compile(isbnPattern);
		Pattern pattern2 = Pattern.compile(pricePattern);
		
		if(isbn == null || price == null || title == null || isbn.isEmpty() || price.isEmpty() || title.isEmpty()) {
			throw new RuleException("* None of the fields can be empty!");
		}		
		else if(!pattern1.matcher(isbn).matches()) {
			throw new RuleException("* 1. Isbn must be numeric and consist of either 10 or 13 characters\r\n" + 
					"* 2. If Isbn has length 10, the first digit must be 0 or 1\r\n" + 
					"* 3. If Isbn has length 13, the first 3 digits must be either 978 or 979");
		}
		else if(Double.parseDouble(price) < 0.5){
			throw new RuleException("Price must be greater than 0.49");
		}
		else if(!pattern2.matcher(price).matches()) {
			throw new RuleException("Price must be a floating point number with two decimal places");
		}
		
	}	

}
