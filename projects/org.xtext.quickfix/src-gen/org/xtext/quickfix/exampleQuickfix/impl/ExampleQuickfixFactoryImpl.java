/**
 */
package org.xtext.quickfix.exampleQuickfix.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.quickfix.exampleQuickfix.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExampleQuickfixFactoryImpl extends EFactoryImpl implements ExampleQuickfixFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExampleQuickfixFactory init()
  {
    try
    {
      ExampleQuickfixFactory theExampleQuickfixFactory = (ExampleQuickfixFactory)EPackage.Registry.INSTANCE.getEFactory(ExampleQuickfixPackage.eNS_URI);
      if (theExampleQuickfixFactory != null)
      {
        return theExampleQuickfixFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExampleQuickfixFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExampleQuickfixFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ExampleQuickfixPackage.MODEL: return createModel();
      case ExampleQuickfixPackage.CITY: return createCity();
      case ExampleQuickfixPackage.SIGHT: return createSight();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public City createCity()
  {
    CityImpl city = new CityImpl();
    return city;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sight createSight()
  {
    SightImpl sight = new SightImpl();
    return sight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExampleQuickfixPackage getExampleQuickfixPackage()
  {
    return (ExampleQuickfixPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExampleQuickfixPackage getPackage()
  {
    return ExampleQuickfixPackage.eINSTANCE;
  }

} //ExampleQuickfixFactoryImpl
