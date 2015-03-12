package org.eclipse.xtext.tutorial.survey.ui.syntaxcoloring

import java.util.regex.Pattern
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.tutorial.survey.survey.Question
import org.eclipse.xtext.tutorial.survey.survey.SurveyPackage
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration

class SurveySemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	static val xtext = Pattern.compile(".*xtext.*", Pattern.CASE_INSENSITIVE.bitwiseOr(Pattern.UNICODE_CASE))

	override protected highlightElement(EObject element, IHighlightedPositionAcceptor acceptor) {
		if (element instanceof Question) {
			if (xtext.matcher(element.name).matches || xtext.matcher(element.text).matches) {
				highlightFeature(
					acceptor,
					element,
					SurveyPackage.Literals.QUESTION__NAME,
					DefaultHighlightingConfiguration.KEYWORD_ID
				)
				return true
			}
		}
		return false
	}
}
