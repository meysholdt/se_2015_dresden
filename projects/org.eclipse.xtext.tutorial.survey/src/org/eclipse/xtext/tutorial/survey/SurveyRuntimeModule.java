/*
 * generated by Xtext
 */
package org.eclipse.xtext.tutorial.survey;

import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.tutorial.survey.generator.SurveyOutputConfigurationProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class SurveyRuntimeModule extends org.eclipse.xtext.tutorial.survey.AbstractSurveyRuntimeModule {

	public Class<? extends IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
		return SurveyOutputConfigurationProvider.class;
	}
}
