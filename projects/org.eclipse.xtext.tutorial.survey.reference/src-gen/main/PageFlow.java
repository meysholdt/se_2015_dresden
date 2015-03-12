package main;

import org.eclipse.xtext.tutorial.survey.runtime.IFormState;
import org.eclipse.xtext.tutorial.survey.runtime.IPageFlow;

public class PageFlow implements IPageFlow {
	
	public String getFirstPage() {
		return "Start";
	}
	
	public String getNextPage(IFormState formState) {
		String currentPage = formState.getCurrentPage();
		if(currentPage == null)
			return getFirstPage();
		return null;
	}
}
