/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-27 10:21:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class school_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("    <title>独墅湖高教区课程资源共享平台</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/k-style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/swiper.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/h-school.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"layui/css/layui.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/global.css\">\r\n");
      out.write("    <script src=\"layui/layui.js\"></script>\r\n");
      out.write("    <script src=\"js/html5shiv.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"js/selectivizr.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"layui-carousel\" id=\"bg-item\">\r\n");
      out.write("        <div class=\"layui-header title\">\r\n");
      out.write("            <div class=\"layui-container\">\r\n");
      out.write("                <div class=\"layui-logo layui-pull-left\">\r\n");
      out.write("                    <img src=\"img/frontpagelogo.png\" width=\"360px\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"personalCenter layui-pull-right\">\r\n");
      out.write("                    <a class=\"operation\"><a class=\"operation\" href=\"index\" target=\"_blank\" style=\"color:#fff\"><i class=\"layui-icon layui-icon-read\"></i>&nbsp;回首页</a></a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"personalCenter layui-pull-right\">\r\n");
      out.write("                    <a class=\"operation\"><a class=\"operation\" href=\"school\" target=\"_blank\" style=\"color:#fff\"><i class=\"layui-icon layui-icon-read\"></i>&nbsp;院校</a></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"layui-container layui-pull-center\" style=\"margin-bottom: 30px;width: 1240px;\">\r\n");
      out.write("        <fieldset class=\"layui-elem-field\">\r\n");
      out.write("\r\n");
      out.write("            <legend >\r\n");
      out.write("                <p style=\"font-size: 23px;\">\r\n");
      out.write("                    <i class=\"layui-icon layui-icon-read layui-pull-center\" style=\"font-size: 30px;\"></i> 合作院校</p>\r\n");
      out.write("            </legend>\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"s-school\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"wCenter w-center\">\r\n");
      out.write("\r\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    <div class=\"item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/schooldetail1?page=1&limit=20\"><img src=\"img/dnxiaohui.png\" alt=\"\"></a></div>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    <div class=\"item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/schooldetail2?page=1&limit=40\"><img src=\"img/zkdxiaohui.png\" alt=\"\"></a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("        </fieldset>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"layui-container layui-pull-center\" style=\"margin-bottom: 30px;width: 1240px;\">\r\n");
      out.write("\r\n");
      out.write("        <fieldset class=\"layui-elem-field \">\r\n");
      out.write("\r\n");
      out.write("            <legend>\r\n");
      out.write("                <p style=\"font-size: 23px;\">\r\n");
      out.write("                    <i class=\"layui-icon layui-icon-read layui-pull-center\" style=\"font-size: 30px;\"></i>&nbsp;东南大学</p><br>\r\n");
      out.write("            </legend>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"layui-field-box \" style=\"background: rgba(255,255,255,1);\" >\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"img\" align=\"center\">\r\n");
      out.write("                    <img src=\"img/dnxiaohui.png\"  >\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <p><p style=\"font-size: 16px;line-height: 25px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;东南大学（Southeast University），简称“东大”，位于江苏省会南京，是中华人民共和国教育部直属、中央直管副部级建制的全国重点大学，建筑老八校及原四大工学院之一，国家首批双一流（A类）、211工程、985工程重点建设高校，入选2011计划、111计划、卓越工程师教育培养计划、卓越医生教育培养计划、国家级大学生创新创业训练计划、国家大学生创新性实验计划、国家建设高水平大学公派研究生项目、全国深化创新创业教育改革示范高校、中国政府奖学金来华留学生接收院校、教育部来华留学示范基地，卓越大学联盟、中俄工科大学联盟、中欧工程教育平台”、长三角高校合作联盟主要成员，国家国防科技工业局与教育部共建。</p></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"layui-container layui-pull-center\" style=\"margin-bottom: 30px;width: 1240px;\">\r\n");
      out.write("\r\n");
      out.write("        <fieldset class=\"layui-elem-field \">\r\n");
      out.write("\r\n");
      out.write("            <legend>\r\n");
      out.write("                <p style=\"font-size: 23px;\">\r\n");
      out.write("                    <i class=\"layui-icon layui-icon-read layui-pull-center\" style=\"font-size: 30px;\"></i> 中国科学技术大学</p><br>\r\n");
      out.write("            </legend>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"layui-field-box \" style=\"background: rgba(255,255,255,1);\">\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"img\" align=\"center\">\r\n");
      out.write("                    <img src=\"img/zkdxiaohui.png\"  >\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <p><p style=\"font-size: 16px;line-height: 25px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;中国科学技术大学（University of Science and Technology of China），简称中国科大，位于安徽省合肥市，由中国科学院直属，中央直管副部级建制，位列A类世界一流大学建设高校、211工程、985工程，首批20所学位自主审核高校之一，入选珠峰计划、111计划、2011计划、中国科学院知识创新工程、卓越工程师教育培养计划、全国深化创新创业教育改革示范高校、国家建设高水平大学公派研究生项目、中国政府奖学金来华留学生接收院校，九校联盟、中国大学校长联谊会、东亚研究型大学协会、环太平洋大学联盟成员，是一所以前沿科学和高新技术为主、兼有特色管理和人文学科的综合性全国重点大学。</p></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"parterner wCenter\" >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("                <div class=\"wCenter\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"left\">\r\n");
      out.write("                        <h5 class=\"black_color\"><img src=\"../static/image/logo_small2@2x.png\" alt=\"\">独墅湖高教区课程资源共享平台</h5>\r\n");
      out.write("                        <p>课程内容版权均归课程内容提供者(机构)所有</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"center\">\r\n");
      out.write("                        <dl>\r\n");
      out.write("                            <dt><a class=\"black_color\" href=\"#\">-平台介绍</a></dt>\r\n");
      out.write("                            <dt><a class=\"black_color\" href=\"#\">-帮助中心</a></dt>\r\n");
      out.write("                            <dt><a class=\"black_color\" href=\"#\">-联系我们</a></dt>\r\n");
      out.write("                            <!-- <dt><a class=\"black_color\" href=\"http://\">-关注我们</a></dt> -->\r\n");
      out.write("                        </dl>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"right\">\r\n");
      out.write("                        <p class=\"black_color\">主管单位：东南苏州研究院</p>\r\n");
      out.write("                        <p class=\"black_color\">主办单位：独墅湖高教区课程资源共享平台管理中心</p>\r\n");
      out.write("                        <p class=\"black_color\">承办单位：Young项目组</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
