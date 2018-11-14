<%-- 
    Document   : modal-login
    Created on : Nov 14, 2018, 7:55:13 PM
    Author     : Shado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Modal -->
<div class="modal fade" id="login" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Đăng nhập</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <p class="notification"> ${message}&nbsp; </p>
                <form action="login" method="post">
                    <div class="form-group">
                        <input type="email" class="form-control" placeholder="Nhập Email" name="txtEmail">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" placeholder="Nhập mật khẩu" name="txtPassword">
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-danger">
                            <i class="fas fa-sign-in-alt mr-1"></i> Đăng nhập
                        </button>
                    </div>
                    <div class="form-group" style="margin-top: 10px;">
                        <a class="link-effect mt-1 mr-1" href="reminder_password.jsp">
                            Quên mật khẩu?
                        </a>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
