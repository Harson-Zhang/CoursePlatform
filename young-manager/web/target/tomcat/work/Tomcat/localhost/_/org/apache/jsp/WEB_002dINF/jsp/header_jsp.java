/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-09-14 09:09:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layui/css/layui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/comment.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/details.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"layui-header title\">\r\n");
      out.write("    <div class=\"layui-container\">\r\n");
      out.write("        <div class=\"layui-pull-left\">\r\n");
      out.write("            <a href=\"toIndexPage\" target=\"_blank\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo.png\" height=\"40px\">\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"layui-container\">\r\n");
      out.write("    <div class=\"layui-tab layui-tab-brief\" id=\"sign\" lay-filter=\"\" style=\"display: none;\">\r\n");
      out.write("        <ul class=\"layui-tab-title\">\r\n");
      out.write("            <li class=\"layui-this\">登录</li>\r\n");
      out.write("            <li>注册</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"layui-tab-content\">\r\n");
      out.write("            <div class=\"layui-tab-item layui-show\">\r\n");
      out.write("                <div class=\"\" style=\"margin: 40px 20px;\">\r\n");
      out.write("                    <form class=\"layui-form layui-form-pane\" id=\"login\">\r\n");
      out.write("                        <div class=\"layui-form-item\">\r\n");
      out.write("                            <label class=\"layui-form-label\">用户名</label>\r\n");
      out.write("                            <div class=\"layui-input-block\">\r\n");
      out.write("                                <input type=\"text\" name=\"username\" required lay-verify=\"required\" placeholder=\"请输入用户名\"\r\n");
      out.write("                                       autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <div class=\"layui-form-item\">\r\n");
      out.write("                            <label class=\"layui-form-label\">密码</label>\r\n");
      out.write("                            <div class=\"layui-input-block\">\r\n");
      out.write("                                <input type=\"password\" name=\"password\" required lay-verify=\"required\"\r\n");
      out.write("                                       placeholder=\"请输入密码\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <div class=\"layui-form-item\">\r\n");
      out.write("                            <button class=\"layui-btn layui-btn-fluid layui-btn-normal layui-btn-radius\" lay-submit\r\n");
      out.write("                                    lay-filter=\"login\">立即登录\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-tab-item\">\r\n");
      out.write("                <div class=\"\" style=\"margin: 30px 20px;\">\r\n");
      out.write("                    <form class=\"layui-form layui-form-pane form\">\r\n");
      out.write("                        <div class=\"layui-form-item\">\r\n");
      out.write("                            <label class=\"layui-form-label\">用户名</label>\r\n");
      out.write("                            <div class=\"layui-input-block\">\r\n");
      out.write("                                <input type=\"text\" name=\"uname\" required lay-verify=\"required\" placeholder=\"请输入用户名\"\r\n");
      out.write("                                       autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"layui-form-item\">\r\n");
      out.write("                            <label class=\"layui-form-label\">密码</label>\r\n");
      out.write("                            <div class=\"layui-input-block\">\r\n");
      out.write("                                <input type=\"password\" name=\"password\" required id=\"registPassword\"\r\n");
      out.write("                                       lay-verify=\"required\" placeholder=\"请输入密码\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"layui-form-item\">\r\n");
      out.write("                            <label class=\"layui-form-label\">确认密码</label>\r\n");
      out.write("                            <div class=\"layui-input-block\">\r\n");
      out.write("                                <input type=\"password\" name=\"password\" required id=\"confirmPassword\"\r\n");
      out.write("                                       lay-verify=\"required\" placeholder=\"请再次输入密码\" autocomplete=\"off\"\r\n");
      out.write("                                       class=\"layui-input\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"layui-form-item\">\r\n");
      out.write("                            <label class=\"layui-form-label\">手机号</label>\r\n");
      out.write("                            <div class=\"layui-input-block\">\r\n");
      out.write("                                <input type=\"text\" name=\"telephone\" placeholder=\"请输入手机号\" required lay-verify=\"required\" autocomplete=\"off\"\r\n");
      out.write("                                       class=\"layui-input\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <div class=\"layui-form-item\">\r\n");
      out.write("                        <input type=\"submit\" id=\"registSubmit\"\r\n");
      out.write("                               class=\"layui-btn layui-btn-fluid layui-btn-radius layui-btn-normal regist-btn\"\r\n");
      out.write("                               value=\"立即注册\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layui/layui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['element', 'carousel', 'layer', 'form'], function () {\r\n");
      out.write("        var element = layui.element,\r\n");
      out.write("            carousel = layui.carousel,\r\n");
      out.write("            $ = layui.jquery,\r\n");
      out.write("            layer = layui.layer,\r\n");
      out.write("            form = layui.form,\r\n");
      out.write("            layedit = layui.layedit;\r\n");
      out.write("\r\n");
      out.write("        //真没办法，js代码还是没法分离出来，放回原网页了o(╥﹏╥)o\r\n");
      out.write("    });\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/header.jsp(19,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty loginUser }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div class=\"personalCenter layui-pull-right\"><a id=\"logout\" href=\"javascript:;\" target=\"_blank\"\r\n");
        out.write("                                                            style=\"color:#fff\"><i\r\n");
        out.write("                    class=\"layui-icon layui-icon-face-cry\"></i> &nbsp;注销</a></div>\r\n");
        out.write("            <div class=\"personalCenter layui-pull-right\"><a href=\"/toUserSystem\" target=\"_blank\" style=\"color:#fff\"><i\r\n");
        out.write("                    class=\"layui-icon layui-icon-face-smile\"></i> &nbsp;个人中心</a></div>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/jsp/header.jsp(26,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loginUser }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div class=\"operation layui-pull-right\"><i class=\"layui-icon layui-icon-face-smile\"></i>&nbsp;注册</div>\r\n");
        out.write("            <div class=\"operation layui-pull-right\"><i class=\"layui-icon layui-icon-tree\"></i>&nbsp;学生登录</div>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
