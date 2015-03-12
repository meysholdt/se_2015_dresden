package org.xtext.example.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.services.UnorderedgroupsGrammarAccess;
import org.xtext.example.unorderedgroups.Employee;
import org.xtext.example.unorderedgroups.UnorderedgroupsPackage;

@SuppressWarnings("all")
public class UnorderedgroupsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UnorderedgroupsGrammarAccess grammarAccess;

	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == UnorderedgroupsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UnorderedgroupsPackage.EMPLOYEE:
				if(context == grammarAccess.getEmployeeRule()) {
					sequence_Employee(context, (Employee) semanticObject);
					return;
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}

	/**
	 * Constraint:
	 *     (firstName=ID age=INT? lastName=ID yearOfBirth=INT?)
	 */
	protected void sequence_Employee(EObject context, Employee semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
