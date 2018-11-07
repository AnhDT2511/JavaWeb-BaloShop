package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_002dprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/common/user-nav.jsp");
    _jspx_dependants.add("/common/user-sidenav.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>Trang cá nhân</title>\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap/bootstrap.min.css\">\r\n");
      out.write("        <!-- Custom CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/common.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/user.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Nav -->\r\n");
      out.write("<nav class=\"navbar navbar-expand-md bg-light navbar-light\">\r\n");
      out.write("    <div class=\"container pr-0\">\r\n");
      out.write("        <a class=\"mr-4 brand\" href=\"products.jsp\">Shop Balo</a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\r\n");
      out.write("            <div class=\"ml-auto\">\r\n");
      out.write("                <ul class=\"navbar-nav\"> \r\n");
      out.write("                    <li class=\"nav-item mr-2\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"cart.jsp\">\r\n");
      out.write("                            Giỏ hàng \r\n");
      out.write("                            <span class=\"badge badge-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCart ne null ? listCart.size() : 0}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Cover -->\r\n");
      out.write("        <div id=\"main-contain\" class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"left-side\">\r\n");
      out.write("                        <div class=\"row title\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <h6>Danh mục quản lý</h6>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- User Side Nav -->\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"col-md-12\">\r\n");
      out.write("        <div class=\"side-nav\">\r\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"user-profile.jsp\">\r\n");
      out.write("                        <i class=\"mr-2\"></i> Thông tin chung\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"orders\">\r\n");
      out.write("                        <i class=\"mr-2\"></i> Đơn hàng\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"user-history.jsp\">\r\n");
      out.write("                        <i class=\"mr-2\"></i> Lịch sử mua hàng\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div> ");
      out.write("                     \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-9\">\r\n");
      out.write("                    <div class=\"right-side\">\r\n");
      out.write("                        <div class=\"row title\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <h6>\r\n");
      out.write("                                    Thông tin tài khoản\r\n");
      out.write("                                </h6>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row mt-1\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"m-info\">\r\n");
      out.write("                                    <table>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>Email:</td>\r\n");
      out.write("                                            <td><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentLoginAccount.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>Mật khẩu:</td>\r\n");
      out.write("                                            <td>\r\n");
      out.write("                                                <a href=\"javascript:void(0)\" data-toggle=\"collapse\" data-target=\"#changePassword\" aria-expanded=\"false\" aria-controls=\"collapseExample\">Đổi mật khẩu</a>\r\n");
      out.write("                                            </td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>Loại tài khoản:</td>\r\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentLoginAccount.roleId == 1 ? \"Admin\" : \"Khách hàng\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>Trạng thái:</td>\r\n");
      out.write("                                            <td>\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>Ngày tạo:</td>\r\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentLoginAccount.fmDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row mt-3\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"collapse mb-2\" id=\"changePassword\">\r\n");
      out.write("                                    <div class=\"card\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <form action=\"\" method=\"post\">\r\n");
      out.write("                                                <div class=\"form-group col-md-6\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"password\" placeholder=\"Nhập mật khẩu hiện tại\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group col-md-6\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"newPassword\" placeholder=\"Nhập mật khẩu mới\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group col-md-6\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"newPasswordCf\" placeholder=\"Nhập lại mật khẩu mới\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-success btn-sm ml-3\" name=\"btnUpload\" value=\"Đổi mật khẩu\">\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row title\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <h6>\r\n");
      out.write("                                    Thông tin cá nhân\r\n");
      out.write("                                </h6>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                        <div class=\"row mt-1\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"m-info\">\r\n");
      out.write("                                    <table>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>Họ và tên:</td>\r\n");
      out.write("                                            <td><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accountDetailInfo.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>Số điện thoại:</td>\r\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accountDetailInfo.mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>Giới tính:</td>\r\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accountDetailInfo.gender == 1 ? \"Nam\" : \"Nữ\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>Địa chỉ:</td>\r\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accountDetailInfo.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-success btn-sm mt-2\" data-toggle=\"collapse\" data-target=\"#updateInfo\" aria-expanded=\"false\" aria-controls=\"collapseExample\">\r\n");
      out.write("                                        Thay đổi thông tin\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row mt-3\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"collapse mb-2\" id=\"updateInfo\">\r\n");
      out.write("                                    <div class=\"card\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <form action=\"\" method=\"post\">\r\n");
      out.write("                                                <div class=\"form-group col-md-6\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Họ và tên\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group col-md-6\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"mobile\" placeholder=\"Số điện thoại\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group col-md-6\">\r\n");
      out.write("                                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                                        <input class=\"form-check-input\" type=\"radio\" name=\"gender\" value=\"1\">\r\n");
      out.write("                                                        <label class=\"form-check-label\" for=\"inlineRadio1\">Nam</label>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                                        <input class=\"form-check-input\" type=\"radio\" name=\"gender\" value=\"0\">\r\n");
      out.write("                                                        <label class=\"form-check-label\" for=\"inlineRadio2\">Nữ</label>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group col-md-12\">\r\n");
      out.write("                                                    <textarea class=\"form-control\" rows=\"3\" name=\"address\" placeholder=\"Địa chỉ\"></textarea>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-success btn-sm ml-3\" name=\"btnUpload\" value=\"Xác nhận\">\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Optional JavaScript -->\r\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("        <script src=\"js/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentLoginAccount ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <li class=\"nav-item dropdown\">\r\n");
        out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
        out.write("                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentLoginAccount.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                            </a>\r\n");
        out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
        out.write("                                <a class=\"dropdown-item\" href=\"user-profile.jsp\">Thông tin cá nhân</a>\r\n");
        out.write("                                <div class=\"dropdown-divider\"></div>\r\n");
        out.write("                                <a class=\"dropdown-item\" href=\"logout\">Đăng xuất</a>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentLoginAccount eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <li class=\"nav-item\">\r\n");
        out.write("                            <a class=\"nav-link\" href=\"register.jsp\">Đăng ký</a>\r\n");
        out.write("                        </li>\r\n");
        out.write("                        <li class=\"nav-item\">\r\n");
        out.write("                            <a class=\"nav-link\" href=\"login.jsp\">Đăng nhập</a>\r\n");
        out.write("                        </li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentLoginAccount.status == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <span class=\"active\">Đang hoạt động</span>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentLoginAccount.status != 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <span class=\"deactive\">Ngừng hoạt động</span>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
