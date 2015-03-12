/**
 */
package org.xtext.example.unorderedgroups;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.unorderedgroups.UnorderedgroupsPackage
 * @generated
 */
public interface UnorderedgroupsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UnorderedgroupsFactory eINSTANCE = org.xtext.example.unorderedgroups.impl.UnorderedgroupsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Employee</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Employee</em>'.
   * @generated
   */
  Employee createEmployee();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UnorderedgroupsPackage getUnorderedgroupsPackage();

} //UnorderedgroupsFactory
