/**
 */
package org.xtext.example.unorderedgroups.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.unorderedgroups.Employee;
import org.xtext.example.unorderedgroups.UnorderedgroupsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.unorderedgroups.impl.EmployeeImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.xtext.example.unorderedgroups.impl.EmployeeImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.xtext.example.unorderedgroups.impl.EmployeeImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.xtext.example.unorderedgroups.impl.EmployeeImpl#getYearOfBirth <em>Year Of Birth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmployeeImpl extends MinimalEObjectImpl.Container implements Employee
{
  /**
   * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected static final String FIRST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected String firstName = FIRST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAge()
   * @generated
   * @ordered
   */
  protected static final int AGE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAge()
   * @generated
   * @ordered
   */
  protected int age = AGE_EDEFAULT;

  /**
   * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected static final String LAST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected String lastName = LAST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getYearOfBirth() <em>Year Of Birth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYearOfBirth()
   * @generated
   * @ordered
   */
  protected static final int YEAR_OF_BIRTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYearOfBirth() <em>Year Of Birth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYearOfBirth()
   * @generated
   * @ordered
   */
  protected int yearOfBirth = YEAR_OF_BIRTH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmployeeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UnorderedgroupsPackage.Literals.EMPLOYEE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstName(String newFirstName)
  {
    String oldFirstName = firstName;
    firstName = newFirstName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnorderedgroupsPackage.EMPLOYEE__FIRST_NAME, oldFirstName, firstName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAge()
  {
    return age;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAge(int newAge)
  {
    int oldAge = age;
    age = newAge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnorderedgroupsPackage.EMPLOYEE__AGE, oldAge, age));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLastName()
  {
    return lastName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastName(String newLastName)
  {
    String oldLastName = lastName;
    lastName = newLastName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnorderedgroupsPackage.EMPLOYEE__LAST_NAME, oldLastName, lastName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getYearOfBirth()
  {
    return yearOfBirth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYearOfBirth(int newYearOfBirth)
  {
    int oldYearOfBirth = yearOfBirth;
    yearOfBirth = newYearOfBirth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnorderedgroupsPackage.EMPLOYEE__YEAR_OF_BIRTH, oldYearOfBirth, yearOfBirth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UnorderedgroupsPackage.EMPLOYEE__FIRST_NAME:
        return getFirstName();
      case UnorderedgroupsPackage.EMPLOYEE__AGE:
        return getAge();
      case UnorderedgroupsPackage.EMPLOYEE__LAST_NAME:
        return getLastName();
      case UnorderedgroupsPackage.EMPLOYEE__YEAR_OF_BIRTH:
        return getYearOfBirth();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UnorderedgroupsPackage.EMPLOYEE__FIRST_NAME:
        setFirstName((String)newValue);
        return;
      case UnorderedgroupsPackage.EMPLOYEE__AGE:
        setAge((Integer)newValue);
        return;
      case UnorderedgroupsPackage.EMPLOYEE__LAST_NAME:
        setLastName((String)newValue);
        return;
      case UnorderedgroupsPackage.EMPLOYEE__YEAR_OF_BIRTH:
        setYearOfBirth((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UnorderedgroupsPackage.EMPLOYEE__FIRST_NAME:
        setFirstName(FIRST_NAME_EDEFAULT);
        return;
      case UnorderedgroupsPackage.EMPLOYEE__AGE:
        setAge(AGE_EDEFAULT);
        return;
      case UnorderedgroupsPackage.EMPLOYEE__LAST_NAME:
        setLastName(LAST_NAME_EDEFAULT);
        return;
      case UnorderedgroupsPackage.EMPLOYEE__YEAR_OF_BIRTH:
        setYearOfBirth(YEAR_OF_BIRTH_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UnorderedgroupsPackage.EMPLOYEE__FIRST_NAME:
        return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
      case UnorderedgroupsPackage.EMPLOYEE__AGE:
        return age != AGE_EDEFAULT;
      case UnorderedgroupsPackage.EMPLOYEE__LAST_NAME:
        return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
      case UnorderedgroupsPackage.EMPLOYEE__YEAR_OF_BIRTH:
        return yearOfBirth != YEAR_OF_BIRTH_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (firstName: ");
    result.append(firstName);
    result.append(", age: ");
    result.append(age);
    result.append(", lastName: ");
    result.append(lastName);
    result.append(", yearOfBirth: ");
    result.append(yearOfBirth);
    result.append(')');
    return result.toString();
  }

} //EmployeeImpl
