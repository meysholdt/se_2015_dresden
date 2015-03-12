/**
 */
package org.xtext.quickfix.exampleQuickfix;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.quickfix.exampleQuickfix.Model#getCities <em>Cities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.quickfix.exampleQuickfix.ExampleQuickfixPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Cities</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.quickfix.exampleQuickfix.City}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cities</em>' containment reference list.
   * @see org.xtext.quickfix.exampleQuickfix.ExampleQuickfixPackage#getModel_Cities()
   * @model containment="true"
   * @generated
   */
  EList<City> getCities();

} // Model
