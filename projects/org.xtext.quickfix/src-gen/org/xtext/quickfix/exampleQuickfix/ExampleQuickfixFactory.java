/**
 */
package org.xtext.quickfix.exampleQuickfix;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.quickfix.exampleQuickfix.ExampleQuickfixPackage
 * @generated
 */
public interface ExampleQuickfixFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExampleQuickfixFactory eINSTANCE = org.xtext.quickfix.exampleQuickfix.impl.ExampleQuickfixFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>City</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>City</em>'.
   * @generated
   */
  City createCity();

  /**
   * Returns a new object of class '<em>Sight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sight</em>'.
   * @generated
   */
  Sight createSight();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ExampleQuickfixPackage getExampleQuickfixPackage();

} //ExampleQuickfixFactory
