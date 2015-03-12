/**
 */
package org.xtext.example.unorderedgroups;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.unorderedgroups.Employee#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.xtext.example.unorderedgroups.Employee#getAge <em>Age</em>}</li>
 *   <li>{@link org.xtext.example.unorderedgroups.Employee#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.xtext.example.unorderedgroups.Employee#getYearOfBirth <em>Year Of Birth</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.unorderedgroups.UnorderedgroupsPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject
{
  /**
   * Returns the value of the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Name</em>' attribute.
   * @see #setFirstName(String)
   * @see org.xtext.example.unorderedgroups.UnorderedgroupsPackage#getEmployee_FirstName()
   * @model
   * @generated
   */
  String getFirstName();

  /**
   * Sets the value of the '{@link org.xtext.example.unorderedgroups.Employee#getFirstName <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Name</em>' attribute.
   * @see #getFirstName()
   * @generated
   */
  void setFirstName(String value);

  /**
   * Returns the value of the '<em><b>Age</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Age</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Age</em>' attribute.
   * @see #setAge(int)
   * @see org.xtext.example.unorderedgroups.UnorderedgroupsPackage#getEmployee_Age()
   * @model
   * @generated
   */
  int getAge();

  /**
   * Sets the value of the '{@link org.xtext.example.unorderedgroups.Employee#getAge <em>Age</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Age</em>' attribute.
   * @see #getAge()
   * @generated
   */
  void setAge(int value);

  /**
   * Returns the value of the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Name</em>' attribute.
   * @see #setLastName(String)
   * @see org.xtext.example.unorderedgroups.UnorderedgroupsPackage#getEmployee_LastName()
   * @model
   * @generated
   */
  String getLastName();

  /**
   * Sets the value of the '{@link org.xtext.example.unorderedgroups.Employee#getLastName <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Name</em>' attribute.
   * @see #getLastName()
   * @generated
   */
  void setLastName(String value);

  /**
   * Returns the value of the '<em><b>Year Of Birth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Year Of Birth</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Year Of Birth</em>' attribute.
   * @see #setYearOfBirth(int)
   * @see org.xtext.example.unorderedgroups.UnorderedgroupsPackage#getEmployee_YearOfBirth()
   * @model
   * @generated
   */
  int getYearOfBirth();

  /**
   * Sets the value of the '{@link org.xtext.example.unorderedgroups.Employee#getYearOfBirth <em>Year Of Birth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Year Of Birth</em>' attribute.
   * @see #getYearOfBirth()
   * @generated
   */
  void setYearOfBirth(int value);

} // Employee
