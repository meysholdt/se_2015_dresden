/**
 */
package org.xtext.quickfix.exampleQuickfix;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.xtext.quickfix.exampleQuickfix.ExampleQuickfixFactory
 * @model kind="package"
 * @generated
 */
public interface ExampleQuickfixPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "exampleQuickfix";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/quickfix/ExampleQuickfix";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "exampleQuickfix";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExampleQuickfixPackage eINSTANCE = org.xtext.quickfix.exampleQuickfix.impl.ExampleQuickfixPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.quickfix.exampleQuickfix.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.quickfix.exampleQuickfix.impl.ModelImpl
   * @see org.xtext.quickfix.exampleQuickfix.impl.ExampleQuickfixPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Cities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CITIES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.quickfix.exampleQuickfix.impl.CityImpl <em>City</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.quickfix.exampleQuickfix.impl.CityImpl
   * @see org.xtext.quickfix.exampleQuickfix.impl.ExampleQuickfixPackageImpl#getCity()
   * @generated
   */
  int CITY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Sights</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CITY__SIGHTS = 1;

  /**
   * The number of structural features of the '<em>City</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.quickfix.exampleQuickfix.impl.SightImpl <em>Sight</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.quickfix.exampleQuickfix.impl.SightImpl
   * @see org.xtext.quickfix.exampleQuickfix.impl.ExampleQuickfixPackageImpl#getSight()
   * @generated
   */
  int SIGHT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGHT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGHT__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Sight</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGHT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.quickfix.exampleQuickfix.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.quickfix.exampleQuickfix.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.quickfix.exampleQuickfix.Model#getCities <em>Cities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cities</em>'.
   * @see org.xtext.quickfix.exampleQuickfix.Model#getCities()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Cities();

  /**
   * Returns the meta object for class '{@link org.xtext.quickfix.exampleQuickfix.City <em>City</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>City</em>'.
   * @see org.xtext.quickfix.exampleQuickfix.City
   * @generated
   */
  EClass getCity();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.quickfix.exampleQuickfix.City#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.quickfix.exampleQuickfix.City#getName()
   * @see #getCity()
   * @generated
   */
  EAttribute getCity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.quickfix.exampleQuickfix.City#getSights <em>Sights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sights</em>'.
   * @see org.xtext.quickfix.exampleQuickfix.City#getSights()
   * @see #getCity()
   * @generated
   */
  EReference getCity_Sights();

  /**
   * Returns the meta object for class '{@link org.xtext.quickfix.exampleQuickfix.Sight <em>Sight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sight</em>'.
   * @see org.xtext.quickfix.exampleQuickfix.Sight
   * @generated
   */
  EClass getSight();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.quickfix.exampleQuickfix.Sight#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.quickfix.exampleQuickfix.Sight#getName()
   * @see #getSight()
   * @generated
   */
  EAttribute getSight_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.quickfix.exampleQuickfix.Sight#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.quickfix.exampleQuickfix.Sight#getDescription()
   * @see #getSight()
   * @generated
   */
  EAttribute getSight_Description();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExampleQuickfixFactory getExampleQuickfixFactory();

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
     * The meta object literal for the '{@link org.xtext.quickfix.exampleQuickfix.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.quickfix.exampleQuickfix.impl.ModelImpl
     * @see org.xtext.quickfix.exampleQuickfix.impl.ExampleQuickfixPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Cities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CITIES = eINSTANCE.getModel_Cities();

    /**
     * The meta object literal for the '{@link org.xtext.quickfix.exampleQuickfix.impl.CityImpl <em>City</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.quickfix.exampleQuickfix.impl.CityImpl
     * @see org.xtext.quickfix.exampleQuickfix.impl.ExampleQuickfixPackageImpl#getCity()
     * @generated
     */
    EClass CITY = eINSTANCE.getCity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CITY__NAME = eINSTANCE.getCity_Name();

    /**
     * The meta object literal for the '<em><b>Sights</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CITY__SIGHTS = eINSTANCE.getCity_Sights();

    /**
     * The meta object literal for the '{@link org.xtext.quickfix.exampleQuickfix.impl.SightImpl <em>Sight</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.quickfix.exampleQuickfix.impl.SightImpl
     * @see org.xtext.quickfix.exampleQuickfix.impl.ExampleQuickfixPackageImpl#getSight()
     * @generated
     */
    EClass SIGHT = eINSTANCE.getSight();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGHT__NAME = eINSTANCE.getSight_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGHT__DESCRIPTION = eINSTANCE.getSight_Description();

  }

} //ExampleQuickfixPackage
