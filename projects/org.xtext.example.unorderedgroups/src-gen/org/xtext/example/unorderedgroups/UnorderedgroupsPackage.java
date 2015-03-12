/**
 */
package org.xtext.example.unorderedgroups;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.unorderedgroups.UnorderedgroupsFactory
 * @model kind="package"
 * @generated
 */
public interface UnorderedgroupsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "unorderedgroups";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/Unorderedgroups";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "unorderedgroups";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UnorderedgroupsPackage eINSTANCE = org.xtext.example.unorderedgroups.impl.UnorderedgroupsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.unorderedgroups.impl.EmployeeImpl <em>Employee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.unorderedgroups.impl.EmployeeImpl
   * @see org.xtext.example.unorderedgroups.impl.UnorderedgroupsPackageImpl#getEmployee()
   * @generated
   */
  int EMPLOYEE = 0;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__FIRST_NAME = 0;

  /**
   * The feature id for the '<em><b>Age</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__AGE = 1;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__LAST_NAME = 2;

  /**
   * The feature id for the '<em><b>Year Of Birth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__YEAR_OF_BIRTH = 3;

  /**
   * The number of structural features of the '<em>Employee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link org.xtext.example.unorderedgroups.Employee <em>Employee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Employee</em>'.
   * @see org.xtext.example.unorderedgroups.Employee
   * @generated
   */
  EClass getEmployee();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.unorderedgroups.Employee#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see org.xtext.example.unorderedgroups.Employee#getFirstName()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_FirstName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.unorderedgroups.Employee#getAge <em>Age</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Age</em>'.
   * @see org.xtext.example.unorderedgroups.Employee#getAge()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_Age();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.unorderedgroups.Employee#getLastName <em>Last Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Name</em>'.
   * @see org.xtext.example.unorderedgroups.Employee#getLastName()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_LastName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.unorderedgroups.Employee#getYearOfBirth <em>Year Of Birth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year Of Birth</em>'.
   * @see org.xtext.example.unorderedgroups.Employee#getYearOfBirth()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_YearOfBirth();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UnorderedgroupsFactory getUnorderedgroupsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.unorderedgroups.impl.EmployeeImpl <em>Employee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.unorderedgroups.impl.EmployeeImpl
     * @see org.xtext.example.unorderedgroups.impl.UnorderedgroupsPackageImpl#getEmployee()
     * @generated
     */
    EClass EMPLOYEE = eINSTANCE.getEmployee();

    /**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__FIRST_NAME = eINSTANCE.getEmployee_FirstName();

    /**
     * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__AGE = eINSTANCE.getEmployee_Age();

    /**
     * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__LAST_NAME = eINSTANCE.getEmployee_LastName();

    /**
     * The meta object literal for the '<em><b>Year Of Birth</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__YEAR_OF_BIRTH = eINSTANCE.getEmployee_YearOfBirth();

  }

} //UnorderedgroupsPackage
