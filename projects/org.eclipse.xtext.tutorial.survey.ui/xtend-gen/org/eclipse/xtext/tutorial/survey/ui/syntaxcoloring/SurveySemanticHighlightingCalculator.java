package org.eclipse.xtext.tutorial.survey.ui.syntaxcoloring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.tutorial.survey.survey.Question;
import org.eclipse.xtext.tutorial.survey.survey.SurveyPackage;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;

@SuppressWarnings("all")
public class SurveySemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  private final static Pattern xtext = Pattern.compile(".*xtext.*", (Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE));
  
  protected boolean highlightElement(final EObject element, final IHighlightedPositionAcceptor acceptor) {
    if ((element instanceof Question)) {
      boolean _or = false;
      String _name = ((Question)element).getName();
      Matcher _matcher = SurveySemanticHighlightingCalculator.xtext.matcher(_name);
      boolean _matches = _matcher.matches();
      if (_matches) {
        _or = true;
      } else {
        String _text = ((Question)element).getText();
        Matcher _matcher_1 = SurveySemanticHighlightingCalculator.xtext.matcher(_text);
        boolean _matches_1 = _matcher_1.matches();
        _or = _matches_1;
      }
      if (_or) {
        this.highlightFeature(acceptor, element, 
          SurveyPackage.Literals.QUESTION__NAME, 
          DefaultHighlightingConfiguration.KEYWORD_ID);
        return true;
      }
    }
    return false;
  }
}
