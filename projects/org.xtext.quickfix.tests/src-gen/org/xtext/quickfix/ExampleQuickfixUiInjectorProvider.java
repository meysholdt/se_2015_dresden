/*
 * generated by Xtext
 */
package org.xtext.quickfix;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ExampleQuickfixUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.xtext.quickfix.ui.internal.ExampleQuickfixActivator.getInstance().getInjector("org.xtext.quickfix.ExampleQuickfix");
	}
	
}
