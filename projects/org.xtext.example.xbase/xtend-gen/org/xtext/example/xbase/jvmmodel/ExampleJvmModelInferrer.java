package org.xtext.example.xbase.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.xbase.example.Field;
import org.xtext.example.xbase.example.Member;
import org.xtext.example.xbase.example.Method;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class ExampleJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  /**
   * The dispatch method {@code infer} is called for each instance of the
   * given element's type that is contained in a resource.
   * 
   * @param element
   *            the model to create one or more
   *            {@link JvmDeclaredType declared
   *            types} from.
   * @param acceptor
   *            each created
   *            {@link JvmDeclaredType type}
   *            without a container should be passed to the acceptor in order
   *            get attached to the current resource. The acceptor's
   *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
   *            accept(..)} method takes the constructed empty type for the
   *            pre-indexing phase. This one is further initialized in the
   *            indexing phase using the closure you pass to the returned
   *            {@link IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
   *            initializeLater(..)}.
   * @param isPreIndexingPhase
   *            whether the method is called in a pre-indexing phase, i.e.
   *            when the global index is not yet fully updated. You must not
   *            rely on linking using the index if isPreIndexingPhase is
   *            <code>true</code>.
   */
  protected void _infer(final org.xtext.example.xbase.example.Class clazz, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(clazz);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(clazz, _fullyQualifiedName);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      EList<Member> _members = clazz.getMembers();
      for (final Member member : _members) {
        EList<JvmMember> _members_1 = it.getMembers();
        JvmFeature _switchResult = null;
        boolean _matched = false;
        if (!_matched) {
          if (member instanceof Field) {
            _matched=true;
            String _name = ((Field)member).getName();
            JvmTypeReference _type = ((Field)member).getType();
            _switchResult = this._jvmTypesBuilder.toField(member, _name, _type);
          }
        }
        if (!_matched) {
          if (member instanceof Method) {
            _matched=true;
            String _name = ((Method)member).getName();
            JvmTypeReference _inferredType = this._jvmTypesBuilder.inferredType();
            final Procedure1<JvmOperation> _function_1 = (JvmOperation it_1) -> {
              EList<JvmFormalParameter> _parameters = ((Method)member).getParameters();
              for (final JvmFormalParameter parameter : _parameters) {
                EList<JvmFormalParameter> _parameters_1 = it_1.getParameters();
                JvmFormalParameter _cloneWithProxies = this._jvmTypesBuilder.<JvmFormalParameter>cloneWithProxies(parameter);
                this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _cloneWithProxies);
              }
              XExpression _body = ((Method)member).getBody();
              this._jvmTypesBuilder.setBody(it_1, _body);
            };
            _switchResult = this._jvmTypesBuilder.toMethod(member, _name, _inferredType, _function_1);
          }
        }
        this._jvmTypesBuilder.<JvmFeature>operator_add(_members_1, _switchResult);
      }
    };
    _accept.initializeLater(_function);
  }
  
  public void infer(final EObject clazz, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (clazz instanceof org.xtext.example.xbase.example.Class) {
      _infer((org.xtext.example.xbase.example.Class)clazz, acceptor, isPreIndexingPhase);
      return;
    } else if (clazz != null) {
      _infer(clazz, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(clazz, acceptor, isPreIndexingPhase).toString());
    }
  }
}
