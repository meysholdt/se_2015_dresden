package org.eclipse.xtext.tutorial.survey.runtime.impl;

import com.google.common.base.Objects;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtext.tutorial.survey.runtime.IPageFlow;
import org.eclipse.xtext.tutorial.survey.runtime.impl.DataStore;
import org.eclipse.xtext.tutorial.survey.runtime.impl.Evaluation;
import org.eclipse.xtext.tutorial.survey.runtime.impl.FormState;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class SurveyHandler extends AbstractHandler {
  @Property
  private IPageFlow _pageFlow;
  
  @Extension
  private DataStore datastore = new DataStore();
  
  @Extension
  private Evaluation _evaluation = new Evaluation();
  
  @Override
  public void handle(final String target, final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {
    final FormState formState = new FormState(request);
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(target, "/dispatch")) {
        _matched=true;
        IPageFlow _pageFlow = this.getPageFlow();
        String nextPage = _pageFlow.getNextPage(formState);
        boolean _equals = Objects.equal(nextPage, null);
        if (_equals) {
          this.datastore.store(formState);
          HttpSession _session = request.getSession();
          _session.invalidate();
          nextPage = "Thanks";
        }
        response.sendRedirect((nextPage + ".html"));
        baseRequest.setHandled(true);
      }
    }
    if (!_matched) {
      if (Objects.equal(target, "/evaluate")) {
        _matched=true;
        this._evaluation.sendEvaluationPage(response, this.datastore);
        baseRequest.setHandled(true);
      }
    }
    if (!_matched) {
      if (Objects.equal(target, "/")) {
        _matched=true;
        IPageFlow _pageFlow_1 = this.getPageFlow();
        String _firstPage = _pageFlow_1.getFirstPage();
        String _plus = (_firstPage + ".html");
        response.sendRedirect(_plus);
        baseRequest.setHandled(true);
      }
    }
  }
  
  @Pure
  public IPageFlow getPageFlow() {
    return this._pageFlow;
  }
  
  public void setPageFlow(final IPageFlow pageFlow) {
    this._pageFlow = pageFlow;
  }
}
