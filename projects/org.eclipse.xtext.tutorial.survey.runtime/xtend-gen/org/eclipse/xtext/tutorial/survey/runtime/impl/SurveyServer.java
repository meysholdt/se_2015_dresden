package org.eclipse.xtext.tutorial.survey.runtime.impl;

import java.io.File;
import java.util.List;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtext.tutorial.survey.runtime.IPageFlow;
import org.eclipse.xtext.tutorial.survey.runtime.impl.SurveyHandler;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class SurveyServer {
  @Property
  private int _port;
  
  @Property
  private IPageFlow _pageFlow;
  
  private List<String> webroots = CollectionLiterals.<String>newArrayList();
  
  public boolean addWebroot(final String folder) {
    return this.webroots.add(folder);
  }
  
  public void start() {
    Server _server = new Server(8080);
    final Procedure1<Server> _function = new Procedure1<Server>() {
      @Override
      public void apply(final Server it) {
        try {
          final HandlerList handlerList = new HandlerList();
          SessionHandler _sessionHandler = new SessionHandler();
          handlerList.addHandler(_sessionHandler);
          SurveyHandler _surveyHandler = new SurveyHandler();
          final Procedure1<SurveyHandler> _function = new Procedure1<SurveyHandler>() {
            @Override
            public void apply(final SurveyHandler it) {
              IPageFlow _pageFlow = SurveyServer.this.getPageFlow();
              it.setPageFlow(_pageFlow);
            }
          };
          SurveyHandler _doubleArrow = ObjectExtensions.<SurveyHandler>operator_doubleArrow(_surveyHandler, _function);
          handlerList.addHandler(_doubleArrow);
          for (final String webroot : SurveyServer.this.webroots) {
            ResourceHandler _resourceHandler = new ResourceHandler();
            final Procedure1<ResourceHandler> _function_1 = new Procedure1<ResourceHandler>() {
              @Override
              public void apply(final ResourceHandler it) {
                it.setResourceBase(webroot);
              }
            };
            ResourceHandler _doubleArrow_1 = ObjectExtensions.<ResourceHandler>operator_doubleArrow(_resourceHandler, _function_1);
            handlerList.addHandler(_doubleArrow_1);
          }
          it.setHandler(handlerList);
          it.start();
          it.join();
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    };
    ObjectExtensions.<Server>operator_doubleArrow(_server, _function);
  }
  
  protected ResourceHandler getResourceHandler() {
    ResourceHandler _resourceHandler = new ResourceHandler();
    final Procedure1<ResourceHandler> _function = new Procedure1<ResourceHandler>() {
      @Override
      public void apply(final ResourceHandler it) {
        try {
          File _file = new File(".");
          final String current = _file.getCanonicalPath();
          it.setResourceBase((current + "/webroot/"));
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    };
    return ObjectExtensions.<ResourceHandler>operator_doubleArrow(_resourceHandler, _function);
  }
  
  @Pure
  public int getPort() {
    return this._port;
  }
  
  public void setPort(final int port) {
    this._port = port;
  }
  
  @Pure
  public IPageFlow getPageFlow() {
    return this._pageFlow;
  }
  
  public void setPageFlow(final IPageFlow pageFlow) {
    this._pageFlow = pageFlow;
  }
}
