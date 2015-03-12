/**
 */
package org.xtext.quickfix.exampleQuickfix;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.quickfix.exampleQuickfix.City#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.quickfix.exampleQuickfix.City#getSights <em>Sights</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.quickfix.exampleQuickfix.ExampleQuickfixPackage#getCity()
 * @model
 * @generated
 */
public interface City extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.quickfix.exampleQuickfix.ExampleQuickfixPackage#getCity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.quickfix.exampleQuickfix.City#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sights</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.quickfix.exampleQuickfix.Sight}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sights</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sights</em>' containment reference list.
   * @see org.xtext.quickfix.exampleQuickfix.ExampleQuickfixPackage#getCity_Sights()
   * @model containment="true"
   * @generated
   */
  EList<Sight> getSights();

} // City
