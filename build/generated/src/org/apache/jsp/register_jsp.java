package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Đăng ký</title>\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap/bootstrap.min.css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/form.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"intro\">\n");
      out.write("            <div class=\"middle signin\">\n");
      out.write("                <div class=\"login-panel\">\n");
      out.write("                    <div class=\"logo text-center\">\n");
      out.write("                        <a href=\"index.jsp\">Shop Balo</a>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"notification\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&nbsp; </p>\n");
      out.write("                    <form action=\"register\" method=\"POST\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"email\" class=\"form-control\" placeholder=\"Nhập Email\" name=\"txtEmail\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" placeholder=\"Nhập mật khẩu\" name=\"txtPassword\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" placeholder=\"Nhập lại mật khẩu\" name=\"txtPasswordConfirm\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Họ và tên\" name=\"txtName\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Số điện thoại\" name=\"txtMobile\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <textarea class=\"form-control\" rows=\"2\" placeholder=\"Địa chỉ\" name=\"txtAddress\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <label class=\"custom-control custom-checkbox mr-4\">\n");
      out.write("                                    <input type=\"radio\" class=\"custom-control-input\" value=\"1\" name=\"gender\">\n");
      out.write("                                    <span class=\"custom-control-indicator\"></span>\n");
      out.write("                                    <span class=\"custom-control-description\">Nam</span>\n");
      out.write("                                </label>\n");
      out.write("                                <label class=\"custom-control custom-checkbox\">\n");
      out.write("                                    <input type=\"radio\" class=\"custom-control-input\" value=\"0\" name=\"gender\">\n");
      out.write("                                    <span class=\"custom-control-indicator\"></span>\n");
      out.write("                                    <span class=\"custom-control-description\">Nữ</span>\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-sm\">\n");
      out.write("                                    <i class=\"fas fa-edit mr-1\"></i> Tạo tài khoản\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"margin-top: 10px;\">\n");
      out.write("                            <div class=\"col text-right\">\n");
      out.write("                                <a class=\"link-effect mt-1\" href=\"login.jsp\">\n");
      out.write("                                    <i class=\"fas fa-sign-in-alt mr-1\"></i> Đăng nhập\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"js/jquery/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
