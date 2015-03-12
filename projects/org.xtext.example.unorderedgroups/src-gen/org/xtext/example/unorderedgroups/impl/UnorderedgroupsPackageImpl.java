/**
 */
package org.xtext.example.unorderedgroups.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.unorderedgroups.Employee;
import org.xtext.example.unorderedgroups.UnorderedgroupsFactory;
import org.xtext.example.unorderedgroups.UnorderedgroupsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnorderedgroupsPackageImpl extends EPackageImpl implements UnorderedgroupsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass employeeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.unorderedgroups.UnorderedgroupsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UnorderedgroupsPackageImpl()
  {
    super(eNS_URI, UnorderedgroupsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link UnorderedgroupsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static UnorderedgroupsPackage init()
  {
    if (isInited) return (UnorderedgroupsPackage)EPackage.Registry.INSTANCE.getEPackage(UnorderedgroupsPackage.eNS_URI);

    // Obtain or create and register package
    UnorderedgroupsPackageImpl theUnorderedgroupsPackage = (UnorderedgroupsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UnorderedgroupsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UnorderedgroupsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theUnorderedgroupsPackage.createPackageContents();

    // Initialize created meta-data
    theUnorderedgroupsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theUnorderedgroupsPackage.freeze();


    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(UnorderedgroupsPackage.eNS_URI, theUnorderedgroupsPackage);
    return theUnorderedgroupsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmployee()
  {
    return employeeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmployee_FirstName()
  {
    return (EAttribute)employeeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmployee_Age()
  {
    return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmployee_LastName()
  {
    return (EAttribute)employeeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmployee_YearOfBirth()
  {
    return (EAttribute)employeeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnorderedgroupsFactory getUnorderedgroupsFactory()
  {
    return (UnorderedgroupsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    employeeEClass = createEClass(EMPLOYEE);
    createEAttribute(employeeEClass, EMPLOYEE__FIRST_NAME);
    createEAttribute(employeeEClass, EMPLOYEE__AGE);
    createEAttribute(employeeEClass, EMPLOYEE__LAST_NAME);
    createEAttribute(employeeEClass, EMPLOYEE__YEAR_OF_BIRTH);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEmployee_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmployee_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmployee_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmployee_YearOfBirth(), ecorePackage.getEInt(), "yearOfBirth", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //UnorderedgroupsPackageImpl
