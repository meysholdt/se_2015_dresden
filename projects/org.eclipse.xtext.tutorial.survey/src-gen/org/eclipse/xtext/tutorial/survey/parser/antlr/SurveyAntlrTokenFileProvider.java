/*
 * generated by Xtext
 */
package org.eclipse.xtext.tutorial.survey.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SurveyAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.tokens");
	}
}
