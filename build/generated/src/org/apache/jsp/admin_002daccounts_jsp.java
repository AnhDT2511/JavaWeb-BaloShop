package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002daccounts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"right-side mb-5\">\n");
      out.write("    <div class=\"row title\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("            <h6>\n");
      out.write("                Quản lý tài khoản\n");
      out.write("            </h6>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"row mt-2\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("            <table id=\"accounts\" table class=\"table table-bordered\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>STT</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Loại</th>\n");
      out.write("                        <th>Trạng thái</th>\n");
      out.write("                        <th>Chi tiết</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accounts}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"i\" varStatus=\"no\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${no.index+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.roleId == 1 ? \"Admin\" : \"Khách hàng\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.status == 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <span class=\"active\">Đang hoạt động</span>\n");
      out.write("                            </c:if>\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.status != 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <span class=\"deactive\">Ngừng hoạt động</span>\n");
      out.write("                            </c:if>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\" class=\"g-color\">Chi tiết</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </c:forEach>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- The Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"myModal\">\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("            <!-- Modal Header -->\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\">Chi tiết tài khoản</h5>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Modal body -->\n");
      out.write("            <div class=\"modal-body result-detail\">\n");
      out.write("                xxxxxxxxxxxxxxxxxxxxx\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Modal footer -->\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-success btn-sm\" data-dismiss=\"modal\">Cập nhật thông tin</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger btn-sm\" data-dismiss=\"modal\">Khóa tài khoản</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary btn-sm\" data-dismiss=\"modal\">Đóng</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
