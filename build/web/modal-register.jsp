<%-- 
    Document   : modal-login
    Created on : Nov 14, 2018, 7:55:13 PM
    Author     : Shado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Modal -->
<div class="modal fade" id="register" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                <form action="register" method="POST">
                    <div class="form-group">
                        <input type="email" class="form-control" placeholder="Nhập Email" name="txtEmail">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" placeholder="Nhập mật khẩu" name="txtPassword">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" placeholder="Nhập lại mật khẩu" name="txtPasswordConfirm">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Họ và tên" name="txtName">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Số điện thoại" name="txtMobile">
                    </div>
                    <div class="form-group">
                        <textarea class="form-control" rows="2" placeholder="Địa chỉ" name="txtAddress"></textarea>
                    </div>
                    <div class="form-group">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="gender" id="exampleRadios1" value="1">
                            <label class="form-check-label" for="exampleRadios1">
                                Nam
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="gender" id="exampleRadios1" value="0">
                            <label class="form-check-label" for="exampleRadios1">
                                Nữ
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-danger">
                            <i class="fas fa-edit mr-1"></i> Tạo tài khoản
                        </button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
