package org.xtext.quickfix.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.quickfix.exampleQuickfix.City;
import org.xtext.quickfix.exampleQuickfix.ExampleQuickfixPackage;
import org.xtext.quickfix.exampleQuickfix.Model;
import org.xtext.quickfix.exampleQuickfix.Sight;
import org.xtext.quickfix.services.ExampleQuickfixGrammarAccess;

@SuppressWarnings("all")
public class ExampleQuickfixSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExampleQuickfixGrammarAccess grammarAccess;

	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExampleQuickfixPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExampleQuickfixPackage.CITY:
				if(context == grammarAccess.getCityRule()) {
					sequence_City(context, (City) semanticObject);
					return;
				}
				else break;
			case ExampleQuickfixPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject);
					return;
				}
				else break;
			case ExampleQuickfixPackage.SIGHT:
				if(context == grammarAccess.getSightRule()) {
					sequence_Sight(context, (Sight) semanticObject);
					return;
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}

	/**
	 * Constraint:
	 *     (name=STRING sights+=Sight*)
	 */
	protected void sequence_City(EObject context, City semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}


	/**
	 * Constraint:
	 *     cities+=City*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}


	/**
	 * Constraint:
	 *     (name=STRING description=STRING)
	 */
	protected void sequence_Sight(EObject context, Sight semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExampleQuickfixPackage.Literals.SIGHT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExampleQuickfixPackage.Literals.SIGHT__NAME));
			if(transientValues.isValueTransient(semanticObject, ExampleQuickfixPackage.Literals.SIGHT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExampleQuickfixPackage.Literals.SIGHT__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSightAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSightAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
}
